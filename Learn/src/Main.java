import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int N =  sc.nextInt();
		int arr[] = new int[N];
		int arr1[] = new int[N];
		
		for(int i=0; i<N;i++){
			arr[i] = 0;
		}
		for(int i=0; i<N;i++){
			arr1[i] = sc.nextInt();
		}
		int count =0;
		for(int i=0; i<=N; i++){
			int k=1;
			while(i!=k) {
				arr[i] = arr[i]+1;
				
			}
			k+=1;
			count++;
		}
		System.out.println(count);

	}
}

