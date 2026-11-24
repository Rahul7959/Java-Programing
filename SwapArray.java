class SwapArray{
	public static void main(String[] args) {
		int[]arr={40,30,20,10};
		int n=arr.length;

		for(int i=0; i<n/2; i++){
			int swap=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=swap;
		}
		for(int i=0; i<n; i++){
			System.out.println(arr[i]);
		}
	}
}