import java.util.Scanner;

public class TestingClass {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("viratkohli");
		str.append("INDRCB");
		
		System.out.println(str);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the key value to search: ");
		int key=scan.nextInt();
		int[] a= {10,30,40,50,60,70,80,90,110,150};
		int low=0,high=a.length;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(key==a[mid]) {
				System.out.println("key found at "+mid+" index");
				break;
			}
			else if(key<a[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		if(low>high) {
			System.out.println("key not found");
		}
		
	}

}
