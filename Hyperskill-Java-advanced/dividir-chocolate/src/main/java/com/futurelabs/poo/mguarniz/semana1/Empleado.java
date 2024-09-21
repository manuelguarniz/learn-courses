package com.futurelabs.poo.mguarniz.semana1;

public class Empleado {
    private int codigo;
    private int tipoServicio;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Empleado () { }
    public Empleado(int codigo, int tipoServicio, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.codigo = codigo;
        this.tipoServicio = tipoServicio;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getTipoServicio() {
        return tipoServicio;
    }
    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public char calculaCategoria() {
        if (tipoServicio <= 5) {
            return 'A';
        } else if (tipoServicio <= 10) {
            return 'B';
        } else {
            return 'C';
        }
    }
}