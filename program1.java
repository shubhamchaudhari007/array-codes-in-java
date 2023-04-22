import java.io.*;
class demo1{
	public static void main(String[] args)throws IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of array");
		int size=Integer.parseInt(Br.readLine());
		int sum=0;
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(Br. readLine());
			if(arr[i]%2!=0){
				sum=sum+arr[i];
			}
		}
		System.out.println("sum of odd elements is = " + sum);
	}
}

