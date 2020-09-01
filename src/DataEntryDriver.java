import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataEntryDriver {
	//  the backup plan if we can't get the database going
	private static final String FILE_NAME = "Project3250/inventory_team4.csv";
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<DataEntry> database = new ArrayList<>(20000);
		Scanner scanner = new Scanner(new File(FILE_NAME));
		scanner.nextLine();
		while(scanner.hasNextLine()) {
			String[] temp = scanner.nextLine().split(",");
			String PRODUCT_ID = temp[0];
			Integer QUANTITY = Integer.parseInt(temp[1]);
			double WHOLESALE_COST = Double.parseDouble(temp[2]);
			float SALE_PRICE = Float.parseFloat(temp[3]);
			String SUPPLIER_ID = temp[4];
			database.add(new DataEntry(
			 PRODUCT_ID,
			 QUANTITY,
			 WHOLESALE_COST,
			 SALE_PRICE,
			 SUPPLIER_ID
			));
			if(scanner.hasNextLine()){ scanner.nextLine();}
		}
		System.out.println(database.get(0).equals(database.get(1)));
	}
}

