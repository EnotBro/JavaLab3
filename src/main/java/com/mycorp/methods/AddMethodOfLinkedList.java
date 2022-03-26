package com.mycorp.methods;

import java.util.LinkedList;
import java.util.List;

/**
 * class AddMethodOfLinkedList
 * Adding an element to the end of the LinkedList
 */
public class AddMethodOfLinkedList extends  Method {
    /**
     * LinkedList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of AddMethodOfLinkedList
     */
    public AddMethodOfLinkedList()
    {
        super("Add method of LinkedList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new LinkedList<>();
    }

    @Override
    public void executeMethod() {
        testList.add(1);
    }
}
