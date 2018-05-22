package example4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Example4Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("Task 1");
        b1.setPrefSize(100, 50);
        Button b2 = new Button("Task 2");
        b2.setPrefSize(100, 50);

        Label l1 = new Label("Stauts");
        Label l2 = new Label("Stauts");

        TextField t = new TextField("bala7");

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(".. in progress");
                new Thread() {
                    public void run() {
                        try {
                            Thread.sleep(10_000);

                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    l1.setText(".. done");
                                }
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();

            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    l2.setText("... in progress");
                    Thread.sleep(10_000);
                    l2.setText("... done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });



        GridPane grid = new GridPane();
        grid.add(b1, 0, 0);
        grid.add(l1, 1, 0);
        grid.add(b2, 0, 1);
        grid.add(l2, 1, 1);
        grid.add(t, 1, 2);

        Scene scene  = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
