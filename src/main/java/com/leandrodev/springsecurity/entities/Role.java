package com.leandrodev.springsecurity.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private String name;

    public enum Value{
        ADMIN(1L);
        BASIC(2L);
        Long roleId;

        Value(Long roleId) {
            this.roleId = roleId;
        }
        public Long getRoleId() {
            return roleId;
        }
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
