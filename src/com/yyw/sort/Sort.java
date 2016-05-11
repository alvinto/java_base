package com.yyw.sort;

/**
 *常用的排序算法
 * Created by wangshuai on 2016/4/1.
 */
public class Sort {
    /**
     * 插入排序
     * 数组有n个元素
     * 假设n-1个元素已经从小到大排好序了，用第n个元素分别于n-1个元素比较，插入到比n打的前面，后面的元素后移
     * @param arrs
     * @return
     */
    public static int[] insertSort(int[] arrs){
        for(int i=1;i<arrs.length-1;i++){
            int temp = arrs[i];
            int j = i-1;
            for(;j>=0&&arrs[j]>temp;j--){//将大于temp的值整体后移
                arrs[j+1] = arrs[j];
            }
            arrs[j+1] = temp;
        }
        return arrs;
    }

    /**
     * 选择排序 在要排序的数组中选择一个最小的数与第一个交换；
     * 然后在剩下的数中选一个最小的与第二个交换；
     * 如此循环到倒数第二个数与最后一个数比较
     * @param arrs
     * @return
     */
    public static int[] selectSort(int[] arrs){
        int position=0;
        for(int i =0;i<arrs.length-1;i++){
            int j = i+1;
            int temp = arrs[i];
            position = i;
            for(;j<arrs.length-1;j++){
                if(arrs[j]<temp){
                    temp = arrs[j];
                    position = j;
                }
            }
            arrs[position] = arrs[i];
            arrs[i] = temp;
        }
        return arrs;
    }

    /**
     * 冒泡排序
     * 每次比较相邻的两个数，小数上浮
     * 第二次从第二个元素之后的数组比较相邻的两个数
     * @param args
     * @return
     */
    public static int[] bubbleSort(int[] args){
        int temp;
        for(int i = 0;i<args.length-1;i++){
            for(int j=i;j<args.length-1;j++){
                if(args[j] > args[i]){
                    temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        return args;
    }

    /**
     * 快速排序
     * @param args
     * @return
     */
    public static int[] quickSort(int[] args){
        quick(args);
        return args;
    }
    private static void quick(int[] args){
        if(args.length > 0){
            _quickSort(args,0,args.length-1);
        }
    }

    private static void _quickSort(int[] args,int low,int high){
        if(low < high){
            int middle = getMiddle(args,low,high);

            _quickSort(args,0,middle-1);
            _quickSort(args,middle+1,high);
        }
    }

    private static int getMiddle(int[] args,int low,int high){
        int temp = args[low];//数组的第一个作为中轴
        while(low < high){
            while(low < high && args[high]>temp){
                high -- ;
            }

            args[low] = args[high];//比中轴小的记录移到低端

            while(low<high && args[low] < temp){
                low ++;
            }
            args[high] = args[low];
        }
        args[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] temp = {5,1,6,7,4,2,3};

        for(int i : temp){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : Sort.insertSort(temp)){
            System.out.print(i + " ");
        }
        System.out.println("-------插入排序--------");

        for(int i : Sort.selectSort(temp)){
            System.out.print(i + " ");
        }
        System.out.println("-------选择排序--------");

        for(int i : Sort.bubbleSort(temp)){
            System.out.print(i + " ");
        }
        System.out.println("-------冒泡排序--------");

        for(int i : Sort.quickSort(temp)){
            System.out.print(i + " ");
        }
        System.out.println("-------快速排序--------");
    }
}
