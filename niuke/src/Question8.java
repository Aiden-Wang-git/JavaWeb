import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/9/1 12:59
 */
public class Question8 {
    public static int myAtoi(String str) {
        List<List<Integer>> list = new ArrayList<>();
        Boolean flag = true;
        StringBuilder newString = new StringBuilder();
        for (int i =0;i<str.length();++i){
            if ((Character.isSpaceChar(str.charAt(i))||(int)str.charAt(i)==(int)'-'||(int)str.charAt(i)==(int)'+')&&flag){
                if (!Character.isSpaceChar(str.charAt(i))){
                    newString.append(str.charAt(i));
                    flag =false;
                    continue;
                }
                else continue;
            }
            else if (((int)'0'<=(int)str.charAt(i)&&(int)str.charAt(i)<=(int)'9')){
                flag = false;
//                if ((int)str.charAt(i)==(int)'+')
//                    continue;
                newString.append(str.charAt(i));
                continue;
            }
            else break;
        }
        if (flag||newString.toString().equals("-")||newString.toString().equals("+"))
            return 0;
        long num = Long.parseLong(newString.toString());
        return (int)num==num?(int)num:(num>0?Integer.MAX_VALUE:Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("2147483648"));
    }
}
