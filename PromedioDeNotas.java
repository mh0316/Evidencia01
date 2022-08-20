import java.util.Scanner;

public class PromedioDeNotas {
    public static void main(String[] args) {
        double[] notas = ingresarNotas();
        double promedio = calcularPromedio(notas);
        mostrarResultados(promedio);
    }

    public static double[] ingresarNotas(){
        double[] notas = new double[3];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Ingrese la nota:");
            notas[i] = ingresar();
        }
        return notas;
    }

    public static double calcularPromedio(double[] notas){
        double promedio = 0;

        for(int i = 0; i < notas.length;i++){
            promedio += (notas[i] / 3);
        }

        return promedio;
    }

    public static void mostrarResultados(double promedio){
        if(promedio > 35.5 && promedio < 39.5){
            System.out.println("Su promedio final es: "+promedio);
            System.out.println("Debería rendir un exámen.");
        }
        if(promedio > 39.5){
            System.out.println("Su promedio final es: "+promedio);
            System.out.println("Felicidades, asignatura aprobada.");
        }
    }

    public static double ingresar() {
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                return teclado.nextDouble();
            } catch (Exception e) {
                System.out.println("Ingrese una nota válida:");
                teclado.nextLine();
            }
        } while (true);
    }
}
