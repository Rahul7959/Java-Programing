class PalinDromArray{
	public static void main(String[] args) {
		char[]ch={'r','h','u','l'};
		boolean res=true;

		for(int i=0; i<ch.length; i++){
			if(ch[i] !=ch[ch.length-1-i]){
				res=false;
			}
		}
		System.out.println(res?"array is a palindrom":"Not palindrom");
	}
}