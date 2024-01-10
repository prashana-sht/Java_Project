/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg2.javafxuicontrols;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
/**
 *
 * @author user
 */
public class JavaFxUiControls extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

   @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX UI Controls Alternative");

        // Label
        Label label = new Label("Enter your name:");

        // TextField
        TextField textField = new TextField();
        textField.setPromptText("Type here");

        // Button
        Button button = new Button("Submit");
        button.setOnAction(e -> {
            String enteredText = textField.getText();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Hello, " + enteredText + "!");
            alert.showAndWait();
        });

        // RadioButton
        RadioButton radioButton = new RadioButton("Option 1");
        RadioButton radioButton2 = new RadioButton("Option 2");
        ToggleGroup radioGroup = new ToggleGroup();
        radioButton.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);

        // CheckBox
        CheckBox checkBox = new CheckBox("Check me");

        // Hyperlink
        Hyperlink hyperlink = new Hyperlink("Visit OpenAI");
        hyperlink.setOnAction(e -> getHostServices().showDocument("https://www.openai.com"));

        // Menu
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem menuItem = new MenuItem("Open");
        menuItem.setOnAction(e -> openFileChooser());
        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);

        // Tooltip
        Tooltip tooltip = new Tooltip("This is a tooltip");

        // VBox
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.getChildren().addAll(
                label,
                textField,
                button,
                radioButton,
                radioButton2,
                checkBox,
                hyperlink,
                menuBar,
                new Label("Hover over me:"),
                new Button("Button with Tooltip"),
                tooltip
        );

        // Set up the scene
        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }
}