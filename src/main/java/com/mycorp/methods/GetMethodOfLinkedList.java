package com.mycorp.methods;

import java.util.LinkedList;
import java.util.List;

public class GetMethodOfLinkedList extends Method {
    private List<Integer> testList;

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
