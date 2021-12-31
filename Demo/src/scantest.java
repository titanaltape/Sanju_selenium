import java.util.Scanner;

public class scantest {
	public static void main(String[] args) {
		Scanner demo = new Scanner(System.in);
		System.out.println("studentId:");
		int a = demo.nextInt();
		System.out.println("studentId:"+a);
		
		System.out.println("studentName");
		String b = demo.nextLine();
		System.out.println("studentName"+b);
		
		System.out.println("Mark 1");
		int M1 = demo.nextInt();
		System.out.println("Mark 1"+M1);
		
		System.out.println("Mark 2");
		int M2 = demo.nextInt();
		System.out.println("Mark 2"+M2);
		
		System.out.println("Mark 3");
		int M3 = demo.nextInt();
		System.out.println("Mark 3"+M3);
		
		System.out.println("enter how many numbers to cal  avg");
		int n=demo.nextInt();
		int avg = M1+M2+M3/n;
		System.out.println("print avg"+avg);
	}

}
