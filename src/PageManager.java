

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;




public class PageManager {

    private ItemManager itemManager;
    private FinancialManager financialManager;

    private Stage homepage;

    private Scene scene;
    private Scene foodScene;
    private Scene gasScene;
    private Scene rentScene;
    private Scene tuitionScene;
    private Scene leisureScene;
    private Scene printScene;
    private Scene expensesScene;

    private Button enter;
    private Button backToHomepage;
    private Button enterItem;
    private Button getPrintedItems;
    private Button print;
    private Button getTotal;
    private Button getFinancialGoal;
    private Button enterGoals;
    private Button refreshGoals;
    private Button trackExpenditure;

    private TextField askFood;
    private TextField askPrice;
    private TextField askGas;
    private TextField askGasPrice;
    private TextField askRent;
    private TextField askRentPrice;
    private TextField askTuition;
    private TextField askTuitionPrice;
    private TextField askLeisure;
    private TextField askLeisurePrice;
    private TextField printItemsText;
    private TextArea test = new TextArea();
    private TextField askIncome;
    private TextField askExpenses;
    private TextField askExpenditure;
    private TextField askSavings;
    private TextField totalExpenditure;
    private TextField trialexpenditure;

    private Text line1;

    private ComboBox<String> dropDown;

    public PageManager() {
        itemManager = new ItemManager();
    }

    public void setupHomePage(Stage primaryStage) {
        homepage = primaryStage;
        getFinancialGoal = new Button("Set Financial Goal");
        getFinancialGoal.setOnAction(e -> primaryStage.setScene(expensesScene));
        homepage.setTitle("Welcome To Your Personal Financial Tracker");
        enter = new Button("Enter Item");
        getPrintedItems = new Button("See Expenses History");
        dropDown = new ComboBox<>();

        dropDown.getItems().addAll(
                "Food/Drink",
                "Leisure Activity",
                "Gas",
                "Rent",
                "Tuition"
        );

        dropDown.setPromptText("Select item to track");
        //dropDown.setEditable(true);
        enter.setOnAction(e -> goToPage(primaryStage));
        dropDown.setOnAction(e -> System.out.println("User selected: " + dropDown.getValue()));

        getPrintedItems.setOnAction(e -> primaryStage.setScene(printScene));

        VBox home = new VBox(20);
        home.setPadding(new Insets(40, 40, 40, 40));
        home.getChildren().addAll(getFinancialGoal, dropDown, enter, getPrintedItems);
        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        home.setStyle(style);

        scene = new Scene(home, 400, 350);
        scene.setFill(Color.rgb(100, 150, 160, 1.0));
        homepage.setScene(scene);
        homepage.show();
    }

    public void setupFoodPage(Stage primaryStage) {

        backToHomepage = new Button("Back to Homepage");
        backToHomepage.setOnAction(e -> primaryStage.setScene(scene));

        askFood = new TextField("Type item name then enter");
        askPrice = new TextField("Enter price of item");
        enterItem = new Button("Enter");
        enterItem.setOnAction(e -> itemManager.createItem(askFood.getText(), askPrice.getText()));

        VBox foodBox = new VBox(30);
        foodBox.setPadding(new Insets(40, 40, 40, 40));
        foodBox.getChildren().addAll(askFood, askPrice, enterItem, backToHomepage);
        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        foodBox.setStyle(style);

        foodScene = new Scene(foodBox, 400, 350);
        foodScene.setFill(Color.rgb(100, 150, 255, 1.0));

    }


    public void setupGasPage(Stage primaryStage) {

        backToHomepage = new Button("Back to Homepage");
        backToHomepage.setOnAction(e -> primaryStage.setScene(scene));

        askGas = new TextField("Type item name then enter");
        askGasPrice = new TextField("Enter price of item");
        enterItem = new Button("Enter");
        enterItem.setOnAction(e -> itemManager.createItem(askGas.getText(), askGasPrice.getText()));

        VBox gasBox = new VBox(30);
        gasBox.setPadding(new Insets(40, 40, 40, 40));
        gasBox.getChildren().addAll(askGas, askGasPrice, enterItem, backToHomepage);
        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        gasBox.setStyle(style);

        gasScene = new Scene(gasBox, 400, 350);
        gasScene.setFill(Color.rgb(255, 100, 255, 1.0));
    }

    public void setupRentPage(Stage primaryStage) {

        backToHomepage = new Button("Back to Homepage");
        backToHomepage.setOnAction(e -> primaryStage.setScene(scene));

        askRent = new TextField("Type item name then enter");
        askRentPrice = new TextField("Enter price of item");
        enterItem = new Button("Enter");
        enterItem.setOnAction(e -> itemManager.createItem(askRent.getText(), askRentPrice.getText()));

        VBox rentBox = new VBox(30);
        rentBox.setPadding(new Insets(40, 40, 40, 40));
        rentBox.getChildren().addAll(askRent, askRentPrice, enterItem, backToHomepage);
        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        rentBox.setStyle(style);

        rentScene = new Scene(rentBox, 400, 350);
        rentScene.setFill(Color.rgb(34, 139, 90, 1.0));
    }

    public void setupLeisurePage(Stage primaryStage) {

        backToHomepage = new Button("Back to Homepage");
        backToHomepage.setOnAction(e -> primaryStage.setScene(scene));

        askLeisure = new TextField("Type item name then enter");
        askLeisurePrice = new TextField("Enter price of item");
        enterItem = new Button("Enter");
        enterItem.setOnAction(e -> itemManager.createItem(askLeisure.getText(), askLeisurePrice.getText()));

        VBox leisureBox = new VBox(30);
        leisureBox.setPadding(new Insets(40, 40, 40, 40));
        leisureBox.getChildren().addAll(askLeisure, askLeisurePrice, enterItem, backToHomepage);
        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        leisureBox.setStyle(style);

        leisureScene = new Scene(leisureBox, 400, 350);
        leisureScene.setFill(Color.rgb(120, 255, 200, 1.0));
    }

    public void setupExpensesPage(Stage primaryStage) {
        askExpenditure = new TextField("Enter amount you would like to spend daily");
        askExpenses = new TextField("Enter amount of concrete monthly expenses (rent, insurance, gas...etc)");
        askSavings = new TextField("Enter amount you would like to save monthly");
        askIncome = new TextField("Enter your monthly income");

        totalExpenditure = new TextField();
        enterGoals = new Button("Calculate Daily Expenditure");
        enterGoals.setOnAction(e -> calculateGoals());

//        trackExpenditure = new Button("Track Daily Expenditure");
//        System.out.println("totalExpenditure"+totalExpenditure.getText());
//        trackExpenditure.setOnAction(e -> beginTracking(Double.parseDouble(totalExpenditure.getText())));

        trialexpenditure = new TextField();

        backToHomepage = new Button("Back to Homepage");
        backToHomepage.setOnAction(e -> primaryStage.setScene(scene));
        refreshGoals = new Button("Refresh Goal Values");
        refreshGoals.setOnAction(e -> refresh());

        VBox expensesBox = new VBox(30);
        expensesBox.setPadding(new Insets(40, 40, 40, 40));
        expensesBox.getChildren().addAll(askIncome, askSavings, askExpenses, enterGoals, totalExpenditure, trialexpenditure, refreshGoals, backToHomepage);
        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        expensesBox.setStyle(style);

        expensesScene = new Scene(expensesBox, 500, 600);
        expensesScene.setFill(Color.rgb(50, 50, 190, 1.0));

    }

    public void beginTracking(double daily) {
        System.out.println();
        financialManager = new FinancialManager();
        //addObserver(financialManager);
        //notifyObserver(daily);
    }

    public void updateNotification() {
        trialexpenditure.setText("True");
    }


    public void setupTuitionPage(Stage primaryStage) {

        backToHomepage = new Button("Back to Homepage");
        backToHomepage.setOnAction(e -> primaryStage.setScene(scene));

        askTuition = new TextField("Type item name then enter");
        askTuitionPrice = new TextField("Enter price of item");
        enterItem = new Button("Enter");
        enterItem.setOnAction(e -> itemManager.createItem(askTuition.getText(), askTuitionPrice.getText()));

        VBox tuitionBox = new VBox(30);
        tuitionBox.setPadding(new Insets(40, 40, 40, 40));
        tuitionBox.getChildren().addAll(askTuition, askTuitionPrice, enterItem, backToHomepage);
        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        tuitionBox.setStyle(style);

        tuitionScene = new Scene(tuitionBox, 600, 400);
        tuitionScene.setFill(Color.rgb(85, 10, 40, 1.0));
    }

    public void goToPage(Stage primaryStage) {
        if (dropDown.getValue().equals("Food/Drink")) {
            primaryStage.setScene(foodScene);
        } if (dropDown.getValue().equals("Gas")) {
            primaryStage.setScene(gasScene);
        } if (dropDown.getValue().equals("Rent")) {
            primaryStage.setScene(rentScene);
        } if (dropDown.getValue().equals("Leisure Activity")) {
            primaryStage.setScene(leisureScene);
        } if (dropDown.getValue().equals("Tuition")) {
            primaryStage.setScene(tuitionScene);
        }
    }

    public void printItemsPage(Stage primaryStage) {
        printItemsText = new TextField();
        getTotal = new Button("Get Total Amount Spent");
        getTotal.setOnAction(e -> printTotal());
        print = new Button("Print Items");
        print.setOnAction(e -> loadItemsPage());

        line1 = new Text("To view your expenses report, hit the button \n below "
                + "and locate your ItemsList.txt file \n in your computer");
        line1.setFont(Font.font("Verdana", 14));
        line1.setFill(Color.WHITE);

        backToHomepage = new Button("Back to Homepage");
        backToHomepage.setOnAction(e -> primaryStage.setScene(scene));


        VBox printBox = new VBox(30);
        printBox.setPadding(new Insets(40, 40, 40, 40));
        printBox.getChildren().addAll(line1, printItemsText, getTotal, print, backToHomepage);

        String style = "-fx-background-color: rgba(255, 255, 255, 0.5);";
        printBox.setStyle(style);

        printScene = new Scene(printBox, 400, 350);
        printScene.setFill(Color.rgb(15, 10, 40, 1.0));
    }

    public void refresh() {
        askExpenses.setText("");
        askSavings.setText("");
        askIncome.setText("");
        totalExpenditure.setText("");
    }

    public void printTotal() {
        int totalExpense  = itemManager.getTotalExpenses();
        printItemsText.setText("Total Amount Spent: $" + Integer.toString(totalExpense));
    }

    public void calculateGoals() {
        int income = Integer.parseInt(askIncome.getText());
        int savings = Integer.parseInt(askSavings.getText());
        int expenses = Integer.parseInt(askExpenses.getText());
        int decreaseSavings = 0;
        int decreaseExpenses = 0;
        double totalDailyExpenditure = 0.0;

        if (((income - savings) - expenses) <= 0) {
            totalExpenditure.setText("You are out of funds to spend for the month");
        } else {
            decreaseSavings = income-savings;
            decreaseExpenses = decreaseSavings - expenses;
            totalDailyExpenditure = (decreaseExpenses/30);
        }

        totalExpenditure.setText(Double.toString(totalDailyExpenditure));

    }

    private void loadItemsPage() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                final JFrame f = new JFrame("Load Items");
                f.setBackground(java.awt.Color.cyan);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                final JFileChooser fileChooser = new JFileChooser();

                JPanel gui = new JPanel(new BorderLayout());

                final JEditorPane document = new JEditorPane();
                gui.add(new JScrollPane(document), BorderLayout.CENTER);

                JButton open = new JButton("Search Items List text file");
                open.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent ae) {
                        int result = fileChooser.showOpenDialog(f);
                        if (result == JFileChooser.APPROVE_OPTION) {
                            File file = fileChooser.getSelectedFile();
                            try {
                                document.setPage(file.toURI().toURL());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
                gui.add(open, BorderLayout.NORTH);

                f.setContentPane(gui);
                f.pack();
                f.setSize(400, 300);
                f.setLocationByPlatform(true);

                f.setVisible(true);
            }
        });

    }


}