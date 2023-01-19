package com.recharger.admin.repository;

import com.recharger.admin.entity.Issuer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuerRepository extends JpaRepository<Issuer, Long> {
}
