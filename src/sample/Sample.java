/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.time.LocalDate;

/**
 *
 * @author maoohnishi
 */
public class Sample {
    
    public int calculator(int x, int y){
        
        // Java8が動くかどうかための処理
        LocalDate localDate = LocalDate.now();
        
        return x * y;
    }
    
}
