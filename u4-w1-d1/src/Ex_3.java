import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        System.out.println("Ciao e benvenuto nel Back-End");

        // 1
        Scanner scanner = new Scanner((System.in));

        System.out.println("inserisci la base: ");
        double b = scanner.nextDouble();
        System.out.println("Inserisci l'altezza: ");
        double h = scanner.nextDouble();

        System.out.println("Il perimetro del rettangolo è uguale a: " + perimetroRet(b,h));

        // 2
        System.out.println("Inserisci un numero per vedere se è pari o dispari: ");
        int n = scanner.nextInt();
        System.out.println("Il valore del risulato è [" + pariDispari(n) + "] . Se è 'true', allora è pari altrimenti 'dispari'");

        // 3
        System.out.println("Inserisci il valore del primo lato: ");
        double l1 = scanner.nextDouble();
        System.out.println("Inserisci il valore del secondo lato: ");
        double l2 = scanner.nextDouble();
        System.out.println("Inserisci il valore del terzo lato: ");
        double l3 = scanner.nextDouble();

        System.out.println("L'area del triangolo è uguale a: " + areaTriangolo(l1,l2,l3) + " cm");
        scanner.close();

    }

    public static double perimetroRet(double base, double altezza){
       return  2 * (base + altezza);
    }

    public static boolean pariDispari(int num){
       return num %2 ==0;
    }

    public static double areaTriangolo (double lato1, double lato2, double lato3){
        double p = (lato1+lato2+lato3)/2;
        return  Math.sqrt(p*((p-lato1)*(p-lato2)*(p-lato3)));
    }
}
