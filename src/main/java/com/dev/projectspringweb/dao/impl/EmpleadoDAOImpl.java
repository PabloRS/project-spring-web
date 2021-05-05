/**
 * 
 */
package com.dev.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.dev.projectspringweb.dao.EmpleadoDAO;

/**
 * @author pablo
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Pablo Ramirez";
	}

}
