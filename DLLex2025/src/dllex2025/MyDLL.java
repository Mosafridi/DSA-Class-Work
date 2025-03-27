/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dllex2025;

/**
 *
 * @author shoai
 */
public class MyDLL implements LinearListInterface {
    
    private Node head;
    private Node last;
    private Node curr;
     private int size;
     
     public MyDLL(){
         head = null;
         last = null;
         size = 0;
         curr = head;
        
          
     }
    
   

    
//    
//     public boolean isEmpty();
//    public int Size();
//    public Object get(int index);
//    public void remove(int inndex);
//    public void add(int index, Object element );
//    public void printList();

    @Override
    public boolean isEmpty() {
        return (size ==0);
    
    }

// @Override
//    public size() {
//    }
    
    private void setCurrent(int index){
        curr= head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
            
        }
    } 
@Override
public Object get(int index ){
    setCurrent(index);
    return curr;
}
@Override
public void remove(int index){
   
    
    size--;
}

@Override
public void add(int index, Object element){
    if (index == 1){
        Node newNode = new Node(element, null, null);
        newNode.setNext(head);
        head.setPrev(newNode);
        head = newNode;
        
    }else if (index == (size+1)){
        Node newNode = new Node (element, null,null);
        newNode.setPrev(last);
        last.setNext(newNode);
        
    }else{
       setCurrent(index);
       Node newNode = new Node(element, null, null);
       newNode.setNext(curr);
       Node prev = curr.getPrev();
       newNode.setPrev(prev);
       prev.setNext(newNode);
       curr.setPrev(newNode);
       
       
    }
    size++;
    
}

}
