class PrimeNumber{
	public static void main(String[] args) {
		int num=7;

		boolean prime=false;

		if(num<=1){
			prime=true;
		}else{
			for(int i=2; i<=num/2; i++){
				if(num%i==0){
					prime=true;

				}
			}
		}
		if(prime){
			System.out.println(num+": is a PrimeNumber");
		}else{
			System.out.println(num+": is not a PrimeNumber");
		}
	}
}