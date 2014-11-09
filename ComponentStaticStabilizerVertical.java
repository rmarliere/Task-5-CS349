/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class ComponentStaticStabilizerVertical extends A_ComponentStatic
{
    private final ComponentDynamicRudder _rudder;
    public ComponentStaticStabilizerVertical(DescriptorComponent descriptor, ComponentDynamicRudder rudder)
    {
        super(descriptor);
        _rudder = rudder;
        addComponents(_rudder);
        setTag("stabilizer-vertical");
    }

    public ComponentDynamicRudder getRudder()
    {
        return _rudder;
    }


}
