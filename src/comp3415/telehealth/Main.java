package comp3415.telehealth;

import comp3415.telehealth.db.LogInfo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  COMP-3415 Software Engineering
 *  TeleHealth Project
 *  Lakehead University 2020
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        LogInfo.window = primaryStage;

        // The beginning "View" specified in FXML
        Parent rootView = FXMLLoader.load(getClass().getResource("view/welcome.fxml"));

        // The beginning scene containing the login view
        Scene loginScene = new Scene(rootView);

        // Set the stage (window) properties and show it:
        primaryStage.setTitle("COMP3415 Group Project");
        primaryStage.setScene(loginScene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}
