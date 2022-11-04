package com.keepe.keepe;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.keepe.keepe.models.Admin;
import com.keepe.keepe.models.Cliente;
import com.keepe.keepe.models.Usuario;

@SpringBootApplication
public class KeepeApplication {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setCorreo("Florencio@terra.cl");
		System.out.println(usuario);

		Cliente cliente1 = new Cliente(1300, "arielmufasa@terra.cl", "beliteodio", 333 , 19342555-1, true, 1000.11 , "yyy66");
		System.out.println(cliente1);

		Cliente cliente2 = new Cliente(1301, "arielWESKER@terra.cl", "belinoteodio", 444 , 19342555-2, false, 1000.22 , "izzz55");
		System.out.println(cliente2);

		Cliente cliente3 = new Cliente(1302, "arielbastardoc@terra.cl", "camelcase", 666 , 19342555-3, false, 1000.33 , "xxxx66");
		System.out.println(cliente3);

		Admin admin1 = new Admin(1303, "arielsinpelo@terra.cl", "nomeacuerdo", 777, 111111-1);
		System.out.println(admin1);

		Admin admin2 = new Admin(1303, "arielconpeloazul@terra.cl", "adawong", 888, 222222-1);
		System.out.println(admin2);

		Cliente clientevacio = new Cliente(0, null, null, 0, 0, null, null, null);

		admin2.modificarCorreo();
		


	}

}
