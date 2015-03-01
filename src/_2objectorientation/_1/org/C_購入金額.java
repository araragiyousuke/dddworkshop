/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectorientation._1.org;

/**
 *
 * @author 113108A003ZLA
 */
public class C_購入金額 {
    private final int val;
    private final float base_point_rate = (float) 0.1;
    private final int bonus_point_rate=2;
    
    public C_購入金額(int val){
        this.val = val;
    }
    
    public int 付与ポイント計算(M_年齢 birthday){
        if(birthday.高齢者()){
            return (int) (this.val * base_point_rate * 2);
        }
        return (int) (this.val * base_point_rate);
    }
}
