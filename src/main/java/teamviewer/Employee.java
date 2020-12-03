/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import java.util.ArrayList;


/**
 * 
 * holds employee array
 * @author tyler
 */
public class Employee
{
        private String name;
	private String day;
	private String startTime;
	private String endTime;
        
        ArrayList<String> employeeList = new ArrayList<>();
        public void addEmployee(String name, String day, String startTime, String endTime)
        {
            employeeList.add(name);
            employeeList.add(day);
            employeeList.add(startTime);
            employeeList.add(endTime);
            
            this.name = name;
            this.day = day;
            this.startTime = startTime;
            this.endTime = endTime;
        
        }

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
        public ArrayList getEmployeeList() {
		return employeeList;
	}
        
}