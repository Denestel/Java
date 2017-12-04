/*******************************************************************************
@Title: Link.java
@Purpose: Demonstrate moderate understanding of linkedList and its basic functions
@Author: Mbianda Denestel
@Date: 11/25/17
@Version: 1.0
*******************************************************************************/

public class Link {

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
      LinkList theLinkedList = new LinkList();
      theLinkedList.insertFirstLink("Don Quiller", 550);
      theLinkedList.insertFirstLink("A tale of two cities", 200);
      theLinkedList.insertFirstLink("Lord of the Rings", 150);
      theLinkedList.insertFirstLink("The Giver", 325);

      theLinkedList.display();
      theLinkedList.removeFirst();
      System.out.println("I removed the first Link");
      theLinkedList.display();
      System.out.println("I am going to search for Don Quiller");
      System.out.println(theLinkedList.find("Don Quiller").bookName + " was found.");
      System.out.println("I am going to remove a book");
      theLinkedList.removeLink("Lord of the Rings");
      theLinkedList.display();
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

  public Link removeFirst(){
    Link linkReference = firstLink;
    //check if there is a first link
    if (!isEmpty()) {
      firstLink = firstLink.next;
    }
    else{
      System.out.println("Empty LinkedList");
    }
    return linkReference;
  }
  //To cycle through a LinkedList
  //Start at the reference stored in firstLink
  //then get the refrences stored in next for every link untill it returns null
  public void display(){
    Link theLink = firstLink;

    while(theLink != null){
        theLink.display();
        System.out.println("Next Link: " + theLink.next);
        theLink = theLink.next;
        System.out.println();
    }
  }
  //To find a link in a LinkedList
  //Check for the firstLink reference in the LinkedList
  //if there is no match, continue checking every reference stored in next until next returns null
  public Link find(String bookName){

    Link theLink = firstLink;

    if (!isEmpty()) {
      while(theLink.bookName != bookName){
        if(theLink.next == null){
          return null;
        }
        else{
          theLink = theLink.next;
        }
      }
    }
    else{
      System.out.println("Empty LinkedList");
    }
    return theLink;
  }
  //To remove a specific link
  //Cycle through all Links until there is a match
  //If the refenced link stored in LinkedLists firstLink matches, store the refrence next in firstLink as firstLink
  //If a match occurs elswhere, find the link that next equals the reference to remove
  //Get the reference named next in the Link to remove and assign it to the Link above
  public Link removeLink(String bookName){
    Link currentLink = firstLink;
    Link previousLink = firstLink;

    while(currentLink.bookName != bookName){
      if (currentLink.next == null) {
        return null;
      }
      else{
        previousLink = currentLink;
        currentLink = currentLink.next;
      }
    }

    if (currentLink == firstLink) {
      firstLink = firstLink.next;
    }
    else{
      previousLink.next = currentLink.next;
    }
    return currentLink;
  }
}
