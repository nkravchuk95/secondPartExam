package fileName;

public class FileName {

	public static void main(String[] args) {
		
		String fname = "c:\\WebServers\\home\\testsite\\www\\myfile.txt";
		
		String strPath = fname.substring(fname.lastIndexOf("\\")+1, fname.length());
		int pos = strPath.lastIndexOf(".");
		if (pos > 0) {
			strPath = strPath.substring(0, pos);
		}
		System.out.println(strPath);

	}

}
