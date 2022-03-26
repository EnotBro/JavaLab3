package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

public class GetMethodOfArrayList extends Method {
    private List<Integer> testList;

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
