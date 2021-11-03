/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

/**
 *
 * @author HP
 */
public class HashMap<K,D> {
    private NodeKey<K,D> first;
    private int size;
    public HashMap (){
        size=0;
        first=null;
    }
    public int getSize() {
        return size;
    }
    public void put (K key, D data)
    {
        NodeKey <K,D> node = new NodeKey<K,D>(key,null,data);
        if (first == null) 
        {
            size++;
            first = node;
        } 
        else 
        {
            for (NodeKey<K,D> current = first ; current != null; current = current.getNodeNext() ) 
            {
                if(current.getKey().equals(key))
                {
                    break;
                }
                else
                {
                    if (current.getNodeNext() == null ) 
                    { 
                        size++;
                        current.setNodeNext(node); // Enlazo el ultimo nodo.
                        break;
                    }
                }
            }
        }
    }
    public D get (K index){
        NodeKey<K,D> Data=null;
        for (NodeKey<K,D> current = first;current != null; current = current.getNodeNext() ) {
                if (current.getKey()==index) {
                    Data=current;
                    break;
                }
            }
        return Data.getNodedata();
    }
    public boolean contains(K key) {
      boolean ComeBack=false;
        for (NodeKey<K,D> current = first;current != null; current = current.getNodeNext() ) {
            if (  current.getKey().equals(key)) {
                ComeBack=true;
                break;
            }
        }
        return ComeBack;
    }
    public void getKeySet(){
       for (NodeKey<K,D> current = first;current != null; current = current.getNodeNext() ) {
            System.out.println(current.getKey());
       }
    }
    public void print(){
       for (NodeKey<K,D> current = first;current != null; current = current.getNodeNext() ) {
            System.out.println(current.getKey() + " - " +current.getNodedata());
       }
    }
    public void remove (K key){
        NodeKey<K,D> PreviousNode=null;
        size--;
        if(first.getKey().equals(key))
        {
            first=first.getNodeNext();
           
        }
        else
        {
            for(NodeKey<K,D> current=first; current!=null; current=current.getNodeNext())
            {
                if(current.getKey().equals(key))
                {
                    PreviousNode.setNodeNext(current.getNodeNext());
                    break;
                }
                PreviousNode=current;
            }
        }
    }
    
}
