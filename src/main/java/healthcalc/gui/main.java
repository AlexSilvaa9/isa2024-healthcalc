package healthcalc.gui;

import java.awt.EventQueue;

import healthcalc.*;

public class main {

	public static void main(String[] args) throws Exception {
		// EventQueue.invokeLater(new Runnable() {
		// 	public void run() {
		// 		try {
		// 			HealthCalcImpl modelo = HealthCalcImpl.getInstance();
		// 			// HealthHospital modelo = new adapter();
		// 			vista vista = new vista();
		// 			controlador controlador = new controlador(modelo, vista);
		// 			vista.registrarControlador(controlador);
		// 		} catch (Exception e) {
		// 			e.printStackTrace();
		// 		}
		// 	}
		// });

	
		//probar proxy y adapter

		// HealthHospital modelo = new adapter();
		// System.out.println(modelo.pesoIdeal((float) 1.8, 'm'));
		// System.out.println(modelo.pesoIdeal((float) 1.4, 'm'));
		// System.out.println(modelo.pesoIdeal((float) 1.1, 'm'));
		// HealthStats estadisticas=HealthStatsImp.getInstance();
		// System.out.println(estadisticas.alturaMedia());

		//probar decorador
		HealthHospital modelo = new adapter();
		HealthHospital modeloAmericano = new DecoradorAmericano(modelo);
		HealthHospital modeloEuropeo = new DecoradorEuropeo(modelo);
		
		System.out.println(modelo.pesoIdeal((float) 1.8, 'm'));
		System.out.println(modeloAmericano.pesoIdeal((float) 1.8, 'm'));
		System.out.println(modeloEuropeo.pesoIdeal((float) 1.8, 'm'));

	}
}