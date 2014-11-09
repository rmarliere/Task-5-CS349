import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public abstract class A_Component implements I_Identifiable, I_Visitable
{
    private String _params;
    private String _tag;
    private List<A_Component> _components;
    private A_Component _host;
    private final DescriptorComponent _descriptor;

    public A_Component(DescriptorComponent descriptor)
    {
        _descriptor = descriptor;
        _components = new ArrayList<>();
        setTag("component");
    }

    public A_Descriptor getDescriptor()
    {
        return _descriptor;
    }

    public String getID_()
    {
        return _descriptor.getID_();
    }

    public void setHost(A_Component host)
    {
        _host = host;
    }
    public A_Component getHost()
    {
        return _host;
    }

    public boolean hasHost()
    {
        return _host != null;
    }

    public void addComponents(A_Component component)
    {
        _components.add(component);
    }

    public List<A_Component> getComponents()
    {
        return _components;
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

    public void visit_(Visitor visitor)
    {
        visitor.append("<"+ getTag() + getParams() + ">");
        visitor.append("<component>");
        getDescriptor().visit_(visitor);
        visitor.append("</component>");
        List<A_Component> components = getComponents();
        for (final A_Component childComponent : components)
        {
            childComponent.visit_(visitor);
        }
        visitor.append("</" + getTag() +  ">");
    }
}
