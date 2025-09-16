import java.util.Scanner;

public class PerfilPersonalGamer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos del perfil
        String nombre = "Emanuel Baltazar";
        String descripcion = "Estudiante de Ingeniería de Sistemas, gamer. Le gustan los videojuegos de supervivencia, estrategia en tiempo real, modo historia interactiva, MOBAs y shooters. Comida favorita: hamburguesas, gomitas, helados, frappes, snacks y todo tipo de frituras. Le gusta ayudar a las personas y es muy bromista.";

        // Proyectos
        String[][] proyectos = {
                {"Catalogo de Supermercado", "Sistema para administrar productos y ventas de un supermercado", "2024"},
                {"Tienda de Juegos", "Plataforma online para comprar y vender videojuegos", "2023"},
                {"Sistema de Memoria", "Aplicación para entrenamiento de memoria y concentración", "2025"}
        };

        // Redes sociales
        String[] redes = {"Facebook", "Twitter", "LinkedIn", "GitHub"};

        int opcion = 0;
        do {
            System.out.println("\n===============================");
            System.out.println("         PERFIL PERSONAL       ");
            System.out.println("===============================");
            System.out.println("1. Presentacion");
            System.out.println("2. Proyectos");
            System.out.println("3. Redes Sociales");
            System.out.println("4. Contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n===============================");
                    System.out.println("       TARJETA DE PRESENTACION  ");
                    System.out.println("===============================");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Descripcion: " + descripcion);
                    System.out.println("===============================");
                    break;

                case 2:
                    System.out.println("\n===============================");
                    System.out.println("            PROYECTOS          ");
                    System.out.println("===============================");
                    System.out.printf("%-25s %-60s %-5s%n", "Proyecto", "Descripcion", "Ano");
                    System.out.println("------------------------------------------------------------");
                    for (String[] proyecto : proyectos) {
                        System.out.printf("%-25s %-60s %-5s%n", proyecto[0], proyecto[1], proyecto[2]);
                    }
                    System.out.println("===============================");
                    break;

                case 3:
                    System.out.println("\n===============================");
                    System.out.println("        REDES SOCIALES         ");
                    System.out.println("===============================");
                    for (String red : redes) {
                        System.out.println("* " + red);
                    }
                    System.out.println("===============================");
                    break;

                case 4:
                    System.out.println("\n===============================");
                    System.out.println("           CONTACTO             ");
                    System.out.println("===============================");
                    System.out.print("Ingrese su nombre: ");
                    String nombreContacto = sc.nextLine();
                    System.out.print("Ingrese su correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Ingrese su mensaje: ");
                    String mensaje = sc.nextLine();
                    System.out.println("\nGracias por contactarnos, " + nombreContacto + "!");
                    System.out.println("Recibimos su mensaje: " + mensaje);
                    System.out.println("Le responderemos al correo: " + correo);
                    System.out.println("===============================");
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion invalida, intente nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
