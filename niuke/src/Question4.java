import jdk.nashorn.internal.ir.BaseNode;
import other.Binary_tree;

import java.util.ArrayList;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/16 15:49
 */
public class Question4 {
    public static void back_sort(Binary_tree root, ArrayList<Integer> list){
        if (root!=null){
            back_sort(root.left,list);
            back_sort(root.right,list);
//            list.add(root.val);
            System.out.println(root.val);
        }
    }

    public static void main(String[] args) {
        Binary_tree node4 =new Binary_tree(4,null,null);
        Binary_tree node5 = new Binary_tree(5,null,null);
        Binary_tree node3 = new Binary_tree(3,null,null);
        Binary_tree node2 = new Binary_tree(2,node4,node5 );
        Binary_tree node1 = new Binary_tree(1,node2,node3 );
        ArrayList<Integer> list = new ArrayList<>();
        back_sort(node1,list);
        for (int i : list){
            System.out.println(i);
        }

    }
}
