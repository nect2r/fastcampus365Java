package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {

        //Integer 형 queue 선언
        Queue<Integer> queue_int = new LinkedList<Integer>();

        //String 형 queue 선언언
        Queue<String> queue_str = new LinkedList<String>();

        //데이터 추가는 add(value) 또는 offer(value) 를 사용함
        queue_int.add(1);

        //offer boolean 반환
        queue_int.offer(2);

        System.out.println("queue_int = " + queue_int);

        //poll() 과 remove()를 통해 큐의 아이템을 삭제할 수 있음
        queue_int.poll();

        System.out.println("queue_int = " + queue_int);

        MyQueueEx<Integer> mq = new MyQueueEx<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);

        System.out.println("mq.dequeue() = " + mq.dequeue());
        System.out.println("mq.dequeue() = " + mq.dequeue());
        System.out.println("mq.dequeue() = " + mq.dequeue());

    }
}
