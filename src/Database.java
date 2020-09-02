import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Database<T> implements Iterable<T> {
	private HashMap<String, DataEntry> data;
	
	public Database(Integer size) {
		data = new HashMap<>(size);
	}
	
	public boolean create(String PRODUCT_ID, DataEntry entry) {
		if(data.containsKey(entry.getProductId())) {
			return false;
		}
		data.put(entry.getProductId(), entry);
		return true;
	}
	
	public File update(String outputPath) throws FileNotFoundException {
		File outputFile = new File(outputPath);
		PrintWriter writer = new PrintWriter(outputFile);
		for(T dataEntry: this) {
			writer.println(dataEntry);
		}
		return outputFile;
	}
	
	public boolean remove(DataEntry entry) {
		if(data.containsKey(entry.getProductId())) {
			return false;
		}
		data.remove(entry.getProductId());
		return true;
	}
	
	public DataEntry read(String id) {
		return data.get(id);
	}
	
	@Override public String toString() {
		return data.toString();
	}
	
	@Override public Iterator<T> iterator() {
		return new Iterator<T>() {
			Map.Entry<String, DataEntry> current;
			final Iterator<Map.Entry<String, DataEntry>> iterator = data.entrySet().iterator();
			
			@Override public boolean hasNext() {
				return iterator != null;
			}
			
			@Override public T next() {
				Map.Entry<String, DataEntry> temp = iterator.next();
				current = iterator.next();
				return (T)temp;
			}
		};
	}
} 
