package teamviewer;

import static org.junit.jupiter.*;
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
    public void teststuff()
    {
        assertNotNull([message,] object)
    }
    
    @Test
    void removeAccountRemovesAccountFromCustomer () {
        employee.removeEmployee("1");
        var customerAccount = employee.getAccount("1");
        assertNull(customerAccount, "Did not receive the expected null account value.");
    }
}
