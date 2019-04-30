/**
 * @file     WindowController.java
 * @date     28.04.2019
 */
package app;

import javafx.fxml.FXML;
/**
 * @author GRVN@BTI
 * @version  - 2019
 * @project GasStation
 */
public class WindowController {
	
	private GasStation gasStation;
	
	public void setMain(GasStation gastStation) {
		this.gasStation = gasStation;
	}
	
	@FXML
	public void handleChangedText() {
		
	}
	
	@FXML 
	public void handleClear() {
		
	}
}
