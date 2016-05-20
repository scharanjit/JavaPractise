package j2ee1001;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadWrite {
	 FileWriter writer;
	 FileReader reader;
	
	static char[] in = new char[50];
	public static void main(String[] args) throws IOException {
		ReadWrite r = new ReadWrite();
		//r.read();
		r.display();
	}   
	
	public void read() throws IOException 
	{
	File f = new File("Sample10.txt");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		FileWriter fw = new FileWriter(f);

		fw.write("abcdef");
		
		
			fw.flush();    //	this is very important flush & close
		fw.close();
			try {
				reader = new FileReader("Sample10.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				writer=new FileWriter("Sample10.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		int x=0;
		try {
			while((x=reader.read())!=-1)
			{
				
				System.out.println((char)x+" ");
				//System.out.println(x+" ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
		public void display()
		{
			Connection con = null;
			PreparedStatement ps;
			ResultSet rs;
			try {
				con =getConnection();
				
				ps =con.prepareStatement("select * from where emp=?");
				int l = 0;
				ps.setString(l, "al");
				
				rs=ps.executeQuery();
				
				System.out.println(rs.getString(l));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			finally
			{
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}

		private Connection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}

		
}

