class AmstrongNumber{
	public static void main(String[] args) {
		int num1=2026;
		int num2=num1;
		int sum=0;

		while(num2>0){
			int digit=num2%10;
			sum=sum+(digit*digit*digit);
			num2=num2/10;
		}
		if(num1==sum){
			System.out.println(num1+"  is a AmstrongNumber");
		}else{
			System.out.println(num1+" is not a AmstrongNumber");
		}
	}
}