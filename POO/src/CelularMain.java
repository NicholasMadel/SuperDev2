import java.util.Scanner;

public class CelularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celular celular1 = new Celular();
		Celular celular2= new Celular();
		
		Scanner scan = new Scanner (System.in);
		
		celular1.marca = "Apple";
		celular1.bateria = "5000mAh";
		celular1.camera = "48Mp";
		celular1.memoria = "256GB";
		celular1.modelo = "iPhone 15";
		celular1.tamanho = "6.7";
		
		
		
		
		System.out.println(celular1.marca);
		System.out.println(celular1.bateria);
		System.out.println(celular1.camera);
		System.out.println(celular1.memoria);
		System.out.println(celular1.modelo);
		System.out.println(celular1.tamanho);
		
				
	}

}
