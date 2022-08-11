package com.tuingxueyuan.stock.practice.rumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SuiJiShu {
    /**
     * 描述 明明生成了N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，
     * 然后再把这些数从小到大排序，按照排好的顺序输出。
     *
     * 数据范围： 1≤n≤1000 ，输入的数字大小满足 1≤val≤500
     *
     * 输入描述： 第一行先输入随机整数的个数 N 。 接下来的 N
     * 行每行输入一个整数，代表明明生成的随机数。 具体格式可以参考下面的"示例"。
     *
     * 输出描述： 输出多行，表示输入数据处理后的结果
     *
     * 输入：
     * 3
     * 2
     * 2
     * 1
     * 复制
     * 输出：
     * 1
     * 2
     * 复制
     * 说明：
     * 输入解释：
     * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到500之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
     * 2
     * 2
     * 1
     * 所以样例的输出为：
     * 1
     * 2
     */
    // treeSet就是有序不重复集合
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        int count = 0;
        int num = 0;
        Set<Integer> setList = new HashSet<>();
        while ((str = br.readLine()) != null) {
            count++;
            if (count == 1) {
                num = Integer.parseInt(str);
            } else {
                setList.add(Integer.parseInt(str));
            }
            if (count == num + 1)
                break;
        }

//        Comparator.comparingInt(setList)
        List<Integer> collect = setList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        for (Integer tmp :
                collect) {
            System.out.println(tmp);
        }
    }
}
