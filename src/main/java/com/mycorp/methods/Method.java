package com.mycorp.methods;

abstract public class Method {
    private String name;
    public abstract void executeMethod();
    public abstract void resetState(int numberOfElements);

    protected Method(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
