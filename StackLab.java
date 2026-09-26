import java.util.*;

public class StackLab {
    private int[] arr;
    private int top;
    private static final int MAX = 10;

    StackLab() {
        arr = new int[MAX];
        top = -1;
    }

    void push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack overflow. Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println(x + "pushed onto stack.");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow . Cannot pop.");
            return;
        }
        System.out.println("Popped elements :" + arr[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element :" + arr[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements: ");
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class StackDemo {
    public static void main(String[] args) {
        StackLab s = new StackLab();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }

}
