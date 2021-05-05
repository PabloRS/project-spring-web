/**
 * 
 */
package com.dev.projectspringweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.dev.projectspringweb.services.SpringService;

/**
 * @author pablo
 * Controlador de ejemplo para demostrar la integracion de Spring con JSF.
 */
@ManagedBean
@ViewScoped
public class SpringJSFController {
	
	private String nombreEmpresa;
	
	private String nombreEmpleado;

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@ManagedProperty("#{springServiceImpl}")
	private SpringService springServiceImpl;
	
	/**
	 * @return the springServiceImpl
	 */
	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}

	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}

	@PostConstruct
	public void init() {
		String nombre = this.springServiceImpl.mostrarNombreEmpresa();
		System.out.println(nombre);
		this.nombreEmpresa = nombre;
		
		String nombreEmpleado = this.springServiceImpl.mostrarNombreEmpleado();
		System.out.println(nombreEmpleado);
		this.nombreEmpleado = nombreEmpleado;
	}
}
