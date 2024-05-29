import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        boolean seguir = true;
        while (seguir) {
            System.out.println("Ingresa el Id del empleado: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.println("Ingresa el nombre del empleado: ");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingresa el apellido del empleado: ");
            String apellido = scanner.nextLine();
            
            System.out.println("Ingresa el departamento del empleado: ");
            String departamento = scanner.nextLine();
            
            System.out.println("Ingresa el salario del empleado: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); 
            
           
            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(empleado);
            
            
            System.out.println("Registrar otro? si/no");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                seguir = false;
            }
        }
        
        
        System.out.println("Registros: ");
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println("Id: " + empleado.getId());
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellido: " + empleado.getApellido());
            System.out.println("Departamento: " + empleado.getDepartamento());
            System.out.println("Salario: " + empleado.getSalario());
            System.out.println();
        }
        

    }
}
