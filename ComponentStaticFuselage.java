/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class ComponentStaticFuselage extends A_ComponentStatic
{
    public final String _tag = "fuselage";
    private final ComponentDynamicGearNose _gear;
    private final ComponentStaticStabilizerVertical _stabilizerVertical;
    private final ComponentStaticStabilizerHorizontal _stabilizerRight;
    private final ComponentStaticStabilizerHorizontal _stabilizerLeft;
    private final ComponentStaticWingRight _wingRight;
    private final ComponentStaticWingLeft _wingLeft;

    public ComponentStaticFuselage(DescriptorComponent descriptor, ComponentStaticWingLeft wingLeft,
                                   ComponentStaticWingRight wingRight,
                                   ComponentStaticStabilizerHorizontal stabilizerLeft,
                                   ComponentStaticStabilizerHorizontal stabilizerRight,
                                   ComponentStaticStabilizerVertical stabilizerVertical,
                                   ComponentDynamicGearNose gear) {
        super(descriptor);
        _gear = gear;
        _stabilizerVertical = stabilizerVertical;
        _stabilizerLeft = stabilizerLeft;
        _stabilizerRight = stabilizerRight;
        _wingLeft = wingLeft;
        _wingRight = wingRight;
        setEngineManager(new EngineManager(this));
        addComponents(getGear());
        addComponents(getStabilizerRight());
        addComponents(getStabilizerLeft());
        addComponents(getStabilizerVertical());
        addComponents(getWingLeft());
        addComponents(getWingRight());
        setTag("fuselage");
    }

    public ComponentDynamicGearNose getGear()
    {
        return _gear;
    }
    public ComponentStaticStabilizerHorizontal getStabilizerLeft()
    {
        return _stabilizerLeft;
    }

    public ComponentStaticStabilizerHorizontal getStabilizerRight()
    {
        return _stabilizerRight;
    }

    public ComponentStaticStabilizerVertical getStabilizerVertical()
    {
        return _stabilizerVertical;
    }
    public ComponentStaticWingLeft getWingLeft()
    {
        return _wingLeft;
    }

    public ComponentStaticWingRight getWingRight()
    {
        return _wingRight;
    }

}
