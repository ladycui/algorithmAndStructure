/**
 * @Auther: cyn
 * @Date: 2019-09-26 14:08
 * @Description:
 */
public class ReverseLinkList {

    class Node {
        int value;
        Node next;
    }

    //insertInHead
    public void reverse(Node head) {
        Node p, q;
        p = head.next;
        head.next = null;
        while (p != null) {
            q = p.next;
            p.next = head.next;
            head.next = p;
            p = q;
        }
    }

    public Node initList(int len) {//insert a node in tail
        Node head = new Node();
        Node tail = head;
        for (int i = 1; i <= len; i++) {
            Node node = new Node();
            node.value = i;
            tail.next = node;
            tail = node;
        }
        return head;
    }

    //insert a node in head
    public Node initInHead(int len) {
        Node head = new Node();
        for (int i = 0; i < len; i++) {
            Node node = new Node();
            node.value = i;
            node.next = head.next;
            head.next = node;
        }
        return head;
    }

    public void printList(Node list) {
        Node p = list.next;
        while (p != null) {
            System.out.println(p.value);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkList obj = new ReverseLinkList();
        Node head;
        obj.printList(head = obj.initList(10));
        obj.reverse(head);
        obj.printList(head);
    }

}
