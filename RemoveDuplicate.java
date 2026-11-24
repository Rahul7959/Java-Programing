class RemoveDuplicate{
	public static void main(String[] args) {
		String str1="JavaProgramming";
		String res="";

		for(int i=str1.length()-1; i>=0; i--){
			res=res+str1.charAt(i);
		}
		System.out.println("After removingduplicate from string:"+res);
	}
}