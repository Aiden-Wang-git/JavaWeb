import javafx.beans.binding.StringBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/31 18:50
 */
public class Question7 {

    public static String convert(String s, int numRows) {
        if (numRows==1)
            return s;
        List<StringBuilder> rows =  new ArrayList<>();
        for (int j =0 ;j<Math.min(numRows,s.length());++j){
            rows.add(new  StringBuilder());
        }
        Math.min(3,4);
        int row = 0;
        Boolean flag = true;
        for (int i =0;i<s.length();++i) {
            rows.get(row).append(s.charAt(i));
            if (row==0||row==numRows-1)
                flag = !flag;
            row+=flag?-1:1;
        }
        StringBuilder ret =  new StringBuilder();
        for (StringBuilder s1 : rows)
            ret.append(s1);
        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("AB",1));
    }

}
