package a1_twoDimensionalArray;

public class A2_TwoDimensionalArray {
	
public static void main(String[] args){
		
		//int [][] a= new int[row][column];
		
		String [][] a= new String[2][3];
		
		//first row
		
				a[0][0]="Vcentry1";
				a[0][1]="Vcentry2";
				a[0][2]="Vcentry3";
		
				//second row
				
				a[1][0]="Vcentry4";
				a[1][1]="Vcentry5";
				a[1][2]="Vcentry6";
			String input ="Vcentry3";
			
			for (int row=0;row<a.length;row++){
				for(int col=0;col<a[row].length;col++){
					
					String data = a[row][col];
					
					//if (data.equals(input)){
						//System.out.println("Yes value exists");
						
				//	}else{	
						//System.out.println("No value not exists");
						
						
						while(data.equals(input)){
							System.out.println("Yes value exists");
							break;
				
					}
					}
				}
					
}				

}
