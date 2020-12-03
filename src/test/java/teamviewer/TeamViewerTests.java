package teamviewer;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import teamviewer.MainWindow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tyler Whitehouse
 */
public class TeamViewerTests 
{
    @Test
    @DisplayName ("Tests that a name for ")
    public final void testMain() 
    {
        String expectedResult = "Main running sucessfully";
        String actualResult;

        try{
            MainWindow.main(new String[0]);
            actualResult = "Main running sucessfully";
        }
        catch (RuntimeException e){
            actualResult = e.toString();
        }
        assertEquals("Should run without throwing an error.", expectedResult, actualResult);
    }
    
    @Test
    @DisplayName ("Tests that an employee name was entered.")
    public void testEmployeeName()
    {
//        String EmployeeName = Employee.getName;
//        assertNotNull(EmployeeName);
    }
    
    @Test
    @DisplayName ("Tests that a shift start time was entered.")
    public void testStartTime()
    {
 //       double startTime = Employee.getStartTime;
 //       assertNotNull(startTime);
    }
    
    @Test
    @DisplayName ("Tests that a shift end time was entered.")
    public void testEndTime()
    {
 //       double endTime = Employee.getEndTime;
 //       assertNotNull(endTime);
    }
    
}
