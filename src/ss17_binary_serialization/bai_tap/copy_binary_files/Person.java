package ss17_binary_serialization.bai_tap.copy_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    public static final String FILE_PATH = "D:\\c0523g1-modul2\\src\\ss17_binary_serialization\\bai_tap\\copy_binary_files\\sourcefile.txt";
    public static final String FILE_COPPY = "D:\\c0523g1-modul2\\src\\ss17_binary_serialization\\bai_tap\\copy_binary_files\\targetfile.txt";
    private String name;
    private int age;
    private static final long serialVersionUID = -684979447L;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Person> readFormFile(String filePath) {
        List<Person> personList = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            personList = (List<Person>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }

    public static void writeFormFile(String filePath, List<Person> personList) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void coppyToFile(String fileCoppy, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(fileCoppy);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(filePath);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("hung", 18));
        writeFormFile(FILE_PATH, personList);
        coppyToFile(FILE_COPPY, FILE_PATH);
        List<Person> newPerson = readFormFile(FILE_PATH);
        for (Person person:newPerson) {
            System.out.println(person);
        }
        System.out.println("sao chép thành công");

    }
}
