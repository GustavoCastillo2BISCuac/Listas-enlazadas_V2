package listenlaza_v2;
/**@author Gustavo_Castillo*/
public class Nod {
    public int dato;    // Valor a almacenar    
    public Nod siguiente;  // Puntero, del mismo tipo de la clase
    
    // Constructor para insertar el dato
    public Nod (int d){
        this.dato = d;
        this.siguiente = null;
      
    }
    // Constructor para insertar al inicio de la lista
    public Nod(int d, Nod n){
        dato = d;       
        siguiente = n;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int d) {
        this.dato = d;
    }

    public Nod getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nod siguiente) {
        this.siguiente = siguiente;
    }
}