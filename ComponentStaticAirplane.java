/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class ComponentStaticAirplane extends A_ComponentStatic
{
    private final ComponentStaticFuselage _fuselage;
    public ComponentStaticAirplane(DescriptorComponent descriptor, ComponentStaticFuselage fuselage)
    {
        super(descriptor);
        _fuselage = fuselage;
        addComponents(fuselage);
        setTag("airplane");
    }

    public ComponentStaticFuselage getFuselage()
    {
        return _fuselage;
    }
}
