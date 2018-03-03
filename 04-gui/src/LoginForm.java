import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginForm extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginValidation validation = new LoginValidation();

        Text welcome = new Text("Welcome");
        Label usernameLabel = new Label("Username: ");
        Label passwordLabel = new Label("Password: ");
        TextField usernameField = new TextField();
        TextField passwordField = new TextField();
        Button login = new Button("Login");
        Text result = new Text();

        GridPane grid = new GridPane();
        grid.add(welcome, 0, 0);
        grid.add(usernameLabel, 0, 1);
        grid.add(passwordLabel, 0, 2);
        grid.add(usernameField, 1, 1);
        grid.add(passwordField, 1, 2);
        grid.add(login, 1, 3);
        grid.add(result, 1, 4);

        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                boolean valid = validation.validate(username, password);
                if(valid) {
                    result.setText("Welcome!");
                } else {
                    result.setText("Wrong credentials");
                }
            }
        });

        primaryStage.setScene(new Scene(grid, 600, 400));
        primaryStage.show();
    }
}
