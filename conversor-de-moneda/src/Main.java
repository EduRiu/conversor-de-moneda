import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var lista = new ListaDeMonedas();
        conexionApi conexion = new conexionApi();

        Scanner leer = new Scanner(System.in);
        System.out.println("BienVenido al conversor de moneda");
        System.out.println("ingrese cantidad");
        int cantidad = leer.nextInt();

       lista.listar();

        System.out.println("de que pais es la moneda?");
        String inicial = lista.nombreYmonedas(leer.next());

        System.out.println("a la moneda de que pais quiere convertir?");
        String destino = lista.nombreYmonedas(leer.next());

        modeloMoneda resultado = conexion.cotizar(inicial, destino, cantidad);


        System.out.println("La cotizacion para " + cantidad + " son " + resultado.conversion_rate());


    }
}