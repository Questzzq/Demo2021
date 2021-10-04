package modules.structure;

import java.util.Queue;
import java.util.Stack;

/**
 * @author EricTseng
 * @date 2021/10/2 22:21
 */
public class LinkNodes {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        for(int i = 1; i <= 5; i++) {
            ListNode node = new ListNode(i);
            node.next = head;
            head = node;
        }
        printList(head);
        ListNode resHead = reverseList(head);
        printList(resHead);
    }

    public static void printList(ListNode head) {
        ListNode p = head;
        while (p.next != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println("\n");
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pre = null;
        ListNode cur = head;

        while(cur != null) {
            ListNode tmpNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmpNode;
        }

        return pre;

    }
}