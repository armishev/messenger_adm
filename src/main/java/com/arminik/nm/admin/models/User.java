package com.arminik.nm.admin.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long Id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")  
    private String lastname;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "role_id")
    private Long roleId;
}
