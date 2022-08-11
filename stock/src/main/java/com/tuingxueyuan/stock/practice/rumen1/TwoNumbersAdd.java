package com.tuingxueyuan.stock.practice.rumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoNumbersAdd {
    /**
     * 给出一个整型数组numbers，和一个目标值target，请在数组中找出两个加起来等于目标值的数的下标，返回的下标按升序排列。 （注：返回的数组下标从1开始算起，保证target一定可以由数组里面2个数字相加得到）
     * 输入：[3, 2, 4], 6 返回值：[2, 3] 说明：因为2 + 4 = 6 ，而2的下标为2 ， 4的下标为3 ，又因为下标2 < 下标3 ，所以返回[2, 3]
     * <p>
     * 输入：[20, 70, 110, 150], 90 返回值：[1, 2] 说明：20 + 70 = 90
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String next = str.replace(" ", "");
            List<Integer> arrs = Arrays.asList(next.substring(1, next.indexOf(']')).split(",")).stream()
                .map(data -> Integer.parseInt(data)).collect(Collectors.toList());
            int data = Integer.parseInt(next.substring(next.lastIndexOf(',') + 1));
            for (int i = 0; i < arrs.size(); i++) {
                for (int j = i + 1; j < arrs.size(); j++) {
                    if (arrs.get(i) + arrs.get(j) == data) {
                        System.out.println("[" + (i+1) + ", " + (j+1) + "]");
                    }
                }
            }
        }
    }
}
