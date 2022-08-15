package zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZuoBiaoYiDong {
    /**
     * 描述 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
     *
     * 输入：
     *
     * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
     *
     * 坐标之间以;分隔。
     *
     * 非法坐标点需要进行丢弃。如AA10; A1A; $%$; YAD; 等。
     *
     * 下面是一个简单的例子 如：
     *
     * A10;S20;W10;D30;X;A1A;B10A11;;A10;
     *
     * 处理过程：
     *
     * 起点（0,0） + A10 = （-10,0） + S20 = (-10,-20) + W10 = (-10,-10) + D30 = (20,-10) + x = 无效 + A1A = 无效 + B10A11 = 无效 +
     * 一个空 不影响 + A10 = (10,-10) 结果 （10， -10）
     *
     * 数据范围：每组输入的字符串长度满足 \1≤n≤10000 ，坐标保证满足 -2^{31} < x,y < 2^{31}-1，且数字部分仅含正数
     *
     * 输入描述： 一行字符串
     *
     * 输出描述： 最终坐标，以逗号分隔
     *
     * 输入： A10;S20;W10;D30;X;A1A;B10A11;;A10; 输出： 10,-10
     */
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int[] arr = {0, 0};
        while ((str = reader.readLine()) != null) {
            List<String> strings = Arrays.asList(str.split(";"));
            List<String> collect = strings.stream().filter(s -> isOk(s)).collect(Collectors.toList());
            for (String data : collect) {
                if (data.charAt(0) == 'A') {
                    arr[0] -= Integer.parseInt(data.substring(1));
                } else if (data.charAt(0) == 'D') {
                    arr[0] += Integer.parseInt(data.substring(1));
                } else if (data.charAt(0) == 'W') {
                    arr[1] += Integer.parseInt(data.substring(1));
                } else if (data.charAt(0) == 'S') {
                    arr[1] -= Integer.parseInt(data.substring(1));
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.println(arr[i]);
                }else{
                    System.out.print(arr[i] + ",");
                }

            }

        }
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(";");
        int x = 0;
        int y = 0;
        for(String s : in){
            // 不满足题目给定坐标规则
            if(!s.matches("[WASD][0-9]{1,2}")){
                continue;
            }
            int val = Integer.valueOf(s.substring(1));
            switch(s.charAt(0)){
                case 'W':
                    y += val;
                    break;
                case 'S':
                    y -= val;
                    break;
                case 'A':
                    x -= val;
                    break;
                case 'D':
                    x += val;
                    break;
            }
        }
        System.out.println(x+","+y);
    }

    private static boolean isOk(String str) {

        if (str == null || "".equals(str) || str.length() > 3)
            return false;
        if (str.charAt(0) == 'A' || str.charAt(0) == 'S' || str.charAt(0) == 'D' || str.charAt(0) == 'W')
        {
            if (isNumeric(str.substring(1)))
                return true;
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }
}
