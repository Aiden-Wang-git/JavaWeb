package other;

/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/16 11:19
 */

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

