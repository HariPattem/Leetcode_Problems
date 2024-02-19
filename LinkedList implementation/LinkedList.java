/**
 * LinkedList
 */
public class LinkedList {
 private Node head;
 public void insert(int val){
     Node node=new Node();
        node.data=val;
        if(head==null){
           head=node;
        } else{
            Node n=head;
            while(n.next!=null){
               n=n.next;
            }
            n.next=node;
        }
       
 }
 public void show(){
    Node n=head;
    while(n.next!=null){
    System.out.print(n.data+"  ");
    n=n.next;
    } 
    System.out.println(n.data);
}

public void insertAtStart(int val){
    Node newNode=new Node();
    newNode.data=val;
    newNode.next=head;
    head=newNode;
}

public void insertAtEnd(int val){
    insert(val);
}

public void insertAtIndex(int position, int val){
    Node newNode=new Node();
    newNode.data=val;
    if(position==0){
        newNode.next=head;
        head=newNode;
        return;
    }
    Node n=head;
   for(int i=0;i<position-1;i++){
      n=n.next;
   }
   newNode.next=n.next;
    n.next=newNode;
}

 public void removeAtIndex(int position){
    Node n=head;
   if(position==0){
     head=n.next;
   }
   for(int i=0;i<position-1;i++){
    n=n.next;
    }
     n.next=n.next.next;
 }
  public boolean contains(int val){
    Node n=head;
    while(n.next!=null){
        if(n.data==val){
             return true;
        }
      n=n.next;
    }
    if(n.data==val){
       return true;
    }
return false;
  }  
}