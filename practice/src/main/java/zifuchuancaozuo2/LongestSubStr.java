package zifuchuancaozuo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubStr {
    /**
     * 描述： 当一个字符串满足如下条件时，我们称它是美丽的：
     * 1.所有5个英文元音字母（‘a’,‘e’,‘i’,‘o’,‘u’）都必须至少出现一次
     * 2.这些元音字母的顺序都必须按照字典序升序排布
     * 比方说，字符串"aeiou"和"aaaaaaeiiiioou"都是美丽的，而"uaeio",“aeoiu"等不是美丽的
     * 给你一个只包含英文元音字母的字符串word，请你返回word中最长美丽子字符串的长度。如果不存在返回0
     * 子字符串： 是字符串中一个连续的字符串序列
     * 示例1:
     * 输入：word = “aeiaaioaaaaeiiiiouuuooaauuaeiu”
     * 输出：13
     * 解释：最长子字符串是"aaaaeiiiiouuu”,长度为13
     * 示例2：
     * 输入：word = “aeeeiiiioooauuuaeiou”
     * 输出：5
     * 解释：最长子字符串是 “aeiou” ，长度为 5 。
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            char[] chars = str.toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length - 1; i++) {

                if (chars[0]!='a')
                    continue;
                if (chars[i]=='a' && (chars[i+1] == 'a' || chars[i+1] == 'e')){
                    count ++;
                }else if (chars[i]=='e' && (chars[i+1] == 'e' || chars[i+1] == 'i')){
                    count ++;
                }else if (chars[i]=='i' && (chars[i+1] == 'i' || chars[i+1] == 'o')){
                    count ++;
                }else if (chars[i]=='o' && (chars[i+1] == 'o' || chars[i+1] == 'u')){
                    count ++;
                }else if (chars[i]=='u' && chars[i+1] == 'u'){
                    count ++;
                }else{
                    count = 0;
                }
            }
            System.out.println(count);
        }
    }
}
