import java.util.Scanner;
import java.util.Random;

public class QFC_Coin_Toss {

    public static void main(String[] args)
    {
      String userinput;
      Scanner scan = new Scanner (System.in);

      Random gen = new Random();
      int npc;

 		int userscore = 0;
   		int npcscore = 0;


  	 	while(userscore < 2 || npcscore < 2)
  	 	{

  	 		System.out.println("Heads or Tails?");
  			userinput = scan.nextLine();
			if (userinput.equals("heads"))
  			{
  	 			npc = gen.nextInt(2);
  	 			if (npc == 0)
  	 			{
  	 				System.out.println("Congrats! It was heads");
  	 				userscore += 1;
  	 			}
  	 			else
  	 			{
  	 				System.out.println("Sorry, it was tails");
  	 				npcscore += 1;
  	 			}
  		 	}
  			else
  			{
     			npc = gen.nextInt(2);
  				if (npc == 0)
  				{
  			 		System.out.println("Sorry, it was heads");
  		 			npcscore += 1;
  				}
  				else
  	 			{
  	 				System.out.println("Congrats! It was tails");
  	 				userscore += 1;
				}
  			}
  	 	}
		if (userscore == 2)
		{
			System.out.println("Congrats! You won " + userscore + " to " + npcscore);
		}
		else
		{
			System.out.println("You lost " + npcscore + " to " + userscore);
		}
   	}
	}

