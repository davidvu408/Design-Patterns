package Adapter;

import java.util.Random;

public class Adaptee {

	private String serverAddress = "127.0.0.1";

	public void connectToApacheServer() {
		System.out.println("Connected to" + serverAddress);
	}

	public boolean connectionEstabished() {
		int n = new Random().nextInt(2);
		if (n == 0) { return false; } 
		else { return true; }
	}

	public String getServerAddress() {
		return serverAddress;
	}

	public void setServerAddress(String newAddress) {
		serverAddress = newAddress;
	}
}
