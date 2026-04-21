package com.companyinsights.controller;

import com.companyinsights.model.Company;
import com.companyinsights.service.CompanyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CompanyController {

    private final CompanyService service;

    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @GetMapping("/company")
    public Company getCompany(@RequestParam String name) {
        return service.getCompanyData(name);
    }
}