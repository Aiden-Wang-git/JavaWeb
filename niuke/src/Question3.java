/**
 * @description:
 * @author: WangJun
 * @time: 2020/8/16 11:17
 */

import other.ListNode;

import java.util.*;


public class Question3 {
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode now = head.next;
        ListNode last = head;
        while (now != null) {
            if (now.val <= newHead.next.val) {
                last.next = now.next;
                now.next = newHead.next;
                newHead.next = now;
                head = newHead.next;
            }
            else if (now.val >= last.val) {
                last = now;
            }
            else {
                while (now.val >= head.val) {
                    if (now.val <= head.next.val) {
                        last.next = now.next;
                        now.next = head.next;
                        head.next = now;
                        head = newHead.next;
                        break;
                    } else head = head.next;
                }
            }
            now = last.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(5, null);
        ListNode node1 = new ListNode(6, node);
        ListNode sort = insertionSortList(node1);
        while (sort != null) {
            System.out.println(sort.val);
            sort = sort.next;
        }
    }
}