import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/13 7:40
 */
public class Qusetion2 {
    /**
     * @param tokens string字符串一维数组
     * @return int整型
     */
    public static int evalRPN(String[] tokens) {
        // write code here
        List<String> list_RPN = new ArrayList<>();
        int a;
        int b;
        for (String s : tokens)
            list_RPN.add(s);
        while (list_RPN.size() > 1) {
            for (int i = 0; i < list_RPN.size(); ++i) {
                if (list_RPN.get(i).equals("+")) {
                    a = new Integer(list_RPN.get(i - 2));
                    b = new Integer(list_RPN.get(i - 1));
                    list_RPN.set(i - 2, Integer.toString(a + b));
                    list_RPN.remove(i - 1);
                    list_RPN.remove(i-1);
                    System.out.println("加法");
                    break;
                }
                if (list_RPN.get(i).equals("-")) {
                    a = new Integer(list_RPN.get(i - 2));
                    b = new Integer(list_RPN.get(i - 1));
                    list_RPN.set(i - 2, Integer.toString(a - b));
                    list_RPN.remove(i - 1);
                    list_RPN.remove(i-1);
                    break;
                }
                if (list_RPN.get(i).equals("*")) {
                    a = new Integer(list_RPN.get(i - 2));
                    b = new Integer(list_RPN.get(i - 1));
                    list_RPN.set(i - 2, Integer.toString(a * b));
                    list_RPN.remove(i - 1);
                    list_RPN.remove(i-1);
                    break;
                }
                if (list_RPN.get(i).equals("/")) {
                    a = new Integer(list_RPN.get(i - 2));
                    b = new Integer(list_RPN.get(i - 1));
                    list_RPN.set(i - 2, Integer.toString(a / b));
                    list_RPN.remove(i - 1);
                    list_RPN.remove(i-1);
                    break;
                }
            }
        }
        return new Integer(list_RPN.get(0));
    }

    public static void main(String[] args) {
        String[] test = {"2","1","+","3","*"};
        System.out.println(evalRPN(test));
    }
}
