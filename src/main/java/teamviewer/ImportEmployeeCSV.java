/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import javax.swing.JFileChooser;
import java.io.File;  
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
/**
 * open file selector
 * get employee name, start/end times from CSV
 * @author tyler
 */
public class ImportEmployeeCSV
{

    private String pickedFile;
    
    public void ImportEmployee() 
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.showOpenDialog(null);
        
        String csvFile = pickedFile;
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) 
            {

                // use comma as separator
                String[] employee = line.split(cvsSplitBy);

                /*
                print to ScheduleGraphics table
                
                */
                System.out.println("[Name = " + employee[4] + " , Start Time =" + employee[5] + "End Time" + employee[6] + "]");

            }

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

     
    }

}

