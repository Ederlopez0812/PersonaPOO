import java.util.Scanner;
public class MainPersona {
public static void main(String[] args) {
    Scanner p1= new Scanner(System.in);
    System.out.println("ingresa tu nombre");
    String name=p1.next();
    System.out.println("ingresa tu apellido");
    String lastname=p1.next();
    System.out.println("ingresa tu edad ");
    int edad=p1.nextInt();
    System.out.println("ingresa tu altura");
    double altura=p1.nextDouble();
Persona p2=new Persona();
p2.nombre=name;
p2.apellido=lastname;
p2.edad=edad;
p2.altura=altura;
p2.mostrarNombre();
p2.mostrarApellido();
p2.mostrarAltura();
}
    
}