import java.util.Stack;

/**
 * Created by panqiuhui on 2014/11/30.
 */
public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public void push(int x) {
        if (this.min.isEmpty() || this.min.peek() >= x) {
            this.min.push(x);
        }
        this.stack.push(x);
    }

    public void pop() {
        if (this.min.peek().equals(this.stack.peek())) {
            this.min.pop();
        }
        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.min.peek();
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(0);
        m.push(1);
        m.push(0);
        int min = m.getMin();
        System.out.println(min);
        m.pop();
        min = m.getMin();
        System.out.println(min);
    }
}
