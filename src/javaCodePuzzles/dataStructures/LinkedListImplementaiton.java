package javaCodePuzzles.dataStructures;

/**
 * Program to simulate the linked list in java
 * Created by aseem Jain on 5/8/16.
 */

import java.util.*;
public class LinkedListImplementaiton {

static Map<Integer,Node> linkListMap = new HashMap<Integer, Node>();

    private Node addNode(Node node){
        LinkedListImplementaiton.linkListMap.put(linkListMap.size(),node);
        return node;
    }

    private Node populateLinkedList(){
        Node nodeStart = new Node(linkListMap.size()+1,"startNode");
        Node node ;
        addNode(nodeStart);
        for (int i=1;i<3;i++) {
             node = new Node(linkListMap.size()+1,"value@index"+i);
            addNode(node);
        }
        node =  new Node(null,"lastData");
        addNode(node);
        return nodeStart;
    }

    void rejoinLinkedList(Integer sourceAddress, Integer destinationAddress){

        Node sourceNode = linkListMap.get(sourceAddress);
        sourceNode.setAddressOfNextNode(destinationAddress);
    }

    Node insertAtTail(Node head,String data) {
        Integer addressOfNextNode = head.getAddressOfNextNode();
        if ( addressOfNextNode == null) {
            Node node = new Node(null,data);
            addNode(node);
            return node;
        }
        Node node = linkListMap.get(addressOfNextNode);
        insertAtTail(node, data);
        return head;
    }

    Node insertAtStart(Node head,String data) {
        Node node = new Node(0,data);
        addNode(node);
        return node;
    }


    // Iterative way to print linked list
    void printLinkedList(Node node){
        System.out.println(node.getData());
        if(node.getAddressOfNextNode() == null){
            return;
        }
        Node nextNode = linkListMap.get(node.getAddressOfNextNode());
//        System.out.println(node.getData());
        printLinkedList(nextNode);
    }

    public static void main(String[] args) {
        LinkedListImplementaiton linkedList = new LinkedListImplementaiton();
        Node node = linkedList.populateLinkedList();
        linkedList.printLinkedList(node);

        // removing and rejoining the linked list
//        linkedList.rejoinLinkedList(3, 7);
//        linkedList.printLinkedList(node);
        linkedList.insertAtTail(node, "tailValue");
        linkedList.printLinkedList(node);
        Node headInsertedNode = linkedList.insertAtStart(node, "faceValue");
        linkedList.printLinkedList(headInsertedNode);
    }

}


class Node {

    private Integer addressOfNextNode = null;
    private String data = "";

    public Node(Integer addressOfNextNode , String data){
        this.data = data;
        this.addressOfNextNode = addressOfNextNode;

    }
    public Integer getAddressOfNextNode() {
        return addressOfNextNode;
    }

    public void setAddressOfNextNode(Integer addressOfNextNode) {
        this.addressOfNextNode = addressOfNextNode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}