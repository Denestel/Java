/*******************************************************************************
@Title: LinkedList2.java
@Purpose: Demonstrate moderate understanding of linkedList and its basic functions
@Author: Mbianda Denestel
@Date: 11/25/17
@Version: 1.0
*******************************************************************************/

public class LinkedList2 {

  //Each link created will have a bookName and millionsSold
  public String bookName;
  public int millionsSold;
  //reference the next Link in te linkedList
  public Link next;

  //Create the constructor
  public Link(String bookName, int millionsSold){
    this.bookName = bookName;
    this.millionsSold = millionsSold;
  }

  //Display information about the links
  public void display(){
    System.out.println(bookName + ": " + millionsSold + ",000,000");
  }

  //function to return the name of the book
  public String toString(){
    return bookName;
  }

  public static void main(String[] args) {

  }
}
class LinkList {
  public Link firstLink;

  //initializes the first value of the linked list which is always null
  //this sets up the pointer
  LinkList(){
    firstLink = null;
  }

  public boolean isEmpty(){
    return(firstLink == null);
  }

  public void insertFirstLink(String bookName, int millionsSold){
    Link newLink = new Link(bookName, millionsSold);
    //connect the first link to the new link
    newLink.next = firstLink;
    firstLink = newLink;
  }
}
