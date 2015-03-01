/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectorientation._1.hard;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class PointFactoryTest {

    private final int goodsAmount = 100;

    @Test
    public void _64歳の場合は10ポイント() {

        int actual = PointFactory.calculateGrantPoint(goodsAmount, "19550203");
        int expected = 10;

        assertThat(actual, is(expected));

    }

    @Test
    public void _65歳の場合は20ポイント() {

        int actual = PointFactory.calculateGrantPoint(goodsAmount, "19550202");
        int expected = 20;

        assertThat(actual, is(expected));

    }
}
