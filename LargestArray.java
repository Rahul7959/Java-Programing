class LargestArray{
	public static void main(String[] args) {
		int[]arr={10,20,30,40};
		int larg=arr[0];

		for(int i=0; i<arr.length; i++){
			if(arr[i]>larg){
				larg=arr[i];
			}
		}
		System.out.println("LargestArray is:"+larg);
	}
}