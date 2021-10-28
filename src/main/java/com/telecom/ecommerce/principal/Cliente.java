package com.telecom.ecommerce.principal;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_cliente;
	@Column
	private Integer id_producto; //esta es la clave foranea
	@Column
	private Integer dni;
	@Column
	private Integer codigo_postal;
	@Column
	private Integer telefono;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String domicilio;
	@Column
	private String contrasenia;
	@Column
	private Date nacimiento;
	
	public Cliente(Integer id_cliente, Integer dni, Integer codigo_postal, Integer telefono, String nombre,
			String correo, String domicilio, String contrasenia, Date nacimiento, Integer id_producto) {
		super();
		this.id_cliente = id_cliente;
		this.dni = dni;
		this.codigo_postal = codigo_postal;
		this.telefono = telefono;
		this.nombre = nombre;
		this.correo = correo;
		this.domicilio = domicilio;
		this.contrasenia = contrasenia;
		this.nacimiento = nacimiento;
		this.id_producto = id_producto;
	}
	
	public Cliente() {}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public Integer getId_producto() {
		return id_producto;
	}
	
	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(Integer codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
}
