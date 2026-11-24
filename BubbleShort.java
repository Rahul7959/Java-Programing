class BubbleShort{
	public static void main(String[] args) {
		int[]arr={20,10,40,30};
		int order;

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					order=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=order;
				}
			}
		}System.out.println("After BubbleShorting");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
}