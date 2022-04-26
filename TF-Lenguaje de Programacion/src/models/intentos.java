package models;
import java.util.Scanner;
import java.util.ArrayList;

public class intentos {

    // Metodo sin retorno
    public void intentosV(){
        Scanner sc = new Scanner(System.in);

        // Llama a la clase cliente
        cliente client = new cliente();
        // Llama a la clase operacion
        operacion op = new operacion();

        // Llama al metodo Validator de la clase cliente
        boolean val = client.Validator();

        double saldo = 0.0;
        int contador = 0;

        while (contador < 3 ){
            if (val == true) {
                saldo = op.OperacionRealizada(contador, saldo);
                System.out.println("\nDesea Continuar [si] | [no]");
                String pregunta = sc.nextLine();
                if (pregunta.equals("si")){
                    contador = 0;
                }else{
                    System.out.println("\n¡¡GRACIAS POR SU PREFERENCIA!!");
                    contador = 4;
                }
            }else if (contador < 1){
                System.out.println("\n¡¡ERROR, vuelva a ingresar!!");
                val = client.Validator();
                contador++;
            }else if(contador == 2){
                System.out.println("\nSe agotó su numero de intentos...");
                contador = 4;
            }else if(contador == 1 ){
                System.out.println("\n¡¡Ultimo intento!!");
                val = client.Validator();
                contador++;
            }
        }
    }
}