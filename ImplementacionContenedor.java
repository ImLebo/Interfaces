import java.util.ArrayList;

public class ImplementacionContenedor implements Contenedor{
    
    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public ImplementacionContenedor(){
        this.listaEstudiantes.add(new Estudiante("Santiago", "1234"));
        this.listaEstudiantes.add(new Estudiante("Luis", "1264"));
        this.listaEstudiantes.add(new Estudiante("Santiago", "1034"));
    }

    public ArrayList<Estudiante> obtener_estudiantes(){
        return this.listaEstudiantes; 
    }

}
