	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class JavaFx extends Application {
	 // Converts the text inside a TextField to a double
    public double parseStringToDouble(TextField inputField) {
        String rawText = inputField.getText();
        // check rawText for valid input. else returns a double
        if(rawText == null || rawText.trim().isEmpty()) {
        	return Double.NaN;
        }
        return Double.parseDouble(rawText);
    }
    
    public boolean isNaNumber(double value) {
    	// checking if N is a number. 
    	// returns true is value is a number or false if value is a NaN 
    	return !Double.isNaN(value);
    }

   
    @Override
    public void start(Stage primaryStage) {
        // setting the height and width of the scene
        int sceneHeight = 150;
        int sceneWidth = 350;

        // array of labels
        String[] inputFieldLabels = {"Number 1", "Number 2", "Result"};

        // instance of InputSection - creates a Pane with Labels, TextFields
        InputSection inputSection = new InputSection(inputFieldLabels);
        FlowPane inputPane = inputSection.getInputPane();
        TextField[] inputFields = inputSection.getTextFields();

        // layout for operation buttons
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);

        // operation button names
        String[] operationLabels = {"Add", "Subtract", "Divide", "Multiply","SQRT"};
        // new button array
        Button[] operationButtons = new Button[operationLabels.length];
        

       
        // loop through button labels to create buttons and actions
        for (int i = 0; i < operationLabels.length; i++) {
        	// extracting the current operation
            final String operation = operationLabels[i];
            
            // creating a new button with the current operation label
            operationButtons[i] = new Button(operation);

            operationButtons[i].setOnAction(e -> {
            	// checking what's being perform
                System.out.println("Clicked: " + operation + e);

                // extracting text field values from array
                TextField firstInput = inputFields[0];
                TextField secondInput = inputFields[1];
                TextField resultField = inputFields[2];

                // parsing the string values to double
                double x = parseStringToDouble(firstInput);
                double y = parseStringToDouble(secondInput);

            	// checking whether the values are not empty
            	boolean isXaNumber = !Double.isNaN(x);
                boolean isYaNumber = !Double.isNaN(y);
                
                               
                // determine which operation to run
                switch (operation) {
                	case "Add":
                		if (isXaNumber && isYaNumber) {
                			resultField.setText(String.valueOf(x + y));
                		}
                		break;
                	case "Subtract":
                    	if (isXaNumber && isYaNumber) {
                        	resultField.setText(String.valueOf(x - y));
                    	}
                    		break;
                	case "Divide":
                		if (isXaNumber && isYaNumber) {
                			resultField.setText(String.valueOf(x / y));
                		}
                		break;
                	case "Multiply":
                		if (isXaNumber && isYaNumber) {
                			resultField.setText(String.valueOf(x * y));
                		}
                		break;
                	case "SQRT":
                    
                        if (isXaNumber && isYaNumber) {
                        	// ex 4 * sqrt(Y)
                        	resultField.setText(String.valueOf(x * Math.sqrt(y)));
                        } else if (isXaNumber) {
                        	// only x is given
                            resultField.setText(String.valueOf(Math.sqrt(x)));
                        } else if (isYaNumber) {
                        	// only y is given
                            resultField.setText(String.valueOf(Math.sqrt(y)));
                        }
                        break;
                        
                    default:
                        resultField.setText(String.valueOf(Double.NaN));
                }
            });
            
            // adding the button to the button container
            buttonBox.getChildren().add(operationButtons[i]);
        }

        // creating the layout
        BorderPane layout = new BorderPane();
        layout.setCenter(inputPane);
        layout.setBottom(buttonBox);
        
        // creating the final scene
        Scene scene = new Scene(layout, sceneWidth, sceneHeight);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
    	// starting the project
        launch(args);
    }
}



class InputSection{
	// data fields
	// private data fields so they cant be access outside the class
	private FlowPane inputPane;
    private TextField[] inputFields;	
    
    // arg constructor
	public InputSection(String[] labelNames) {
		inputPane = new FlowPane();
        inputPane.setHgap(2);

        inputFields = new TextField[labelNames.length];
        Label[] fieldLabels = new Label[labelNames.length];

        // create and attach each label + input field
        for (int i = 0; i < labelNames.length; i++) {
            String labelText = labelNames[i];
            inputFields[i] = new TextField();
            fieldLabels[i] = new Label(labelText);

            // consistent size for all input fields
            inputFields[i].setPrefColumnCount(3);
            inputPane.getChildren().addAll(fieldLabels[i], inputFields[i]);
        } 
	}
	// getMethods returns inputPane instance
	public FlowPane getInputPane() {
		return inputPane;
	}
	// returns TextField array
	public TextField[] getTextFields() {
		return inputFields;
	}
	
}
