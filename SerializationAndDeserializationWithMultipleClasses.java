import java.io.*;


class Dog implements Serializable {
    Cat c = new Cat();
}

class Cat implements Serializable {
    Rat r = new Rat();
}

class Rat implements Serializable {
    int i = 10;
    int j = 20;
}

public class SerializationAndDeserializationWithMultipleClasses {
    public static void main(String args[]) throws Exception
    {

        Dog d = new Dog();  // Constructor Called println

        System.out.println("Serialization started");
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);

        System.out.println();

        System.out.println("Deserialization started"); 
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Dog d1 = (Dog)ois.readObject();

        System.out.println("Deserialization ended");
        System.out.println(d1.c.r.i + "===============>" + d1.c.r.j);
    }
}
