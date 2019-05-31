package Calculator.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.*;

public class CalcController {

	double firstInput = 0;
	double secondInput = firstInput;
	
	boolean hasOperator = false;
	boolean isAdd = false, isSub = false, isMult = false, isDiv = false;
	int result;
	
	@FXML Button equalButton;
	@FXML Button divideButton;
	@FXML Button multiplyButton;
	@FXML Button addButton;
	@FXML Button subtractButton;
	@FXML Button dotButton;
	@FXML Button invertButton;
	@FXML Button zeroButton;
	@FXML Button oneButton;
	@FXML Button twoButton;
	@FXML Button threeButton;
	@FXML Button fourButton;
	@FXML Button fiveButton;
	@FXML Button sixButton;
	@FXML Button sevenButton;
	@FXML Button eightButton;
	@FXML Button nineButton;
	@FXML Button clearButton;
	@FXML Button percentButton;
	
	@FXML TextField tf;
	
	@FXML
	public void input(ActionEvent e) {
		Button b = (Button) e.getSource();
		
		if(b == zeroButton) {
			if(!tf.getText().equals("0"))
				tf.setText(tf.getText() + "0");
			return;
		}
		
		if(b == oneButton) {
			if(tf.getText().equals("0"))
				tf.setText("1");
			else
				tf.setText(tf.getText() + "1");
			return;
		}
		
		if(b == twoButton) {
			if(tf.getText().equals("0"))
				tf.setText("2");
			else
				tf.setText(tf.getText() + "2");
			return;
			
		}
		
		if(b == threeButton) {
			if(tf.getText().equals("0"))
				tf.setText("3");
			else
				tf.setText(tf.getText() + "3");
			return;
		}
		
		if(b == fourButton) {
			if(tf.getText().equals("0"))
				tf.setText("4");
			else
				tf.setText(tf.getText() + "4");
			return;
		}
		
		if(b == fiveButton) {
			if(tf.getText().equals("0"))
				tf.setText("5");
			else
				tf.setText(tf.getText() + "5");
			return;
		}
		
		if(b == sixButton) {
			if(tf.getText().equals("0"))
				tf.setText("6");
			else
				tf.setText(tf.getText() + "6");
			return;
		}
		
		if(b == sevenButton) {
			if(tf.getText().equals("0"))
				tf.setText("7");
			else
				tf.setText(tf.getText() + "7");
			return;
		}
		
		if(b == eightButton) {
			if(tf.getText().equals("0"))
				tf.setText("8");
			else
				tf.setText(tf.getText() + "8");
			return;
		}
		
		if(b == nineButton) {
			if(tf.getText().equals("0"))
				tf.setText("9");
			else
				tf.setText(tf.getText() + "9");
			return;
		}
		
		if(b == dotButton) {
			if(!tf.getText().contains("."))
				tf.setText(tf.getText() + ".");
			return;
		}
	}
	
	@FXML
	public void action(ActionEvent e) {
		Button b = (Button) e.getSource();
		
		if(b == equalButton) {
			if(hasOperator) {
				if(isAdd) {
					secondInput = Double.parseDouble(tf.getText());
					firstInput += secondInput;
					tf.setText("" + firstInput);
					hasOperator = false;
					isAdd = false;
					return;
				}
				else if(isSub) {
					secondInput = Double.parseDouble(tf.getText());
					firstInput -= secondInput;
					tf.setText("" + firstInput);
					hasOperator = false;
					isSub = false;
					return;
				}else if(isMult) {
					secondInput = Double.parseDouble(tf.getText());
					firstInput *= secondInput;
					tf.setText("" + firstInput);
					hasOperator = false;
					isAdd = false;
					return;
				}else if(isDiv) {
					secondInput = Double.parseDouble(tf.getText());
					if(secondInput == 0) {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("Error");
						alert.setHeaderText("Error in Division");
						alert.setContentText("Cannot divide by 0");
						alert.showAndWait();
						return;
					}else {
						firstInput /= secondInput;
						tf.setText("" + firstInput);
						hasOperator = false;
						isAdd = false;
						return;
					}
				}	
			}
		}
		
		if(b == invertButton) {
			if(hasOperator) {
				secondInput = Double.parseDouble(tf.getText());
				tf.setText("" + secondInput * -1);
				secondInput = secondInput * -1;
			}else {
				firstInput = Double.parseDouble(tf.getText());
				tf.setText("" + firstInput * -1);
				firstInput = firstInput * -1;
			}
			return;
		}
		
		if(b == percentButton) {
			if(hasOperator) {
				secondInput = Double.parseDouble(tf.getText());
				secondInput = secondInput/100;
				tf.setText(""+ secondInput);
			}else {
				firstInput = Double.parseDouble(tf.getText());
				firstInput = firstInput/100;
				tf.setText("" + firstInput);
			}
			return;
		}
		
		if(b == clearButton) {
			tf.setText("0");
			firstInput = 0;
			secondInput = firstInput;
			hasOperator = false;
			return;
		}
		
		
	}
	
	@FXML
	public void operators(ActionEvent e) {
		Button b = (Button) e.getSource();
		
		if(b == addButton) {
			firstInput = Double.parseDouble(tf.getText());
			tf.setText("0");
			hasOperator = true;
			isAdd = true;
			return;
		}
		
		if(b == subtractButton) {
			firstInput = Double.parseDouble(tf.getText());
			tf.setText("0");
			hasOperator = true;
			isSub = true;
			return;
		}
		
		if(b == multiplyButton) {
			firstInput = Double.parseDouble(tf.getText());
			tf.setText("0");
			hasOperator = true;
			isMult = true;
			return;
		}
		
		if(b == divideButton) {
			firstInput = Double.parseDouble(tf.getText());
			tf.setText("0");
			hasOperator = true;
			isDiv = true;
			return;
		}
	}
	
	
}
