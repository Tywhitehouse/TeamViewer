/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

/**
 *gets:
 * name from add employee window
 * start/end time from add employee window
 * displays 
 * @author Tyler Whitehouse
 */
public class Employee 
{
   private String name; 
   private double startTime; 
   private double endTime; 
   
   public Employee(String pathToExcelFile) 
   { 
       this.name = name; 
       this.startTime = startTime; 
       this.endTime = endTime; 
   } 
   
   public String getName() 
   { 
       return name; 
   } 
   
   public void setName(String name) 
   { 
       this.name = name; 
   } 
   
   public double getStartTime() 
   { 
       return startTime; 
   } 
   
   public void setStartTime(double startTime) 
   { 
       this.startTime = startTime; 
   } 
   
   public double getEndTime() 
   { 
       return endTime; 
   } 
   
   public void setEndTime(double endTime) 
   { 
       this.endTime = endTime; 
   }
}
