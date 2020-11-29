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
    
    public void ImportEmployee() 
    {
     
        String csvFile = "";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) 
            {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("[Name = " + country[4] + " , Start Time =" + country[5] + "End Time" + country[6] + "]");

            }

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

     
    }

}

