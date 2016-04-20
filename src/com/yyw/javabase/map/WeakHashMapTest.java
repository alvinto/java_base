package com.yyw.javabase.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * WeakHashMap  弱引用
 * WeakReference  ReferenceQueue
 * Created by wangshuai on 2016/4/19.
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        WeakHashMap<String,Object> weakHashMap = new WeakHashMap<String, Object>();

        String a = new String("a");
        String b = new String("b");

        hashMap.put(a,"aaa");
        hashMap.put(b,"bbb");

        weakHashMap.put(a,"aaa");
        weakHashMap.put(b,"bbb");

        readMap(hashMap);
        readMap(weakHashMap);

        hashMap.remove(a);

        a = null;
        b = null;
        System.gc();

        readMap(weakHashMap);
    }

    private static void readMap(Map<String,Object> map){
        Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Object> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("----------------------");
    }



}
