class SuperMarket{

static String superMarketName="LU LU Market";
public static void main(String a[]){
System.out.println("welcome to"+superMarketName);
String vegatables[]={"Lady's finger","Tomato","Heere kai","Cauliflower"};
String perfume[]={"Fogg","AXE","CODE","Denver"};
String fruits[]={"Mango","Banana","Apple","Dragon Fruit","Grapes","Kiwi","Orange","Strawberry","Chikku","PineApple"};
String Biscuites[]={"Good Day","Marie Gold","Dark Fantasy","Parle G","Bounce","BarBoun","Marie Light","Oreo","Happy Happy","Tiger"};
String chocolates[]={"Dairy Milk","KitKat","Munch","Perk","5 Star","Milky Bar","Eclairs","Gems","Temptation","Fuse"};
String groceries[]={"Salt","Sugar","Pepper","Moong Dal","Coffee Powder","Baking Soda","Chilli Powder","Grains","Corn Flour","Maida"};
String meat[]={"Chicken","Pork","Mutton","Fish","Lamb","Crab","Labster","Poultry","Turkey","Duck"};
String shoes[]={"Crocs","Bata","adidas","Walk mate","Sports","Sparks","Nike","WoodLand","ReeBok","Skechers"};
String cosmetics[]={"Fondation","Kajal","Lipstick","Face Cream","Body Lotion","Face Powder","Nail Polish","Nail Polish remover","Conceller","Eye Shadow"};
String electronics[]={"TV","Iron Box","Bulb","Vaccum cleaner","Electric Stove","Washing Machine","Water Purifier","Oven","Refrigeratore","Air Conndition"};
String cloths[]={"Jeans","Shirt","T-shirt","Hoodies","SwearShirt","Kurtha","Lehanga","Sarees","Skirt","Jumpsuit"};
String snacks[]={"Lays","Kurkure","Bingo","Pizza","Burger","French Fries","Shawarma","Pringles","PaniPuri","Momos"};

System.out.println("list of vegatables");
System.out.println(vegatables[0]+" "+"\n"+vegatables[1]+"\n "+vegatables[2]+"\n"+vegatables[3]+"\n");
				   
System.out.println("list of Perfumes");
System.out.println(perfume[0]+" "+"\n"+perfume[1]+"\n "+perfume[2]+"\n"+perfume[3]+"\n");

System.out.println("list of fruits");
System.out.println(fruits[0]+" "+"\n"+fruits[1]+"\n "+fruits[2]+"\n"+fruits[3]+"\n"+fruits[4]+"\n"+fruits[5]+"\n"+fruits[6]+"\n"+fruits[7]+"\n"+fruits[8]+"\n"+fruits[9]+"\n");

System.out.println("list of Biscuites");
System.out.println(Biscuites[0]+" "+"\n"+Biscuites[1]+"\n "+Biscuites[2]+"\n"+Biscuites[3]+"\n"+Biscuites[4]+"\n"+Biscuites[5]+"\n"+Biscuites[6]+"\n"+Biscuites[7]+"\n"+Biscuites[8]+"\n"+Biscuites[9]+"\n");

System.out.println("list of chocolates");
//System.out.println(chocolates[0]+" "+"\n"+chocolates[1]+"\n "+chocolates[2]+"\n"+chocolates[3]+"\n"+chocolates[4]+"\n"+chocolates[5]+"\n"+chocolates[6]+"\n"+chocolates[7]+"\n"+chocolates[8]+"\n"+chocolates[9]+"\n");
for(int b=0;b<chocolates.length;b++){
	System.out.println(b+1+") "+chocolates[b]);
}

System.out.println("list of groceries");
//System.out.println(groceries[0]+" "+"\n"+groceries[1]+"\n "+groceries[2]+"\n"+groceries[3]+"\n"+groceries[4]+"\n"+groceries[5]+"\n"+groceries[6]+"\n"+groceries[7]+"\n"+groceries[8]+"\n"+groceries[9]+"\n");
for(int s=0;s<groceries.length;s++){
	System.out.println(groceries[s]);
}

System.out.println("list of meat");
System.out.println(meat[0]+" "+"\n"+meat[1]+"\n"+meat[2]+"\n"+meat[3]+"\n"+meat[4]+"\n"+meat[5]+"\n"+meat[6]+"\n"+meat[7]+"\n"+meat[8]+"\n"+meat[9]+"\n");

System.out.println("list of shoes");
System.out.println(shoes[0]+" "+"\n"+shoes[1]+"\n"+shoes[2]+"\n"+shoes[3]+"\n"+shoes[4]+"\n"+shoes[5]+"\n"+shoes[6]+"\n"+shoes[7]+"\n"+shoes[8]+"\n"+shoes[9]+"\n");

System.out.println("list of cosmetics");
System.out.println(cosmetics[0]+" "+"\n"+cosmetics[1]+"\n"+cosmetics[2]+"\n"+cosmetics[3]+"\n"+cosmetics[4]+"\n"+cosmetics[5]+"\n"+cosmetics[6]+"\n"+cosmetics[7]+"\n"+cosmetics[8]+"\n"+cosmetics[9]+"\n");

System.out.println("list of electronics");
System.out.println(electronics[0]+" "+"\n"+electronics[1]+"\n"+electronics[2]+"\n"+electronics[3]+"\n"+electronics[4]+"\n"+electronics[5]+"\n"+electronics[6]+"\n"+electronics[7]+"\n"+electronics[8]+"\n"+electronics[9]+"\n");

System.out.println("list of cloths");
System.out.println(cloths[0]+" "+"\n"+cloths[1]+"\n "+cloths[2]+"\n"+cloths[3]+"\n"+cloths[4]+"\n"+cloths[5]+"\n"+cloths[6]+"\n"+cloths[7]+"\n"+cloths[8]+"\n"+cloths[9]+"\n");

System.out.println("list of snacks");
System.out.println(snacks[0]+" "+"\n"+snacks[1]+"\n "+snacks[2]+"\n"+snacks[3]+"\n"+snacks[4]+"\n"+snacks[5]+"\n"+snacks[6]+"\n"+snacks[7]+"\n"+snacks[8]+"\n"+snacks[9]+"\n");


}
}