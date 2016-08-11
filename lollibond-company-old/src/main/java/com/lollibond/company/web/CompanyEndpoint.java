package com.lollibond.company.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lollibond.company.domain.Company;
import com.lollibond.company.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyEndpoint {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping
	public List<Company> findAll() {
		return companyService.findAll();
	}

}
