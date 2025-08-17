import java.io.*;
import java.util.Scanner;

public class Main {
    //TODO 3: add a static method here. Use textFileWrite() as name, it won't return any value.
    public static void textFileWrite() {
        //Inside the method, declare an object of Person class and use the toString() method to obtain
        //the string representation
        Person person = new Person("Keyla", 20, 60);
        String str = person.toString();
        //TODO 4: create object of FileWriter class, it points to file1.txt
        try {
            FileWriter fileWriterObj = new FileWriter("src/file1.txt");
            //call the write() method of FileWriter to save the data of the Person object in the file
            fileWriterObj.write(str);
            System.out.println("File written with FileWriter...");
            fileWriterObj.close();
            //TODO 5: put the file writing code in try block, and catch the IO exception
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    //TODO 6: Define printWrite() method, a static method that doesn’t return any data.
    public static void printWrite() {
        String data;

        try {
//TODO 7: Take inputs from the user with Scanner class, for name, age and weight.
//  Instantiate Person object with the inputs
            PrintWriter printWriterObj = new PrintWriter("src/file3.txt");
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scan.next();
            System.out.print("Enter your age: ");
            int age = scan.nextInt();
            System.out.print("Enter your weight: ");
            double weight = scan.nextDouble();

            Person person = new Person(name, age, weight);
            data = person.toString();

//TODO 8: Declare object of PrintWriter class, which refers to file2.dat file in the current folder.
//   Call its println() method, to write the object string returned by toString() method
            printWriterObj.println(data);
            printWriterObj.close();
            System.out.println("File written with PrintWriter...");
        } catch (IOException e) {
            e.getStackTrace();
        }
//TODO 9: Put the code in try catch block for IOException
    }

    public static void binaryFileWrite() {
//TODO 10: Declare a byte array to store a list of numbers.
        byte[] numbers = {10, 20, 30, 40, 50};
//TODO 11: Open a FileOutputStream object, pointing towards file3.txt file
        try (FileOutputStream fileObj = new FileOutputStream("src/file2.dat")) {
//TODO 12: call the write() method of FileOutputStream object to print each element in the array.
// Use for loop for the purpose
            for (int i = 0; i < numbers.length; i++)
                fileObj.write(numbers[i]);
            System.out.println("File Written with FIleOutputStream");
            fileObj.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
//TODO 13: Place all the file activity inside the try-catch block.
    }

    public static void streamWrite() {
        try {
//TODO 14: Declare an object of DataOutputStream class.
// Use object of FileOutputStream class as argument to its constructor.
// The FileOutputStream object refers to file4.dat
            FileOutputStream file = new FileOutputStream("src/file4.dat");
            DataOutputStream fileObj = new DataOutputStream(file);
//TODO 15: Use Scanner class to read name, age, and weight.
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scan.next();
            System.out.print("Enter your age: ");
            int age = scan.nextInt();
            System.out.print("Enter your weight: ");
            double weight = scan.nextDouble();
// Instantiate a Person object from the inputs.
            Person person = new Person(name, age, weight);
//TODO 16: Call writeUTF(), writeInt(), and writeDouble() methods of DataOutputStream object
// to write respectively the name, age and weight attributes of the Person object.
            fileObj.writeUTF(person.name);
            fileObj.writeInt(person.age);
            fileObj.writeDouble(person.weight);
            fileObj.flush();
            fileObj.close();
            System.out.println("File written with streamWrite...");
//TODO 17: Place the entire file writing code in try-catch block
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
//TODO 18: call the static methods from main() method
        textFileWrite(); //file 1
        printWrite(); //file 3
        binaryFileWrite(); //file 2
        streamWrite(); //file 4
    }
}
