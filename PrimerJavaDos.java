import java.util.Scanner;

public class PrimerJavaDos {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresos: ");
        float ingresos = in.nextFloat();

        Scanner sp = new Scanner(System.in);
        System.out.println("Superficie: ");
        int superficie = sp.nextInt();

        Scanner en = new Scanner(System.in);
        System.out.println("Energia: ");
        int energia = en.nextInt();

                    if ((ingresos <= 748382.07) &&
                          (superficie <= 30) &&
                            (energia <= 3330) ) {
                              System.out.println("Categoría A");
                    }                 else if((ingresos <= 1112459.83) &&
                                    (superficie <= 45) &&
                                     (energia <= 5000) ) {
                                      System.out.println("Categoría B");
                    }





    }
}
