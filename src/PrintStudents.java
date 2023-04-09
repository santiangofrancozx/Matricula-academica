public class PrintStudents {

    PrintStudents(String[][] x, int fila){
        System.out.println("Mostrar estudiantes.");
        for(int i = 0; i <= fila; i++){
            System.out.println(x[i][0] + "  "
                            +x[i][1] + "  "
                            +x[i][2] + "  "
                            +x[i][3] + "  "
                            +x[i][4]);

        }
    }
}
