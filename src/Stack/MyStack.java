package Stack;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        //자료형 매개변수를 넣어서, 스택에 들어갈 데이터의 타입을 지정해야 함
        Stack<Integer> stack_int = new Stack<Integer>();

        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println("stack_int = " + stack_int.pop());
        System.out.println("stack_int = " + stack_int.pop());
        System.out.println("stack_int = " + stack_int.pop());
    }

}
