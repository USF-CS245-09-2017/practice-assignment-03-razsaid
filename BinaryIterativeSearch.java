public class BinaryIterativeSearch implements Practice03Search {

	public int search(int [] arr, int target){
		int first = 0;
		int last= arr.length-1;
		int mid=0;

		while (first <=last){
			mid = (first+last)/2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid]>target)
				first = mid+1;
			else 
				last = mid-1;


		}
		return -1;

	}
	public String searchName (){
		return "Binary Iterative Search";
	}
}