import other.ListNode;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/20 13:44
 */
public class Question5 {
    public static void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
            return;
        ListNode left = head;
        ListNode rigth = head;
        ListNode temp = new ListNode(0);
        while(left!=null&&left.next!=null){
            while(rigth.next!=null){
                rigth = rigth.next;
            }
            temp = left.next;
            left.next=rigth;
            rigth.next = temp;
//            temp.next = rigth.next;
            while (temp.next!=rigth){
                temp = temp.next;
            }
            temp.next = null;
            left = left.next.next;
            rigth = left;
        }
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node = new ListNode(0);
        reorderList(node1);
        node =node1;
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
