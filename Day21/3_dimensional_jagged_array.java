package jaggedarray;

import java.util.Scanner;

public class three_dimension_jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[][][]a=new int[2][][];
		a[0]=new int[2][];
	    a[1]=new int [3][];
	    a[0][0]=new int[2];
	    a[0][1]=new int[3];
	    a[1][0]=new int[1];
	    a[1][1]=new int[3];
	    a[1][2]=new int[4];
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a[i].length;j++) {
	    		
	    		for(int k=0;k<a[i][j].length;k++) {
	    			System.out.println("Enter the "+(i+1)+"th block,"+(j+1)+"th row and "+(k+1)+"th column");
	    	 a[i][j][k]=sc.nextInt();
	    }
	}
	    }
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a[i].length;j++) {
	    		for(int k=0;k<a[i][j].length;k++) {
	    	 System.out.print(a[i][j][k]+" ");
	    }
	    	System.out.println();
	}
	    	
	    	System.out.println();
	}
}

	}


