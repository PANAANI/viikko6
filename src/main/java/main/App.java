package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("0")) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            if (sc.hasNext()) {
                choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        
                        break;
                    case "2":
                        
                        break;                       
                    case "3":
                        
                        break;
                    case "4":
                        
                        break;
                    case "5":
                        
                        break;
                    case "0":
                        System.out.println("Kiitos ohjelman käytöstä.");
                        sc.close(); 
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    }
}
