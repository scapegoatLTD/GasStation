/**
 * @file     loginWindowController.java
 * @date     25.04.2019
 */
package app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author GRVN@BTI
 * @version  - 2019
 * @project GasStation
 */
public class LoginWindowController {

	private GasStation gasStation;
	private Label label;
	private TextField textField;
	
	public void setMain(GasStation gasStation) {
		this.gasStation = gasStation;
	}
	
	@FXML
	public void handleChangedText() {
		
	}
	
	@FXML
	public void handleClear() {
		
	}
	
}
