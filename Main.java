import java.util.Scanner;

// Clase VisitorInformation
 class VisitorInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración y asignación de valores a variables representando información del visitante
        String visitorName;
        int visitorAge;
        char visitorGender;
        boolean isResident;
        double temperature;

        // Solicitar al usuario que ingrese la información del visitante
        System.out.println("Por favor, ingrese la información del visitante:");

        System.out.print("Nombre: ");
        visitorName = scanner.nextLine();

        System.out.print("Edad: ");
        visitorAge = scanner.nextInt();

        System.out.print("Género (M/F): ");
        visitorGender = scanner.next().charAt(0);

        System.out.print("¿Es residente? (true/false): ");
        isResident = scanner.nextBoolean();

        System.out.print("Temperatura corporal: ");
        temperature = scanner.nextDouble();

        // Imprimir la información del visitante
        System.out.println("\nInformación del Visitante:");
        System.out.println("Nombre: " + visitorName);
        System.out.println("Edad: " + visitorAge);
        System.out.println("Género: " + visitorGender);
        System.out.println("¿Es Residente?: " + isResident);
        System.out.println("Temperatura Corporal: " + temperature);

        scanner.close(); // Cerrar el scanner al finalizar
    }
}