package ej01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServidorUDP {

	final static int PUERTO = 1234;
	
	public static void main(String[] args) throws IOException {
		
		InetAddress grupo = InetAddress.getByName("225.0.0.1");
		
		MulticastSocket ms = new MulticastSocket();
		
		while(true)	{
			DatagramPacket paquete = new DatagramPacket(null, PUERTO)
		}
	}
}
