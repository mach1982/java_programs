/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author mach
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField weightInput;
    @FXML
    private TextField heightInput;
    @FXML
    private Button bmiBnt;
    @FXML
    private Label bmiResult;
    @FXML
    private Label appNmae;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        bmiCalc bmic =new bmiCalc();
        DecimalFormat df = new DecimalFormat("#.##");
        //System.out.println("Test");
        
        bmic.setHeigth(Float.parseFloat(heightInput.getText()));
        bmic.setWeight(Float.parseFloat(weightInput.getText()));
        
        bmiResult.setText(""+df.format(bmic.getBMI()));
        
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
