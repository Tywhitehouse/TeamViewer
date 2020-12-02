/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teamviewer;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.*;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.JScrollPane;

/**
 * 
 * @author tyler
 */


public class MainWindow 
{
        
       public void DrawMainWindow()
    {
        JMenu addScheduleMenu, helpMenu, exportScheduleMenu, removeScheduleMenu;
        JMenuItem manualAdd, importAdd, constraintAdd;
        
        JMenuBar menuBar = new JMenuBar();
        addScheduleMenu = new JMenu("Add Schedule"); 
        removeScheduleMenu = new JMenu("Remove Schedule");
        exportScheduleMenu = new JMenu("Export Schedule");
        JButton HelpButton = new JButton("Help");
        HelpWindow HelpWindow = new HelpWindow();      

        
        AddScheduleWindow AddScheduleWindow = new AddScheduleWindow();
        ImportEmployeeCSV ImportEmployeeCSV = new ImportEmployeeCSV();
        ScheduleGraphics ScheduleGraphics = new ScheduleGraphics();
        
        
        manualAdd = new JMenuItem("Manually Add Schedule");
        importAdd = new JMenuItem("Import Schedule");
        constraintAdd = new JMenuItem("Add Constraint");
        
        
        JFrame frame = new JFrame("Team Viewer");
        JPanel panel = new JPanel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        
        addScheduleMenu.add(manualAdd);
        addScheduleMenu.add(importAdd);
        addScheduleMenu.add(constraintAdd);
        
        menuBar.add(addScheduleMenu);
        menuBar.add(removeScheduleMenu);
        menuBar.add(exportScheduleMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(HelpButton);
        
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
        
        frame.add(tablePane, BorderLayout.CENTER);
             
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );   
        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);       
        
        manualAdd.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {                    
                AddScheduleWindow.DrawScheduleWindow();
            }
        });
        
        HelpButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {                    
                HelpWindow.DrawHelpWindow();
            }
        });
        
        importAdd.addActionListener(new ActionListener() 
        {                         
            @Override
            public void actionPerformed(ActionEvent e) 
            {              
                JFrame frame2 = new JFrame("Team Viewer");
                frame2.setLayout(null);
                frame2.setVisible(true);
                frame2.setLocationRelativeTo(null);
                frame2.setSize(800, 600);
                
                
                ImportEmployeeCSV.ImportEmployee();
                
                
                
            }           
        });
    }
    
}
