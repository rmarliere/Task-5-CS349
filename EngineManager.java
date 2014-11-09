import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/7/14
 * Assignment: Task 5
 * Class: CS 349
 */

public class EngineManager
{
    private boolean isBalanced = false;
    private final ComponentStaticFuselage _host;
    private List<ComponentDynamicEngine> _leftEngines = new ArrayList<>();
    private List<ComponentDynamicEngine> _rightEngines = new ArrayList<>();

    public EngineManager(ComponentStaticFuselage host)
    {
        _host = host;
        setLeftEngines();
        setRightEngines();
    }

    public ComponentStaticFuselage getHost()
    {
        return _host;
    }

    public void registerEngineLeft(ComponentDynamicEngine engine)
    {
        if (!isBalanced)
        {
            _leftEngines.add(engine);
        }
        else
        {
            throw new RuntimeException("the engines are already balanced");
        }
    }

    public void registerEngineRight(ComponentDynamicEngine engine)
    {
        if (!isBalanced)
        {
            _rightEngines.add(engine);
        }
        else
        {
            throw new RuntimeException("the engines are already balanced");
        }
    }

    public List<ComponentDynamicEngine> getEngines()
    {
        List<ComponentDynamicEngine> allEngines = new ArrayList<>();
        allEngines.addAll(_leftEngines);
        allEngines.addAll(_rightEngines);
        return allEngines;
    }

    public void setPower(double power)
    {
        List<ComponentDynamicEngine> allEngines = getEngines();
        for (ComponentDynamicEngine engine : allEngines)
        {
            engine.setPower(power);
        }
    }

    public void commit()
    {
        if (_leftEngines.size() == _rightEngines.size())
        {
            isBalanced = true;
        }
        else
        {
            throw new RuntimeException("the engines are not balanced");
        }
    }

    private void setRightEngines()
    {
        ComponentStaticWingRight wingRight = getHost().getWingRight();
        _rightEngines = wingRight.getEngines();
    }

    private void setLeftEngines()
    {
        ComponentStaticWingLeft wingLeft = getHost().getWingLeft();
        _leftEngines = wingLeft.getEngines();
    }
}
