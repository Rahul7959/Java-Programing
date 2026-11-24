class SecondMaxiumElement{
	public static void main(String[] args) {
		int[]arr={10,20,30,40};
		int max=Integer.MIN_VALUE;
		int seondmax=Integer.MIN_VALUE;

		for(int num:arr){
			if(num>max){
				seondmax=max;
				max=num;
			}else if(num>seondmax && num!=max){
				seondmax=num;
			}
		}
		System.out.println("SecondMaxiumElement is:"+seondmax);
	}
}