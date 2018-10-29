package com.liujie.common.vo;


/**
 * @Description:
 * @author : liujie
 * @Date: 2018/8/6 21:02
*/
public class Test {

    public static void main(String[] args) {
        User s = User.builder()
                    .age(15)
                    .name("liujie")
                    .build();
        System.out.println(s);




    }
}
