package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * class GetMethodOfArrayList
 * Getting the last element by its index from ArrayList with size 100
 */
public class GetMethodOfArrayList extends Method {
    /**
     * ArrayList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of GetMethodOfArrayList
     */
    public GetMethodOfArrayList()
    {
        super("Get method of ArrayList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new ArrayList<>();
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
