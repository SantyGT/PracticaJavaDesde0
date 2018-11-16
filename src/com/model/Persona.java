
package com.model;

public class Persona {
    
    private int Id_Persona;
    private String Primer_Nombre;
    private String Segunso_Nombre;
    private String Primer_Apellido;
    private String Segundo_Apellido;
    private int Edad;
    private int Sexo;

    public Persona(int Id_Persona, String Primer_Nombre, String Segunso_Nombre, String Primer_Apellido, String Segundo_Apellido, int Edad, int Sexo) {
        this.Id_Persona = Id_Persona;
        this.Primer_Nombre = Primer_Nombre;
        this.Segunso_Nombre = Segunso_Nombre;
        this.Primer_Apellido = Primer_Apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }
    
    public Persona(){
    }

    public int getId_Persona() {
        return Id_Persona;
    }

    public void setId_Persona(int Id_Persona) {
        this.Id_Persona = Id_Persona;
    }

    public String getPrimer_Nombre() {
        return Primer_Nombre;
    }

    public void setPrimer_Nombre(String Primer_Nombre) {
        this.Primer_Nombre = Primer_Nombre;
    }

    public String getSegunso_Nombre() {
        return Segunso_Nombre;
    }

    public void setSegunso_Nombre(String Segunso_Nombre) {
        this.Segunso_Nombre = Segunso_Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
