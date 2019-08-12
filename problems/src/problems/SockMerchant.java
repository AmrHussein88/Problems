package problems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class SockMerchant {

	  // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        List<Integer> list = new ArrayList<Integer>();  
        
        for(int i = 0; i<n; i++){
        	if(!list.contains(ar[i])) {
        		list.add(new Integer(ar[i]));
        	}
        	else {
        		result++;
        		list.remove(Integer.valueOf(ar[i]));
        		
        		
        	}
        	
        }
        
return result;


    }


    public static void main(String[] args) throws IOException {
       int [] ar = {10,9,8,3,9,8,11,7,10,11,3};
       int result = sockMerchant(10, ar);
        System.out.print(result);

       
    }
}
