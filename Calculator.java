import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application {

    @Override
    public void start(Stage stage) {

        TextField num1 = new TextField();
        num1.setPromptText("First number");

        TextField num2 = new TextField();
        num2.setPromptText("Second number");

        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");

        Label result = new Label("Result:");

        HBox buttons = new HBox(10);

        buttons.getChildren().addAll(
                add, sub, mul, div
        );

        add.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());

            result.setText("Result: " + (a + b));
        });

        sub.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());

            result.setText("Result: " + (a - b));
        });

        mul.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());

            result.setText("Result: " + (a * b));
        });

        div.setOnAction(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());

            result.setText("Result: " + (a / b));
        });

        VBox root = new VBox(15);

        root.getChildren().addAll(
                num1,
                num2,
                buttons,
                result
        );

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}