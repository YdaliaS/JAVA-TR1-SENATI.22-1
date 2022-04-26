package models;
import java.io.Console;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class cliente {

    // Atributos
    public String dni;
    private String password; // Privado
    public String usuario;


    public String getPassword() { // Mostrar
        return password;
    }

    public void setPassword(String password) { // Modificar
        this.password = password;
    }

    // Constructor
    public cliente(){

    }

    public cliente(String Dni, String Password, String Usuario){
        // Reemplaza los atributos con los parametros pasados
        this.dni = Dni;
        this.password = Password;
        this.usuario = Usuario;
    }
    //Creacion metodo Valitator para el dni y contraseña
        public boolean Validator(/*String dni, String password, String user*/){
        Console pass = System.console();

        Scanner sc = new Scanner(System.in);
        ArrayList<cliente> datos = new ArrayList<cliente>();
        cliente cliente1 = new cliente("46701905","*****","Jesus");
        cliente cliente2 = new cliente("42345678","nieve==123","Alberto");
        cliente cliente3 = new cliente("48765432","yato..321","Ydalia");
        cliente cliente4 = new cliente("72030405","nino/111","Kony");
        cliente cliente5 = new cliente("74567890","minino+++","Jazmine");

        datos.add(cliente1);
        datos.add(cliente2);
        datos.add(cliente3);
        datos.add(cliente4);
        datos.add(cliente5);

        System.out.println("\n******************\n"
                            + "  New Peru Bank "
                            + "\n******************\n");

        System.out.print("Ingrese DNI: ");
        String Dni = sc.nextLine();

        /*System.out.print("Ingrese Contraseña: ");
        String Password = sc.nextLine();*/

        char[] Pass = pass.readPassword("Ingrese Contraseña: ", new Object[0]);
        String Password = String.valueOf(Pass);

        for (int i = 0; i < Password.length(); i++){
            if (Password != null){
                System.out.print("*");
            }
        }

        boolean validador = false;

        //Estructura repetitiva para validar el Dni,Contraseña

        for (cliente date: datos) {
            String dniS = date.dni;
            String passS = date.password;
            String userS = date.usuario;
            if (Dni.equals(dniS) && Password.equals(passS)) {
                validador = true;
                System.out.println("BIENVENIDO " + userS);
                break;
            }else {
                validador = false;
            }
        }
        return validador;
    }

}
