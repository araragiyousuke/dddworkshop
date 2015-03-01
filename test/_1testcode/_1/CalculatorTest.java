/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1testcode._1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CalculatorTest {
    
    Calculator calculator = new Calculator();
    
    @Test
    public void _かけ算(){
        
        int actual = calculator.multiplicate(3, 4);
        int expected = 12;
        
        assertThat(actual, is(expected));
        
    }

    @Test
    public void _足し算(){
        
        int actual = calculator.add(3, 4);
        int expected = 7;
        
        assertThat(actual, is(expected));
        
    }
}
