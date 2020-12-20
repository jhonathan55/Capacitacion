/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jhonathan
 */
public class Zeus {
    int rut,cel1,cel2,provision,sap,rutRes;
    String nombre,apellido1, apellido2, estCivil,fNac,nacionalidad,direccion,ciudad,comuna,email,disponibilidad,tipoRac,fIngreso;

    public Zeus() {
    }

    public Zeus(int rut, int cel1, int cel2, int provision, int sap, int rutRes, String nombre, String apellido1, String apellido2, String estCivil, String fNac, String nacionalidad, String direccion, String ciudad, String comuna, String email, String disponibilidad, String tipoRac, String fIngreso) {
        this.rut = rut;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.provision = provision;
        this.sap = sap;
        this.rutRes = rutRes;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.estCivil = estCivil;
        this.fNac = fNac;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.email = email;
        this.disponibilidad = disponibilidad;
        this.tipoRac = tipoRac;
        this.fIngreso = fIngreso;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getCel1() {
        return cel1;
    }

    public void setCel1(int cel1) {
        this.cel1 = cel1;
    }

    public int getCel2() {
        return cel2;
    }

    public void setCel2(int cel2) {
        this.cel2 = cel2;
    }

    public int getProvision() {
        return provision;
    }

    public void setProvision(int provision) {
        this.provision = provision;
    }

    public int getSap() {
        return sap;
    }

    public void setSap(int sap) {
        this.sap = sap;
    }

    public int getRutRes() {
        return rutRes;
    }

    public void setRutRes(int rutRes) {
        this.rutRes = rutRes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getfNac() {
        return fNac;
    }

    public void setfNac(String fNac) {
        this.fNac = fNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTipoRac() {
        return tipoRac;
    }

    public void setTipoRac(String tipoRac) {
        this.tipoRac = tipoRac;
    }

    public String getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(String fIngreso) {
        this.fIngreso = fIngreso;
    }


}
