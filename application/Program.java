package application;

import java.util.Scanner;

import veiculos.Carro;
import veiculos.Moto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Seu veiculo seria Carro ou Moto?: ");

		String automovel = sc.next();

		if (automovel.equals("carro")) {

			Carro carro = new Carro(null, null, false, 0, 0);

			System.out.println("Qual o modelo do carro?: ");

			carro.setModelo(sc.next());

			System.out.println("Qual a marca do carro?: ");

			carro.setMarca(sc.next());

			System.out.println("Quantas vezes voce quer acelerar?: ");

			int acelerar = sc.nextInt();

			for (int i = 1; i <= acelerar; i++) {

				carro.acelerar();

			}

			System.out.println("Você quer brecar?: ");

			String brecar = sc.next();

			if (brecar.equals("sim")) {

				carro.brecar();

			}

			System.out.println("Quantas portas tem seu carro?: ");

			carro.setQtdPortas(sc.nextInt());

			System.out.println("Carro esta ligado(true) ou desligado(false)?: ");

			boolean ligadoDesligado = sc.hasNextBoolean();

			if (ligadoDesligado = true) {

				carro.ligar();

			} else if (ligadoDesligado = false) {

				carro.desligar();

			}

			carro.imprime();

		} else if (automovel.equals("moto")) {

			Moto moto = new Moto(null, null, false, 0);

			System.out.println("Qual o modelo da moto?: ");

			moto.setModelo(sc.next());

			System.out.println("Qual a marca da moto?: ");

			moto.setMarca(sc.next());

			System.out.println("Quantas vezes voce quer acelerar?: ");

			int acelerar = sc.nextInt();

			for (int i = 1; i <= acelerar; i++) {

				moto.acelerar();

			}

			System.out.println("voce quer brecar?: ");

			String brecar = sc.next();

			if (brecar.equals("sim")) {

				moto.brecar();

			}

			System.out.println("Você quer buzinar?: ");

			String buzina = sc.next();

			if (buzina.equals("sim")) {

				moto.buzinar();

			}

			System.out.println("Carro esta ligado(true) ou desligado(false)?: ");

			boolean ligadoDesligado = sc.hasNextBoolean();

			if (ligadoDesligado = true) {
				moto.ligar();
				
			} else if (ligadoDesligado = false) {
				moto.desligar();
				
			}
			moto.imprime();

		}

		sc.close();

	}

}
