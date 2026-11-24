import java.util.HashSet;
class RemoveDupliCate{
	
	public static void main(String[] args) {
		int[]arr={10,20,10,20,30};
		HashSet<Integer> set=new HashSet<Integer>();

		for(int num:arr){
			set.add(num);
		}System.out.println("After removeing duplicate");
		for(int x:set){
			System.out.println(x);
		}
	}
}