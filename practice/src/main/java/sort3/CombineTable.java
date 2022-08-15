package sort3;

import java.util.HashMap;
import java.util.Scanner;

public class CombineTable {
    /**
     * 描述 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并， 即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
     *
     *
     * 提示: 0 <= index <= 11111111 1 <= value <= 100000
     *
     * 输入描述： 先输入键值对的个数n（1 <= n <= 500） 接下来n行每行输入成对的index和value值，以空格隔开
     *
     * 输出描述： 输出合并后的键值对（多行）
     *
     * 输入： 4
     * 0 1
     * 0 2
     * 1 2
     * 3 4
     *
     * 输出：
     * 0 3
     * 1 2
     * 3 4
     */
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int count = 0;
        int num = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
//        map.keySet().stream().sorted().forEach(k -> System.out.println(k + " " + map.get(k)));
        while ((input = reader.readLine()) != null) {
            count++;
            if (count == 1) {
                num = Integer.parseInt(input);
            } else {
                if (map.containsKey(Integer.parseInt(input.split(" ")[0]))) {
                    int i1 = map.get(Integer.parseInt(input.split(" ")[0])) + Integer.parseInt(input.split(" ")[1]);
                    map.put(Integer.parseInt(input.split(" ")[0]), i1);
                } else {
                    map.put(Integer.parseInt(input.split(" ")[0]), Integer.parseInt(input.split(" ")[1]));
                }
                if (count - 1 == num) {
                    List<Integer> collect = map.keySet().stream().sorted().map(m -> m.intValue()).collect(Collectors.toList());
                    for (int x :collect) {
                        System.out.println(x+" "+map.get(x));
                    }
                    map = new HashMap<>();
                    count = 0;
                }
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            int k = scanner.nextInt();
            int v = scanner.nextInt();
//            map.merge(k, v, Integer::sum);
            map.merge(k, v, (v1,v2) -> v1+v2);
        }
        map.keySet().stream().sorted().forEach(k -> System.out.println(k + " " + map.get(k)));

    }

    /*public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int tableSize = scanner.nextInt();
        Map<Integer, Integer> table = new TreeMap<Integer, Integer>(tableSize);
        for (int i = 0; i < tableSize; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (table.containsKey(key)) {
                table.put(key, table.get(key) + value);
            } else {
                table.put(key, value);
            }
        }
        for (Integer key : table.keySet()) {
            System.out.println( key + " " + table.get(key));
        }
    }*/
}
