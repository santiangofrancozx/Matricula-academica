import java.util.Scanner;

public class Estudiante {
    Scanner sc = new Scanner(System.in);
    //atributos
    String name;
    String apellido;
    String genere;
    int age;
    int code;

    //setters
    void setCode(int cod){
        code = cod;
    }

    void setName(){
        System.out.print("Ingrese el nombre: ");
        name = sc.nextLine();
    }

    void setApellido(){
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
    }

    void setGenere(){
        do {
            System.out.print("Ingrese el género (m/f): ");
            String genere2 = sc.nextLine();
            if (genere2.equals("m") || genere2.equals("f")) { // el operador == con strings no funciona en java debe ser .equals()
                genere = genere2;
                break; // Salir del bucle una vez que se asigna un valor válido
            } else {
                System.out.println("Ingrese una opción válida (m/f).");
            }
        } while (true);
    }

    void setAge(){
        System.out.print("Ingrese la edad: ");
        verifyIntType verify = new verifyIntType(age);
        age = verify.num;
        //age = sc.nextInt();
    }

    //getters

    int getCode(){
        return code;
    }

    String getName(){
        return name;
    }

    String getApellido(){
        return apellido;
    }

    String getGenere(){
        return genere;
    }

    int getAge(){
        return age;
    }

    Estudiante(){
        //setCode();
        setName();
        setApellido();
        setGenere();
        setAge();
        sc.skip(".*\\R");
    }

}
