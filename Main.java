import lab3.*;
/**
 * {@code Main} class. Makes everything work.
 */
public class Main {
    public static void main(String[] args) {
        File file1 = new File("File.txt");
        File file2 = new File("Elif.txt");
        File file3 = new File("Life.txt");
        File file4 = new File("Ifle.txt");
        Directory directory = new Directory("Dir1");
        directory.addComponent(file1);
        directory.addComponent(file2);
        Directory directory2 = new Directory("Dir2");
        directory2.addComponent(file3);
        directory2.addComponent(file4);
        directory.addComponent(directory2);

        directory.operation();
    }
}