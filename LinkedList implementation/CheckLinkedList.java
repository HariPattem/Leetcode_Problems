
public class CheckLinkedList {

    public static void main(String [] args){
        LinkedList list=new LinkedList();
        list.insert(1);
        list.insert(4);
        list.insert(3);
        list.show();
        list.insertAtIndex(2, 5);
        list.show();
    }
}