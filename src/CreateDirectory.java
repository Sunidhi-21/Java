import java.io.File;
import java.io.IOException;

public class CreateDirectory {

	public static void main(String[] args) {
		
		File file = new File("E:\\FileHandling\\CreateDir\\IOFile");
		
		file.mkdir();
		
		if(file.mkdirs()==true) {
			System.out.println("All directories created using mkdirs");
		}else {
			System.out.println("directories already exist!");
		}
		
		System.out.println("Can read permission:"+file.canRead());
		System.out.println("Can write permission :"+file.canWrite());
		System.out.println("Can execute permission :"+file.canExecute());
		
		file.setReadable(false);
		file.setReadable(true, false);
		
		System.out.println("Is it a dir: "+file.isDirectory());
		System.out.println("Absolute: "+file.getAbsolutePath());
	
		File myFile = new File("TesterFile.txt");
		
		try {
			if(myFile.createNewFile()) {
				System.out.println("Created file using createNewFile()");
			}else {
				System.out.println("File already exists");
			}
		} catch(IOException e) {
			System.out.println("The parents are not present");	
		}
		System.out.println("Is it a file:"+myFile.isFile());
//		myFile.delete();
//		file.delete();
	
	}
}