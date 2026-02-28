package basic;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FileList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Directory Name:");
        String dirName = sc.nextLine();

        File dir = new File(dirName);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory!");
            sc.close();
            return;
        }

        File[] javaFiles = dir.listFiles((file, name) -> name.endsWith(".java"));
        if (javaFiles == null || javaFiles.length == 0) {
            System.out.println("No Java files found.");
            sc.close();
            return;
        }
        System.out.println("\nJava Files:");
        for (File f : javaFiles) {
            System.out.println(f.getName());
        }

        Arrays.sort(javaFiles, Comparator.comparingLong(File::length).reversed());

        System.out.println("\nJava Files Sorted by Size (Descending):");
        for (File f : javaFiles) {
            System.out.println(f.getName() + " --> " + f.length() + " bytes");
        }

        sc.close();
    }
}