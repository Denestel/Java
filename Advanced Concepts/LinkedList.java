/*******************************************************************************
@Title: LinkedList.java
@Purpose: Demonstrate basic understanding of linkedList and its basic functions
@Author: Mbianda Denestel
@Date: 11/25/17
@Version: 1.0
*******************************************************************************/



import java.util.*;
import java.util.LinkedList;

public class LinkedList{
  public static void main(String[] args) {

    LinkedList linkedListOne = new LinkedList();

    //Restrict the linked list to only accept 1 data type
    LinkedList<String> names = new LinkedList<String>();

    //add to the linked list
    names.add("Dennis");
    names.add("Joey");
    names.add("Kendra");

    //add into the last position of the list
    names.addLast("Marissa");

    //add into the first position of the list
    names.addFirst("Aubrey");

    //adding into a specified index
    names.add(0, "Luis");

    //replacing a value at a specified index
    names.set(2, "Paul");

    //removing from LinkedList
    names.remove(4);
    names.remove("Luis");

    //Enhanced for loop with linked list
    for (String name : names) {
      System.out.println(name);
    }


    //retrieving value based on index using get() function
    System.out.println("\nFisrt index: " + names.get(0));
    //get the last index
    System.out.println("\nLast index: " + names.getLast());

    //copy a LinkedList into a new linkedList
    LinkedList<String> nameCopy = new LinkedList<String>(names);

    //check if the linked list has a specified value
    //containsAll() used to check if two LinkedList both have exactly the same values
    if (names.contains("Paul")) {
      System.out.println("\nPaul here");
    }

    //find the index of a specified value
    System.out.println("\nPaul is at index: " + names.indexOf("Paul"));

    //check if a list is empty
    //returns a boolean value
    names.isEmpty();

    //find the size of the LinkedList
    names.size();

    //Look at the first element without throwing an error if there isnt one
    names.peek();

    //Look at and remove the first element
    nameCopy.poll();

    //Look at and remove the last element
    nameCopy.pollLast();

    //push a value onto the front of the list
    nameCopy.push("Witney");

    //removes the first element
    nameCopy.pop();

    //convert LinkedList into an array
    Object[] nameArray = new Object[7];
    nameArray = names.toArray();
    System.out.println(Arrays.toString(nameArray));

    //delete everything in the LinkedList
    names.clear();
    nameCopy.clear();
  }
}
