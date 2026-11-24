class ReverseString{
public static void main(String[] args) {
	String str1="RahulranjaDas";
	String res="";

	for(int i=0; i<str1.length(); i++ ){
		char ch=str1.charAt(i);
		if(res.indexOf(ch)==-1){
			res=res+ch;
		}
	}
	System.out.println("After ReverseString is:"+res);
}
}
	
