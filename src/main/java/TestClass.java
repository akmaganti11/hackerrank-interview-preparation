import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.util.Assert;

public class TestClass {
	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Input:");
//		PrintWriter wr = new PrintWriter(System.out);
//		String[] ss = br.readLine().trim().split(" ");
//		System.out.println(ss);
//		int n = Integer.parseInt(ss[0]);
//		int q = Integer.parseInt(ss[1]);
//		System.out.println(n);
//		System.out.println(q);
//		System.out.println("Str: ");
//		String s = br.readLine().trim();
//
//		System.out.println(s);
//		for (int i_A = 0; i_A < q; i_A++) {
//			String[] sss = br.readLine().trim().split(" ");
//			int l = Integer.parseInt(sss[0]);
//			int r = Integer.parseInt(sss[1]);
//			wr.println(solve(s, n, l, r));
//		}
//
//		wr.close();
//		br.close();
		
//		int n = (int) Math.pow(10, 4);
		System.out.println(solve("abcaab", 6, 2, 5));
		
		//-----------------------
		
//	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        PrintWriter wr = new PrintWriter(System.out);
//	        int n = Integer.parseInt(br.readLine().trim());
//	        String[] arr_arr = br.readLine().trim().split(" ");
//	        int[] arr = new int[n];
//	        for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
//	            arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
//	        }
//
//	        long out_ = solve(arr);
//	        wr.println(out_);
//
//	        wr.close();
//	        br.close();

//		Assert.isTrue(true);
//	    System.out.println(solve());
	}

	
	static int solve() {
		int[] a = {10, 4, 4, 4, 4, 7};
		int largest = Arrays.stream(a).max().getAsInt(); 
		boolean flag = false;
        System.out.println(largest);
        
        int power = 0;
        for(int i =0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] != largest && a[j] != largest) {
					if(a[i]+a[j] > largest) {
						flag = true;
					}
				}
			}
		}
        
        if(flag) {
    		return Arrays.stream(a).sum() -largest;
    	} else {
    		power = Arrays.stream(a).sum();
    	}
        
        
		return power;
		
    }


	


	
	static int solve(String s, int n, int l, int r) {
		// Write your code here
		int count = 0;
		if (l >= 1 && l <= r && r <= n) {
			String subedString = s.substring(l-1, r);
			int subStringLength = subedString.length();
			for (int i = 0; i < subStringLength; i++) {
				for (int j = 1; j <= subStringLength - i; j++) {
					String subs = subedString.substring(i, i + j);
					if (subs.charAt(0) == subs.charAt(subs.length() - 1)) {
						count++;
					}
				}
			}
			return count;
		} else {
			throw new IllegalArgumentException("Invalid Inputs");
		}
	}
}