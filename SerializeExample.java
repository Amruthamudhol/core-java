import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amruta");

        try {
            FileOutputStream file = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(s1);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}