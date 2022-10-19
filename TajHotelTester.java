class TajHotelTester{
	public static void main(String s[]){
		TajHotel taj = new TajHotel();
		taj.hotel();
		taj.name = "TajHotel";
		taj.Noofmanager = 15;
		taj.branchId = 984415;
		taj.address = "RajajiNagar";
		System.out.println("Hotel Name = "+taj.name + "\n No of Manager = " + taj.Noofmanager + "\n Hotel BranchId = "+ taj.branchId + "\n Address = "+ taj.address);
		taj.tq();
	}
}