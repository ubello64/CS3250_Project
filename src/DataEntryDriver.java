import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class DataEntryDriver {
	//  the backup plan if we can't get the database going
	private static final String FILE_NAME = "inventory_team4.csv";
	public static final HashMap<Integer, DataEntry> DATABASE = new HashMap<>(20000);
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(FILE_NAME));
		scanner.nextLine();
		int i = 0;
		while(scanner.hasNextLine()) {
			String[] temp = scanner.nextLine().split(",");
			String PRODUCT_ID = temp[0];
			Integer QUANTITY = Integer.parseInt(temp[1]);
			double WHOLESALE_COST = Double.parseDouble(temp[2]);
			float SALE_PRICE = Float.parseFloat(temp[3]);
			String SUPPLIER_ID = temp[4];
			DATABASE.put(i++, new DataEntry(
			 PRODUCT_ID,
			 QUANTITY,
			 WHOLESALE_COST,
			 SALE_PRICE,
			 SUPPLIER_ID
			));
 			System.out.println(DATABASE.get(i - 1).toString());
			if(scanner.hasNextLine()) {
				scanner.nextLine();
			}
		}
		System.out.println(DATABASE.get(0).equals(DATABASE.get(1)));
	}
}

