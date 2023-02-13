package s0104n1ejercicio3;

import java.util.ArrayList;

public class S0104N1Ejercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		
		//Se crea un metodo que sume dos numeros subsecuentes y los añada a otro array
		
		sumaSubsecuentes(array);
		
	}
	
	public static ArrayList<Integer> sumaSubsecuentes(ArrayList<Integer> array) {
		
		ArrayList<Integer> sumaSubs = new ArrayList<Integer>();
		
		for(int i=0;i<array.size();i++) {
			
			sumaSubs.add(array.get(i)+ array.get(i+1));
			
		}
		
		System.out.println(sumaSubs);
		
		return sumaSubs;
	}
	
	

}