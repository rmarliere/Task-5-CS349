/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public abstract class A_ComponentStatic extends A_Component
{
    private EngineManager _engineManager;
    public A_ComponentStatic(DescriptorComponent descriptor)
    {
        super(descriptor);
    }

    public EngineManager getEngineManager()
    {
        return _engineManager;
    }

    public void setEngineManager(EngineManager engineManager)
    {
        _engineManager = engineManager;
    }
}
