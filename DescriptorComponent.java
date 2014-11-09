/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class DescriptorComponent extends A_Descriptor implements I_Identifiable
{
    private final String _id;
    private DescriptorSpatial _descriptor;

    public DescriptorComponent(String id, DescriptorSpatial descriptor)
    {
        _id = id;
        _descriptor = descriptor;
        setTag("descriptor");
        setParams("id=\"" + getID_() + "\"");
        addDescriptor(_descriptor);
    }

    public DescriptorSpatial getDescriptorSpatial()
    {
        return _descriptor;
    }

    @Override
    public String getID_() {
        return _id;
    }
}
