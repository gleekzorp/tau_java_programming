package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Finally is shown in video but not saved at the end
// Found this resource on the topic https://devqa.io/java-exception-handling/

public class ExceptionHandling {

    public static void main(String[] args){

        createNewFileIOException();
//        createNewFileException();
//        numbersExceptionHandling();

        // The function that calls this method is now in control of how to handle the exception
        // Either wrap this into a try/catch or add a throws IOException to the main method
//        createNewFileRethrow();
    }

    public static void createNewFileException(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileIOException(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader = new Scanner(file)){
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            System.out.println("oops");
            e.printStackTrace();
        }
    }
}
