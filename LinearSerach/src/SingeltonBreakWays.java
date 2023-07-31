import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonBreakWays {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {
        SingeltonPattern originalSIngelton=SingeltonPattern.getInstance();
        SingeltonPattern DuplicateSIngelton=SingeltonPattern.getInstance();

        System.out.println(originalSIngelton.hashCode());
        System.out.println(DuplicateSIngelton.hashCode());

        //Reflection
        System.out.println("________________________Reflection______________________");

        Class<?> singelton=Class.forName("SingeltonPattern");
        Constructor<SingeltonPattern> singeltonPatternConstructor= (Constructor<SingeltonPattern>) singelton.getDeclaredConstructor();
        singeltonPatternConstructor.setAccessible(true);

        SingeltonPattern brokenSingeltonPattern=singeltonPatternConstructor.newInstance();
        System.out.println(originalSIngelton.hashCode());
        System.out.println(brokenSingeltonPattern.hashCode());

        // Serialization

        System.out.println("_______________________Serialization____________________");

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("D:\\Serialization.ser"));

        objectOutputStream.writeObject(originalSIngelton);
        objectOutputStream.close();

        // Deserialization

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("D:\\Serialization.ser"));
        SingeltonPattern singeltonPattern= (SingeltonPattern) objectInputStream.readObject();
        System.out.println(singeltonPattern.hashCode());



        //Clonning

        SingeltonPattern singeltonPattern1= (SingeltonPattern) originalSIngelton.clone();
        System.out.println(singeltonPattern1.hashCode());


    }
}
