package com.midium;

/**
 * @author Z33
 * @create 2020-04-06 20:20
 * @desc
 */
public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        ListNode node1 = l1;
        ListNode node2 = l2;
        int flag = 0;
        while (node1 != null || node2 != null) {
            int a = node1 == null ? 0 : node1.val;
            int b = node2 == null ? 0 : node2.val;
            int sum = a + b + flag;
            flag = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if (node1 != null) {
                node1 = node1.next;
            }
            if (node2 != null) {
                node2 = node2.next;
            }
        }
        if (flag > 0) {
            temp.next = new ListNode(flag);
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}