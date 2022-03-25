package ut5_tarea18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {

	Producto p1 = new Producto(1,"Iphone x", 21);
	Producto p2 = new Producto(82,"Xiaomi smartband", 11);
	Producto p3 = new Producto(23, "Galaxy Fold", 7);
	Producto p4 = new Producto(23, "Error", 27);
	@Test
	void testAñadirProductos() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
	}

	@Test
	void testErrorAñadirProductos() throws Exception {
		GestorStock g = new GestorStock();
		Exception esperado = new Exception("DuplicatedElement");
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		try {
			g.añadirProductos(p4);
		}catch(Exception e){
			assertTrue(e.toString().equals(esperado.toString()));
		}
	}
	
	@Test
	void testLocalizarProducto() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		assertEquals(p1, g.localizarProducto(p1.getId()));
	}
	
	@Test
	void testLocalizarProductoError() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		assertNotEquals(p1, g.localizarProducto(p2.getId()));
	}
	
	@Test
	void testLocalizarProducto2() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		assertEquals(p2, g.localizarProducto(p2.getNombre()));
	}
	
	@Test
	void testLocalizarProductoError2() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		assertNotEquals(p1, g.localizarProducto(p2.getNombre()));
	}
	
	@Test
	void testCantidadProductos() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		assertEquals(21, g.cantidadEnStock(1));
	}
	
	@Test
	void testCantidadProductosNoId() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		assertEquals(-1, g.cantidadEnStock(19));
	}
	
	@Test
	void testRecibirProducto() throws Exception {
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);
		g.recibirProducto(1, 9);
		assertEquals(30, g.localizarProducto(1).getStock());
	}
	
	@Test
	void testErrorRecibirProducto() throws Exception {
		Exception x = new Exception("UnexpectedId");
		GestorStock g = new GestorStock();
		g.añadirProductos(p1);
		g.añadirProductos(p2);
		g.añadirProductos(p3);

		try {
			g.recibirProducto(24, 5);
		}catch(Exception e) {
			assertEquals(x.toString(), e.toString());
		}

	}
}
