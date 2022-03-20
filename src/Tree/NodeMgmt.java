package Tree;

public class NodeMgmt {
    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE1: Node 가 하나도 없을 때
        if (this.head == null) {
            this.head = new Node(data);
            // CASE2: Node 가 하나 이상 들어가 있을 때
        } else {
            Node findNode = this.head;
            while (true) {
                // CASE2-1: 현재 Node 의 왼쪽에 Node 가 들어가야할 떄
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                    // CASE2-2: 현재 Node 의 오른쪽에 Node 가 들어가야할 떄
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        // CASE1: Node 가 하나도 없을 때
        if (this.head == null) {
            return null;
            // CASE2: Node 가 하나 이상 있을 떄떄
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            return null;
        }
    }

    public boolean delete(int value) {
        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        // 코너 케이스1: Node 가 하나도 없을 때
        if (this.head == null) {
            return false;
        } else {
            // 코너 케이스2: Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때때
            if (this.head.value == value && this.head.left == null && this.head.right == null) {
                this.head = null;
                return true;
            }

            while (currNode != null) {
                if (currNode.value == value) {
                    searched = true;
                    break;
                } else if (value < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }
        }

        if (searched == false) {
            return false;
        }

        // 여기까지 실행되면,
        // currNode 에는 해당 데이터를 가지고 있는 Node,
        // currParentNode 에는 해당 데이터를 가지고 있는 Node 의 부모 Node;

        // CASE1: 삭제할 Node 가 Leaf Node 인 경우
        if (currNode.left == null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;
            // CASE2: 삭제할 Node가 Child Node를 한 개 가지고 있을 경우
            // CASE2-1: 왼쪽에 Child Node 가 존재 하는 경우
        } else if (currNode.left != null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = currNode.left;
                currNode = null;
            } else {
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
            // CASE2-2: 오른쪽에 Child Node 가 존재 하는 경우
        } else if (currNode.right != null && currNode.left == null) {
            if (value < currParentNode.value) {
                currParentNode.left = currNode.right;
                currNode = null;
            } else {
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        } else {
            // CASE3-1: 삭제할 Node가 Child Node 를 두 개 가지고 있고, (삭제할 Node 가 부모 Node 의 왼쪽에 있을 떄)
            if (value < currParentNode.value) {
                Node changeNode = currNode.right;
                Node chageParentNode = currNode.right;
                while (changeNode.left != null) {
                    chageParentNode = changeNode;
                    changeNode = changeNode.left;
                }

                //CASE3-1-2: changeNode 의 오른쪽 Child Node 가 있을 때
                if (changeNode.right != null) {
                    chageParentNode.left = changeNode.right;
                    //CASE3-1-1: changeNode 의 Childe Node 가 없을 때
                } else {
                    chageParentNode.left = null;
                }
                currParentNode.left = changeNode;
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
                // CASE3-2: 삭제할 Node가 Child Node 를 두 개 가지고 있고, (삭제할 Node 가 부모 Node 의 오른쪽에 있을 떄)
            } else {
                Node changeNode = currNode.right;
                Node chageParentNode = currNode.right;
                while (changeNode.left != null) {
                    chageParentNode = changeNode;
                    changeNode = changeNode.left;
                }

                //CASE3-2-2: changeNode 의 오른쪽 Child Node 가 있을 때
                if (changeNode.right != null) {
                    chageParentNode.left = changeNode.right;
                    //CASE3-2-1: changeNode 의 Childe Node 가 없을 때
                } else {
                    chageParentNode.left = null;
                }

                currParentNode.right = changeNode;
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;

                currNode = null;
            }
            return true;
        }
    }
}
