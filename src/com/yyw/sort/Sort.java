package com.yyw.sort;

/**
 *常用的排序算法
 * Created by wangshuai on 2016/4/1.
 */
public class Sort {
    /**
     * 直接插入排序
     *  插入排序 适合少量元素的数组
     *特点：stable sort、In-place sort
     最优复杂度：当输入数组就是排好序的时候，复杂度为O(n)，而快速排序在这种情况下会产生O(n^2)的复杂度。
     最差复杂度：当输入数组为倒序时，复杂度为O(n^2)
     插入排序比较适合用于“少量元素的数组”。
     循环不变式：在每次循环开始前，A[1...i-1]包含了原来的A[1...i-1]的元素，并且已排序。
     初始：i=2，A[1...1]已排序，成立。
     保持：在迭代开始前，A[1...i-1]已排序，而循环体的目的是将A[i]插入A[1...i-1]中，使得A[1...i]排序，因此在下一轮迭代开       始前，i++，因此现在A[1...i-1]排好序了，因此保持循环不变式。
     终止：最后i=n+1，并且A[1...n]已排序，而A[1...n]就是整个数组，因此证毕。
     * @param originalArray
     * @return
     */
    private static int[] insertSort(int[] originalArray){
        for(int i = 1;i<originalArray.length;i++){
            int temp = originalArray[i];
            for(int j = i-1;j>=0;j--){
                if(originalArray[j] > temp){
                    originalArray[j+1] = originalArray[j];
                    originalArray[j] = temp;
                }
            }
        }
        return originalArray;
    }

    /**
     * 选择排序
     * 将要排序的数组分为两部分，一部分已排序，一部分未排序；
     * 从后端未排序中选择一个最小值，放入前端已排序最后面
     * 特性：In-place sort，unstable sort。
     思想：每次找一个最小值。
     最好情况时间：O(n^2)。
     最坏情况时间：O(n^2)。
     * @return
     */
    private static int[] selSort(int[] originalArray){
        for(int i = 0;i<originalArray.length;i++){
            int m = i;
            for(int j = i+1;j<originalArray.length;j++){
                if(originalArray[m] > originalArray[j]){
                    m = j;
                }
            }
            if(m != i){
                int temp = originalArray[i];
                originalArray[i] = originalArray[m];
                originalArray[m] = temp;
            }
        }
        return originalArray;
    }


    public static void main(String[] args) {
        int[] temp = {5,1,6,7,4,2,3};
        int[] insertSortTemp = Sort.insertSort(temp);
        int[] selSortTemp = Sort.selSort(temp);
        for(int i : insertSortTemp){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : selSortTemp){
            System.out.print(i + " ");
        }
    }
}
