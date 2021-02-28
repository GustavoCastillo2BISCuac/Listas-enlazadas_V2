package listenlaza_v2;
/**@author Gustavo_Castillo*/
public class Lis {
    protected Nod inicio, fin;   
        
        public Lis(){
        inicio = null;
        fin    = null;
    }
    // Método para conocer si la lista esta vacia
    public boolean esVacia(){
        if (inicio == null){
            return true;
            }else{
                return false;
        }
    } 
     // Método para insertar al Inicio de la Lista
    public void agregarAlInicio(int d){       
        if(esVacia()){
        inicio = new Nod(d, inicio);
            fin = inicio;
            } else {
                inicio = new Nod(d, inicio);
    }
 }
    // Método para insertar al Final de la Lista
    public void agregarAlFinal(int d){        
        if (esVacia()){
            inicio = new Nod(d);
            fin = inicio;
            }else{
                fin.setSiguiente(new Nod(d));
                fin = fin.getSiguiente();
        }
            
    }     
    public void mostrarLista(){       
        Nod recorrer = inicio;
        System.out.println("");
        
        while (recorrer != null){
            System.out.print("["+ recorrer.dato+"] -->");
            recorrer = recorrer.getSiguiente();
        }
    }

      // Metodo para eliminar un nodo del inicio
    public int borrarDelInicio(){        
        int elemento = inicio.dato;
        if (inicio == fin){
            inicio = null;
            fin    = null;
             }else{
                inicio = inicio.siguiente;
        }
                return elemento;
        }
     // Método para eliminar un nodo del final
    public int borrarDelFinal(){        
        int elemento = fin.dato;
        if (inicio == fin){
            inicio = null;
            fin    = null;
            } else {
            Nod temporal = inicio;
                while(temporal.siguiente !=fin){
                temporal = temporal.siguiente;
            }
                fin = temporal;
                fin.siguiente = null;
        }
                return elemento;
    }
}