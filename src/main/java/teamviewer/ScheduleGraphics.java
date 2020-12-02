/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *Gets: employee names, start/end dates.
 * @author tyler
 */

public class ScheduleGraphics 
{
    /**
     * 
     * @param employeeName
     * @param startTime
     * @param endTime 
     */
    public void DrawSchedule()
    {
        
        String[] columnNames = {"Employee", "Start Time", "End Time"};
        
        Object[][] data = 
        {
           {"Kathy", "Smith", "Snowboarding"},
           {"John", "Doe", "Rowing"},
           {"Sue", "Black", "Knitting"},
           {"Jane", "White", "Speed reading"},
           {"Joe", "Brown", "Pool"}
        };
            
        JTable ScheduleTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(ScheduleTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScheduleTable.setFillsViewportHeight(true);
        JPanel tablePane = new JPanel();
        tablePane.add(scrollPane);
      
        
    }
    
}
