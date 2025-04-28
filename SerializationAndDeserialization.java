import java.io.*;

class Dog implements Serializable {
    static transient int i = 10;
    final transient int j = 20; // final variables once assigned, we cant re-assign them 

    Dog(){
        System.out.println("Constructor called");
    }
}

public class SerializationAndDeserialization {
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
        System.out.println(d1.i+"===========>"+d1.j);
    }
}   


 