class Cricket {
public static void main(String cricket[]){
  int rohitHightestScore  = 264;
  int sachinHighestScore  = 200;
  int mandanaHighestScore = 135;
  int ackerrHighestScore  = 232;
  int bjClarkHighestScore = 229;
  
  int highestScores[] = {rohitHightestScore,sachinHighestScore,mandanaHighestScore,ackerrHighestScore,bjClarkHighestScore};
  
  int ref = highestScores[0];
  int ref1 = highestScores[1];  
  int ref2 = highestScores[2]; 
  int ref3 = highestScores[3]; 
  int ref4 = highestScores[4];
  System.out.println("Element at index 0 is = " +ref);
  System.out.println("Element at index 1 is = " +ref1);
  System.out.println("Element at index 2 is = " +ref2);
  System.out.println("Element at index 3 is = " +ref3);
  System.out.println("Element at index 4 is = " +ref4);
  System.out.println("\n");
  
  for(int s=0;s<highestScores.length;s++){
	  System.out.println("Element at index "+(s+1)+" is "+s);
  }
}

}
