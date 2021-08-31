class Reverse{
	public static void main(String[] args){
	int num=153, n=0;
	n = num;
	while(n>0){
	p = n%10;
	t = (t*10)+p;
	n = n/10;
	}
	System.out.println("reverse of "+num +" = "+t);
}