/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Persona;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author cecilia
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
  int id;
  int dni;
  String nombre;
  String apellido;
  String sexo;
  String fechaNacimiento;
  
  /**Constructor*/ 
  Persona(String nombre,String apellido, String sexo, String fechaNacimiento, int dni){
       this.nombre = nombre;
       this.apellido = apellido;
       this.sexo = sexo;
       this.fechaNacimiento = fechaNacimiento;
       this.dni= dni;
       
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
     
    
    public void datos(){
        System.out.println("Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}');
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
  
  
  
  
  /** para edad
   * // 01/01/2000
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
LocalDate ahora = LocalDate.now();

Period periodo = Period.between(fechaNac, ahora);
System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());*/
   

   
}
