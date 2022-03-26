package com.mycorp;

import dnl.utils.text.table.*;
import com.mycorp.methods.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Method> methods = new ArrayList<>();
        methods.add(new AddMethodOfArrayList());
        methods.add(new AddMethodOfLinkedList());
        methods.add(new DeleteMethodOfArrayList());
        methods.add(new DeleteMethodOfLinkedList());
        methods.add(new GetMethodOfArrayList());
        methods.add(new GetMethodOfLinkedList());
        methods.add(new ContainsMethodOfArrayList());
        methods.add(new ContainsMethodOfLinkedList());

        int numberOfSteps = 1000;

        testOfMethods(methods,numberOfSteps);

    }
    public static void testOfMethods(List<Method> methods, int numberOfSteps)
    {
        System.out.println("Wait please, tests need some time");
        String[] columnNames = new String[3];
        columnNames[0] = "Name of method";
        columnNames[1] = "Number of steps";
        columnNames[2] = "Average time, nanoseconds";

        Object[][] data = new Object[methods.size()][3];

        for (int i=0;i < methods.size();i++)
        {
            data[i][0]=methods.get(i).getName();
            data[i][1]=numberOfSteps;
            data[i][2]=MethodTester.getTimeOfTest(methods.get(i),numberOfSteps);
        }

        TextTable table = new TextTable(columnNames,data);
        table.printTable();
    }
}
