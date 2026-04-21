package com.companyinsights.service;

import com.companyinsights.model.Company;
import com.companyinsights.scraper.WebScraper;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    public Company getCompanyData(String name) {
        String about = WebScraper.fetchAbout(name);
        return new Company(name, about);
    }
}