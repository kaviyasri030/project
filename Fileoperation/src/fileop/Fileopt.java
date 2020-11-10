package fileop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Fileopt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\Kaviya Sri\\Desktop\\Fileopt");
		boolean mkdir = f.mkdir();
		System.out.println("create a folder: "+mkdir);
		File f2 = new File("C:\\Users\\Kaviya Sri\\Desktop\\Fileopt\\Java\\Report");
		boolean mkdirs = f2.mkdirs();
		System.out.println("create a next folder: "+mkdirs);
		File f3 = new File("C:\\Users\\Kaviya Sri\\Desktop\\Fileopt\\Java\\Report\\file.txt");
		boolean createNewFile=f3.createNewFile();
		System.out.println("create a new file: "+createNewFile);
		File f4 = new File("C:\\Users\\Kaviya Sri\\Desktop\\Fileopt\\Java\\Report\\file.txt");
		FileUtils.write(f4,"welcome to corejava");
		File f5= new File("C:\\Users\\Kaviya Sri\\Desktop\\Fileopt\\Java\\Report\\file2.txt");
		boolean createNewFiles= f5.createNewFile();
		System.out.println("create another file: "+createNewFiles);
		File source = new File("C:\\Users\\Kaviya Sri\\Desktop\\Fileopt\\Java\\Report\\file.txt");
		File destination = new File("C:\\Users\\Kaviya Sri\\Desktop\\Fileopt\\Java\\Report\\file2.txt");
		FileUtils.copyFile(source, destination);
		File z = new File("C:\\\\Users\\\\Kaviya Sri\\\\Desktop\\\\Fileopt\\\\Java\\\\Report");
		File[] listFiles=z.listFiles();
		for(File w : listFiles) {
			System.out.println();
			
		}
	}

}
