package com.suhyuk.partner_back.controller;

import com.suhyuk.partner_back.entity.Member;
import com.suhyuk.partner_back.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Member member) {

        // ✅ 아이디 중복 확인
        if (memberRepository.findByUserid(member.getUserid()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("이미 사용 중인 아이디입니다.");
        }

        // ✅ 이메일 중복 확인
        if (memberRepository.findByEmail(member.getEmail()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("이미 사용 중인 이메일입니다.");
        }

        // 저장 후 결과 반환
        Member saved = memberRepository.save(member);
        return ResponseEntity.ok(saved); // JSON 객체로 반환
    }
}


