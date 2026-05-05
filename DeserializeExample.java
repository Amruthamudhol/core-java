import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(file);

            Student s2 = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            s2.display();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}