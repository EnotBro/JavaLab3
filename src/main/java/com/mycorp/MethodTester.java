package com.mycorp;

import com.mycorp.methods.Method;

/**
 * class method tester
 */
public class MethodTester {
    /**
     * Gives average time of 10000 executions of method (in nanoseconds)
     * @param method The method for which you want to have test
     * @param numberOfSteps Number of steps which the test contains
     * @return Double value of time of the test
     */
    public static double getTimeOfTest(Method method, int numberOfSteps)
    {
        int numberOfTests=10000;
        double averageTime = 0.0;
        double allTime = 0.0;
        if (numberOfSteps>0)
        {
            for (int k = 0;k<numberOfTests;k++)
            {
                method.resetState(numberOfSteps);
                long start = System.nanoTime();
                for (int i=0;i<numberOfSteps;i++)
                {
                    method.executeMethod();
                }
                long finish = System.nanoTime();
                allTime += ((double) finish-start);
            }
            averageTime = allTime/numberOfTests;
        }

        return averageTime;
    }
}
