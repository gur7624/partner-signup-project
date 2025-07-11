package com.suhyuk.partner_back.repository;

import com.suhyuk.partner_back.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business, Long> {
}
