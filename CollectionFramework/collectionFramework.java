// Collection Framework 
// List --> ArrayList, LinkedList, Vector, Stack

import java .util.LinkedList;
import java.rmi.StubNotFoundException;
import java .util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Queue;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;




public class collectionFramework {
public static void main(String args[]){


    
//<<<<<<-------------------------------------------------------- ArrayList------------------------------------------------------------>>>>>>>

    ArrayList<Integer> table = new ArrayList<>();  // Creation of ArrayList syntax
    table.offer(10);
    table.offer(20);
    table.offer(30);
    table.offer(40);
    table.offer(2,25);  //this will offer element 25 at index 2.
    
    System.out.println(table);

    table.remove(1);  // this will delete the element at index 1.
    
    System.out.println(table);

    ArrayList<Integer> Table3 = new ArrayList<>();
    Table3.offer(100);
    Table3.offer(200);

    table.addAll(Table3);

    System.out.println(table);

    System.out.println(table.get(2));   // through get, we can print the element of given index.
    
    table.remove(Integer.valueOf(30));  // this will remove the element of value 30.     
    System.out.println(table);

    table.clear();  // this command will delete the element in the ArrayList.
    System.out.println(table);

    table.set(1,120);  // this will replace the existing element to new given element at given index.
    System.out.println(table);

    System.out.println(table.contains(40));   // this will find the element present in the array or not, if present/absent  then it will give the output as true/false.


    for (int i=0; i < table.size(); i++){
        System.out.println("the element is " + table.get(i));   //this will print all the element in next line.
    }


// <<<<<<---------------------------------------------------linkedList----------------------------------------------------------------------->>>>>>

LinkedList<Integer> table1 = new LinkedList<Integer>();
table1.offer(10); // here the index of the first element in LinkedList will be defined as 0, if we do not define error will occur.
table1.offer(15);
table1.offer(20);
table1.offer(25);
System.out.println(table1);
table1.remove(1);
System.out.println(table1);




//<<<<<<---------------------------------------------------------Stack------------------------------------------------------------------->>>>>>>>>>>


// Stack work on the principle of LIFO(last In First Out).

Stack<String> animals = new Stack<>();
animals.push("Tiger");   // In stack we use push to offer an element in stack.
animals.push("Elephant");
animals.push("Lion");
animals.push("Cat");

System.out.println(animals);

System.out.println(animals.peek());  // we peek() see the element which is at the peek/top.

animals.pop(); // pop() is used to remove the element from the stack.

System.out.println(animals.peek());



// <<<<<<<<------------------------------------------Queue------------------------------------------------------->>>>>>>>>>


Queue<Integer> queue = new LinkedList<>();

queue.offer(12);
queue.offer(22);
queue.offer(32);
queue.offer(28);

System.out.println(queue);  // Queue work on the principle of FIFO(First In First Out).



System.out.println(queue.poll()); // this poll() will remove element.

System.out.println(queue); // here 12 will not get in output becoz it has poll/remove.

System.out.println(queue.peek()); // this will tell head of the queue.



Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());    //Comparator.reverseOrder() is will print largest element at top.        

pq.offer(40);
pq.offer(12);
pq.offer(22);
pq.offer(32);
pq.offer(28);

System.out.println(pq);   // In priorityqueue the smallest element is on top.


// <<<<<----------------------------------------------Set------------------------------------------------------------------>>>>>>>

HashSet<Integer> set = new HashSet<>();
Set<Integer> set = new LinkedHashSet<>(); // LinkedHashSet will print in same order in like we given.
TreeSet<Integer> set = new TreeSet<>();   // This will give element in sorted order.

set.add(12);
set.add(65);
set.add(44);
set.add(41);

System.out.println(set);

set.add(12);
System.out.println(set);   // In hash we cannot add same element multiple times already 12 is present in set so it does print.



// <<<<<<<<<<<-------------------------------------------------------------Map---------------------------------------------------------------------------------->>>>>>>>>

map is use to store the vallue in key value pair.

Map<String, Integer> numbers = new HashMap<>();

numbers.put("fifteen",15);
numbers.put("thirty",30);
numbers.put("fifty",50);
numbers.put("thirtyone",31);

numbers.putIfAbsent("fifty", 50);

System.out.println(numbers);

// <<<-----------------------------------------------------------------TreeMap---------------------------------------------------------------------------------------->>

Map<String, Integer> numbers = new TreeMap<>(); // this print in dictionary order in sorted form.

numbers.put("one",1);
numbers.put("two",2);
numbers.put("three",3);
numbers.put("four",4);

System.out.println(numbers);
    }
}
