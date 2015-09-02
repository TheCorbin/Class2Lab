/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author ryancorbin
 */
public class WelcomeService {
    
    
    public String dayTime(){
        String dayPeriod = "Night";
        
        Calendar currentTime = Calendar.getInstance();
        int hour = currentTime.get(Calendar.HOUR_OF_DAY);
        
        
        if (hour < 12 && hour >= 05){
            return "Morning";
        } else if (hour < 18 && hour >= 12){
            return "Afternoon";
        } else if (hour < 22 && hour >= 18){
            return "Evening";
        }
        
        return dayPeriod;
    }
    
    public String welcome(String name){
        String dayTime = dayTime();
        return "Good " + dayTime + ", " + name + ". Welcome!";
    }
    
    
    public double add(String n1, String n2){
        double num1, num2, sum;
        
        try{
            num1 = Double.parseDouble(n1);
            num2 = Double.parseDouble(n2);
            sum = num1 + num2;
            
        }catch(Exception e){
            sum = 0;
        }
        return sum;
    }
    
    
    
}
