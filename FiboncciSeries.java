import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;
public class FiboncciSeries {
	

	    public static int lenLongestFibSubseq(int[] arr) {
	        Set<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }

	        int maxLen = 0;
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int x = arr[i];
	                int y = arr[j];
	                int length = 2;

	                while (set.contains(x + y)) {
	                    int z = x + y;
	                    x = y;
	                    y = z;
	                    length++;
	                }

	                maxLen = Math.max(maxLen, length);
	            }
	        }

	        return maxLen >= 3 ? maxLen : 0;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of elements in the array:");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int result = lenLongestFibSubseq(arr);
	        System.out.println("The length of the longest Fibonacci-like subsequence is: " + result);
	    
	}


	 

