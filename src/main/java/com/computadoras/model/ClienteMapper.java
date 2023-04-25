package com.computadoras.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClienteMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cliente c = new Cliente();
		c.setId_cliente(rs.getInt(1));
		c.setNombre_cliente(rs.getString(2));
		c.setId_area(rs.getInt(3));
		c.setDni(rs.getString(4));
		c.setEdad(rs.getInt(5));
		c.setCiudad(rs.getString(6));
		return c;
	}
	
}
