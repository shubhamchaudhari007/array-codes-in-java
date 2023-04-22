import java.io.*;
class demo5{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter array size");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("enter elements in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
			System.out.println(arr[i]);
		}
	}
	}
}

