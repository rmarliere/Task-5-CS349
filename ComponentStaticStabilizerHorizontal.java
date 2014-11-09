/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class ComponentStaticStabilizerHorizontal extends A_ComponentStatic
{
    private final ComponentDynamicElevator _elevator;
    public ComponentStaticStabilizerHorizontal(DescriptorComponent descriptor, ComponentDynamicElevator elevator)
    {
        super(descriptor);
        _elevator = elevator;
        addComponents(_elevator);
        setTag("stabilizer-horizontal");

    }

    public ComponentDynamicElevator getElevator()
    {
        return _elevator;
    }


}
