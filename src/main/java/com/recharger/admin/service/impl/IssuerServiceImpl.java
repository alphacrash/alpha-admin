package com.recharger.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.recharger.admin.entity.Issuer;
import com.recharger.admin.repository.IssuerRepository;
import com.recharger.admin.service.IssuerService;

public class IssuerServiceImpl implements IssuerService {
	@Autowired
	private IssuerRepository issuerRepository;

	public List<Issuer> fetchIssuer() {
		List<Issuer> issuerList = issuerRepository.findAll();
		return issuerList;
	}

}
