package com.yyw.javabase.object;

/**
 * 值引用和对象引用的区别
 * Created by wangshuai on 2016/5/17.
 */
public class ValueObjectRefer {
    public static void main(String[] args) {
        int temp = 10;
        calculate(temp);
        System.out.println(temp);
        User user1 = new User("bbbbb");
        setName(user1);
        System.out.println(user1.getName());

    }

    public static int calculate(int i){
        return i+10;
    }
    public static void setName(User user){
        user.setName("aaaa");
        user = new User();
    }

}
