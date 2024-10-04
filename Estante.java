
package ejercicio;


public class Estante {
    private Libro [] vectorLibros;
    private int dimF;
    private int dimL;


    public Estante (int capacidad){
        this.dimF=capacidad;
        this.dimL=0;
        this.vectorLibros=new Libro[dimF];
    }

    public int getDimL() {
        return dimL;
    }
    public boolean estalleno (){
       return dimF==dimL;
    }
          
    public void agregarLibro(Libro libroAdd){
        if (!estalleno()){
            vectorLibros[dimF]=libroAdd;
            dimL++;
        } else {
            System.out.println("El estante está lleno. No se puede agregar más libros.");
        }
            
        
    }
    


}