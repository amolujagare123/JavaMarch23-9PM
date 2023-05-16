package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadOperation {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream =new FileInputStream("D:\\amol.txt");

        System.out.println("end of the program");
    }
}
