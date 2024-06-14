import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ConsequtiveSum
{
   
        public static List<List<Integer>> findConsecutiveSums(int N) {
            List<List<Integer>> result = new ArrayList<>();
            HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
            int prefixSum = 0;
    
            // Initialize the prefix sum map with the base case
            prefixSumMap.put(0, 0);
    
            for (int i = 1; i <= N; i++) {
                prefixSum += i;
    
                // Check if there's a prefix sum that matches current prefixSum - N
                if (prefixSumMap.containsKey(prefixSum - N)) {
                    int start = prefixSumMap.get(prefixSum - N) + 1;
                    List<Integer> consecutiveNumbers = new ArrayList<>();
                    for (int j = start; j <= i; j++) {
                        consecutiveNumbers.add(j);
                    }
                    result.add(consecutiveNumbers);
                }
    
                // Add current prefix sum to the map
                prefixSumMap.put(prefixSum, i);
            }

            // Also consider the single number N itself as a valid subarray
            //result.add(List.of(N));
            
            return result;
        }
            
        
    
    
    public static void main(String[] args) 
    {
        System.out.println(findConsecutiveSums(5));
     
    }
}