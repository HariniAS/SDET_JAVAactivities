package JavaActivity4_UtilityClasses;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity4_2_FileIO {

	public static void main(String[] args) throws IOException {
		 File file = new File ("C:\\Users\\XMT5NJV\\Pictures\\sample.txt");
		 file.createNewFile();

		 //get the file Object
         File fileUtil = FileUtils.getFile("C:\\Users\\XMT5NJV\\Pictures\\sample.txt");
         //Read file
         System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

         //Create directory
         File destDir = new File("resources");
         //Copy file to directory
         FileUtils.copyFileToDirectory(file, destDir);

         //Get file from new directory
         File newFile = FileUtils.getFile(destDir, "sample.txt");
         //Read data from file
         String newFileData = FileUtils.readFileToString(newFile, "UTF8");
         //Print it
         System.out.println("Data in new file: " + newFileData);

	}

}
