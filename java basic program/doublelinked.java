package linkedlist;
class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
    Node(int val,Node next,Node prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }
}
public class doublelinked {
    Node head=null;
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node temp=head;
Node last=null;
        while(temp!=null){
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println("------------------------------------");
        System.out.println("REVERSE THE LINKED LIST");
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }

    }


}
