package com.java.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeBook {
	
	public static void main(String[] args){
		Book myBook = new Book(10, "Sai Ram");
		
		try {
			FileOutputStream file = new FileOutputStream("D:\\Book.ser");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			oos.writeObject(myBook);
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
