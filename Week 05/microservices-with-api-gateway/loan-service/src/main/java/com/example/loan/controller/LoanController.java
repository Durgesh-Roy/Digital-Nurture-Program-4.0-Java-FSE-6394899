package com.example.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan/details")
    public String getLoanDetails() {
        return "Loan details from Loan Service";
    }
}