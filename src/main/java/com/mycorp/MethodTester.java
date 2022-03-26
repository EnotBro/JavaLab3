package com.mycorp;

import com.mycorp.methods.Method;

public class MethodTester {
    public static double getTimeOfTest(Method method, int numberOfSteps)
    {
        int numberOfTests=10000;
        double averageTime = 0.0;
        for (int k = 0;k<numberOfTests;k++)
        {
            method.resetState(numberOfSteps);
            long start = System.nanoTime();
            for (int i=0;i<numberOfSteps;i++)
            {
                method.executeMethod();
            }
            long finish = System.nanoTime();
            averageTime += ((double) finish-start);
        }
        return averageTime/numberOfTests;
    }
}
