/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectorientation._1.org;

import _1testcode._2.DataUtil;

/**
 *
 * @author 113108A003ZLA
 */
public class M_年齢 {
    private final String val;
    
    public M_年齢(String val){
        this.val = val;
    }
    
    public boolean 未成年(){
        int age = DataUtil.calculatorElapsedYears(this.val);
        // 満20才未満を未成年とする
        if( age < 20){
            return true;
        }
        return false;
    }
    
    public boolean 高齢者(){
        int age = DataUtil.calculatorElapsedYears(this.val);
        // 満60才以上を未成年とする
        if( age >= 60){
            return true;
        }
        return false;
    }
}
