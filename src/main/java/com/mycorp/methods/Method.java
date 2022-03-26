package com.mycorp.methods;

/**
 * class method
 */
abstract public class Method {
    /**
     * Name of the method
     */
    private String name;

    /**
     * Execution of the method. Needed for timing
     */
    public abstract void executeMethod();

    /**
     * Going to the start state of test
     * @param numberOfElements number of elements. Needed for making start state
     */
    public abstract void resetState(int numberOfElements);

    /**
     * Constructor of method
     * @param name name of method
     */
    protected Method(String name)
    {
        this.name=name;
    }

    /**
     * Get the name of method
     * @return name of method
     */
    public String getName()
    {
        return name;
    }
}
