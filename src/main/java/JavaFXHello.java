import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;








public class JavaFXHello extends Application {
    public static void run() {
        launch();
    }

    public class Runner {
        public static void main(String[] args) {
            JavaFXHello.run();
        }
    }
        
    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label1 = new Label("Hello from JavaFXHello.java: " + version);
        Label label2 = new Label("Hej IT 62450!");
        GridPane pane = new GridPane();
        pane.add(label1,0,0);
        pane.add(label2,1,1);
        Scene scene = new Scene(pane, 640,480);
        stage.setScene(scene);
        stage.show();

    }
}
