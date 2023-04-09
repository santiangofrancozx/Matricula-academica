import java.util.Scanner;

public class ModifiedStudent {
    Scanner sc = new Scanner(System.in);
    int code2;

    ModifiedStudent(Estudiante[] x, int fila){
        System.out.print("Ingrese el codigo de estudiante: ");
        code2 = sc.nextInt();
        for (int i = 0; i <= fila; i++){
            if(x[i].getCode() == code2){
                System.out.println("Usuario encontrado");
                //datos actuales del usuario
                System.out.println("Nombre: " + x[i].getName());
                System.out.println("Apellido: " + x[i].getApellido());
                System.out.println("Genero: " + x[i].getGenere());
                System.out.println("Edad: " + x[i].getAge());
                System.out.println("==============================");
                //limpiar buffer
                sc.skip(".*\\R");
                //setear nuevos datos
                x[i].setName();
                x[i].setApellido();
                x[i].setGenere();
                x[i].setAge();
                //mostrar datos modifiacdos
                System.out.println("==============================");
                System.out.println("Nombre: " + x[i].getName());
                System.out.println("Apellido: " + x[i].getApellido());
                System.out.println("Genero: " + x[i].getGenere());
                System.out.println("Edad: " + x[i].getAge());
                break;

            }
        }
        System.out.println("Usuario no encontrado");
    }
}
