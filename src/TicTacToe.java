package application;

/**
* Objective: create a tictactoe game from the video demo
* Input and Output: none/void
* Created by: Jaime Cabrera
* Date: July 16, 2025
* Version: 1 - game seems well constructed, theres some code repetition but not a lot.
*/



//import necessary javafx classes
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

//import for layout and text controls
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

//import for arraylist
import java.util.ArrayList;

// main class that extends javafx application
public class TicTacToe extends Application {
	
	// declare a 3x3 array of cells
	private Cell[][] cell = new Cell[3][3];
    // declare a label for status messages
	private Label lblStatus = new Label("'X's turn to play");
    // tracker which player's turn it is
	private char whoseTurn = 'X';
	
	
	public void start(Stage primaryStage) {
		// create gridpane to hold the cells
		GridPane pane = new GridPane();
		
        // loop to initialize and add cells to the grid
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				pane.add(cell[i][j] = new Cell(), i, j);
			}
		}
//		cell[0][0].setToken('X');
//		cell[1][0].setToken('O');

		
		BorderPane borderPane = new BorderPane();
		// center gridpane
		borderPane.setCenter(pane);
        // place label at the bottom
		borderPane.setBottom(lblStatus);
        // create a scene with specified dimensions
		Scene scene = new Scene(borderPane, 350,350);
        // set stage title
		primaryStage.setTitle("TicTacToe");
		primaryStage.setScene(scene);
        // show the stage
		primaryStage.show();
		
		
		
	}
	
	public boolean isFull() {
		// loop to check if the rows and columns are full
		for(int i = 0; i <3; i++) {
			for(int j = 0; j<3; j++) {
				if(cell[i][j].getToken()==' ')
					return false;
			}	
		}
		return true;
	}
	
    // method to check if a player has won
	public boolean isWon(char token) {
	    // Check rows
	    for (int i = 0; i < 3; i++) {
	        if (cell[i][0].getToken() == token &&
	            cell[i][1].getToken() == token &&
	            cell[i][2].getToken() == token) {
	            return true;
	        }
	    }

	    // Check columns
	    for (int j = 0; j < 3; j++) {
	        if (cell[0][j].getToken() == token &&
	            cell[1][j].getToken() == token &&
	            cell[2][j].getToken() == token) {
	            return true;
	        }
	    }

        // check top-left to bottom-right diagonal
	    if (cell[0][0].getToken() == token &&
	        cell[1][1].getToken() == token &&
	        cell[2][2].getToken() == token) {
	        return true;
	    }
        // check top-right to bottom-left diagonal
	    if (cell[0][2].getToken() == token &&
	        cell[1][1].getToken() == token &&
	        cell[2][0].getToken() == token) {
	        return true;
	    }

	    // No win detected
	    return false;
	}
	
    // define inner class cell representing each square in the grid
	public class Cell extends Pane{
		private char token = ' ';
		
        // constructor to set up the cell
		public Cell() {
			// border style
			setStyle("-fx-border-color:black");
            // set preferred size of the cell
			this.setPrefSize(800,800);
			// mouse click handler
			this.setOnMouseClicked(e -> handleMouseClick());
		}
		
        // getter for the token
		public char getToken() {
			return token;
		}
		
		// helper method to handle mouse click
		public void handleMouseClick() {
			// checking whose turn to play is
			if(token == ' ' && whoseTurn != ' ') {
				setToken(whoseTurn);
                // check if current player has won
				if(isWon(whoseTurn)) {
					lblStatus.setText(whoseTurn + " won! the game is over");
					whoseTurn = ' ';
					
					// if all rows and cols are full game is a draw
				}else if(isFull()) {
					lblStatus.setText("DRAW! the game is over");
					whoseTurn = ' ';
					// determine whose turn is
				}else {
					whoseTurn  =(whoseTurn == 'X' ? 'O' : 'X');
					lblStatus.setText(whoseTurn + "'s turn");


				}
			}
		}
		
		// setter method
		public void setToken(char c) {
			token = c;
			// drawing the X's and O's
			
			if(token == 'X') {
                // create first line of x
				Line line1 = new Line(10,10, this.getWidth()-10,this.getHeight()-10);
				line1.endXProperty().bind(this.widthProperty().subtract(10));
				line1.endYProperty().bind(this.heightProperty().subtract(10));
				
                // create second line of x
				Line line2 = new Line(10,this.getWidth()-10,this.getHeight()-10,10);
				line2.startYProperty().bind(this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));

                // add lines to the cell
				this.getChildren().addAll(line1,line2);
			}else if(token == 'O') {
				// O's properties
				Ellipse el = new Ellipse(this.getWidth()/2, this.getHeight()/2,
						this.getWidth()/2-10,this.getHeight()/2-10); 
				
                // create ellipse for o
				el.centerXProperty().bind(this.widthProperty().divide(2));
				el.centerYProperty().bind(this.heightProperty().divide(2));
				
                // bind ellipse center and radii to cell size
				el.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
				el.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
               
				// set stroke and fill for the ellipse
				el.setStroke(Color.BLACK);
				el.setFill(Color.WHITE);
                // add ellipse to the cell
				this.getChildren().add(el);
			}
		}
		
	}
		// main method to start the app
	   public static void main(String[] args) {
	    	// starting the project
	        launch(args);
	    }
}
