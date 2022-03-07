package LinkedList;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if(head == null){
            head = new Node<T>(data);
        }else{
            Node<T> node = this.head;
            //노드의 처음시작을 head로 가져오고
            //제일 마지막 노드까지 while을 통해 가져옴
            //마지막 노드.next 에 새로운 노드를 담으면 마지막에 노드를 담을수있음!!
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

}