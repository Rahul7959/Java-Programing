class PalindromNumber{
	public static void main(String[] args) {
		int num=2002;
		int num2=num;
		int rev=0;


		while(num2>0){
			int digit=num2%10;
			rev=rev*10+digit;
			num2=num2/10;

		}
		if(num==rev){
			System.out.println(num+" is a PalindromNumber");
		}else{
			System.out.println(num+ " is a not a PalindromNumber");
		}
	}
}