package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

public class DeleteMethodOfArrayList extends Method {
    private List<Integer> testList;

    public DeleteMethodOfArrayList()
    {
        super("Delete method of ArrayList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new ArrayList<>();
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
