import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ImplementacionContenedor instancia = new ImplementacionContenedor();
        ArrayList<Estudiante> listaEstudiantes = instancia.obtener_estudiantes();

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Estudiante: "+estudiante.getStudent_name() + " Codigo: "+estudiante.getStudent_code());
        }

    }
}