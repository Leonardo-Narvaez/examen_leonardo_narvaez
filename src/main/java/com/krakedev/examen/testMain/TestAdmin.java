package com.krakedev.examen.testMain;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.services.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminVentas ad = new AdminVentas();
		Vendedor v = new Vendedor("12345", "V");
		VendedorComision v1 = new VendedorComision("56985","C");
		VendedorMixto v2 = new VendedorMixto("85236", "M");

		ad.agregar(v);
		ad.agregar(v1);
		ad.agregar(v2);
		
		System.out.println("Sueldo de V: " + ad.calcularSueldo("12345"));
		System.out.println("Sueldo de V1: " + ad.calcularSueldo("56985"));
		System.out.println("Sueldo de V2: " + ad.calcularSueldo("85236"));
		System.out.println("Sueldo de V3: " + ad.calcularSueldo("854115"));
	}

}
