
import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    int ID;
    String Name, Email;
    Double Bonus, Report, App, LT;

    public Student() {
    }

    public Student(int ID, String Name, String Email, Double Bonus, Double Report, Double App, Double LT) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Bonus = Bonus;
        this.Report = Report;
        this.App = App;
        this.LT = LT;
    }


    public void fromConsole(Scanner sc) {
        System.out.print("Nhap ten: ");
        this.Name = sc.nextLine();

        System.out.print("Nhap email: ");
        this.Email = sc.nextLine();

        System.out.print("Nhap Bonus: ");
        this.Bonus = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap Report: ");
        this.Report = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap App: ");
        this.App = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap LT: ");
        this.LT = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("ID=").append(ID);
        sb.append(", Name='").append(Name).append('\'');
        sb.append(", Email='").append(Email).append('\'');
        sb.append(", Bonus=").append(Bonus);
        sb.append(", Report=").append(Report);
        sb.append(", App=").append(App);
        sb.append(", LT=").append(LT);
        sb.append('}');
        return sb.toString();
    }

    public double GPA(double bonus, double report, double app, double LT) {
        double GPA = this.Bonus * 0.1 + this.Report * 0.3 + this.App * 0.15 + this.LT * 0.45;
        return (GPA);
    }




}