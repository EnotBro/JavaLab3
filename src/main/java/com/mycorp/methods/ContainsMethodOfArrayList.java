package com.mycorp.methods;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethodOfArrayList extends Method{
    private List<Integer> testList;

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
