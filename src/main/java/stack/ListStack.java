package stack;

/**
 * @Auther: cyn
 * @Date: 2019-10-22 16:46
 * @Description:链表实现stack
 */
public class ListStack<T> {
    Node head;

    class Node {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    public void push(T value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public T pop() {
        if (head == null) {
            return null;
        }
        T value = head.value;
        head = head.next;
        return value;
    }
}
