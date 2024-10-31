//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            ArrayList<Integer> result = ob.subarraySum(nums, d);
            // Print all elements in the result list
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a new line after the result
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0, currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            // Shrink the window from the left if currSum exceeds the target
            while (currSum > target && start < i) {
                currSum -= arr[start];
                start++;
            }

            // Check if we found the target sum
            if (currSum == target) {
                result.add(start + 1);  // 1-based index for the start
                result.add(i + 1);      // 1-based index for the end
                return result;
            }
        }

        // If no subarray is found
        result.add(-1);
        return result;
    }
}
