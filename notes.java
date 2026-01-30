//Circular linked list deletion code
// 
public static Node deleteLastNode (Node last) {
    if (last == null)
        return null;

Node head = last.next;

if (head == last) {
    last = null;
    return last;
}

Node curr = head;
while (curr.next != last) {
    curr = curr.next;
}

curr.next = head;
last = curr;
return last;

}

// Deletion at specific node

public static Node deleteSpecificNode (Node last, int key) {
    // first we check if our list is empty
    if (last == null) {
        return null;
    }

    Node curr = last.next; //ref to the start of the last
    Node prev = last;

    // if the node to be deleted is the only one in the last
    if (curr==last&&curr.data==key) {
        last = null;
        return last;
    }

    // ir the node to be deleted is the first node
    if (curr.data == key) {
        last.next = curr.next; 
        return last;
    }

    // traverse the list to search the node to be deleted
    while (curr != last && curr.data != key) {
        prev = curr;
        curr = curr.next;
    }

    // if the node the deleted is found
    if (curr.data == key) {
        prev.next = curr.next;
        if (curr == last) {
            last = prev;
        }
    }
    return last;
}


public static Node insertSpecificNode (Node last, int data, int target) {
    if (last == null) return null;
    Node curr = last.next;
    Node prev = last;
    Node newNode = new Node (data);

    // if target is the only node in last
    if (curr == last && curr.data == target) {
        curr.next = newNode;
    }

    // traverse to find target

    // if found 
}

public static Node insertAtPosition (Node last, int data, int pos) {
    if (last == null) {
        //if the list is empty
        if (pos != 1) {
            System.out.println("Invalid position");
            return last;
        }

        // create a new node and make it point to itself
        Node newNode = new Node (data);
        last = newNode;
        last.next = last;
        return last;

    }

    // Create a new node with the given data
    Node newNode = new Node (data);

    // curr will point to head initially
    Node curr = last.next;

    if (pos == 1) {
        // insert at beginning
        newNode.next = curr;
        last.next = newNode;
        return last;
    }
}