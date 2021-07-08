package paquete1;

public class Estudiante {

    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero

    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom;
    }

    public void establecerApellidoEstudiante(String ape) {
        apellidosEstudiante = ape;
    }

    public void establecerIdentificacionEstudiante(String iden) {
        identificacionEstudiante = iden;
    }

    public String obtenerNombresEstudiante() {
        return nombresEstudiante;
    }

    public String obtenerApellidoEstudiante() {
        return apellidosEstudiante;
    }

    // 8. Método obtenerIdentificacionEstudiante() : Cadena
    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }
}
