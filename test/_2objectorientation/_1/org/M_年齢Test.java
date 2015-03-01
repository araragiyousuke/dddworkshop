/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectorientation._1.org;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author 113108A003ZLA
 */
public class M_年齢Test {

    // 現在日付は20150202という前提

    @Test
    public void _未成年でないことを確認19950202(){
        M_年齢 age = new M_年齢("19950202");
        boolean expected = false;
        assertThat(age.未成年(), is(expected));
    }
    
    @Test
    public void _未成年であることを確認19950203(){
        M_年齢 age = new M_年齢("19950203");
        boolean expected = true;
        assertThat(age.未成年(), is(expected));
    } 

    @Test
    public void _高齢者でないことを確認19550203(){
        M_年齢 age = new M_年齢("19550203");
        boolean expected = false;
        assertThat(age.高齢者(), is(expected));
    }

    @Test
    public void _高齢者であることを確認19550202(){
        M_年齢 age = new M_年齢("19550202");
        boolean expected = true;
        assertThat(age.高齢者(), is(expected));
    }
}
