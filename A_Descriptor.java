import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public abstract class A_Descriptor implements I_Visitable
{
    private String _params;
    private String _tag;
    private List<A_Descriptor> _descriptors;

    public A_Descriptor()
    {
        _descriptors = new ArrayList<>();
    }
    public void setTag(String tag)
    {
        _tag = tag;
    }

    public String getTag()
    {
        if (_tag == null)
            throw new NullPointerException("tag is null");
        return _tag;
    }

    public void setParams(String params)
    {
        _params = params;
    }

    public String getParams()
    {
        if (_params == null)
            return "";
        return " " + _params;
    }

    public void addDescriptor(A_Descriptor descriptor)
    {
        _descriptors.add(descriptor);
    }

    public List<A_Descriptor> getDescriptors()
    {
        return _descriptors;
    }

    public void visit_(Visitor visitor)
    {
        visitor.append("<"+ getTag() + getParams() + ">");
        for (final A_Descriptor childDescriptor : getDescriptors())
        {
            childDescriptor.visit_(visitor);
        }
        visitor.append("</"+ getTag() +">");
    }
}
