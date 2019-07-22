package com.oops.java;

import java.io.*;

@SuppressWarnings("serial")
public class Hotel implements Serializable {
    @SuppressWarnings("unused")
	private Room room = new Room();
    
    public static void main(String[] args) {
        Hotel h = new Hotel();
        try {
            FileOutputStream fos = new FileOutputStream("Hotel.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Room {
}