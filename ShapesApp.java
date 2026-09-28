import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class ShapesApp extends Application {

    @Override
    public void start(Stage stage) {

        Circle circle = new Circle(50);
        circle.setFill(Color.BLUE);

        Rectangle rectangle = new Rectangle(100, 60);
        rectangle.setFill(Color.RED);

        Line line = new Line(0, 0, 150, 0);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(5);

        Button circleButton = new Button("Green Circle");
        Button rectangleButton = new Button("Yellow Rectangle");

        circleButton.setOnAction(e -> {
            circle.setFill(Color.GREEN);
        });

        rectangleButton.setOnAction(e -> {
            rectangle.setFill(Color.YELLOW);
        });

        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(
                circleButton,
                rectangleButton
        );

        HBox shapes = new HBox(30);

        shapes.getChildren().addAll(
                circle,
                rectangle,
                line
        );

        VBox root = new VBox(30);

        root.getChildren().addAll(
                shapes,
                buttons
        );

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}