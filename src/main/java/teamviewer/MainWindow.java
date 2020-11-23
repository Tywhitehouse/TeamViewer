/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teamviewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

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
        HelpWindow HelpWindow = new HelpWindow();
        AddScheduleWindow AddScheduleWindow = new AddScheduleWindow();
        JButton HelpButton = new JButton("Help");
        
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
        
        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        manualAdd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {                    
            AddScheduleWindow.DrawScheduleWindow();
            }
        });
        
        HelpButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {                    
            HelpWindow.DrawHelpWindow();
            }
        });
        
    }
    
}
