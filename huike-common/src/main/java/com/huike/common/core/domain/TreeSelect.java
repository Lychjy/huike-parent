package com.huike.common.core.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huike.common.core.domain.entity.SysDept;
import com.huike.common.core.domain.entity.SysMenu;
import com.huike.common.core.domain.entity.SysUser;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Treeselect树结构实体类
 */
@Data
@NoArgsConstructor
public class TreeSelect implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 节点ID
     */
    protected Object id;

    /**
     * 节点名称
     */
    protected String label;

    /**
     * 子节点
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    protected List<TreeSelect> children = new ArrayList<>();

    public TreeSelect(SysDept dept) {
        this.id = dept.getDeptId();
        this.label = dept.getDeptName();
        this.children = dept.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
    }

    public TreeSelect(SysMenu menu) {
        this.id = menu.getMenuId();
        this.label = menu.getMenuName();
        this.children = menu.getChildren().stream().map(TreeSelect::new).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "TreeSelect{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }
}
