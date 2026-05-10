package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorMixto;

public class TestVendedorMixto_JUnit {
	@Test
	void retornoCorrecto_Metodo_calcularSueldo_VendedorMixto() {
		VendedorMixto vendedor = new VendedorMixto("12345");

		assertEquals(0, vendedor.calcularSueldo(), 0.001);
	}
}

