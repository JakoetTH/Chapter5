package Chapter5.Impl.Composite;

import java.util.ArrayList;
import java.util.List;

public class Hangar implements Component {
    List<Component> components = new ArrayList<Component>();
    @Override
    public String fly()
    {
        return "I am flying";
    }
    @Override
    public String land()
    {
        return "I am landing";
    }
    public void addComponent(Component component)
    {
        components.add(component);
    }
    public void removeComponent(Component component)
    {
        components.remove(component);
    }
    public List<Component> getComponents()
    {
        return components;
    }
    public Component getComponent(int index)
    {
        return components.get(index);
    }
}
