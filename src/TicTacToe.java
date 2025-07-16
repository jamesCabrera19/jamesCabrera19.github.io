package application;

/**
* Objective: create a calculator from the video demo
* Input and Output: integers and doubles
* Created by: Jaime Cabrera
* Date: July 8, 2025
* Version: 1.2 - my logic could've been better, especially my boolean checks. But the app runs fine, no crashes
*/

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


import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.util.ArrayList;



public class TicTacToe extends Application {

	private Cell[][] cell = new Cell[3][3];
	private Label lblStatus = new Label("'X's turn to play");
	private char whoseTurn = 'X';
	
	
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				pane.add(cell[i][j] = new Cell(), i, j);
			}
		}
//		cell[0][0].setToken('X');
//		cell[1][0].setToken('O');

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(lblStatus);
		Scene scene = new Scene(borderPane, 350,350);
		primaryStage.setTitle("TicTacToe");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	
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

	    // Check diagonals
	    if (cell[0][0].getToken() == token &&
	        cell[1][1].getToken() == token &&
	        cell[2][2].getToken() == token) {
	        return true;
	    }

	    if (cell[0][2].getToken() == token &&
	        cell[1][1].getToken() == token &&
	        cell[2][0].getToken() == token) {
	        return true;
	    }

	    // No win detected
	    return false;
	}
	
	public class Cell extends Pane{
		private char token = ' ';
		
		
		public Cell() {
			setStyle("-fx-border-color:black");
			this.setPrefSize(800,800);
			this.setOnMouseClicked(e -> handleMouseClick());
		}
		
		public char getToken() {
			return token;
		}
		
		public void handleMouseClick() {
			if(token == ' ' && whoseTurn != ' ') {
				setToken(whoseTurn);
				if(isWon(whoseTurn)) {
					whoseTurn = ' ';
				}else {
					whoseTurn  =(whoseTurn == 'X' ? 'O' : 'X');

				}
			}
		}
		
		public void setToken(char c) {
			token = c;
			
			if(token == 'X') {
				Line line1 = new Line(10,10, this.getWidth()-10,this.getHeight()-10);
				line1.endXProperty().bind(this.widthProperty().subtract(10));
				line1.endYProperty().bind(this.heightProperty().subtract(10));
				
				Line line2 = new Line(10,this.getWidth()-10,this.getHeight()-10,10);
				line2.startYProperty().bind(this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));

				this.getChildren().addAll(line1,line2);
			}else if(token == 'O') {
				Ellipse el = new Ellipse(this.getWidth()/2, this.getHeight()/2,
						this.getWidth()/2-10,this.getHeight()/2-10); 
				
				el.centerXProperty().bind(this.widthProperty().divide(2));
				el.centerYProperty().bind(this.heightProperty().divide(2));
				
				el.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
				el.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				
				el.setStroke(Color.BLACK);
				el.setFill(Color.WHITE);
				this.getChildren().add(el);
			}
		}
		
	}
	
	   public static void main(String[] args) {
	    	// starting the project
	        launch(args);
	    }
}
