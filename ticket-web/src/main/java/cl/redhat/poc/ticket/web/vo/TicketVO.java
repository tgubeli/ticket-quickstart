package cl.redhat.poc.ticket.web.vo;

import java.io.Serializable;
import java.util.Date;

public class TicketVO implements Serializable{

	private static final long serialVersionUID = -4598568898513696901L;
	
	private Long id;
	private String asunto;
	private String descripcion;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private Long ownerID;
    private Long suportOwnerID;
    private Long sistema;
    private Long prioridad;
    private Long estado;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	public Long getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(Long ownerID) {
		this.ownerID = ownerID;
	}
	public Long getSuportOwnerID() {
		return suportOwnerID;
	}
	public void setSuportOwnerID(Long suportOwnerID) {
		this.suportOwnerID = suportOwnerID;
	}
	public Long getSistema() {
		return sistema;
	}
	public void setSistema(Long sistema) {
		this.sistema = sistema;
	}
	public Long getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(Long prioridad) {
		this.prioridad = prioridad;
	}
	public Long getEstado() {
		return estado;
	}
	public void setEstado(Long estado) {
		this.estado = estado;
	}
    
}