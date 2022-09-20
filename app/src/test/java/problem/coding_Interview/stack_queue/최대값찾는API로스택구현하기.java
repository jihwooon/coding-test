package problem.coding_Interview.stack_queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ## 미지의 것
 * push와 pop외에 max 연사을 제공하는 스택 클래스를 설계하라.
 * max() 메서드는 스택에 저장된 원소 중에서 가장 값이 원소를 반환하라.
 * ## 자료
 * - 스택
 * >> 선입후출, 후입 선출 구조다.
 * -
 * <p>
 * ## 조건
 * -
 * -
 * <p>
 * ## 계획
 * - element, max을 담을 요소를 만든다.
 * - 스택 기능을 구현한다.
 * -
 * <p>
 * ## 반성
 * -
 * -
 */


public class 최대값찾는API로스택구현하기 {

    public static class ElementWithCachedMax {
        public Integer element;
        public Integer max;

        public ElementWithCachedMax(Integer element, Integer max) {
            this.element = element;
            this.max = max;
        }
    }

    public static class Stack {
        private Deque<ElementWithCachedMax> elementWithCachedMaxes = new LinkedList<>();

        public boolean empty() {
            return elementWithCachedMaxes.isEmpty();
        }

        public Integer max() {
            if (empty()) {
                throw new IllegalStateException("pop() : empty stack");
            }
            return elementWithCachedMaxes.peek().max;
        }

        public Integer pop() {
            if (empty()) {
                throw new IllegalStateException("pop() : empty stack");
            }
            return elementWithCachedMaxes.removeFirst().max;
        }

        public void push(Integer x) {
            elementWithCachedMaxes.addFirst(
                    new ElementWithCachedMax(x, Math.max(x, empty() ? x : max()))
            );
        }
    }

    public static void main(String[] args) {
        ElementWithCachedMax elementWithCachedMax = new ElementWithCachedMax(1, 3);

        Stack stack = new Stack();
        stack.push(10);
        stack.push(12);
        stack.push(13);

//        Integer pop = stack.pop();
//        System.out.println("pop = " + pop);
//
//        Integer pop1 = stack.pop();
//        System.out.println("pop1 = " + pop1);
//
//        Integer pop2 = stack.pop();
//        System.out.println("pop2 = " + pop2);

        Integer max = stack.max();
        System.out.println("max = " + max);

    }

}
