/*******************************************************************************
@Title: DoubleEndedLinkedList.java
@Purpose: To get familiar with Doubly Linked List
@Author: Mbianda Denestel
@Date: 11/25/17
@Version: 2.0
*******************************************************************************/


public class DoubleEndedLinkedList {

      //Has reference to the first and the last link in the linkedList
      Neighbor firstLink;
      Neighbor lastLink;

      public void insertInFirstPosition(String homeOwnerName, int houseNumber){

          Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

          //Check if the list is empty
          if (isEmpty()) {
              lastLink = theNewLink;
          }

          theNewLink.next = firstLink;
          firstLink = theNewLink;
      }

      class Neighbor{
          public String homeOwnerName;
          public int houseNumber;

          public Neighbor next;
          public Neighbor previous;

          public Neighbor(String homeOwnerName, int houseNumber){

              this.homeOwnerName = homeOwnerName;
              this.houseNumber = houseNumber;
          }

          public void display(){

              System.out.println(homeOwnerName + ": " + houseNumber);
          }

          public String toString(){

              return homeOwnerName;
          }
      }//End of the Neighbor class
  }
