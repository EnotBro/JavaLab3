package com.mycorp.methods;

import java.util.LinkedList;
import java.util.List;

/**
 * class GetMethodOfLinkedList
 * Getting the last element by its index from LinkedList with size 100
 */
public class GetMethodOfLinkedList extends Method {
    /**
     * LinkedList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of GetMethodOfLinkedList
     */
    public GetMethodOfLinkedList()
    {
        super("Get method of LinkedList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new LinkedList<>();
        for (int i=0;i<100;i++)
        {
            testList.add(1);
        }
    }

    @Override
    public void executeMethod() {
        testList.get(99);
    }
}
