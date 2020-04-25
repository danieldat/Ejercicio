/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libros3;

/**
 *
 * @author alumnot
 */
public class Chanson {
    
        private String titulo;
    private String autor;
    private int duracion;
    
    
    public Chanson(String l,String a,int p){
    this.titulo=l;
    this.autor=a;
    this.duracion=p;
    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getSong() {
        return duracion;
    }

    public void setSong(int song) {
        this.duracion = song;
    }


    
    
    
    
    
}
