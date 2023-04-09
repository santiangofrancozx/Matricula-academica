public class SaveEstudents {

    SaveEstudents(String[][] x, Estudiante[] m, int fila){
        for(int i = 0; i < fila; i++){
            x[i][0] = m[i].getCode()+"";
            x[i][1] = m[i].getName();
            x[i][2] = m[i].getApellido();
            x[i][3] = m[i].getAge()+"";
            x[i][4] = m[i].getGenere()+"";
        }
    }
}
