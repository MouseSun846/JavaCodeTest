package leetcode;
import static myprint.Print.*;

import Node.ListNode;

import java.util.List;

//链表节点俩俩进行交换
public class SwapPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        //判断为空或者只有一个节点
        if(cur == null || cur.next == null){
            return cur;
        }
        ListNode myList = new ListNode(0);
        ListNode ncur = myList;
        //遍历链表进行交换
        while(cur != null){
            ncur.next = cur.next;
            ncur = ncur.next;
            cur.next = cur.next.next;
            ncur.next = cur;
            if (cur.next == null) break;
            cur = cur.next;
            ncur = ncur.next;
            if (cur.next == null) break;

        }
        return myList.next;
    }


    public static void main(String[] args) {
        ListNode testNode = new ListNode(1);
        ListNode cur = testNode;
        for (int i = 0; i <3 ; i++) {
            cur.next = new ListNode(i+2);
            cur = cur.next;
        }
//        println(testNode);
        println(swapPairs(testNode)) ;
    }
}
