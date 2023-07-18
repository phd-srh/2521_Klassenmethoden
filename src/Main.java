import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        System.out.println("Zahl ist prim? " + Tool.isPrim(zahl) );
        System.out.println("Geheime internas: " + Tool.statischeZahl);
        System.out.println("Konstante: " + Tool.EINE_KONSTANTE_STATISCHE_ZAHL);

        Tool tool = new Tool();
        System.out.println("Was ist das? " + tool.isNotStatic() );
    }
}
