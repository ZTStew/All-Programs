public class SinglyLinkedList {                                                 // creates a class named, 'SinglyLinkedList'
    public Node head;                                                           // the 'head' must be a node object
    public SinglyLinkedList() {                                                 // creates a method named, 'SinglyLinkedList'
        this.head = null;                                                       // sets 'head' (the first node) to be null
    }

    public void add(int value) {                                                // creates an 'add' method
        Node newNode = new Node(value);                                         // creates 'newNode' a new instance of 'Node'
        if(head == null) {                                                      // if there is no 'head'...
            head = newNode;                                                     // 'head' will then be equal to the 'newNode'
        } else {                                                                // else...
            Node runner = head;                                                 // creates 'runner' that is of type 'Node' and assigns it to the value of 'head'
            while(runner.next != null) {                                        // while there is a node after 'runner'...
                runner = runner.next;                                           // 'runner' will now be equal to the next value
            }
            runner.next = newNode;                                              // sets the null value after 'runner' to be 'newNode'
        }
    }

    public void remove(){                                                       // creates a 'remove' method
        Node runner = head;                                                     // creates 'runner' that is a 'Node' and sets it equal to 'head'
        while(runner.next.next != null){                                        // while there is a node two spaces ahead of 'runner'...
            runner = runner.next;                                               // assign 'runner' to the next node
        }
        runner.next = null;                                                     // sets the 'next' value of 'runner' equal to null 
    }

    public void printValues(){                                                  // creates a method named, 'printValues'
        Node runner = head;                                                     // creates 'runner' that is a 'Node' and sets it equal to 'head'
        System.out.println(runner.value);                                       // prints the current value of 'runner'
        while(runner.next != null){                                             // while there is a node ahead of 'runner'...
            runner = runner.next;                                               // runner is equal to the next node
            System.out.println(runner.value);                                   // prints the current value of 'runner'
        }
    }

    public void find(int num){
        Node runner = head;                                                     // creates 'runner' that is a 'Node' and sets it equal to 'head'
        while(runner != null){                                                  // while there is a 'runner'...
            if(runner.value == num){                                            // if the value of 'runner' is equal to 'num'...
                System.out.println("Found The Value: " + runner.value);         // prints statement saying it found the value
                return;                                                         // returns to end search
            }
            runner = runner.next;                                               // runner is equal to the next node
        }
        System.out.println("Value not found");                                  // if no value is found, print that no value was found
    }

    public void makeCount(){                                                    // makes a method named, 'makeCount'
        Node runner = head;                                                     // creates 'runner' that is a 'Node' and sets it equal to 'head'
        int count = 0;                                                          // creates a variable named, 'count' and sets it equal to 0
        while(runner != null){                                                  // while there is a 'runner'...
            count++;                                                            // incrament 'count' by one
            runner = runner.next;                                               // sets runner equal to the next node
        }
        System.out.println("Length of SLL is: " + count);                       // prints the total number of nodes
    }
}
