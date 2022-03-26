package com.mycorp.methods;

import java.util.LinkedList;
import java.util.List;

/**
 * class ContainsMethodOfLinkedList
 * Getting the last element by its value from LinkedList with size 101
 */
public class ContainsMethodOfLinkedList extends Method {

    /**
     * LinkedList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of ContainsMethodOfLinkedList
     */
    public ContainsMethodOfLinkedList()
    {
        super("Contains method of LinkedList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new LinkedList<>();
        for (int i=0;i<100;i++)
        {
            testList.add(1);
        }
        testList.add(2);
    }

    @Override
    public void executeMethod() {
        testList.contains(2);
    }
}
