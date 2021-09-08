class Reverse{
	public static void main(String[] args){
	int num=153;
	while(num>0){
	p = num%10;
	t = (t*10)+p;
	num = num/10;
	}
	System.out.println("reverse of "+num +" = "+t);
}
	
}
