

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Item {

    private String description;
    private double price;
    private DateFormat date = new SimpleDateFormat("dd/MM/yy");
    private Calendar calendar = Calendar.getInstance();
    private String companyName;


    public Item(String description, double price) {
        this.description = description;
        this.price = price;
        companyName = null;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return price;
    }

    public void setDate() {
        System.out.println(date.format(calendar.getTime()));
    }

    public void setCompany(String name) {
        if (companyName == null) {
            companyName = name;
        } else {
            System.out.println("Company name already exists");
        }
    }



}
