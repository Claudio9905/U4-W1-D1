import java.util.Arrays;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println("Ciao e benvenuto nel Back-End");

        int a = 25;
        int b = 20;
        String str = "Chiara";
        String[] strVet = new String[]{"Claudio", "Chiara", "Daniele", "Marco", "Stefano"};
        String str2 = "Luca";

        // 1

        System.out.println("Il prodotto è uguale a: " + prodotto(a,b));
        System.out.println("\n");


        // 2
        String stringConcat = concatStrInt(str, a);
        System.out.println("La nuova stringa concatenata è: " + stringConcat);
        System.out.println("\n");


        // 3
        String[] strRes = inserisciInArray(strVet,str2);
        System.out.println("La stringa risultante è: " + Arrays.toString(strRes));

    }

    public static int prodotto(int num1, int num2){
        return  num1*num2;
    }

    public static String concatStrInt (String str1, int num1 ){
       return str1 + num1;
    }

    public static String[] inserisciInArray (String[] strVet, String str){
        int startLenght = strVet.length;
        int indiceCentrale = strVet.length/2;
        String[] newStringVet = new String[strVet.length + 1];

        System.arraycopy(strVet,0,newStringVet,0,indiceCentrale);
        newStringVet[indiceCentrale] = str;
        System.arraycopy(strVet, indiceCentrale, newStringVet, indiceCentrale+1, startLenght - indiceCentrale);


        return  newStringVet;
    }
}
