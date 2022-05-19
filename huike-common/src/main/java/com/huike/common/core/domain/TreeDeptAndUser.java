package com.huike.common.core.domain;

import com.huike.common.core.domain.entity.SysDept;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class TreeDeptAndUser extends TreeSelect {

    private int type = 0; //0 组织 1 人员
    private boolean disabled = false;

    //组织和人员混合树，前端需要
    public TreeDeptAndUser(SysDept dept) {
        this.id = "dept_" + dept.getDeptId();
        this.label = dept.getDeptName();
        this.disabled = true;
        this.children = dept.getChildren().stream().map(TreeDeptAndUser::new).collect(Collectors.toList());
        if (dept.getUsers() != null && !dept.getUsers().isEmpty()) {
            dept.getUsers().forEach(user -> {
                TreeDeptAndUser tree = new TreeDeptAndUser();
                tree.setId(user.getUserId());
                tree.setLabel(user.getUserName());
                tree.setType(1);
                this.children.add(tree);
            });
        }
    }
}
