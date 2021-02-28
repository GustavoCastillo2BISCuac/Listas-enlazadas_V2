package listenlaza_v2;
import java.util.Scanner;
/**@author Gustavo_Castillo*/
public class ListEnlaza_V2 {
    public static void main(String[] args) {
        Lis lisenlazada = new Lis();
        int option = 0;      Integer factI;
        Scanner Teclado = new Scanner(System.in);
        do{
            System.out.println ("\n MENU PRINCIPAL");
            System.out.println ("1) Añadir valor al pincipio");
            System.out.println ("2) Borrar valor al principio");
            System.out.println ("3) Añadir valor al final");
            System.out.println ("4) Borrar valor al final");
            System.out.println ("5) Mostrar Lista");
            System.out.println ("6) Salir");
            option = Teclado.nextInt();
            switch (option) {
                case 1:
                   System.out.println ("1) Favor de ingresar el dato");
                   factI = Teclado.nextInt();
                   lisenlazada.agregarAlInicio(factI);
                   break;
                case 2:
                    System.out.println ("1) Dato inicial eliminado: "+ lisenlazada.borrarDelInicio());
                    break;
                case 3:
                   System.out.println ("1) Favor de ingresar el dato");
                   factI = Teclado.nextInt();
                   lisenlazada.agregarAlFinal(factI);
                   break;
                case 4:
                    System.out.println ("1) Dato final eliminado: "+ lisenlazada.borrarDelFinal());
                    break;
                case 5:
                    lisenlazada.mostrarLista();
                    break;
                case 6:
                    System.out.println ("1) Hemos Terminado Gracias");
                    break;
                    default :System.out.println ("\t opcion invalida intenta de nuevo\n");
            }
        }while (option != 6);
    }
}