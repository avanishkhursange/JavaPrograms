
import java.io.*;
import java.util.Arrays;


class String_Sort {


	public static void main(String[] args) throws Exception
	{
		
		String str = "Hello world in Java";
		char arr[] = str.toCharArray();
		char temp;

		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
				
				
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}

	
		System.out.println(arr);
	}
}
