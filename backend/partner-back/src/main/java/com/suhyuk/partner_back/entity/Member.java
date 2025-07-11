package com.suhyuk.partner_back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity    //JPA
@Getter    //lombok 클래스 필드에 대해 getXXX() . setXXX() 매서드를 자동으로 생성해줌
@Setter

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 설정 (MySQL 의 AUTO_INCREMENT 와 연결)

    private Long id;

    //이름 : null 불가, 최대50자까지 허용
    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 50)
    private String userid;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true, length = 100)
    private String email;

    @Column(nullable = false, length = 20)
    private String phone;


}
