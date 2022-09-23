package problem.leetcode;

import java.util.Stack;

/** https://leetcode.com/problems/implement-queue-using-stacks/
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

public class Implement_Queue_using_Stacks {

    private Stack<Integer> stack;

    public Implement_Queue_using_Stacks() {
        this.stack = new Stack<>();
    }

    //요소 x를 큐 뒤쪽으로 푸시합니다.
    public void push(int x) {
        stack.push(x);
        System.out.println("stack push = " + stack);
    }

    //큐의 앞쪽에서 요소를 제거하고 반환합니다.
    public int pop() {
        System.out.println("stack pop = " + stack.pop());
        return stack.pop();
    }

    //큐의 맨 앞에 있는 요소를 반환합니다.
    public int peek() {
        if (!stack.isEmpty()) {
            stack.push(stack.pop());

        }

        return stack.peek();
    }

    //true큐가 비어 있으면 반환 하고 false그렇지 않으면 반환합니다.
    public boolean empty() {
        if (stack.isEmpty()) {
            return true;
        }
        System.out.println("stack empty = " + stack.empty());
        return false;
    }

    public static void main(String[] args) {
        Implement_Queue_using_Stacks obj = new Implement_Queue_using_Stacks();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.peek();


    }
}
