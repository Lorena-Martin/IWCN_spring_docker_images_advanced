package com.iwcn.master.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iwcn.master.entities.Producto;

public class ProductoTest {

	@Test
	public void testProducto() {
		Producto p = new Producto();
		assertEquals(p.getCodigo(), 0);
		assertEquals(p.getNombre(), null);
		assertEquals(p.getDescripcion(), null);
		assertEquals(p.getPrecio(), 0);
	}

	@Test
	public void testProductoConstructor() {
		Producto p = new Producto(1, "nombre1", "descripcion1", 1);
		assertEquals(p.getCodigo(), 1);
		assertEquals(p.getNombre(), "nombre1");
		assertEquals(p.getDescripcion(), "descripcion1");
		assertEquals(p.getPrecio(), 1);
	}

	@Test
	public void testSetId() {
		Producto p = new Producto();
		p.setId(1);
		assertEquals(p.getId(), 1);
	}

	@Test
	public void testSetCodigo() {
		Producto p = new Producto();
		p.setCodigo(1);
		assertEquals(p.getCodigo(), 1);
	}

	@Test
	public void testSetNombre() {
		Producto p = new Producto();
		p.setNombre("nombre1");
		assertEquals(p.getNombre(), "nombre1");
	}

	@Test
	public void testSetDescripcion() {
		Producto p = new Producto();
		p.setDescripcion("descripcion1");
		assertEquals(p.getDescripcion(), "descripcion1");
	}

	@Test
	public void testSetPrecio() {
		Producto p = new Producto();
		p.setPrecio(1);
		assertEquals(p.getPrecio(), 1);
	}

}
