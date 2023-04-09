import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int opc;
    int as = 0;
    int fila = 0;
    int code = 1;
    int codeAs = 1;
    Estudiante[] students = new Estudiante[100];
    String[][] estudiantes = new String[5][100];
    String[][] materias = new String[3][100];
    Asignatura[] asignaturas = new Asignatura[100];

    void clean(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    void createStudent(){
        clean();
        System.out.println("Crear estudiante");
        Estudiante estudiante = new Estudiante();
        estudiante.setCode(code);
        code++;
        System.out.println(estudiante.getCode());
        students[fila] = estudiante;
        fila++;
        System.out.println(fila);
    }

    void modifiedStudent(){
        clean();
        System.out.println("Modificar datos estudiante");
        System.out.println(code);
        new ModifiedStudent(students, fila);
    }

    void createAsignatura(){
        Asignatura materia = new Asignatura();
        materia.setCode(codeAs);
        codeAs++;
        asignaturas[as] = materia;
        as++;
    }

    void printAsignaturas(){
        new SaveAsignaturas(materias, asignaturas, as);
        new PrintAsignaturas(materias, as);
    }

    void matricular(){
        //Asignatura materia = new Asignatura();

    }

    Menu(){
        //cto
        do {
            System.out.println("Bienvenido a el sistema de estudiantes");
            System.out.println("1. Crear estudiante.");
            System.out.println("2. Modificar datos del estudiante.");
            System.out.println("3. Crear asignaturas.");
            System.out.println("4. Vizualizar estudiantes.");
            System.out.println("5. Vizualizar asiganturas.");
            System.out.println("6. Matricular asignaturas.");
            System.out.println("7. Ver matricula.");
            System.out.println("8. Salir.");
            System.out.print("Ingrese una opcion: ");
            verifyIntType verify = new verifyIntType(opc);
            opc = verify.num;


            switch (opc){
                case 1:
                    createStudent();
                    clean();
                    break;
                case 2:
                    modifiedStudent();
                    clean();
                    break;
                case 3:
                    createAsignatura();
                    clean();
                    break;
                case 4:
                    new SaveEstudents(estudiantes, students, fila);
                    new PrintStudents(estudiantes, fila);
                    clean();
                    break;
                case 5:
                    printAsignaturas();
                    clean();
                    break;
                case 6:
                    //matricular();
                    //clean();
                    break;
                case 7:
                    //printMatricula();
                    //clean();
                    break;
                case 8:
                    //clean();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        }while (opc != 8);

    }



    public static void main(String[] args) {
        new Menu();
    }
}