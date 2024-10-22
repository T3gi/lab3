package lab3;

import java.util.ArrayList;
import java.util.List;
/**
 * The {@code lab2.Directory} class implement the {@link Component} interface
 * <p>
 * Directory, can have both File and other Directories "inside"
 * This class provides an implementation of the {@link #operation()} method to preform a specific operation defined in {@link Component#operation()}}
 * </p>
 */
public class Directory implements Component{
    private String name;
    public Directory(String name) {
        this.name = name;
    }
    private List<Component> component = new ArrayList<>();
    @Override
    public void operation(){
        System.out.println("Directory operation (" + name + ")");
        for(Component c : component){
            c.operation();
        }
    }
    public void addComponent(Component c){
        component.add(c);
    }
    public void removeComponent(Component c){
        component.remove(c);
    }
}
