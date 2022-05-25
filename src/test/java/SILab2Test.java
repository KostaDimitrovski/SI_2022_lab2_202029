import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    public List<String> listString(String ... elements){
        return new ArrayList<>(Arrays.asList(elements));
    }
    @Test
    public void everyStatement(){
          IllegalArgumentException exception;
          exception=assertThrows(IllegalArgumentException.class, ()->SILab2.function(listString()));
          assertTrue(exception.getMessage().contains("List length should be greater than 0"));


          exception=assertThrows(IllegalArgumentException.class , ()->SILab2.function(listString("0","0")));
          assertTrue(exception.getMessage().contains("List length should be a perfect square"));

          assertEquals(listString("#", "1", "1", "#", "3", "#", "2", "#", "#"), SILab2.function(listString("#", "0", "0", "#", "0", "#", "0", "#", "#")));
    }
    @Test
    public void everyBranch(){
        IllegalArgumentException exception;
        exception=assertThrows(IllegalArgumentException.class, ()->SILab2.function(listString()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));


        exception=assertThrows(IllegalArgumentException.class , ()->SILab2.function(listString("0","0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        assertEquals(listString("0", "2", "#", "#", "1", "#", "3", "#", "1", "1", "1", "#", "#", "1", "0", "1"), SILab2.function(listString("0", "0", "#", "#", "0", "#", "0", "#", "0", "0", "0", "#", "#", "0", "0", "0")));
    }


}