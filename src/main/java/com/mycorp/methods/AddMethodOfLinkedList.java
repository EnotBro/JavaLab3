package com.mycorp.methods;

import java.util.LinkedList;
import java.util.List;

public class AddMethodOfLinkedList extends  Method {
    private List<Integer> testList;

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
