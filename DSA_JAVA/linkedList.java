//import java.io.*;
/** 
class linkedList{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static linkedList insert(linkedList lis1,int data){
        Node node = new Node(data);
        node.next = null;
        if(lis1.head==null){
            lis1.head = node;
        }
        else{
            Node last = lis1.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }
        return lis1;
    }

    public static void disp(linkedList lis1){
        Node tempHead = lis1.head;
        while(tempHead.next != null){
            System.out.println(tempHead.data);
            tempHead = tempHead.next;
        }
        System.out.println(tempHead.data);
    }

    public static void main(String[] args){
        System.out.println("in main");
        linkedList lis1 = new linkedList();
        lis1 = insert(lis1, 10);
        lis1 = insert(lis1,20);
        lis1 = insert (lis1,30);
        disp(lis1);
    }
}
**/

//Menu driven linked list

import java.util.Scanner;


class linkedList{

    static Scanner sc = new Scanner(System.in);

    Node head;
    static class Node{
        int data;
        Node next;
    }

    static void insertEnd(linkedList lis1){
        Node newNode = new Node();
        System.out.println("Enter the data: ");
        int d = sc.nextInt();
        if(lis1.head==null){
            newNode.data = d;
            newNode.next = null;
            lis1.head = newNode;
        }
        else{
            Node last = lis1.head;
            while(last.next != null){
                last = last.next;
            }
            newNode.data = d;
            newNode.next = null;
            last.next = newNode;
        }
    }

    static void insertBeggining(linkedList lis1){
        Node newNode = new Node();
        int d = sc.nextInt();
        if(lis1.head == null){
            newNode.data = d;
            newNode.next = null;
            lis1.head = newNode;
        }
        else{
            newNode.next = lis1.head;
            newNode.data = d;
            lis1.head = newNode;
        }
    }

    static void deleteEnd(linkedList lis1){
        if(lis1.head == null){
            System.out.println("Linked list is empty");
        }
        else{
            Node last = lis1.head;
            Node prev = last;
            while(last.next != null){
                prev = last;
                last = last.next;
            }
            if(prev == last){
                lis1.head = null;
                System.out.println("Node deleted in 0");
            }
            else{
                prev.next = null;
                System.out.println("Node deleted");
            }
        }
    }

    static void display(linkedList lis1){
        Node tempHead = lis1.head;
        while(tempHead != null){
            System.out.println(tempHead.data);
            tempHead = tempHead.next;
        }
    }


    public static void main(String[] args){
        linkedList lis1 = new linkedList();
        while(true){
            System.out.println("To insert node at the end press 1\nTo display press 2\nTo insert node at beginnig press 3\nTo delete at end press 4:\n");
            int opt = sc.nextInt();
            if(opt == 1){
                insertEnd(lis1);
            }
            else if(opt == 2){
                display(lis1);
            }
            else if(opt == 3){
                insertBeggining(lis1);
            }
            else if(opt == 4){
                deleteEnd(lis1);
            }
            else{
                break;
            }
        }
    }
}