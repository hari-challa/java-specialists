package com.javaspecialists.one.to.ten;

import java.util.Vector;

public class AnonymousInnerClasses {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				try {
					while (true) {
						sleep(1000);
						System.out.print(".");
					}
				} catch (InterruptedException ex) {
				}
			}
		}.start();

		UnitersityRegistration<String> universityRegistration = new UnitersityRegistration<>();

		String[] temp_names = new String[3];
		temp_names[0] = "hari";
		temp_names[1] = "krishna";
		temp_names[2] = "challa";
		universityRegistration.addNames(temp_names);

		String[] temp_names_cust = { "Heinz", "John", "Anton" };
		universityRegistration.addNames(temp_names_cust);

		universityRegistration.addNames(new String[] { "Heinz", "John", "Anton" });

		universityRegistration.addNames(new Vector<String>(3) {
			{
				add("Heinz");
				add("John");
				add("Anton");
			}
		});

		Vector myVectory = new Vector(3) {	// defining anonymous inner class
			{
				add("Heinz");
				add("John");
				add("Anton");
			}
		};

	}

	static class UnitersityRegistration<E> {
		private String[] names;

		public void addNames(String[] inputNames) {

		}

		public void addNames(Vector<E> vctList) {

		}
	}

	public class MyVectory extends Vector {
		{
			add("Heinz");
			add("John");
			add("Anton");
		}

		public MyVectory() {
			super(3);
		}
	}

}
