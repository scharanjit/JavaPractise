//package hihi;
//
//public static Node binarySearchTreeToDoublyLinkedList(Node root) {
//
//    // sentinel nodes
//    Node head = new Node();
//    Node tail = new Node();
//
//    // in-order traversal
//    binarySearchTreeToDoublyLinkedList(root, head, tail);
//
//    // re-move the sentinels and re-link;
//    head = head.right;
//    tail = tail.left;
//
//    if (head != null && tail != null) {
//        tail.right = head;
//        head.left = tail;
//    }
//
//    return head;
//}
//
///** In-order traversal **/
//private static void binarySearchTreeToDoublyLinkedList(Node currNode, Node head, Node tail) {
//    if (currNode == null) {
//        return;
//    }
//
//
//    // go left
//    //
//
//    binarySearchTreeToDoublyLinkedList(currNode.left, head, tail);
//
//    // save right node for right traversal as we will be changing current
//    // node's right to point to tail
//    //
//
//    Node right = currNode.right;
//
//    // first time
//    //
//
//    if (head.right == null) {
//
//        // fix head
//        //
//
//        head.right = currNode;
//        currNode.left = head;
//
//        // fix tail
//        //
//
//        tail.left = currNode;
//        currNode.right = tail;
//
//    } else {
//
//        // re-fix tail
//        //
//
//        Node prev = tail.left;
//
//        // fix current and tail
//        //
//
//        tail.left = currNode;
//        currNode.right = tail;
//
//        // fix current and previous
//        //
//
//        prev.right = currNode;
//        currNode.left = prev;
//    }
//
//    // go right
//    //
//
//    binarySearchTreeToDoublyLinkedList(right, head, tail);
//}
//}