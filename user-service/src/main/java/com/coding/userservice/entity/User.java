package com.coding.userservice.entity;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    //private UserStatus status = UserStatus.ACTIVE;
    private Boolean isActive = true;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    //private List<ResfreshToken> refreshTokens = new ArrayList<>();
}
