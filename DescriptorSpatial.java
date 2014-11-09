/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class DescriptorSpatial extends A_Descriptor
{
    private final DescriptorPositional _position;
    private final DescriptorDimensional _dimensions;

    public DescriptorSpatial(DescriptorPositional position, DescriptorDimensional dimensions)
    {
        _position = position;
        _dimensions = dimensions;
        setTag("descriptor-spatial");
        addDescriptor(getDimensions());
        addDescriptor(getPosition());
    }

    public DescriptorDimensional getDimensions()
    {
        return _dimensions;
    }

    public DescriptorPositional getPosition()
    {
        return _position;
    }

}
