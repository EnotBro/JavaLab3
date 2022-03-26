package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * class DeleteMethodOfArrayList
 * Deleting the first element from the ArrayList
 */
public class DeleteMethodOfArrayList extends Method {

    /**
     * ArrayList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of DeleteMethodOfArrayList
     */
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
