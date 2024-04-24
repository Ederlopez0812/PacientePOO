import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        System.out.println("registro medico");
        System.out.println(" ingrese su nombre");
        String name = p1.next();
        System.out.println(" ingrese su apellido");
        String lastname = p1.next();
        System.out.println("ingrese su edad ");
        int edad = p1.nextInt();
        System.out.println("ingrese su altura");
        double altura = p1.nextDouble();
        Paciente p2 = new Paciente();
        p2.nombre = name;
        p2.apellido = lastname;
        p2.altura = altura;
        p2.edad = edad;
        p2.mostrarNombre();
        p2.mostrarApellido();
        p2.mostrarAltura();
    }

}