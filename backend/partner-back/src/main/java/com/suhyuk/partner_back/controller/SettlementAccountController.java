package com.suhyuk.partner_back.controller;

import com.suhyuk.partner_back.entity.SettlementAccount;
import com.suhyuk.partner_back.repository.SettlementAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SettlementAccountController {

    @Autowired
    private SettlementAccountRepository settlementAccountRepository;

    @PostMapping("/settlement-accounts")
    public SettlementAccount saveSettlementAccount(@RequestBody SettlementAccount account) {
        return settlementAccountRepository.save(account);
    }
}


