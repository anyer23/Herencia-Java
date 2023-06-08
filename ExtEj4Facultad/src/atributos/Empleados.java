/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos;

/**
 *
 * @author monte
 */
public class Empleados extends Persona {

    private double anoIncorporacionFacu, numDespacho;

    public Empleados() {
    }

    public Empleados(double anoIncorporacionFacu, double numDespacho, String nombre, String apellido, String estadoCivil, String numIdentificacion) {
        super(nombre, apellido, estadoCivil, numIdentificacion);
        this.anoIncorporacionFacu = anoIncorporacionFacu;
        this.numDespacho = numDespacho;
    }

   

    public double  getAnoIncorporacionFacu() {
        return anoIncorporacionFacu;
    }

    public void setAnoIncorporacionFacu(int anoIncorporacionFacu) {
        this.anoIncorporacionFacu = anoIncorporacionFacu;
    }

    public double getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados");

        sb.append("\nNombre ").append(getNombre());
        sb.append("\nApellido").append(getApellido());
        sb.append(" \nEstado Civil ").append(getEstadoCivil());
        sb.append("\nNumIdentificacion=").append(getNumIdentificacion());
        sb.append("\nAño de Incorporacion a la Facultad ").append(getAnoIncorporacionFacu());
        sb.append("\nNumero de Despacho ").append(getNumDespacho());
        return sb.toString();
    }

}
