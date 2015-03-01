/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1testcode._2;

import _1testcode._1.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class DataUtilTest {

    @Test
    public void _今日20150202は経過年数が０() {
        int actual = DataUtil.calculatorElapsedYears("20150202");
        int expected = 0;
        
        assertThat(actual, is(expected));
    }

    @Test
    public void _明日20150203は経過年数が０() {
        int actual = DataUtil.calculatorElapsedYears("20150203");
        int expected = 0;
        
        assertThat(actual, is(expected));
    }
    
    @Test
    public void _昨日20150201は経過年数が０() {
        int actual = DataUtil.calculatorElapsedYears("20150201");
        int expected = 0;
        
        assertThat(actual, is(expected));
    }

    @Test
    public void _去年20140202は経過年数が１() {
        int actual = DataUtil.calculatorElapsedYears("20140202");
        int expected = 1;
        
        assertThat(actual, is(expected));
    }

}
