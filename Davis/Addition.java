public class Addition {
	
	public int first,second,result;
	
	public void setNums(){
		first = 0;
		second = 0;
	}
	
	public void setNums(int x, int y){
		first = x;
		System.out.println("assigned first - " + first);
		second = y;
		System.out.println("assigned second - " + second);
	}
	
	public int add(){
		System.out.println("add called successfully");
		result = first + second;
		return result;
	}
	
	public String toString(){
		return "The result is: "+this.add();
	}
	
}