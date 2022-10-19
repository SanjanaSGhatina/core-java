class Swiggy {

    // Pizza , Burger , Sandwitch , mosaranna , frechFries , SouthIndian , Pastries
   public static double takeOrder(String item){
   
    if(item == "Pizza"){
	System.out.println("Thank you for Ording "+ item);
	return 99.00  ;
	}
	if(item == "Burger")
	{
	System.out.println("Thank you for Ording "+ item);
	return 60.00 ; 
	}
    if(item  == "SouthIndian")
	{
	System.out.println("Thank you for Ording "+ item);
	return 135 ; 
	}
	if(item  == "mosaranna")
	{
	System.out.println("Thank you for Ording "+ item);
	return 25 ; 
	}
	if(item == "Sandwitch"){
	System.out.println("Thank you for Ording "+ item);
	return 45 ; 
	}
	if(item == "Pastries"){
	System.out.println("Thank you for Ording "+ item);
	return 50 ; 
	
	// other statements
	//return ; 
	// other statements  -- not possible
	}
      
	return 0.0 ; 
   }

   
    public static double takeOrder(String item,int quantity){
   
    if(item == "Pizza"){
	System.out.println("Thank you for Ording "+ item);
	return 99.00 * quantity ;
	}
	if(item == "Burger")
	{
	System.out.println("Thank you for Ording "+ item);
	return 60.00 * quantity; 
	}
    if(item  == "SouthIndian")
	{
	System.out.println("Thank you for Ording "+ item);
	return 135 * quantity; 
	}
	if(item  == "mosaranna")
	{
	System.out.println("Thank you for Ording "+ item);
	return 25 * quantity; 
	}
	if(item == "Sandwitch"){
	System.out.println("Thank you for Ording "+ item);
	return 45 * quantity; 
	}
	if(item == "Pastries"){
	System.out.println("Thank you for Ording "+ item);
	return 50 * quantity; 
	
	// other statements
	//return ; 
	// other statements  -- not possible
	}
      
	return 0.0 ; 
   }
   
   
   
}