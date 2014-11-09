/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class DescriptorPositional extends A_Descriptor
{
    private final double _x;
    private final double _y;
    private final double _z;

    public DescriptorPositional(double x, double y, double z)
    {
        _x = x;
        _y = y;
        _z = z;
        setTag("position");
        setParams("x=\""+ getX() +"\" y=\""+ getY() + "\" z=\"" + getZ() + "\"");
    }

    public double getX()
    {
        return _x;
    }
    public double getY()
    {
        return _y;
    }
    public double getZ()
    {
        return _z;
    }
}
