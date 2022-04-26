package models;
import java.util.Scanner;
import models.intentos; // Importa la clase intentos del paquete models
//la clase principal
public class principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        intentos intento = new intentos(); // Llama a la clase intentos

        // Llama al metodo intentosV de la clase intento
        intento.intentosV();
    }
}
