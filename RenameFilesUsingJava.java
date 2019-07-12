import java.io.File;


public class RenameFilesUsingJava {

	public static void main(String[] args) 
	{
		System.out.println("Files renaming process starting here..");
		for(int i=1;i<=2;i++)
		{
			File oldName = new File("D:\\JavaPrograms\\Naren"+i+".txt"); 
		    File newName = new File("D:\\JavaPrograms\\NarenKarthik"+i+".txt"); 
		    if (oldName.renameTo(newName))  
	            System.out.println("Renamed successfully");         
	        else 
	            System.out.println("Error"); 
		}
		
		File folder = new File("D:\\JavaPrograms\\");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }
		}
	  
	 }

}
