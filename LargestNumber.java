class LargestNumber{
	public static void main(String srg[]){
		int array[]={23,65,10,4,9,45};
		int temp=0;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]<array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(array[2]);
	}
}