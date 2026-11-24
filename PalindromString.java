class PalindromString{
	public static void main(String[] args) {
		String str1="Java";
		String rev="";

		for(int i=str1.length()-1; i>=0; i--){
			rev=rev+str1.charAt(i);
		}
		if(str1.equals(rev)){
			System.out.println(str1+": is a PalindromString");
		}else{
			System.out.println(str1+": is not a PalindromString");
		}
	}
}