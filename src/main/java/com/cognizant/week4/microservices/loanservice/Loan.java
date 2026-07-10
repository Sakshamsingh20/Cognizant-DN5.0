package com.cognizant.week4.microservices.loanservice;

public class Loan {
    private int loanId;
    private String borrowerName;
    private String loanType;
    private double loanAmount;
    private String status;

    public Loan() {}

    public Loan(int loanId, String borrowerName, String loanType, double loanAmount, String status) {
        this.loanId = loanId;
        this.borrowerName = borrowerName;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.status = status;
    }

    public int getLoanId() { return loanId; }
    public String getBorrowerName() { return borrowerName; }
    public String getLoanType() { return loanType; }
    public double getLoanAmount() { return loanAmount; }
    public String getStatus() { return status; }

    public void setLoanId(int loanId) { this.loanId = loanId; }
    public void setBorrowerName(String borrowerName) { this.borrowerName = borrowerName; }
    public void setLoanType(String loanType) { this.loanType = loanType; }
    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }
    public void setStatus(String status) { this.status = status; }
}