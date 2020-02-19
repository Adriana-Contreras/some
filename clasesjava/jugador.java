package campeonato;

public class jugador {

    private String nombrecompleto;
    private String apellidos;
    private String ci;
    private int edad;



    public jugador (String nombre, String apellidos,String ci, int edad) {
        this.nombrecompleto =nombre;
        this.apellidos = apellidos;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombrecompleto(){
        return this.nombrecompleto;
    }
    public void setNombrecompleto(String nombre ){
        this.nombrecompleto =nombre;
    }
}



