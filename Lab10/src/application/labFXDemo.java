package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
public class labFXDemo extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
	  // Create a pane to hold the circle
	  Pane pane = new StackPane(); 
	  
	  Rectangle rectangle = new Rectangle();
	  rectangle.setWidth(400);
	  rectangle.setHeight(400);
	  rectangle.setStroke(Color.BLACK);
	  rectangle.setFill(Color.ORANGE);
	  pane.getChildren().add(rectangle); // Add rectangle to the pane
	  
	  // Create a circle and set its properties
	  Circle circle = new Circle();
	  circle.setRadius(100);
	  circle.setStroke(Color.BLACK);
	  circle.setFill(Color.VIOLET);
	  pane.getChildren().add(circle); // Add circle to the pane
	  // Create a label and set its properties
	  Label label = new Label("MATT DAVIES");
	  label.setFont(Font.font("Avenir",
	    FontWeight.BOLD, FontPosture.ITALIC, 20));
	  pane.getChildren().add(label);
	  // Create a scene and place it in the stage
	  Scene scene = new Scene(pane, 400, 300);
	  primaryStage.setTitle("FontDemo"); // Set the stage title
	  primaryStage.setScene(scene); // Place the scene in the stage
	  primaryStage.show(); // Display the stage

	}
	/**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	}
}