public class BinaryRecursiveSearch implements Practice03Search {

	public int search(int [] arr, int target){
		return search(arr, target, 0, arr.length-1);

	}

	public int search (int [] arr, int target, int first, int last){
		int mid = (first+last)/2;

		if (last<first)
			return -1;
		if (arr[mid] == target)
			return mid;
		else if (arr[mid]>target)
			return search(arr, target, mid+1, arr.length-1);
		else
			return search(arr, target, 0, mid-1);




	}

	public String searchName (){
		return "Binary Recursive Search";
	}
}