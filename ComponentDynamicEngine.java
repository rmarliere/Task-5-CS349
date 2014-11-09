/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class ComponentDynamicEngine extends A_ComponentDynamic
{
    private double _power;
    private final ComponentDynamicPropeller _propeller;

    public ComponentDynamicEngine(DescriptorComponent descriptor, ComponentDynamicPropeller propeller)
    {
        super(descriptor);
        _propeller = propeller;
        setTag("engine");
        setParams();
        addComponents(_propeller);
    }

    public ComponentDynamicPropeller getPropeller()
    {
        return _propeller;
    }

    public void setPower(double power)
    {
        _power = power;
        setParams();
        System.out.println("engine " + getID_() + "power at " + _power);
    }

    public double getPower()
    {
        return _power;
    }

    private void setParams()
    {
        super.setParams("power=\"" + getPower() + "\"");
    }


}
