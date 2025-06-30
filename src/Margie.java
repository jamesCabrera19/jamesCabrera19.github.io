import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Margie extends Application {
    @Override
    public void start(Stage primaryStage) {
    	  Label hello = new Label("Hello JavaFX!");
          Scene scene = new Scene(hello, 300, 200);

          primaryStage.setTitle("JavaFX Test");
          primaryStage.setScene(scene);
          primaryStage.show();      
    }

    public static void main(String[] args) {
    	 launch(args);  
    }
}
