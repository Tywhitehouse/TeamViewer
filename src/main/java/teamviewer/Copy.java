/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamviewer;

import java.util.Arrays;
import java.util.List;

/**
 * copies one list to another
 * @author tyler
 */
public class Copy {
    
    public void copyList(List<String[]> copy, List<String[]> source)
   {      
        copy.addAll(source);

   }
}
