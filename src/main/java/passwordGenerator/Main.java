package passwordGenerator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label lengthLabel = new Label("Довжина пароля:");
        TextField lengthField = new TextField();

        Label uppercaseLabel = new Label("Включити верхній регістр:");
        CheckBox uppercaseCheckBox = new CheckBox();

        Label digitsLabel = new Label("Включити цифри:");
        CheckBox digitsCheckBox = new CheckBox();

        Label specialCharactersLabel = new Label("Включити спеціальні символи:");
        CheckBox specialCharactersCheckBox = new CheckBox();

        grid.add(lengthLabel, 0, 0);
        grid.add(lengthField, 1, 0);
        grid.add(uppercaseLabel, 0, 1);
        grid.add(uppercaseCheckBox, 1, 1);
        grid.add(digitsLabel, 0, 2);
        grid.add(digitsCheckBox, 1, 2);
        grid.add(specialCharactersLabel, 0, 3);
        grid.add(specialCharactersCheckBox, 1, 3);

        Button generateButton = new Button("Згенерувати пароль");
        grid.add(generateButton, 0, 4, 2, 1);

        TextArea passwordArea = new TextArea();
        passwordArea.setEditable(false);
        passwordArea.setWrapText(true);

        Button copyButton = new Button("Скопіювати");
        HBox resultBox = new HBox(passwordArea, copyButton);

        VBox mainLayout = new VBox(grid, resultBox);
        mainLayout.setSpacing(20);

        generateButton.setOnAction(event -> {
            int passwordLength = Integer.parseInt(lengthField.getText());
            boolean includeUppercase = uppercaseCheckBox.isSelected();
            boolean includeDigits = digitsCheckBox.isSelected();
            boolean includeSpecialCharacters = specialCharactersCheckBox.isSelected();

            GeneratePasswordByLength passwordGenerator = new GeneratePasswordByLength();
            String generatedPassword = passwordGenerator.generatePassword(passwordLength, includeUppercase, includeDigits, includeSpecialCharacters);

            passwordArea.setText("Згенерований пароль: " + generatedPassword);
        });

        copyButton.setOnAction(event -> {
            Clipboard clipboard = Clipboard.getSystemClipboard();
            ClipboardContent content = new ClipboardContent();
            content.putString(passwordArea.getText());
            clipboard.setContent(content);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Генератор паролів v1");
            alert.setHeaderText(null);
            alert.setContentText("Пароль скопійовано в буфер обміну.");
            alert.showAndWait();
        });

        Scene scene = new Scene(mainLayout, 400, 300);
        primaryStage.setTitle("Генератор паролів v1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

