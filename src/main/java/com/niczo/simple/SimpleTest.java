package com.niczo.simple;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/9
 * @author lhc
 */
public class SimpleTest {

	public static void main(String[] args) {
		ListNode listNode = init();
		ListNode listNode1 = reverseBetween(listNode, 2, 4);
		while (listNode1 != null) {
			System.out.println(listNode1.val);
			listNode1 = listNode1.next;
		}
	}

	private static ListNode init() {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		return a;
	}

	static class ListNode {
		int val;
       	ListNode next;
       	ListNode(int x) {
       		val = x;
       	}
	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode begin = new ListNode(0);
		ListNode begin2 = begin;
		
		begin.next = head;

		ListNode temp = null;
		ListNode last = null;

		for (int i = 0; ; i++) {
			if (begin == null) {
				break;
			}
			if (i == m - 1) {
				head = begin;
			}

			if (i == m) {
				temp = new ListNode(begin.val);
				last = temp;
			} else if (i > m && i < n) {
				ListNode listNode = new ListNode(begin.val);
				listNode.next = temp;
				temp = listNode;
			} else if (i == n){
				ListNode next = begin.next;
				ListNode listNode = new ListNode(begin.val);
				listNode.next = temp;
				temp = listNode;

				head.next = temp;
				last.next = next;
			}
			begin = begin.next;
		}
		return begin2.next;
	}
}
