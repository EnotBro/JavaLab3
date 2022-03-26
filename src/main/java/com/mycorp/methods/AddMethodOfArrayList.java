package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

public class AddMethodOfArrayList extends Method {

    private List<Integer> testList;

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
