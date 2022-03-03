package Stack;

import java.util.ArrayList;
import java.util.List;

public class MyStackEx<T> {

    private List<T> itemList = new ArrayList<>();

    public void push(T data){
        itemList.add(data);
    }

    public T pop(){
        if(itemList.isEmpty()){
            return null;
        }

        //return itemList.get(itemList.size()-1); 나는 get을 시도했으나 remove로 해야 삭제도되면서 가져올수있음..
        return itemList.remove(itemList.size()-1);
    }

    public boolean isEmpty() {
        return itemList.isEmpty();
    }

}