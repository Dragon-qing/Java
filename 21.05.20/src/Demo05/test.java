package Demo05;

import java.io.*;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputs();
        ObjectInputs();
    }
    public static void ObjectOutputs() throws IOException {
        ArrayList<Person>arr=new ArrayList<>();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Person.txt"));
        arr.add(new Person("张杰","男"));
        arr.add(new Person("徐颖","女"));
        arr.add(new Person("肖宏伟","男"));
        oos.writeObject(arr);
        oos.close();
    }
    public static void ObjectInputs() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Person.txt"));
        Object o=ois.readObject();
        ArrayList<Person>arr=(ArrayList<Person>)o;
        for (Person person : arr) {
            System.out.println(person);
        }
        ois.close();
    }
}
