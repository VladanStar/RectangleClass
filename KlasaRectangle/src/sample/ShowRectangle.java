package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
public class ShowRectangle extends Application {

    @Override // Predefinisanje metoda start u klasi Application
    public void start(Stage primaryStage) {
        // Kreiranje okna
        Pane pane = new Pane();

        // Kreiranje pravougaonika i njihovo dodavanje u okno
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10, 27, "r1"));
        pane.getChildren().add(r1);

        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        pane.getChildren().add(new Text(10, 67, "r2"));
        pane.getChildren().add(r2);

        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        pane.getChildren().add(new Text(10, 107, "r3"));
        pane.getChildren().add(r3);

        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100, 50, 100, 30);
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(),
                    Math.random()));
            r.setFill(Color.WHITE);
            pane.getChildren().add(r);
        }

        // Kreiranje scene i njeno postavljanje u pozornicu
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("ShowRectangle"); // Unos naziva pozornice
        primaryStage.setScene(scene); // Stavljanje scene na pozornicu
        primaryStage.show(); // Prikaz pozornice
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}