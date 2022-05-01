package com.revature.fsd.pixott.app;


	import java.util.Scanner;

	import com.revature.fsd.pixott.handler.MainMenuHandler;

	public class app {
		public static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) {
			MainMenuHandler.dis();
			scanner.close();
		}
	}


