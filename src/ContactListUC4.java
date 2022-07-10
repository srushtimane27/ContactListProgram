import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactListUC4 {


    public static void main(String[] args) {
// TODO Auto-generated method stub
        System.out.println("Array List Examples");
        ArrayList<String> al = new ArrayList<String>();
        al.add("First Name: Srushti");
        al.add("Last Name: Mane");
        al.add("Address: Ganesh Society");
        al.add("City: Pune");
        al.add("Zip: 41102");
        al.add("Phone Number: 5347589626");
        al.add("Email ID: abc@gmail.com");


// Traversing Using Iterator
        Iterator itr = al.iterator();//getting the Iterator
        while (itr.hasNext()) {//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
        for(String contactlist:al)
            System.out.println(contactlist);
        System.out.println("Deleting the element");


        al.remove(2);

        for(String contactlist:al)
            System.out.println();


    }
}
