package com.mycorp.methods;

import java.util.LinkedList;
import java.util.List;

/**
 * class DeleteMethodOfLinkedList
 * Deleting the first element from the LinkedList
 */
public class DeleteMethodOfLinkedList extends Method {
    /**
     * LinkedList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of DeleteMethodOfLinkedList
     */
    public DeleteMethodOfLinkedList()
    {
        super("Delete method of LinkedList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new LinkedList<>();
        for (int i=0;i<numberOfElements;i++)
        {
            testList.add(1);
        }
    }

    @Override
    public void executeMethod() {
        testList.remove(0);
    }
}
