package com.krakedev.examen.services;

import java.util.ArrayList;

import com.krakedev.examen.entidades.Vendedor;

public class AdminVentas {
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

	public void agregar(Vendedor vendedor) {
		vendedores.add(vendedor);
	}

	public Double calcularSueldo(String cedula) {
		for (Vendedor v : vendedores) {
			if (v.getCedula().equals(cedula)) {
				return v.calcularSueldo();
			}
		}
		return null;
	}
}
