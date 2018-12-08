/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weathergui;

import java.util.HashMap;
import java.util.Map;
import java.net.URLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.*;
import com.google.gson.reflect.*;

/**

/**
 *
 * @author mach
 */
public class WeatherAPI {
    
 
   
    
    public static Map<String ,Object> jsonToMap(String str){
        
        Map<String,Object> map =new Gson().fromJson(str, new TypeToken<HashMap<String,Object>> () {}.getType()
        
        );
        
        return map;
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public String[]  weatherResults() {
       //String apiKey="64c45a572899067dd41b4e88a80725a5";
  
       //API address
       String urlString="https://api.openweathermap.org/data/2.5/weather?id=2962334&appid=64c45a572899067dd41b4e88a80725a5&units=metric";
       
       //creating a String arry to store weather data
       String[] weatherData =new String[4];
       try{
           StringBuilder result = new StringBuilder();
           URL url = new URL(urlString);
           URLConnection conn = url.openConnection();
           BufferedReader rd =new BufferedReader (new InputStreamReader(conn.getInputStream()));
           String line;
           
           while((line =rd.readLine())!=null){
               result.append(line);
               
           }
           rd.close();
           //System.out.println(result);
           
           //Using Gson to get the Json data
           
           Map<String,Object> respMap =jsonToMap(result.toString());
           Map<String,Object> mainMap =jsonToMap(respMap.get("main").toString());
           Map<String,Object> windMap =jsonToMap(respMap.get("wind").toString());
           //Map<String,Object> locationMap =jsonToMap(respMap.get("name").toString());
               
           
          
      //adding to string to the weather data array     
      weatherData[0]=""+mainMap.get("temp");
       weatherData[1]=""+windMap.get("speed");
       weatherData[2]=""+mainMap.get("humidity");
       weatherData[3]=""+respMap.get("name");
       
           
           
           
       }catch(IOException e){
           
           System.out.println(e.getMessage());
           
       }
      
       return weatherData;
       
    }
    
}
