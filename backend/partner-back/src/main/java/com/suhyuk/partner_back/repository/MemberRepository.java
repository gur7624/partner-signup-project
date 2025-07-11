package com.suhyuk.partner_back.repository;

import com.suhyuk.partner_back.entity.Member;    //entity 폴더에서 Member 클래스 호출
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// JpaRepository<엔티티 타입, PK 타입>을 상속하면
// save(), findById(), findAll(), delete() 등 기본 기능 자동 제공
public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUserid(String userid);
    Optional<Member> findByEmail(String email);
}
