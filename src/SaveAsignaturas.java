public class SaveAsignaturas {
    SaveAsignaturas(String[][] x, Asignatura[] m, int fila){
        for(int i = 0; i < fila; i++){
            x[i][0] = m[i].getCodeAs()+"";
            x[i][1] = m[i].getName()+"";
            x[i][2] = m[i].getCredits()+"";
        }
    }
}
