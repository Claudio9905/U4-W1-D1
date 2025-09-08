import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        System.out.println("Ciao e benvenuto nel Back-End");

        // 1
        askString();


    }

    public static void askString(){
        Scanner scanner = new Scanner((System.in));

        System.out.println("Inserisci la prima stringa: ");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa: ");
        String str2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa: ");
        String str3 = scanner.nextLine();

        String rightOrder = str1.concat(" " + str2).concat(" " + str3);
        String inverseOrder = str3.concat(" " + str2).concat(" "+ str1);
        System.out.println("L'ordine in cui sono state inserite: " + rightOrder);
        System.out.println("Ordine di inserimento inverso: " + inverseOrder);
        scanner.close();
    }
}
