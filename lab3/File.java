package lab3;
/**
 * The {@code lab2.File} class implement the {@link Component} interface
 * <p>
 * Simply the File you are working with
 * This class provides an implementation of the {@link #operation()} method to preform a specific operation defined in {@link Component#operation()}}
 * </p>
 */
public class File implements Component {
    private String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public void operation(){
        System.out.println("File operation (" + name + ")");
    }
}
