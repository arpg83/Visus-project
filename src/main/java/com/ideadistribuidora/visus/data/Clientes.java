package com.ideadistribuidora.visus.data;

import jakarta.persistence.Entity;

@Entity
public class Clientes extends AbstractEntity {

    private String nombreFantasia;
    private String nombreCliente;
    private String sexo;
    private String estadoCivil;
    private String idDomicilio;
    private String idLocalidad;
    private String telefonoFijo;
    private String telefonoMovil;
    private String telefonoFax;
    private String idDocumento;
    private String numero;
    private String email;
    private String fechaNacimiento;
    private String fechaJubilacion;
    private String fechaBaja;
    private String fechaActualizacion;
    private String fechaIngreso;
    private String fechaUltimaCompra;
    private String limiteFacturasVencidas;
    private String limiteCredito;
    private String pagoMinimo;
    private String periodoCarencia;
    private String nivelFidelizacion;
    private String tipoCliente;
    private String idBanco;
    private String situacionFiscal;
    private String saldoCuentaCorriente;
    private String estadoCliente;

    public String getNombreFantasia() {
        return nombreFantasia;
    }
    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getIdDomicilio() {
        return idDomicilio;
    }
    public void setIdDomicilio(String idDomicilio) {
        this.idDomicilio = idDomicilio;
    }
    public String getIdLocalidad() {
        return idLocalidad;
    }
    public void setIdLocalidad(String idLocalidad) {
        this.idLocalidad = idLocalidad;
    }
    public String getTelefonoFijo() {
        return telefonoFijo;
    }
    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }
    public String getTelefonoMovil() {
        return telefonoMovil;
    }
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    public String getTelefonoFax() {
        return telefonoFax;
    }
    public void setTelefonoFax(String telefonoFax) {
        this.telefonoFax = telefonoFax;
    }
    public String getIdDocumento() {
        return idDocumento;
    }
    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getFechaJubilacion() {
        return fechaJubilacion;
    }
    public void setFechaJubilacion(String fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }
    public String getFechaBaja() {
        return fechaBaja;
    }
    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }
    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }
    public void setFechaUltimaCompra(String fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }
    public String getLimiteFacturasVencidas() {
        return limiteFacturasVencidas;
    }
    public void setLimiteFacturasVencidas(String limiteFacturasVencidas) {
        this.limiteFacturasVencidas = limiteFacturasVencidas;
    }
    public String getLimiteCredito() {
        return limiteCredito;
    }
    public void setLimiteCredito(String limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public String getPagoMinimo() {
        return pagoMinimo;
    }
    public void setPagoMinimo(String pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }
    public String getPeriodoCarencia() {
        return periodoCarencia;
    }
    public void setPeriodoCarencia(String periodoCarencia) {
        this.periodoCarencia = periodoCarencia;
    }
    public String getNivelFidelizacion() {
        return nivelFidelizacion;
    }
    public void setNivelFidelizacion(String nivelFidelizacion) {
        this.nivelFidelizacion = nivelFidelizacion;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public String getIdBanco() {
        return idBanco;
    }
    public void setIdBanco(String idBanco) {
        this.idBanco = idBanco;
    }
    public String getSituacionFiscal() {
        return situacionFiscal;
    }
    public void setSituacionFiscal(String situacionFiscal) {
        this.situacionFiscal = situacionFiscal;
    }
    public String getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }
    public void setSaldoCuentaCorriente(String saldoCuentaCorriente) {
        this.saldoCuentaCorriente = saldoCuentaCorriente;
    }
    public String getEstadoCliente() {
        return estadoCliente;
    }
    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

}
