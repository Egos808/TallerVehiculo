import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Taller de Vehículos");
        
        System.out.print("Ingrese la cantidad de vehículos: ");
        int cantidadVehiculos = scanner.nextInt();
        
        Vehiculo[] vehiculos = new Vehiculo[cantidadVehiculos];
        
        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.println("Vehículo #" + (i + 1));
            System.out.print("Ingrese la marca: ");
            String marca = scanner.next();
            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.next();
            System.out.print("Ingrese el año: ");
            int año = scanner.nextInt();
            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            
            vehiculos[i] = new Vehiculo(marca, modelo, año, precio);
        }
        
        System.out.println("Resumen de vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() +
                               ", Año: " + vehiculo.getAño() + ", Precio: $" + vehiculo.getPrecio());
        }
        
        scanner.close();
    }
}
