import java.io.*;
public class DateiEditieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "data.dat";
		try {
			FileInputStream fis 	= new FileInputStream(filename);
			InputStreamReader isr 	= new InputStreamReader(fis);
			BufferedReader bur 		= new BufferedReader(isr);
			
			String sLine = bur.readLine();
			
			int zaehler = 0;
			while(sLine!=null) {
				System.out.println("Zeile "+zaehler+": "+sLine);
				sLine = bur.readLine();
				zaehler++;
			}
			bur.close();
		} catch (IOException eIO) {
			System.out.println("Fehler: "+eIO);
		}
	}

}
