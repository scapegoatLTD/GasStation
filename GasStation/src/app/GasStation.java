/**
 * @file     GasStation.java
 * @date     14.04.2019
 */
package app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.;
import javafx.stage.Stage;

/**
 * @author BTIndustries
 * @version 0.1 - 2019
 */
public class GasStation extends Application {

	private Stage primaryStage;
	private Stage secondaryStage;
	private boolean login = false; //TODO: proper login function
	private WindowController windowController = new WindowController();
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.openLoginWindow();
		this. openMainFrame();
	}
	
	public void openMainFrame() {
		try {
			
			FXMLLoader loader = new FXMLLoader(GasStation.class.getResource("GasStationMainFrame.fxml"));

			TitledPane pane = loader.load();
			WindowController WindowController = loader.getController();
			WindowController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void openLoginWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(GasStation.class.getResource("LoginWindow.fxml"));
			Pane pane = loader.load();
			primaryStage.setMinHeight(400.00);
			primaryStage.setMaxHeight(500.00);
			
			LoginWindowController loginWindowController = loader.getController();
			loginWindowController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
