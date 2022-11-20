package main.java.baseDemo.DataStructure;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序Demo
 * @Author zhangy
 * @Date 2022/8/31 21:34
 * @Version 1.0
 **/
public class BubbleSort {
    public static void main(String[] args) {
        // 创建待排序的80000个元素的数组
        int[] arr = new int[80000];
        // 生成[0, 80000)的随机数据
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 80000);
        }
        // 排序前的时间
        Date d1 = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr1 = s1.format(d1);
        System.out.println("排序前的时间是：" + dateStr1);

        // 排序
        bubbleSort(arr);

        // 排序后的时间
        Date d2 = new Date();
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr2 = s2.format(d2);
        System.out.println("排序后的时间是：" + dateStr2);
    }

    public static void bubbleSort(int[] arr) {
        // 时间复杂度O(n^2)
        // 临时变量
        int temp = 0;
        // 表示是否转换过的标识
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //System.out.println("第" + (i+1) + "趟后排序的数组");
            // 排序中未交换过
            if(!flag){
                break;
            } else {
                flag = false;
            }
        }
    }
}
