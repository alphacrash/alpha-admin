package com.recharger.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recharger.admin.entity.Issuer;
import com.recharger.admin.service.impl.IssuerServiceImpl;

@RestController
@RequestMapping("api/issuers")

public class AdminController {
	@Autowired
	private IssuerServiceImpl issuerServiceImpl;

	@GetMapping
	public ResponseEntity<List<Issuer>> getIssuers() {
		List<Issuer> issuerList = issuerServiceImpl.fetchIssuer();
		return new ResponseEntity<>(issuerList, HttpStatus.OK);
	}
}