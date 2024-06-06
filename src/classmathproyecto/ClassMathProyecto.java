package classmathproyecto;

import java.util.Random;
import java.util.Scanner;

public class ClassMathProyecto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // Le damos la bienvenida al usuario
        System.out.println("CALCULADORA GEOMETRICA");

        // Declaramos una variable que nos ayudará en el ciclo while
        boolean continuar = true;

        // Ciclo while que se encargará de llevar acabo todo el proceso y termine cuando el usuario lo desee
        while (continuar == true) {
            System.out.println("---------------------------------------------------");
            System.out.println("OPCIONES: \n1. Calculo de Hipotenusa\n2. Calculo del volumen de un cilindro\n3. Distancia entre dos puntos en un plano 2D\n4. Maximo y Minimo de dos numeros\n5. Salir");
            int eleccion = teclado.nextInt();

            switch (eleccion) {
                // Calculo de la hipotenusa
                case 1:
                    // Pedimos los datos al usuario
                    System.out.print("Intruduce el cateto a: ");
                    double catetoA = teclado.nextDouble();
                    System.out.print("Introduce el cateto b: ");
                    double catetoB = teclado.nextDouble();

                    // Realizamos el calculo
                    double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
                    System.out.println("Hipotenusa = " + hipotenusa);
                    break;
                // Calculo del volumen de un cilindro
                case 2:
                    // Pedimos los datos al usuario
                    System.out.print("Introduce el radio: ");
                    double radio = teclado.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double altura = teclado.nextDouble();

                    // Realizamos el calculo
                    double volumen = Math.PI * Math.pow(radio, 2) * altura;
                    System.out.println("Volumen = " + volumen);
                    break;
                // Distancia entre dos puntos
                case 3:
                    // Pedimos los datos al usario
                    System.out.println("Introduce las coordenadas (EJEMPLO: 1.2)");
                    System.out.print("Coordenada A: ");
                    String coordenadaA = teclado.next();
                    System.out.print("Coordenada B: ");
                    String coordenadaB = teclado.next();

                    // Dividimos las coordenadas
                    String[] partesA = coordenadaA.split("\\.");
                    String[] partesB = coordenadaB.split("\\.");

                    // Realizamos el calculo
                    double distancia = Math.sqrt(Math.pow((Integer.parseInt(partesB[0]) - Integer.parseInt(partesA[0])), 2) + Math.pow((Integer.parseInt(partesB[1]) - Integer.parseInt(partesA[1])), 2));
                    System.out.println("Distancia entre " + coordenadaA + " y " + coordenadaB + " = " + distancia);
                    break;
                // Maximo y minimo entre dos numeros
                case 4:
                    // Numero 1
                    int numeroUno = random.nextInt(11);
                    // Numero 2
                    int numeroDos = random.nextInt(11);

                    if (numeroUno > numeroDos) {
                        System.out.println("Primer numero: " + numeroUno + " es mayor que segundo numero: " + numeroDos);
                    } else if(numeroDos > numeroUno){
                        System.out.println("Segundo numero: " + numeroDos + " es mayor que primer numero: " + numeroUno);
                    } else{
                        System.out.println("Primero numero: " + numeroUno + " y Segundo numero: " + numeroDos + " son iguales");
                    }
                    break;
                // Salida del programa
                case 5:
                    System.out.println("Gracias por usar Calculadora Gemotrica, hasta luego!!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Eleccion no valida");
            }
        }
    }
}
