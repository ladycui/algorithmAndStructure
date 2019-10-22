package algorithmAndStructure.stack;

import java.lang.reflect.Array;

/**
 * @Auther: cyn
 * @Date: 2019-10-22 11:10
 * @Description: 数组实现stack
 */
public class ArrayStack<T> {
    int count;//size of stack
    int capacity;//capacity of stack
    T[] array;

    public ArrayStack(int capacity, Class<T> type) {
        this.count = 0;
        this.capacity = capacity;
        //T 运行时才知道具体类，编译期不知道
        array = (T[]) Array.newInstance(type, capacity);
    }

    //入栈
    public boolean push(T item) {
        if (count >= capacity) {
            return false;
        }
        array[count++] = item;
        return true;
    }

    //出栈
    public T pop() {
        if (count <= 0) {
            return null;
        }
        T item = array[count - 1];
        array[count - 1] = null;
        return item;
    }

}
