/**
 * 
 * ListTest
 * Create a test class for the reference based ADT list (Linked List) that tests all of the methods
of this class (e.g. isempty,size,add,remove etc)
 */
public class ListTest {
    public static void main(String[] args){
        ListReferenceBased testList = new ListReferenceBased();
        //test all of the methods of this class (this is horifically ugly, but it works)
        System.out.println("IsEmpty1 " + testList.isEmpty());
        System.out.println("Size1 " + testList.size());
        // Why is 1 the first indes ???
        testList.add(1, (int)2);
        testList.add(2, (int)3);
        testList.add(3, (int)4);
        System.out.println("IsEmpty2 " + testList.isEmpty());
        System.out.println("Size2 " + testList.size());
        System.out.println("Get2 " + testList.get(2));
        testList.displayList();
        testList.remove(2);
        System.out.println("IsEmpty3 " + testList.isEmpty());
        System.out.println("Size3 " + testList.size());
        System.out.println("Get3 " + testList.get(2));
        testList.removeAll();
        System.out.println("IsEmpty4 " + testList.isEmpty());
        System.out.println("Size4 " + testList.size());
        try{
               System.out.println("Get4 " + testList.get(2));
        }catch(ListIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        testList.add(1, "a");
        testList.add(2, "richard of york did battle in vain");
        testList.add(3, "ab");
        System.out.println("Longest String is: " + testList.listLongest());
    }
}
