package teamviewer;

import static org.junit.jupiter.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tyler
 */
public class TeamViewerTests 
{
        @Test
    public final void testMain() 
    {
        String expectedResult = "Main running sucessfully";
        String actualResult;

        try{
            Scheduler.main(new String[0]);
            actualResult = "Main running sucessfully";
        }
        catch (RuntimeException e){
            actualResult = e.toString();
        }
        assertEquals("Should run without throwing an error.", expectedResult, actualResult);
    }
    @Test
    public void teststuff()
    {
        assertNotNull([message,] object)
    }
    
    @Test
    void removeAccountRemovesAccountFromCustomer () {
        Employee.removeEmployee("james", 2.15, 2.15);
        var customerAccount = Employee.getEmployee("james", 2.15, 2.15);
        assertNull(customerAccount, "Did not receive the expected null account value.");
    }
}
