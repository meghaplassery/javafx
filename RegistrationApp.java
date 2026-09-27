import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationApp extends Application {

    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Name:");
        TextField name = new TextField();

        Label emailLabel = new Label("Email:");
        TextField email = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField password = new PasswordField();

        Label genderLabel = new Label("Gender:");

        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup();

        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        CheckBox terms = new CheckBox("Accept Terms");

        Button register = new Button("Register");

        Label result = new Label();

        register.setOnAction(e -> {

            if (name.getText().isEmpty()) {
                result.setText("Enter your name");
            }
            else if (!terms.isSelected()) {
                result.setText("Accept the terms");
            }
            else {
                result.setText("Registration Successful");
            }
        });

        GridPane grid = new GridPane();

        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(nameLabel, 0, 0);
        grid.add(name, 1, 0);

        grid.add(emailLabel, 0, 1);
        grid.add(email, 1, 1);

        grid.add(passwordLabel, 0, 2);
        grid.add(password, 1, 2);

        grid.add(genderLabel, 0, 3);
        grid.add(male, 1, 3);
        grid.add(female, 2, 3);

        grid.add(terms, 1, 4);

        grid.add(register, 1, 5);

        grid.add(result, 1, 6);

        Scene scene = new Scene(grid, 450, 300);

        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}