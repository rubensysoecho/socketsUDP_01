package ej01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ClienteUDP {

	final static int PUERTO = 12345;
	
	public static void main(String[] args) throws IOException {
		
		MulticastSocket ms = new MulticastSocket(PUERTO);
		InetAddress grupo = InetAddress.getByName("225.0.0.1");
		
		ms.joinGroup(grupo);
		
		String msg = "";
		byte[] buffer = new byte[1000];
		
		while(true)	{
			DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
			ms.receive(paquete);
		}
		
		ms.leaveGroup(grupo);
		ms.close();
		System.out.println("Socket cerrado...");
	}
	
}
