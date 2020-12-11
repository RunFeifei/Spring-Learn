package com.fei.run.security;

import lombok.Getter;

@Getter
public enum UserRole {

    USER("user","普通用户"),
    ADMIN("admin","管理员");

    private final String type;
    private final String description;

    UserRole(String type, String description) {
        this.type = type;
        this.description = description;
    }
}
