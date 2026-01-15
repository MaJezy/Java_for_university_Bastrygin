package org.example.Lab5;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class WordShifter extends Application {

    private boolean leftToRight = true;

    @Override
    public void start(Stage stage) {
        TextField left = new TextField();
        TextField right = new TextField();
        Button toggle = new Button("→");

        toggle.setOnAction(e -> {
            if (leftToRight) {
                right.setText(left.getText());
                left.clear();
                toggle.setText("←");
            } else {
                left.setText(right.getText());
                right.clear();
                toggle.setText("→");
            }
            leftToRight = !leftToRight;
        });

        HBox root = new HBox(10, left, toggle, right);
        Scene scene = new Scene(root, 400, 100);

        stage.setTitle("Перекидыватель слов");
        stage.setScene(scene);
        stage.show();
    }
}
