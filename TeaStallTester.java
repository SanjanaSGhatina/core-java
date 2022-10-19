class TeaStallTester{
	public static void main(String arg[]){
		
		
		
		//TeaStall.teaStallId = 789;
		//TeaStall.name = "Beereshwara chai Angdi"
		//TeaStall.address = "Malleshwaram";
		//TeaStall.contactNo = 678634268L;
		
		
		TeaStall.setTeaStallId(987);
		TeaStall.setContactNo(34567896544L);
		TeaStall.setName("Beereshwara chai Angdi");
		TeaStall.setAddress("Malleshwaram");
		System.out.println(TeaStall.getTeaStallId());
		System.out.println(TeaStall.getContactNo());
		System.out.println(TeaStall.getName());
		System.out.println(TeaStall.getAddress());
	}
}