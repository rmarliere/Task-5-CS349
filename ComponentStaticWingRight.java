/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class ComponentStaticWingRight extends A_ComponentStaticWing
{
    public ComponentStaticWingRight(DescriptorComponent descriptor, java.util.List<ComponentDynamicEngine> engines,
                                    java.util.List<ComponentDynamicAileron> ailerons,
                                    ComponentDynamicFlap flap,
                                    ComponentDynamicGearMain gear)
    {
        super(descriptor, engines, ailerons, flap, gear);
    }
}
