package a1_twoDimensionalArray;

public class A1_TwoDimensionTest {
	
	public static void main(String[] args){
		
		//int [][] a= new int[row][column];
		
		int [][] a= new int[3][4];
		
		//first row
		
		a[0][0]=100;
		a[0][1]=300;
		a[0][2]=400;
		a[0][3]=500;
		//second row
		
		a[1][0]=600;
		a[1][1]=700;
		a[1][2]=800;
		a[1][3]=900;
		
		//third row
		
		a[2][0]=1000;
		a[2][1]=3000;
		a[2][2]=4000;
		a[2][3]=5000;
		
		System.out.println("Total row -"+a.length);
		System.out.println("Total row -"+a[0].length);//a[0] represents 0 row
		
		//System.out.println(a[1][3]);//length-row
		 
		for (int row=0;row<a.length;row++){
			for(int col=0;col<a[row].length;col++){
				System.out.print(a[row][col]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
