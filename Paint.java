class Paint{
	static int paintId;
	static String brandName;
	static String color;
	
	static void setPaintId(int id)
	{
		paintId = id;
	}
	static void setBrandName(String bname)
	{
		brandName = bname;
	}
	static void setColor(String col)
	{
		color = col;
	}
	static int getPaintId()
	{
		return paintId;
	}
	static String getBrandName()
	{
		return brandName;
	}
	static String getColor()
	{
		return color;
	}
}