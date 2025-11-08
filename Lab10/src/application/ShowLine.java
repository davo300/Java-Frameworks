import java.awt.event.ActionEvent;

import java.nio.channels.NonWritableChannelException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


class ShrinkHandler implements EventHandler<ActionEvent> {
@Override
public void handle(ActionEvent event) {
// TODO Auto-generated method stub
circlePane.shrink();
}

 }
 /**
 * The main method is only needed for the IDE with limited
 * JavaFX support. Not needed for running from the command line.
 */
 public static void main(String[] args) {
 launch(args);
 }
}
class CirclePane extends StackPane {
 private Circle circle = new Circle(50);
 public CirclePane() {
 getChildren().add(circle);
 circle.setStroke(Color.BLACK);
 circle.setFill(Color.WHITE);
 }

 public void enlarge() {
 circle.setRadius(circle.getRadius() + 2);
 }

 public void shrink() {
 circle.setRadius(circle.getRadius() > 2 ?
 circle.getRadius() - 2 : circle.getRadius());
 }
}