import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreetingApp extends Application {

    @Override
    public void start(Stage stage) {

        // Create TextField
        TextField nameBox = new TextField();
        nameBox.setPromptText("Enter your name");

        // Create Label
        Label messageLabel = new Label("Enter your name");

        // Create Button
        Button greetButton = new Button("Greet");

        // Button click event
        greetButton.setOnAction(event -> {

            // Get name from TextField
            String name = nameBox.getText();

            // Display greeting
            messageLabel.setText("Hello, " + name + "!");
        });

        // Create VBox layout
        VBox root = new VBox(10);

        // Add controls
        root.getChildren().addAll(
                nameBox,
                greetButton,
                messageLabel
        );

        // Create Scene
        Scene scene = new Scene(root, 400, 250);

        // Set Scene
        stage.setScene(scene);

        // Set window title
        stage.setTitle("Greeting Application");

        // Show window
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}