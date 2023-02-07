/*
Implement a doubly linked list.
You will write an implementation of a doubly linked list. Implement a Node to 
hold a value and pointers to the next and previous nodes. Then implement a List 
which holds references to the first and last node and offers an array-like 
interface for adding and removing items:

push (insert value at back);
pop (remove value at back);
shift (remove value at front).
unshift (insert value at front);

To keep your implementation simple, the tests will not cover error conditions. 
Specifically: pop or shift will never be called on an empty list.
*/


class DoublyLinkedList<T> {

    class Node<T> {
        def data
        Node prev
        Node next

        Node(def value) {
            this.data = value
        }
    }

    Node<T> head
    Node<T> tail

    void push(T value) {
        def newNode = new Node(value)

        if (tail) {
            newNode.prev = tail
            tail.next = newNode
        }

        else
            head = newNode

        tail = newNode
    }

    T pop() {
        if (tail) {
            def newNode = tail

            if (newNode.prev) {
                newNode.prev.next = null
                tail = newNode.prev
            }

            else {
                head = null
                tail = null
            }

            newNode.data
        }
    }

    T shift() {
        if (head) {
            def newNode = head
            if (newNode.next) {
                newNode.next.prev = null
                head = newNode.next
            }

            else {
                head = null
                tail = null
            }

            newNode.data
        }
    }

    void unshift(T value) {
        def newNode = new Node(value)

        if (head) {
            newNode.next = head
            head.prev = newNode
        }
        else
            tail = newNode

        head = newNode
    }

    void printNode() {
        def current = head
        while (current != null) {
            println current.data
            current = current.next
        }
    }
}

def dll = new DoublyLinkedList()
dll.push(10)
dll.push(20)
dll.push(30)
dll.push(70)
dll.push(50)
dll.printNode()

println ('\n')
dll.pop()
dll.printNode()

println ('\n')
dll.unshift(100)
dll.printNode()

println ('\n')
dll.shift()
dll.printNode()