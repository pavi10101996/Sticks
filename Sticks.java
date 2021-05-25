import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Sticks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// code 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count=0;
		    int res=1;
		    Arrays.sort(arr);
		    for(int i=n-1;i>0;i--){
		       if(arr[i]==arr[i-1]) {
		            count++;
		            res=res*arr[i];
		            i--;
		       }
		       if(count==2){
		           System.out.println(res);
		           break;
		       }
		    }
		    if(count!=2){
		        System.out.println("-1");
		    }
		}
	}
}