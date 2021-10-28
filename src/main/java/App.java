import javax.swing.*;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int studentId;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] list = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            list[i].fromConsole(sc);
        }

        for (Student st : list){
            System.out.println(st);
        }



        String [] columnName = {"Thong ke","So luong", "Ti le" };
        Object [][] data = {};
        JTable table = new JTable(data, columnName);


    }

}
