/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author cecilia
 */
public class Profecional extends Persona {

    /**
     * @param args the command line arguments
     */
    int matricula;
    String especialidad;
  
   
       Profecional (String nombre, String apellido, String sexo, String fechaNacimiento,int matricula,String especialidad, int dni ){
       super(nombre,apellido, sexo, fechaNacimiento,dni);
       this.matricula = matricula;
       this.especialidad = especialidad;
       
       }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Profecional : "+ " Nombre : "+ nombre+ " Apelldo : "+apellido + " matricula=" + matricula + ", especialidad=" + especialidad + '}';
    }
   
    
}
