import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.PageManager;


public class Main extends Application {

    private Scene scene;
    private PageManager pageManager = new PageManager();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setScene(scene);
        pageManager.setupHomePage(primaryStage);
        pageManager.setupFoodPage(primaryStage);
        pageManager.setupGasPage(primaryStage);
        pageManager.setupRentPage(primaryStage);
        pageManager.setupLeisurePage(primaryStage);
        pageManager.setupTuitionPage(primaryStage);
        pageManager.printItemsPage(primaryStage);
        pageManager.setupExpensesPage(primaryStage);

    }

    // test push!

}
