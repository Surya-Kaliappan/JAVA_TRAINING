public class LinkedListDemo{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;return ;
        }
        newnode.next = head;
        head = newnode;
    }

    static void insertAtPos(int pos,int data){
        if(pos==0){
            insert(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp=head;
        try{
            for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        } catch(NullPointerException e){
            System.out.println("Out of Bound");
        }
    }

    static int count(){
        Node temp = head;
        int count=0;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        insert(1);
        insert(2);
        insert(3);
        insertAtPos(5,5);
        System.out.println("Total Count : "+count());
    }
}