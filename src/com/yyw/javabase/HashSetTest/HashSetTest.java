package com.yyw.javabase.HashSetTest;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangshuai on 2016/5/19.
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("abc");
        set.add(new String("abc"));
        System.out.println(set.size());

        Peason p1 = new Peason("wang",12);
        Peason p2 = new Peason("wang",12);

        set.add(p1);
        set.add(p2);

        System.out.println(set.size());

    }



}
