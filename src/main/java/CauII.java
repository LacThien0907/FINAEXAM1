import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CauII {

    String text1 = "Tôi có 2 địa chỉ email đó là: huutrongpro@gmail.com và solacthien@gmail.com";
    String regex1 = "[a-zA-Z]\\w+@gmail+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?";
    Pattern p1 = Pattern.compile(regex1);
    Matcher m1 = p1.matcher(text1);


    public static void ReadThongTin() {
        try {
            FileInputStream fis = new FileInputStream("person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student p = (Student) ois.readObject();
            System.out.println(p);
            ois.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void ghiThongTin() {
        Student person = new Student();
        try {
            FileOutputStream fos = new FileOutputStream("person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
