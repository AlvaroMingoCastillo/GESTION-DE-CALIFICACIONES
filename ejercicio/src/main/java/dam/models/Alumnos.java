package dam.models;

public class Alumnos {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String dni;
    private int id;
    private String tipoAlumno;

    public Alumnos(String nombre, String apellido, String email, String telefono, String dni, int id, String tipoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
        this.id = id;
        this.tipoAlumno = tipoAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAlumno() {
        return tipoAlumno;
    }

    public void setTipoAlumno(String tipoAlumno) {
        this.tipoAlumno = tipoAlumno;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                ", tipoAlumno='" + tipoAlumno + '\'' +
                '}';
    }

    public Alumnos clone(String nombre, String apellido, String email, int telefono, String dni, int id, String tipoAlumno) {
        return new Alumnos(this.nombre, this.apellido, this.email, this.telefono, this.dni, this.id, this.tipoAlumno);
    }
}
