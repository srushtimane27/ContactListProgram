import java.util.ArrayList;
import java.util.Iterator;

public class ContactListUC1 {


    public static void main(String[] args) {
// TODO Auto-generated method stub
        System.out.println("Array List Examples");
        ArrayList<String> al = new ArrayList<String>();
        al.add("First Name:");
        al.add("Last Name:");
        al.add("Address:");
        al.add("City:");
        al.add("Zip:");
        al.add("Phone Number:");
        al.add("Email ID:");


// Traversing Using Iterator
        Iterator itr = al.iterator();//getting the Iterator
        //check if iterator has the elements
        while (itr.hasNext())
            System.out.println(itr.next());//printing the element and move to next
    }
}