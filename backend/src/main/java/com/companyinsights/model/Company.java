package com.companyinsights.model;

public class Company {
    private String name;
    private String about;

    public Company(String name, String about) {
        this.name = name;
        this.about = about;
    }

    public String getName() { return name; }
    public String getAbout() { return about; }
}