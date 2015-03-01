/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author maoohnishi
 */
public class SampleTest {
    
    @Test
    public void _かけ算(){
        
        Sample sample = new Sample();
        int actual = sample.calculator(3, 4);
        int expected = 12;
        
        assertThat(actual, is(expected));
        
    }
    
}
