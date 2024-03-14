package com.arminik.nm.admin.models.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String nickname;
    private String password;
}
