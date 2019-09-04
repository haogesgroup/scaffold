package com.chives.scaffold.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @AUthor yingluSun
 * @Date 2019/9/4 14:14
 **/
public class Music {


    public static void main (String [] agrg){
         new Music().aaa(new ArrayList());

    }

    public void bbb(){
        aaa(new ArrayList());
        aaa(new LinkedList());
    }

    public final void aaa (List list){
        if(list instanceof ArrayList){
            System.out.println("arrayList");
        }else if (list instanceof LinkedList){
            System.out.println("LinkedList");
        }
    }

}

