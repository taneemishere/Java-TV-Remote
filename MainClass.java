import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * MainClass
 */
public class MainClass extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        TVModel t1 = new TVModel();

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setVgap(5.5);
        pane.setHgap(5.5);

        Button pOnButton = new Button("P ");
        pane.add(pOnButton, 2, 2);
        GridPane.setHalignment(pOnButton, HPos.LEFT);
        pOnButton.setOnAction(e -> t1.power());

        Button oneButton = new Button("1");
        pane.add(oneButton, 4, 35);
        GridPane.setHalignment(oneButton, HPos.LEFT);
        oneButton.setOnAction(e -> t1.setChannel(1));

        Button twoButton = new Button("2");
        pane.add(twoButton, 10, 35);
        GridPane.setHalignment(twoButton, HPos.CENTER);
        twoButton.setOnAction(e -> t1.setChannel(2));

        Button threeButton = new Button("3");
        pane.add(threeButton, 14, 35);
        GridPane.setHalignment(threeButton, HPos.RIGHT);
        threeButton.setOnAction(e -> t1.setChannel(3));

        Button fourButton = new Button("4");
        pane.add(fourButton, 4, 40);
        GridPane.setHalignment(fourButton, HPos.LEFT);
        fourButton.setOnAction(e -> t1.setChannel(4));

        Button fiveButton = new Button("5");
        pane.add(fiveButton, 10, 40);
        GridPane.setHalignment(fiveButton, HPos.CENTER);
        fiveButton.setOnAction(e -> t1.setChannel(5));

        Button sixButton = new Button("6");
        pane.add(sixButton, 14, 40);
        GridPane.setHalignment(sixButton, HPos.RIGHT);
        sixButton.setOnAction(e -> t1.setChannel(6));

        Button sevenButton = new Button("7");
        pane.add(sevenButton, 4, 45);
        GridPane.setHalignment(sevenButton, HPos.LEFT);
        sevenButton.setOnAction(e -> t1.setChannel(7));

        Button eightButton = new Button("8");
        pane.add(eightButton, 10, 45);
        GridPane.setHalignment(eightButton, HPos.CENTER);
        eightButton.setOnAction(e -> t1.setChannel(8));

        Button nineButton = new Button("9");
        pane.add(nineButton, 14, 45);
        GridPane.setHalignment(nineButton, HPos.RIGHT);
        nineButton.setOnAction(e -> t1.setChannel(9));

        Button zeroButton = new Button("0");
        pane.add(zeroButton, 4, 50);
        GridPane.setHalignment(zeroButton, HPos.LEFT);
        zeroButton.setOnAction(e -> t1.setChannel(0));

        Button CSButton = new Button("CS");
        pane.add(CSButton, 14, 50);
        GridPane.setHalignment(CSButton, HPos.RIGHT);
        CSButton.setOnAction(e -> t1.currentSates());

        Button cUButton = new Button("C+");
        pane.add(cUButton, 10, 20);
        GridPane.setHalignment(cUButton, HPos.CENTER);
        cUButton.setOnAction(e -> t1.channelUp());

        Button cDButton = new Button("C- ");
        pane.add(cDButton, 10, 24);
        GridPane.setHalignment(cDButton, HPos.CENTER);
        cDButton.setOnAction(e -> t1.channelDown());

        Button vUButton = new Button("V+");
        pane.add(vUButton, 12, 22);
        GridPane.setHalignment(vUButton, HPos.LEFT);
        vUButton.setOnAction(e -> t1.volumeUp());

        Button vDButton = new Button("V- ");
        pane.add(vDButton, 8, 22);
        GridPane.setHalignment(vDButton, HPos.RIGHT);
        vDButton.setOnAction(e -> t1.volumeDown());

        Scene scene = new Scene(pane, 345, 600);
        primaryStage.setTitle("Remote");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}