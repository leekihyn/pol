package report.leekihyun.r0011;

import java.util.ArrayList;
import java.util.Scanner;

public class Tt3 {

	 private ArrayList list;

	 Tt3() {
	      list = new ArrayList();

	   }
	 public ArrayList getArrayList(int a, int b){
		 return list;
	 }
	 
	   public static void main(String[] args) {
	      
	      Tt3 ae = new Tt3();
	      ArrayList al =  new ArrayList();
	      for (int i = 0; i < 10; i++) {
	         al.add(i);

	      }
	      System.out.println(al);

	   }

	}