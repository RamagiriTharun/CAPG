package com.capgemini.packg;

import java.util.*;

public class ListExample {
    static void Example(){
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(10);
        l.add(30);
        l.stream().map(i->"Number"+i).forEach(s -> System.out.println(s));
//        l.add(null);
//        l.add(50);
//        l.add(null);
//        Set<Integer> s = new LinkedHashSet<Integer>(l);
//        System.out.println(s);
    }
    static void ArrayListMethod(){
        List<Boolean> li = new ArrayList<Boolean>(); //<> are known as generators we can specify the data type of elements to be stored.
        System.out.println("===Array List======");
        li.add(true);
        li.add(false);
        li.add(false);
        for(Boolean i:li){
            System.out.println(i);
        }
    }
    static void LinkedListMethod(){
        List<String> li = new LinkedList<String>();
        li.add("tharun");
        li.add("dinesh");
        li.add("kiran");
        System.out.println("=========Linked List===========");
        for(String s:li){
            System.out.println(s);
        }

    }
    static void PersonMethod(){
        List<Person> li = new LinkedList<Person>();
        li.add(new Person("tharun"));
        li.add(new Person("kiran"));
        li.add(2,new Person("Dinesh"));//to add element at particular index
        System.out.println("from" + li.get(2).getName());//to get individual element using index number
       // to access using index number with for loop
        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i).getName());
        }
        System.out.println("========Person List========");
        for(Person p:li){
            System.out.println(p.getName());
        }
    }
    static void VectorMethod(){
        List<String> li = new Vector<String>();
        li.add("human");
        li.add("being");
        System.out.println("Vector List=========");
        for(String s: li){
            System.out.println(s);
        }
    }
    static void LinkedQueueMethod(){
        Queue<String> q = new LinkedList<String>();
        q.add("ABC");
        q.add("DEF");
        q.add("LMN");
        System.out.println(q.peek());//Gives first element in the queue
        //System.out.println(q.poll());//Removes first element in queue and displays
        System.out.println("=====QUEUE LIST=====");
        for(String s:q){
            System.out.println(s);
        }
    }
    static void ArrayDeQueueMethod(){
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.addFirst(10);//adds the element at top
        q.addLast(15);//adds the element at bottom
        System.out.println("======Deque List=====");
        // displays and removes the first element
        // displays and removes the last element
        //System.out.println("POLL FIRST == " + q.pollFirst());
        //System.out.println("POLL LAST == " + q.pollLast());
        //displays the top element i.e. first element
        //System.out.println(q.peek());
        //displays the last element
        //System.out.println(q.peekLast());
        //displays the first element form top
        //System.out.println(q.peekFirst());
        //displays and removes the first element
        //System.out.println(q.poll());
        for(int i:q){
            System.out.println(i);
        }
//        Iterator<Integer> it = q.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

    }
    public static void main(String[] args) {
//        ArrayListMethod();
//        LinkedListMethod();
//        PersonMethod();
//        VectorMethod();
//        LinkedQueueMethod();
//        ArrayDeQueueMethod();
        Example();
    }
}
