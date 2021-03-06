package exercisesExtraSheet.exercise6;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<File> all = new ArrayList<File>();
        addTree(new File("."), all);
//        System.out.println(all);
    }

    static void addTree(File file, Collection<File> all) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                all.add(child);
                addTree(child, all);
                System.out.print(child+"    ");
            }
            System.out.println();
        }
    }
}
