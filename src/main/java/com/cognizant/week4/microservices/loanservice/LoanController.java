package com.cognizant.week4.microservices.loanservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    private List<Loan> loanList = new ArrayList<>();

    public LoanController() {
        loanList.add(new Loan(1, "Saksham Singh", "Home Loan", 2000000.0, "Active"));
        loanList.add(new Loan(2, "Rahul Sharma", "Car Loan", 500000.0, "Active"));
        loanList.add(new Loan(3, "Priya Patel", "Personal Loan", 100000.0, "Closed"));
    }

    // Get all loans
    @GetMapping
    public List<Loan> getAllLoans() {
        return loanList;
    }

    // Get loan by ID
    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable int id) {
        for (Loan l : loanList) {
            if (l.getLoanId() == id) {
                return l;
            }
        }
        return null;
    }

    // Add new loan
    @PostMapping
    public String addLoan(@RequestBody Loan loan) {
        loanList.add(loan);
        return "Loan created successfully!";
    }
}