public class PrintAsignaturas {
    PrintAsignaturas(String[][] x, int fila){
        System.out.println("Mostrar asignaturas.");
        for(int i = 0; i <= fila; i++){
            System.out.println(x[i][0] + "  " + x[i][1] + "  " + x[i][2]);
        }
    }
}
