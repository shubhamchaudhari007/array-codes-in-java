import java.io.*;
class demo4{
        public static void main(String[] args)throws IOException{
                BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter size of array");
                int size=Integer.parseInt(Br.readLine());
                //char vowels='a';
                int arr[]=new int[size];
                System.out.println("enter array elements");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Br.read();
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println(arr[i]);
			}
                }
               
        }
}
