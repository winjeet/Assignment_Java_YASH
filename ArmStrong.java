class ArmStrong{
	public static void main(String[] args){
	int num=153, n=0;
	n = num;
	while(n>0){
	p = n%10;
	t = (p*p*p)+t;
	n = n/10;
	}
	if(num==t){
	System.out.println("armstrong number");
	}else{
	system.out.println("Not a armstrongnumber");
}
}
}
