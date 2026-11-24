class BinarySearch{
	public static void main(String[] args) {
		int[]arr={10,20,30,40};
		int key=50;
		boolean result=false;

		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				System.out.println("Element found by index:"+i);
				result=true;
			}
		}
		if(!result){
			System.out.println("Element not found");
		}
	}
}