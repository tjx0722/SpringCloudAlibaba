package zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortArr {
    /**
     * 描述 输入整型数组和排序标识，对其元素按照升序或降序进行排序
     *
     * 数据范围： 1≤n≤1000 ，元素大小满足 0≤val≤100000 输入描述： 第一行输入数组元素个数 第二行输入待排序的数组，每个数用空格隔开 第三行输入一个整数0或1。0代表升序排序，1代表降序排序
     *
     * 输出描述： 输出排好序的数字
     *
     * 输入： 8
     * 1 2 4 9 3 55 64 25
     * 0
     *
     * 输出： 1 2 3 4 9 25 55 64
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int count = 0;
        int num = 0;
        String[] arr = null;
        String order = "";
        while ((str = br.readLine()) != null) {
            count++;
            if (count == 1){
                num = Integer.parseInt(str);
            }else if (count == 2){
                arr = str.split(" ");
            }else if (count == 3){
                order = str;
                break;
            }
        }
        Integer[] newArr = new Integer[num];
        for (int i = 0; i < num; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }
        if ("1".equals(order)) {
            Arrays.sort(newArr, Collections.reverseOrder());
        }
        if ("0".equals(order)){
            Arrays.sort(newArr);
        }
        for (int tmp :
                newArr) {
            System.out.print(tmp+" ");
        }
    }
}
