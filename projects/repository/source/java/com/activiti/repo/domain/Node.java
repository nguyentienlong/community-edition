package com.activiti.repo.domain;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import com.activiti.repo.dictionary.ClassRef;
import com.activiti.repo.dictionary.bootstrap.DictionaryBootstrap;
import com.activiti.repo.ref.NodeRef;
import com.activiti.repo.ref.QName;

/**
 * Specific instances of nodes are unique, but may share GUIDs across stores.
 * 
 * @author Derek Hulley
 */
public interface Node
{
    public static final String QUERY_GET_CHILD_ASSOCS = "node.GetChildAssocs";
    
    /**
     * @return Returns the unique key for this node
     */
    public NodeKey getKey();

    /**
     * @param key the unique node key
     */
    public void setKey(NodeKey key);
    
    public Store getStore();
    
    public void setStore(Store store);
    
    public QName getTypeQName();
    
    public void setTypeQName(QName qname);

    /**
     * @return Returns all the regular associations for which this node is a target 
     */
    public Set<NodeAssoc> getSourceNodeAssocs();

    public Set<ChildAssoc> getParentAssocs();

    public Map<String, Serializable> getProperties();

    /**
     * Convenience method to get the reference to the node
     * 
     * @return Returns the reference to this node
     */
    public NodeRef getNodeRef();
}
