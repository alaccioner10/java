
package ejercicio;

public class Ejercicio {

    public static void main(String[] args) {
        Estante estantes = new Estante(20);
        Libro uno = new Libro();
        String unNombre = "El Acabado";
        uno.setTitulo(unNombre);
        Libro dos = new Libro();
        String otroNombre= "El que lo critica";
        dos.setTitulo(otroNombre);
        estantes.agregarLibro(uno);
        estantes.agregarLibro(dos);
            
    }
}

