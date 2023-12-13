package a1_SingledimensionalArray;

public class A5_ObjectArrayTest {

	public static void main(String[] args){
		
		//object - char, boolean,String, int
		
		Object [] a=new Object[5];
		
		a[0]=10;
		a[1]="vcentry";
		a[2]=true;
		a[3]='x';
		a[4]=1.2;
		
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
}
}
