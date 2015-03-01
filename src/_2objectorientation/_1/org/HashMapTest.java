/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2objectorientation._1.org;

import java.util.HashMap;


/**
 *
 * @author 113108A003ZLA
 */
public class HashMapTest {
   public static void main(String args[]){
    HashMap<String,String> keyword = new HashMap<String,String>();
    HashMap<String,HashMap> area = new HashMap<String,HashMap>();
    HashMap<String,HashMap> label = new HashMap<String,HashMap>();

    keyword.put("りんご", "apple");
    keyword.put("ぶどう", "grapes");
    
    area.put("in",keyword);
    label.put("snr", area);

    if (keyword.containsKey("りんご")){
      System.out.print("りんごを英語にすると");
      System.out.println(keyword.get("りんご"));
    }else{
      System.out.println("指定したキーは存在しません");
    }
    if(area.containsKey("in")){
        if(area.get("in").containsKey("ぶどう")){
            System.out.println(area.get("in").get("ぶどう"));
        }
    }
  }

}
