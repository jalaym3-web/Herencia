package ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu Ejercicios");
        System.out.println("1. Persona, Docente y Estudiante");
        System.out.println("2. Cuenta y CuentaCorriente");
        System.out.println("3. Producto y ProductoPerecedero");
        System.out.println("4. Transporte y Bus");
        System.out.println("5. Empleado y Gerente");
        System.out.println("6. Animal y Perro");
        System.out.println("7. Vehiculo y Moto");
        System.out.println("8. Figura, Rectangulo y Circulo");
        System.out.println("9. Libro y LibroDigital");
        System.out.println("10. Sistema de Facturación");
        System.out.print("\nElige una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1: {
                Docente d = new Docente("Ana López", 40, "Matemáticas");
                Estudiante e = new Estudiante("Carlos Ruiz", 20, "2024-001");

                System.out.println("Docente");
                d.mostrar();
                System.out.println("\nEstudiante");
                e.mostrar();
            }

            case 2: {
                System.out.println("Cuenta Normal");
                Cuenta c = new Cuenta("María García", 500);
                c.retirar(600);
                c.retirar(200);
                c.mostrar();

                System.out.println("\nCuenta Corriente");
                CuentaCorriente cc = new CuentaCorriente("Pedro Pérez", 500, 300);
                cc.retirar(700);
                cc.retirar(200);
                cc.mostrar();
            }

            case 3: {
                Producto p = new Producto("Arroz", 12.50);
                p.mostrar();

                System.out.println();

                ProductoPerecedero p1 = new ProductoPerecedero("Leche",  18.00, LocalDate.of(2025, 4, 10));
                ProductoPerecedero p2 = new ProductoPerecedero("Yogurt", 22.00, LocalDate.of(2026, 6, 30));
                p1.mostrar();
                System.out.println();
                p2.mostrar();
            }

            case 4: {
                Transporte t = new Transporte("Toyota", 5);
                t.descripcion();

                System.out.println();

                Bus b = new Bus("Mercedes", 50, "Zona 1 - Zona 12");
                b.descripcion();
            }

            case 5: {
                Empleado em = new Empleado("Carlos López", 4500);
                em.mostrar();

                System.out.println();

                Gerente g = new Gerente("Ana Pérez", 4500, 2000);
                g.mostrar();
            }
            
            case 6: {
                Animal a = new Animal("Animal genérico");
                a.hacerSonido();

                System.out.println();

                Perro perro = new Perro("Rex");
                perro.hacerSonido();
            }

            case 7: {
                Vehiculo v = new Vehiculo("Toyota", 180);
                v.mostrarInfo();

                System.out.println();

                Moto m = new Moto("Honda", 220, 600);
                m.mostrarInfo();
            }

            case 8: {
                Rectangulo r = new Rectangulo("Azul", 5, 3);
                r.mostrar();

                System.out.println();

                Circulo circ = new Circulo("Rojo", 4);
                circ.mostrar();
            }

            case 9: {
                Libro l = new Libro("Cien años de soledad", "Gabriel García Márquez");
                l.mostrarInfo();

                System.out.println();

                LibroDigital ld = new LibroDigital("El principito", "Antoine de Saint-Exupéry", 2.5);
                ld.mostrarInfo();
            }

            case 10: {
                Cliente c1 = new Cliente("Juan Gonzalez", "1234567-8");
                Cliente c2 = new Cliente("Pedro Muñoz", "9876543-2");

                FacturaContado fc = new FacturaContado(101, c1, 500, 10);
                fc.mostrar();

                System.out.println();

                FacturaCredito fcr = new FacturaCredito(102, c2, 1200, 15, 6);
                fcr.mostrar();
            }

            default: 
            	System.out.println("Opción no válida. Elige entre 1 y 10.");
        }

        sc.close();
    }
}