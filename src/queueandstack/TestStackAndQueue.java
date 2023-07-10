package queueandstack;

public class TestStackAndQueue {

    public static void main(String[] args) {
        //Stack implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.deploy();


        //Queue implementation
        System.out.println("Queue implementation");
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.overView();
        queue.dequeue();
    }
}
