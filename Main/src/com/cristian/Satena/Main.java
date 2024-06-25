package com.cristian.Satena;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            FlightManager flightManager = new FlightManager();
            Scanner scanner = new Scanner(System.in);
            int choice;

            while (true) {
                System.out.println("\nSistema de gestion del areopuerto");
                System.out.println("1. Registrar un nuevo vuelo");
                System.out.println("2. Ver un vuelo");
                System.out.println("3. Actualizar un vuelo");
                System.out.println("4. Eliminar un vuelo");
                System.out.println("5. listar todo");
                System.out.println("6. salir");
                System.out.print("Introduzca su eleccion: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (choice == 6) {
                    System.out.println("Saliendo....");
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Escriba el numero de vuelo: ");
                        String flightNumber = scanner.nextLine();
                        System.out.print("Escriba destino: ");
                        String destination = scanner.nextLine();
                        System.out.print("Escribe la hora de salida: ");
                        String departureTime = scanner.nextLine();
                        flightManager.addFlight(flightNumber, destination, departureTime);
                        break;
                    case 2:
                        System.out.print("Introduzca numero de vuelo: ");
                        flightNumber = scanner.nextLine();
                        flightManager.viewFlight(flightNumber);
                        break;
                    case 3:
                        System.out.print("intoduce el numero de vuelo para actualizar: ");
                        flightNumber = scanner.nextLine();
                        System.out.print("Introduce nuevo destino: ");
                        destination = scanner.nextLine();
                        System.out.print("Introduce la nueva hora de salida: ");
                        departureTime = scanner.nextLine();
                        flightManager.updateFlight(flightNumber, destination, departureTime);
                        break;
                    case 4:
                        System.out.print("Introduce el numero de vuelo para eliminar: ");
                        flightNumber = scanner.nextLine();
                        flightManager.deleteFlight(flightNumber);
                        break;
                    case 5:
                        flightManager.listFlights();
                        break;
                    default:
                        System.out.println("Eleccion no valida. intentelo de nuevo");
                }
            }

            scanner.close();
        }
    }

