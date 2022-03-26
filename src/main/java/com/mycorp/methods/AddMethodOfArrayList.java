package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * class AddMethodOfArrayList
 * Adding an element to the end of the ArrayList
 */
public class AddMethodOfArrayList extends Method {

    /**
     * ArrayList for test
     */
    private List<Integer> testList;

    /**
     * Constructor of AddMethodOfArrayList
     */
    public AddMethodOfArrayList()
    {
        super("Add method of ArrayList");
    }

    @Override
    public void resetState(int numberOfElements) {
        testList = new ArrayList<>();
    }

    @Override
    public void executeMethod() {
        testList.add(1);
    }
}
