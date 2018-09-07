public class ListTester {                                                       // creates an class named, 'ListTester'
    public static void main(String[] args){                                     // creates an entry point method that expects no returns
        SinglyLinkedList sll = new SinglyLinkedList();                          // creates 'sll', an instance of 'SinglyLinkedList'
        sll.add(3);                                                             // uses the 'add' method of 'sll' and gives it a value
        sll.add(4);                                                             // uses the 'add' method of 'sll' and gives it a value
        sll.add(10);                                                            // uses the 'add' method of 'sll' and gives it a value
        sll.add(5);                                                             // uses the 'add' method of 'sll' and gives it a value
        sll.add(15);                                                            // uses the 'add' method of 'sll' and gives it a value
        sll.add(2);                                                             // uses the 'add' method of 'sll' and gives it a value
        sll.remove();                                                           // uses the 'remove' method of 'sll'
        sll.remove();                                                           // uses the 'remove' method of 'sll'
        sll.printValues();                                                      // uses the 'printValues' method of 'sll'
    
        sll.find(5);                                                            // uses the 'find' method of 'sll' and gives it a value
        sll.find(15);                                                           // uses the 'find' method of 'sll' and gives it a value

        sll.makeCount();                                                        // uses the 'makeCount' method of 'sll'
    }
}
