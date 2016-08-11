package com.lollibond.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lollibond.company.domain.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Override
	public List<Company> findAll() {
		Company company1 = new Company(100L, "BondInco");
		List<Company> companies = new ArrayList<>();
		companies.add(company1);

		return companies;
	}

}
