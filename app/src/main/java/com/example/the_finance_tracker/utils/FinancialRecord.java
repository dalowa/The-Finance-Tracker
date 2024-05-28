package com.example.the_finance_tracker.utils;

public class FinancialRecord {
    private String category;
    private String description;

    private double amount;

    public FinancialRecord(String category, String description, double amount){
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
