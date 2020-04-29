

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Item {

    private String description;
    private int price;
    private DateFormat date = new SimpleDateFormat("dd/MM/yy");
    private Calendar calendar = Calendar.getInstance();
    private String companyName;


    public Item(String description, int price) {
        this.description = description;
        this.price = price;
        companyName = null;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getTotalPrice() {
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
