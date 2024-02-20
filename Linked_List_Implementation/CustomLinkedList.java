package Linked_List_Implementation;


public class CustomLinkedList<T> {
   private Node<T> head;
   private int capacity=0;
    public void insert(T val){
      capacity++;
        Node<T> node=new Node<>();
        node.data=val;      
      if(head==null){
        head=node;
      }else{
        Node<T> tempHead=head;
        while(tempHead.next!=null){
            tempHead=tempHead.next;
        }
        tempHead.next=node;
      }
    }


    public void insertAt(int index,T val){
      capacity++;
      Node<T> node=new Node<>();
      node.data=val;

      if(index==0){
        node.next=head;
        head=node;
       return;
      }
      Node<T> n=head;
      for(int i=0;i<index-1;i++){
        n=n.next;
      }
      node.next=n.next;
      n.next=node; 
    }
    
    public void remove(int index){
      if(index>index){
        throw new IndexOutOfBoundsException();
      }
      Node<T> n=head;
      for(int i=0;i<index-1;i++){
          n=n.next;
      }
      
      n.next=n.next.next;
    
     capacity--;
    }


    public void insertAtEnd(T val){
       insert(val);
    }
    
    public void insertAtStart(T val){
      Node<T> node=new Node<>();
      node.data=val;
      node.next=head;
      head=node;
   }


  public boolean contains(T val){
    Node<T> node=head;
   while(node.next!=null){
    if(node.data.equals(val)){
        return true;
    }
    node=node.next;
   }
   if(node.data.equals(val)){
      return true;
   }
    return false;
  }

    public void show(){
        Node<T> n=head;
        if(n!=null){
          System.out.print("[ ");
        while(n!=null){
        System.out.print(n.data+" ");
        n=n.next;
    }
   System.out.println("]");
  }
   }
}
