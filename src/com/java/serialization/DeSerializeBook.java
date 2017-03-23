package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeBook {
	public static void main(String[] args) {
		Book book;
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Book.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			book = (Book) ois.readObject();
			ois.close();
			System.out.println(book);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
