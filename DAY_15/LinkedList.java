import java.util.Scanner;
import java.util.Arrays;

public class LinkedList{

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void addAtBegin(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void addAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void addAtPos(int pos,int data){
        if(pos==0){ addAtBegin(data); return;}
        Node temp=head;
        Node newnode = new Node(data);
        try{
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        } catch (NullPointerException e){
            System.out.println("The index is out of bound.");
        }
    }

    void display(){
        if(head == null){ System.out.println("Empty"); return;}
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteAtBegin(){
        if(head==null) return;
        head = head.next;
    }

    void deleteAtEnd(){
        if(head == null) return;
        if(head.next == null){ head = null; return; }
        Node current=head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    void deleteAtpos(int pos){
        if(pos==0){ deleteAtBegin(); return;}
        Node temp=head;
        try{
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        } catch (NullPointerException e){
            System.out.println("The index is out of bound.");
        }
    }

    void deleteFirstSpec(int data){
        Node temp = head;
        int pos=0;
        while(temp.data != data){
            temp = temp.next;
            pos++;
        }
        deleteAtpos(pos);
    }

    void deleteAllSpec(int data){
        Node temp = head;
        int pos = 0;
        while(temp != null){
            if(temp.data != data){
                temp = temp.next;
                pos++;
                continue;
            }
            deleteAtpos(pos);
            temp = temp.next;
        }
    }

    void updateAtpos(int pos, int data){
        Node temp = head;
        try{
            for(int i=0;i<pos;i++){
                temp = temp.next;
            }
            temp.data = data;
        } catch (NullPointerException e){
            System.out.println("Index is out of bound.");
        }
    }

    public static void main(String[] args){
        LinkedList l = new LinkedList();
        Scanner input = new Scanner(System.in);
        // System.out.println("1. AddAtBegin\n2. AddAtEnd\n3. AddAtPos");
        // System.out.println("4. DeleteAtBegin\n5. DeleteAtEnd\n6. DeleteAtPos");
        // System.out.println("7. UpdateAtPos\n0. Exit");
        // while(true){
        //     int choice = input.nextInt();
        //     switch(choice){
        //         case 0:
        //             System.out.println("Exit...");
        //             return ;
        //         case 1:
        //             l.addAtBegin();
        //             break;
        //         case 2:
        //             l.addAtEnd();
        //             break;
        //     }
        // }

        String s;
        while(true){
            System.out.print("\nCommand : ");
            s = input.next();
            String[] parts = s.split("\\(");
            switch(parts[0].stripLeading()){

                case "exit":
                    System.out.println("Exit...");
                    return ;

                case "display":
                    l.display();
                    break;

                case "addAtBegin":
                    l.addAtBegin(Integer.parseInt(parts[1].split("\\)")[0]));
                    break;
                case "addAtEnd":
                    l.addAtEnd(Integer.parseInt(parts[1].split("\\)")[0]));
                    break;
                case "addAtPos":
                    String[] num = parts[1].split("\\)")[0].split(",");
                    l.addAtPos(Integer.parseInt(num[0]),Integer.parseInt(num[1]));
                    break;
                case "deleteAtBegin":
                    l.deleteAtBegin();
                    break;
                case "deleteAtEnd":
                    l.deleteAtEnd();
                    break;
                case "deleteAtPos":
                    l.deleteAtpos(Integer.parseInt(parts[1].split("\\)")[0]));
                    break;
                case "updateAtPos":
                    String[] num1 = parts[1].split("\\)")[0].split(",");
                    l.updateAtpos(Integer.parseInt(num1[0]),Integer.parseInt(num1[1]));
                    break;
                case "deleteAllSpec":
                    l.deleteAllSpec(Integer.parseInt(parts[1].split("\\)")[0]));
                    break;
                case "deleteFirstSpec":
                    l.deleteFirstSpec(Integer.parseInt(parts[1].split("\\)")[0]));
                    break;
                default:
                    System.out.println("No commands found..");
            } 
            
        }

        // l.addAtEnd(1);
        // l.addAtEnd(2);
        // l.addAtEnd(3);
        // l.addAtEnd(2);
        // l.display();
        // l.deleteAllSpec(3);
        // l.deleteAllSpec(2);
        // l.display();
    }
}