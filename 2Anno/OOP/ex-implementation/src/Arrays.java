
public class Arrays {
/** The mission of this class is to provide a number of
* standalone procedures that can be useful for manipulating
* arrays of ints.
**/
/** search x in a **/
	public static int search (int [] a, int x){
		boolean found = false;
		int i=0;
		while(i<a.length && !found){
			if(a[i]==x){
				found = true;
			}
			i++;
		}
		return found ? i : -1;		
	}
/** search x in a, when a is sorted increasingly 
 *  REQUIRE a to be an array of integers sorted increasingly
 *  @param x is the integer to find
 **/
	public static int searchSorted(int [] a, int x){
		int p = 0;
		int q = a.length-1;
		while(p<=q){
			int r = p + (q-p)/2;
			if(a[r] > x){
				p = r+1;
			}else if(a[r] < x){
				q = r -1;
			}else{
				return r;
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		int[] arr1 = {1,5,9,4,8};
		int[] arr2 = {1,2,3,5,9,32,33,85,100};
		System.out.println(search(arr1,2));
		System.out.println(search(arr2,85));

	}

}
