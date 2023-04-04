package file;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/home/muniiramohamed096/stream.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

}
