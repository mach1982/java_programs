/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weathergui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author mach
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label temp ;
    
    @FXML
    private Label tempID;
    
    WeatherAPI t=new WeatherAPI();
    
    @FXML
    private Label windID;
    @FXML
    private Label wind;
    @FXML
    private Label humidity;
    @FXML
    private Button button;
    @FXML
    private Label location;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //String fro getting weather data from API
        String[] weatherData =new String[3];
        weatherData = t.weatherResults();
        String cel ="\u00b0"+"C";
        
        //setting text of lables 
        temp.setText(weatherData[0]+cel);
        wind.setText(weatherData[1]);
        humidity.setText(weatherData[2]);
        location.setText(weatherData[3]);
        
        System.out.println(weatherData[0]);
        System.out.println(weatherData[1]);
        System.out.println(weatherData[2]);
        System.out.println(weatherData[3]);
        // TODO
    }    

    //Have to set this to invisiable
    @FXML
   private void handleButtonAction(ActionEvent event) {
    }
    
}
