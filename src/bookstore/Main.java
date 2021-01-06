package bookstore;

import bookstore.overview.OverviewScene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    private OverviewScene overviewScene = null;
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("That's a title of the app");
        primaryStage.setScene(getOverviewScene());
        primaryStage.show();
    }

    private OverviewScene getOverviewScene() {
        if (overviewScene == null){
            overviewScene = new OverviewScene();
        }
        return overviewScene;
    }


}
