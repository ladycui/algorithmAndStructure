package algorithmAndStructure.queueDemo;

import java.lang.reflect.Array;

/**
 * @Auther: cyn
 * @Date: 2019-12-04 16:14
 * @Description: 用数组实现一个循环队列
 * empty: head == tail;    full: (tail + 1) % size == head;
 * 循环队列的tail位置为空，浪费一个空间
 * attention: 范型数组的创建，不能用类似 items = (T[])new Object[size] 这种类型转换操作
 */
public class CircularQueue<T> {

    T[] items;
    int size;
    int head, tail;

    public CircularQueue(Class<T> type, int size) {
        this.size = size;
        items = (T[]) Array.newInstance(type, size);
        head = tail = 0;
    }

    public boolean enqueue(T item) {
        if (isFull()) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % size;
        return true;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T item = items[head];
        head = (head + 1) % size;
        return item;
    }


    private boolean isFull() {
        if ((tail + 1) % size == head) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        if (head == tail) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CircularQueue<String> queue = new CircularQueue<>(String.class, 5);
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        System.out.println(queue.enqueue("e"));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
