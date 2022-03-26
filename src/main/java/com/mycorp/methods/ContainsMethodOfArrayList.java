package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * class ContainsMethodOfArrayList
 * Getting the last element by its value from ArrayList with size 101
 */
public class ContainsMethodOfArrayList extends Method{

    /**
     * ArrayList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of ContainsMethodOfArrayList
     */
    public ContainsMethodOfArrayList()
    {
        super("Contains method of ArrayList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new ArrayList<>();
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
