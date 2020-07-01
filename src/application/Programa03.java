package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Programa03 {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good afternoon", "Good night" };

		String path = "C:\\temp\\out.txt";
		// put (path,true) for not recreate archive
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
