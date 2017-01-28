import java.util.ArrayList;
import java.util.List;

public class Decompose {

	public String decompose(long n) {
		List<Long> decomposeArray = Decomposer(n, n * n);
		
		// no valid solution exists
		if(decomposeArray == null) return "";
		
	    // remove the last element
		decomposeArray.remove(decomposeArray.size() - 1);
		List<String> result = new ArrayList<>();
		
		for(Long ele : decomposeArray){
			result.add(String.valueOf(ele.longValue()));
		}
		
		return String.join(" ", result);
	}
	
	/**
	 * Recursion to get the list of decompose
	 * @param n
	 * @param remain
	 * @return
	 */
	public List<Long> Decomposer(long n, long remain){
		// basic case
		if(remain == 0){
			List<Long> r = new ArrayList<Long>();
			r.add(n);
			return r;
		}
		
		// iterate all element less than n
		for(long i = n - 1 ; i > 0; i--){
			if((remain - i * i) >= 0){
				List<Long> r = Decomposer(i, (remain - i * i));
				
				// only get the answer
				if(r != null){
					r.add(n);
					return r;
				}
			}
		}
		
		// no answer
		return null;
	}
}