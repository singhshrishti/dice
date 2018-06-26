package Dice;



// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    
    int a=-1;   
    Roll d = new Roll(a);
    if (a==2)
    {
      if(d.toss()==1)
      {
        System.out.println("Heads");
      }
      else
      {
        System.out.println("Tails");
      }
    }
      if(a>6||a<=1||a==3||a==5)
      {
        System.out.println("Please Enter The Number Between 2,4,6");
      }
      if(a==4||a==6)
      {
      System.out.println(d.toss());
      }
    
  }
}

