package com.stable.horseProject.domain.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String userId;

    private String pwd;

    private String checkPwd;

    @Builder
    public User(String name, String userId, String pwd, String checkPwd) {
        this.name = name;
        this.userId = userId;
        this.pwd = pwd;
        this.checkPwd = checkPwd;
    }
}