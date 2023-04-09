import java.util.Scanner;

public class Asignatura {
    Scanner sc = new Scanner(System.in);
    String name;
    int credits;
    int codeAs = 1;

    //setters
    void setCode(int x){
        this.codeAs = x;
    }

    void setName(){
        System.out.print("Ingrese el nombre de la asignatura: ");
        name = sc.nextLine();
    }

    void setCredits(){
        System.out.print("Ingrese los creditos de la asignatura: ");
        verifyIntType verify = new verifyIntType(credits);
        credits = verify.num;

    }

    //getters

    String getName(){
        return name;
    }

    int getCredits(){
        return credits;
    }

    int getCodeAs(){
        return codeAs;
    }

    Asignatura(){
        System.out.println("Crear asignatura: ");
        setName();
        setCredits();
    }
}
