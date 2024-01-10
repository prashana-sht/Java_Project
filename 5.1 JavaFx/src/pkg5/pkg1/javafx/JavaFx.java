
package pkg5.pkg1.javafx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFx extends Application{
 
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Layouts Example");

        // FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setHgap(50);
        flowPane.setVgap(10);
        for (int i = 1; i <= 3; i++) {
            flowPane.getChildren().add(new Button("Button " + i));
        }

        // BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Button("Top"));
        borderPane.setRight(new Button("Right"));
        borderPane.setBottom(new Button("Bottom"));
        borderPane.setLeft(new Button("Left"));
        borderPane.setCenter(new Button("Center"));

        // HBox
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        for (int i = 1; i <= 3; i++) {
            hBox.getChildren().add(new Button("Button " + i));
        }

        // VBox
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);
        for (int i = 1; i <= 3; i++) {
            vBox.getChildren().add(new Button("Button " + i));
        }

        // GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                gridPane.add(new Button("Button " + (i * 3 + j - 3)), j, i);
            }
        }

        Scene scene = new Scene(new VBox(flowPane, borderPane, hBox, vBox, gridPane), 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
