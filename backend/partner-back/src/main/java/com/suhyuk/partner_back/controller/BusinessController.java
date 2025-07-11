package com.suhyuk.partner_back.controller;

import com.suhyuk.partner_back.entity.Business;
import com.suhyuk.partner_back.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class BusinessController {

    @Autowired
    private BusinessRepository businessRepository;

    @PostMapping("/business")
    public ResponseEntity<?> saveBusiness(@RequestBody Business business) {
        Business saved = businessRepository.save(business);
        return ResponseEntity.ok(saved);
    }
}
