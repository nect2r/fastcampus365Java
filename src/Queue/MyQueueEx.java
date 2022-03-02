package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyQueueEx<T> {

    private List<T> queueList = new ArrayList<>();

    public void enqueue(T data){
        queueList.add(data);
    }

    public T dequeue(){
        if(queueList.isEmpty()){
            return null;
        }

        return queueList.remove(0);
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }
}
