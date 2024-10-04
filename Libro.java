/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;


public class Libro {
   private String titulo;
   private Autor primerAutor; 
   private String editorial;
   private int añoEdicion;
   private String ISBN; 
   private double precio; 

   public Libro (){
       
   }
    
   public Libro (String unTitulo, Autor unAutor, String unaEditorial, int unAñoEdicion, String unISBN, double unPrecio){
       titulo=unTitulo;
       primerAutor=unAutor;
       añoEdicion=unAñoEdicion;
       ISBN=unISBN;
       precio=unPrecio;
       editorial=unaEditorial;
   }
   
      public Libro (String unTitulo, Autor unAutor, String unaEditorial, String unISBN){
       titulo=unTitulo;
       primerAutor=unAutor;
       añoEdicion=2015;
       ISBN=unISBN;
       precio=100;
       editorial=unaEditorial;
   }
   
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getPrimerAutor() {
        return primerAutor;
    }

    public void setPrimerAutor(Autor primerAutor) {
        this.primerAutor = primerAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + '}';
    }

   
   
}
     