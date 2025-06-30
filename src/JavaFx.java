import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFx extends Application {

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start called");          // sanity check
        Label hello = new Label("Hello JavaFX!");

        Scene scene = new Scene(hello, 300, 200);    // width & height > 0
        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();               // ensure on-screen
        primaryStage.show();                         // MUST be called
    }

    public static void main(String[] args) {
        launch(args);                                // boots JavaFX
    }
}
