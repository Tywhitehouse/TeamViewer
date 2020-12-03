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

/**
 * open file selector
 * get employee name, day, start/end times from CSV
 * 
 * @author tyler
 */
public class ImportEmployeeCSV
{
    File pickedFile = null;
 /**
  * opens file directory
  * sends employee schedule data to Employee class
  */
    public void ImportEmployee() 
    {
        Employee Employee = new Employee();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.showOpenDialog(null);
        File pickedFile = fileChooser.getSelectedFile();
      
        String line = "";
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(pickedFile));
            
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                Employee.addEmployee(values[0], values[1], values[2], values[3]);
            }
            
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
    /**
     * returns file chosen by fileChooser
     * @return 
     */
    public File GetImportFile() 
    {

        return pickedFile;

    }

}

