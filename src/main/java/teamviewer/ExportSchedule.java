/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import com.opencsv.CSVWriter;
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
    public static void ExportSchedule() throws IOException {
        String STRING_ARRAY = "./export.csv";
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        chooser.showSaveDialog(null);
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
        }
    }
}
