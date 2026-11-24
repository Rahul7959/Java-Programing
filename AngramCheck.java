import java.util.Arrays;
class AngramCheck{
	public static void main(String[] args) {
		String s1="listen";
		String s2="Silent";

		s1=s1.replace("","").toLowerCase();
		s2=s2.replace("","").toLowerCase();

		char[]ch=s1.toCharArray();
		char[]ch1=s2.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);

		if(Arrays.equals(ch,ch1)){
			System.out.println("String is Angram");
		}else{
			System.out.println("String is not Angram");
		}

	}
}