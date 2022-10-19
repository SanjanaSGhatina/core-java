class PaintTest{
	public static void main(String arg[]){
		Paint.setPaintId(2345);
		Paint.setBrandName("ABCD");
		Paint.setColor("Yellow");
		System.out.println(Paint.getPaintId());
		System.out.println(Paint.getBrandName());
		System.out.println(Paint.getColor());
	}
}