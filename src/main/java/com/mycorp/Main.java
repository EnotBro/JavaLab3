package com.mycorp;

import com.mycorp.methods.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(MethodTester.getTimeOfTest(new AddMethodOfArrayList(),1000));//nano
        System.out.println(MethodTester.getTimeOfTest(new AddMethodOfLinkedList(),1000));//nano

        System.out.println(MethodTester.getTimeOfTest(new DeleteMethodOfArrayList(),1000));//nano
        System.out.println(MethodTester.getTimeOfTest(new DeleteMethodOfLinkedList(),1000));//nano

        System.out.println(MethodTester.getTimeOfTest(new GetMethodOfArrayList(),1000));//nano
        System.out.println(MethodTester.getTimeOfTest(new GetMethodOfLinkedList(),1000));//nano

        System.out.println(MethodTester.getTimeOfTest(new ContainsMethodOfArrayList(),1000));//nano
        System.out.println(MethodTester.getTimeOfTest(new ContainsMethodOfLinkedList(),1000));//nano
    }
}
