class ThirdLargestNumber{
	public static void main(String[] args){
	int a[] = {1,2,20, 30, 21, 40,7,10};
	int t;
        int len = a.length;
	for(int i = 0;i<len;i++){
		for(int j = i+1;j<len;j++){
		if(a[i]>a[j]){
		t = a[i];
		a[i]=a[j];
		a[j]=t;
		}
		}
	}
	System.out.println("3rd largest number in array is "+a[len-3]);
}
}

