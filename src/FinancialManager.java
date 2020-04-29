import javafx.scene.control.TextField;

import java.util.LinkedList;
import java.util.List;


//package ca.ubc.cs.inventory.model.items;


public class FinancialManager {

    private double income;
    private double expenses;
    private double expenditure;
    private double savings;
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

    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getExpenditure() {
        return (income - (expenses + savings));
    }

    public double getSavings() {
        return savings;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public void setExpenditure(double expenditure) {
        this.expenditure = expenditure;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }


    public void update(double daily) {
        for (Item i: items) {
            limit = i.getPrice() + limit;
        }
        if (limit > daily) {
            pageManager.updateNotification();
        }
    }

}

