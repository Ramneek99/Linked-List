import java.util.*;
class Main {
    public static void main(String[] args)
    {
        // 1: Implement the private inner class Node in LinkedList

        // 2: Here in Main,  Make a new LinkedList with the generic parameter of Student.
        // Note that the constuctor in LinkedList is implemented for you.
        // What does the constructor initialize the list to?

        //the linkedList constructor initialize node to null


        LinkedList<Student> myList= new LinkedList<Student>();

        // 3: Define 5 Students, remember to invoke the constructor using the new command,
        // make them all have different ID's
        Student s1= new Student("Ramneek", 7001235);
        Student s2= new Student("Ishpreet", 7006372);
        Student s3= new Student("Vishwa", 70073162);
        Student s4= new Student("Dhruvin", 70076132);
        Student s5= new Student("Tirth", 70078381);


        // Implement addToFront and getLength in Linked List Add some of the students to the list using addToFront
        //print out the length run your program and make sure it equals the number of students before continuing
        myList.addToFront(s1);
        myList.addToFront(s2);
        myList.addToFront(s3);
        myList.addToFront(s4);
        myList.addToFront(s5);

        System.out.println("My List length is: " + myList.getLength());
        System.out.println("My List values are: "+myList.toString());



        //TODO 5: Implement toString in Node and LinkedList. The Node toString should just print out the data field of the node.
        // Note that toString is implemented in Student, so this should be easy--
        // creating a string out of the data should invoke the toString in Student
        // (i.e. if I have a student instance named A saying String x= ""+A; will invoke A's toString.
        // Alternatively you can explicitly call A.toString() from within Node (but understand why ""+A will work).
        // Then implement toString in LinkedList. If one prints out a list with two students (Eugenio and Daniqua),
        // with Danica added to the front first and Eugenio added second our list should look as follows head->name:
        // Eugenio id: 700555555->name: Daniqua id: 700444444->null   note the spaces. Print out your list to ensure it works.

        // Implement addToEnd in LinkedList and then add another Student,
        // but this time to the end, and print out the length (should be one more) and
        // the list to ensure it added the student to the end.
        Student s6= new Student("add end", 70078682);
        myList.addToEnd(s6);
        System.out.println("My List length is: " + myList.getLength());
        System.out.println("My List values are: "+myList.toString());

        // Implement removeFromFront in LinkedList and print out what is returned, should be the first student in the list.
        // Then print out the length (should be one less than what you had previously).
        // Finally print out the length to ensure it is correct using getLength
        myList.removeFromFront();
        System.out.println("My List length is: " + myList.getLength());
        System.out.println("My List values are: "+myList.toString());

        // Implement removeFromEnd in LinkedList and print out what is returned.
        // it should be the student who was at the end of the list, furthermore print out the list and
        // the length to ensure it has the right students in it. Note that this function is a bit more involved,
        // you may need to use 3 references as you iterate through the list (think about why?).
        // Make sure your algorithm will work with a list that is of length 1, length 2, length 3, and some big length like 5
        myList.removeFromEnd();
        System.out.println("My List length is: " + myList.getLength());
        System.out.println("My List values are: "+myList.toString());

        // Implement removeTarget in LinkedList. This should rely on the the Type T's equals.
        // Remember our T, though it's generic, is guaranteed to have this function because it's guaranteed to be an object.
        // In Student's case two students are equal if their student ID's are equal.
        // Test removeTarget with a student in the list to ensure that removeTarget returns the right value when you test
        // (and removes the actual student from the list when appropriate).
        System.out.println("Removing");
        myList.removeTarget(s3);
        System.out.println("My List length is: " + myList.getLength());
        System.out.println("My List values are: "+myList.toString());

    }
}
  