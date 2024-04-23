public class Estudiante {
    
    private String student_name = "";
    private String student_code = "";

    public Estudiante(String student_name, String student_code) {
        this.student_name = student_name;
        this.student_code = student_code;
    }

    //Getters
    public String getStudent_name() {
        return this.student_name;
    }

    public String getStudent_code() {
        return this.student_code;
    }

    //Setters
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_code(String student_code) {
        this.student_code = student_code;
    } 
    
}
