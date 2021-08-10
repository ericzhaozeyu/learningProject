package com.company.annotation;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/10 18:10
 * @since 1.5
 */
@SuppressWarnings("all")
public class AnnoDemo1 {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Deprecated
    public int add(int a,int b){
        return a +b;
    }


    public void de(){
        add(1,3);

    }
}
