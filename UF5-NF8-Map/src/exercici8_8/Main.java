package exercici8_8;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Cotxe alfa = new Cotxe("Alfa Romeo", "Giulia", 6, 2900);
		Cotxe seat1 = new Cotxe("Seat", "Ibiza", 4, 1600);
		Cotxe ford1 = new Cotxe("Ford", "Focus", 4, 2000);
		Cotxe ford2 = new Cotxe("Ford", "Mondeo", 4, 2200);
		Cotxe seat2 = new Cotxe("Seat", "Leon", 4, 1600);
		Cotxe hyundai1 = new Cotxe("Hyundai", "Atos", 3, 1500);
		Cotxe hyundai2 = new Cotxe("Hyundai", "Santa Fe", 6, 3000);
		Cotxe hyundai3 = new Cotxe("Hyundai", "Accent", 4, 2000);

		String[] key = { "1234AAA", "2321BBB", "8232FFF", "3311FFF", "9381LLL", "B9011XC", "9234BHG", "9216CKK" };
		Cotxe[] value = { alfa, seat1, ford1, ford2, seat2, hyundai1, hyundai2, hyundai3 };

		// Declarando el treemap
		Map<String, Cotxe> mapList = new TreeMap<String, Cotxe>();

		// Agregandole al treeMap
		for (int i = 0; i < key.length; i++) {
			mapList.put(key[i], value[i]);
		}

		System.out.println("******Comprobando que lo haya agregado\n" + mapList.size());
		System.out.println("\n Agregando un objecto duplicado");
		mapList.put("1234AAA", alfa);
		System.out.println("******Comprobando que lo haya agregado\n" + mapList.size());

		imprimir(mapList);

	}

	private static void imprimir(Map<String, Cotxe> mapList) {

		for (Map.Entry entry : mapList.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}

}
