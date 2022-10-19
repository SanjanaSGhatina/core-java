class Speaker{
 static String brand;
 static String color;
 static double price;
 static boolean isConnected;
 
 public static boolean onOff(){
	 System.out.println("inside onOrOff");
	 if(isConnected == true){
		 System.out.println("Speaker is on...");
		 isConnected = false;
	 }
	else if(isConnected == false){
		 System.out.println("Speaker is off...");
		 isConnected = true;
		// return isConnected;
	 }
	 
	 
	 System.out.println("End of onOrOff");
	 return isConnected;
 }

}