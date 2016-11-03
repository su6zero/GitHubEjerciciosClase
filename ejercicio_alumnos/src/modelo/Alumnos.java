/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Israel
 */
public class Alumnos {
    //Definimos los atributos
    private int idAlumno;
    private String nombre;
    private String apellido;
    private String foto;
    private int faltas;
    private static int nMatriculas;
    //Generamos el constructor
    
    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, int faltas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.faltas = faltas;
    }
    //Definimos los getters y setters

    public int getIdAlumno() {
        return idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFoto() {
        return foto;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    

    
    
    
}
