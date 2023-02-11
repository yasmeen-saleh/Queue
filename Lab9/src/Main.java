import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayQueue <Integer> queue= new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        ArrayQueue <Integer> queue1= new ArrayQueue<>();
        queue1.enqueue(4);
        queue1.enqueue(5);
        queue1.enqueue(6);
//
//        System.out.println("1-rotate.\n The queue before rotation:");
//        queue.print();
//        queue.rotate();
//        System.out.println("The queue after rotation:");
//        queue.print();
//
//        System.out.println("2-clone\nThe original queue::");
//        queue.print();
//        queue.clone(queue1);
//        System.out.println("The cloned queue :");
//        queue1.print();
//
//       LinkedQueue <Integer> q= new LinkedQueue<>();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//
//        LinkedQueue <Integer> q1= new LinkedQueue<>();
//        q1.enqueue(4);
//        q1.enqueue(5);
//        q1.enqueue(6);
//        System.out.println("3-concat.");
//        q.concat(q1);
//        System.out.println("The queue after concatenation:");
//        int s=q.size()-1;
//        while (s!=0){
//            System.out.println(q.dequeue());
//            s--;
//        }

        System.out.println("the winner is : "+queue.josephus(queue,3));



    }}