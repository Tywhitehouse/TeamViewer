/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

/**
 * 
 * holds employee array
 * @author tyler
 */
public class Employee
{
   MainWindow MainWindow = new MainWindow();
  
   List<String[]> storedSchedule = new ArrayList<>();

   public void setStoreEmployees(List<String[]> fullSchedule)
   {
       //have to copy list because i cant get anything else to work
        storedSchedule.addAll(fullSchedule);

        System.out.println("set");
        System.out.println(Arrays.deepToString(storedSchedule.toArray()));
   }
   
    public List<String[]> getStoredSchedule()
    {
        return storedSchedule;    
    }
}