package serializar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 10, 2);
		Aluno a2 = new Aluno("luc", 8, 1);
		
		FileOutputStream f;
		try {
			f = new FileOutputStream(new File("myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(a1);
			o.writeObject(a2);
			
			o.close();
			f.close();
			
			FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Aluno pr1 = (Aluno) oi.readObject();			
			Aluno pr2 = (Aluno) oi.readObject();			
			
			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
