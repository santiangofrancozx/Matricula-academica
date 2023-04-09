import java.util.Scanner;

public class verifyIntType {
    int num;
    Scanner sc = new Scanner(System.in);
    public verifyIntType(Integer x){
            if (sc.hasNextInt()) {
                // Si la entrada es un entero
                x = sc.nextInt();
                this.num = x;
            } else {
                // Si la entrada no es un entero
                System.out.println("La entrada no es un número entero válido.");
            }
    }
}
