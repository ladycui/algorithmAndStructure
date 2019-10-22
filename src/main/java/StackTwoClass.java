/**
 * @Auther: cyn
 * @Date: 2019-09-26 16:54
 * @Description:
 */
public class StackTwoClass {

    // 链表实现（头插, with head node）
   static class Node {
        int value;
        Node next;
    }

    public void enter(Node stack, int value) {
        if (stack == null) {
            stack = new Node();
        }
        Node p = new Node();
        p.value = value;
        p.next = stack.next;
        stack.next = p;
    }


    public int out(Node stack) {
        if (stack.next == null) {
            throw new RuntimeException("stack is null");
        }
        Node p = stack.next;
        int value = p.value;
        stack.next = p.next;
        p = null;
        return value;
    }

    public static void main(String[] args) {
        StackTwoClass obj = new StackTwoClass();
        Node stack = null;
        obj.enter(stack, 1);
        System.out.println(obj.out(stack));
    }

}


