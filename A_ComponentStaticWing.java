import java.util.List;

/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public abstract class A_ComponentStaticWing extends A_ComponentStatic
{
    private final List<ComponentDynamicEngine> _engines;
    private final List<ComponentDynamicAileron> _ailerons;
    private final ComponentDynamicFlap _flap;
    private final ComponentDynamicGearMain _gear;

    public A_ComponentStaticWing(DescriptorComponent descriptor, List<ComponentDynamicEngine> engines,
                                 List<ComponentDynamicAileron> ailerons,
                                 ComponentDynamicFlap flap,
                                 ComponentDynamicGearMain gear)
    {
        super(descriptor);
        _engines = engines;
        _ailerons = ailerons;
        _flap = flap;
        _gear = gear;
        setTag("wing");
        addComponents();
    }

    private void addComponents()
    {
        for (ComponentDynamicAileron aileron : _ailerons)
        {
            addComponents(aileron);
        }

        for (ComponentDynamicEngine engine : _engines)
        {
            addComponents(engine);
        }
        addComponents(_flap);
        addComponents(_gear);
    }

    public List<ComponentDynamicAileron> getAilerons()
    {
        return _ailerons;
    }

    public List<ComponentDynamicEngine> getEngines()
    {
        return _engines;
    }

    public ComponentDynamicFlap getFlap()
    {
        return _flap;
    }

    public ComponentDynamicGearMain getGear()
    {
        return _gear;
    }


}
