class SeparateStringNumber{
	public static void main(String[] args) {
		String s1="Rahul007";

		String alphabets="";
		String number="";

		for(int i=0; i<s1.length(); i++){
			char ch=s1.charAt(i);

			if(Character.isLetter(ch)){
				alphabets=alphabets+ch;
			}else if(Character.isDigit(ch)){
				number=number+ch;
			}
		}
		System.out.println("Alphabets:"+alphabets);
		System.out.println("Number:"+number);
	}
}