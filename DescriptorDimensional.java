/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class DescriptorDimensional extends A_Descriptor
{
    private final double _height;
    private final double _width;
    private final double _depth;

    public DescriptorDimensional(double height, double width, double depth)
    {
        _height = height;
        _width  = width;
        _depth  = depth;
        setTag("dimensions");
        setParams("height=\""+ getHeight() +"\" width=\""+ getWidth() + "\" depth=\"" + getDepth() + "\"");
    }

    public double getDepth()
    {
        return _depth;
    }
    public double getHeight()
    {
        return _height;
    }
    public double getWidth()
    {
        return _width;
    }
}
