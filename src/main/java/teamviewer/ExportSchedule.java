/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;

/**
 *
 * @author tyler
 */
public class ExportSchedule 
{
    /**
     * exports stored schedule as a csv file
     * @throws IOException 
     */
    public static void ExportSchedule() throws IOException {
        String STRING_ARRAY = "./export.csv";
        JFileChooser directoryChooser = new JFileChooser();
        directoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        directoryChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        directoryChooser.showSaveDialog(null);
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY));

            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
        ) {
            String[] headerRecord = {"Name", "Day", "Start Time", "End Time"};
            csvWriter.writeNext(headerRecord);
            csvWriter.writeNext(new String[]{"Sundar Pichai ♥", "sundar.pichai@gmail.com", "+1-1111111111", "India"});
        }
    }
}
