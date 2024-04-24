public class Paciente {
    String nombre;
    String apellido;
    int edad;
    double altura;

    public void mostrarNombre() {
        System.out.println("mi nombre es: " + this.nombre);
    }

    public void mostrarApellido() {
        System.out.println("mi apellido es: " + this.apellido);
    }

    public void mostrarAltura() {
        System.out.println("mi altura es :" + this.altura);
    }

}