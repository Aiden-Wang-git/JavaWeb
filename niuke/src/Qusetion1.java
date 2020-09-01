import java.util.Scanner;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/11 8:55
 */
public class Qusetion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String test = scanner.next();
        String[] strings = test.split(" ");
        int length = strings.length;
        System.out.println(strings[length-1].length());
    }
}
