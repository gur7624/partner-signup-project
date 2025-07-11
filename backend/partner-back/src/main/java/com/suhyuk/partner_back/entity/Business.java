package com.suhyuk.partner_back.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;         // 회사명
    private String businessNumber;  // 사업자 번호
    private String ceo;             // 대표자 성함
    private String businessType;    // 업태
    private String businessItem;    // 종목
}
