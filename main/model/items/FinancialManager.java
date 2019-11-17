package model.items;

import javafx.scene.control.TextField;

import java.util.LinkedList;
import java.util.List;
import ui.PageManager;

//package ca.ubc.cs.inventory.model.items;


public class FinancialManager {

    private int income;
    private int expenses;
    private int expenditure;
    private int savings;
    private double limit;
    private List<Item> items;
    private TextField trialexp;
    private PageManager pageManager;

    public FinancialManager() {
        income = 0;
        expenditure = 0;
        expenses = 0;
        savings = 0;
        items = new LinkedList<>();
        limit = 0;
        pageManager = new PageManager();

    }

    public int getIncome() {
        return income;
    }

    public int getExpenses() {
        return expenses;
    }

    public int getExpenditure() {
        return (income - (expenses + savings));
    }

    public int getSavings() {
        return savings;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public void setExpenditure(int expenditure) {
        this.expenditure = expenditure;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

//    @Override
//    public void update(double daily) {
//        for (Item i: items) {
//            limit = i.getPrice() + limit;
//        }
//        if (limit > daily) {
//            pageManager.updateNotification();
//        }
//    }

}

