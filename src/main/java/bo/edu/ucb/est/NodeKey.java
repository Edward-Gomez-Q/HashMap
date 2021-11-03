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
public class NodeKey<K,D> {
    private K key;
    private NodeKey<K,D> NodeNext;
    private D Nodedata;

    public NodeKey(K key, NodeKey<K, D> NodeNext, D Nodedata) {
        this.key = key;
        this.NodeNext = NodeNext;
        this.Nodedata = Nodedata;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public NodeKey<K, D> getNodeNext() {
        return NodeNext;
    }

    public void setNodeNext(NodeKey<K, D> NodeNext) {
        this.NodeNext = NodeNext;
    }

    public D getNodedata() {
        return Nodedata;
    }

    public void setNodedata(D Nodedata) {
        this.Nodedata = Nodedata;
    }
    
}
