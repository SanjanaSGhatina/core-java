class CollegeTester{
	public static void main(String a[]){
		College cg = new College();
		cg.name = "JNNCE";
		cg.branch = "MCA";
		cg.Noofdept = 5;
		cg.address = "Shivamogga";
		System.out.println("College Name = "+cg.name + "\n Branch Name = " + cg.branch + "\n No of Department = "+ cg.Noofdept + "\n Address = "+ cg.address);
		cg.clg();
	}
}