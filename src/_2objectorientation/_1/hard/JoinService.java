/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectorientation._1.hard;

import _2objectorientation._1.easy.*;
import _1testcode._2.DataUtil;

public class JoinService {

    public boolean check(String name, String birthday) {

        int age = DataUtil.calculatorElapsedYears(birthday);
        if (age < 20) {
            return false;
        }

        return true;

    }

}
