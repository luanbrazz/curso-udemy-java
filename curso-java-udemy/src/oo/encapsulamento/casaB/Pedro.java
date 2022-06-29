package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
//		segredo 
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
//		
//		Ana mae = new Ana();
		
		// System.out.println(mae.segredo);
		// System.out.println(mae.facoDentroDeCasa);
//		System.out.println(mae.formaDeFalar);  ==> 
//		System.out.println(mae.todosSabem);	   ==>
		
//		System.out.println(segredo);
//		System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);  // ==> HERANÇA DE ANA
		System.out.println(todosSabem);	   // ==> HERANÇA DE ANA
		System.out.println(new Ana().todosSabem);
	}
}
