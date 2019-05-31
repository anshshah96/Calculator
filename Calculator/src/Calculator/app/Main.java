package Calculator.app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			Pane root = FXMLLoader.load(getClass().getResource("/Calculator/view/BasicCalcView.fxml"));
			primaryStage.setTitle("Calculator");
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
