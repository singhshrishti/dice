package Dice;

import java.util.Random;

public class Roll
{
	int face;
  	int t;
  	
  	public Roll(int face){
    	this.face=face;
    }
  	
  	public int toss(){
    	if(face==2){
    	Random r =new Random();
      	t=r.nextInt(2)+1;
    } 
      if(face==4){
    	Random r =new Random();
      	t=r.nextInt(4)+1;
    } 
      if(face==6){
    	Random r =new Random();
      	t=r.nextInt(6)+1;
    }
    if(face>6||face<=1||face==3||face==5)
      {
      t=0;
      }
      return t;
  }
}