/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import java.util.List;
import javax.swing.JFileChooser;
import java.io.File;  
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * open file selector
 * get employee name, day, start/end times from CSV
 * @author tyler
 */
public class ImportEmployeeCSV
{
    
    /**
     *
     * @return
     */
    public void ImportEmployee() 
    {
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.showOpenDialog(null);
        File pickedFile = fileChooser.getSelectedFile();
        List<String[]> employeeData = new ArrayList<>();
        
        Employee Employee = new Employee();
        MainWindow MainWindow = new MainWindow();

        
        String line = ""; 
        
        try
        {
        BufferedReader br = new BufferedReader(new FileReader(pickedFile));
        
            while((line = br.readLine()) != null)
            {               
                employeeData.add(line.split(","));               
            }
        Employee.setStoreEmployees(employeeData);
        MainWindow.copyList(employeeData);
        System.out.println("post import");
        System.out.println(Arrays.deepToString(employeeData.toArray()));
        }
        catch(FileNotFoundException e)
        {
           e.printStackTrace();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(ImportEmployeeCSV.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

}

