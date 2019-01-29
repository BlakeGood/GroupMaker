import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Creator
	{

		public static void main(String[] args) throws IOException
			{
				// Creates an Array List from class roster
				Scanner nameList = new Scanner(new File("Names.txt"));
				ArrayList<String>students = new ArrayList<String>();
				
				
				while (nameList.hasNext())
					{
						students.add(nameList.nextLine());
					}
				
				// Greets User
				System.out.println("Hello! Welcome to the group creator. How many groups would you like to have?");
				Scanner userInput = new Scanner(System.in);
				int groups = userInput.nextInt();
				int size = students.size();
				
				//Splits up groups
				int groupSize = 0;
				int lastGroupSize = 0;
				int temp = 0;
				if(students.size() % groups == 0)
					{
						groupSize = students.size() / groups;
						System.out.println("You should have " + groups + " groups of " + groupSize + ".");
					}
				
				else if(students.size() % groups != 0)
					{
						groupSize = size/groups;
						temp = size % groups;
						lastGroupSize = groupSize + 1;
						System.out.println("You should have " + (groups - temp) + " groups of " + groupSize + " and " + temp + " groups of " + lastGroupSize);
						System.out.println();
					}
				int counter = 0;
				boolean runAgain = true;
				while (runAgain)
					{
				//Randomizes Groups
				System.out.println("Here are your groups:");
				System.out.println();
				int getter = 0;
//				int getterAdd = 1;
//				if(counter == 1)
//					{
//						getterAdd = 4;
//					}
//				if(counter == 2)
//					{
//						getterAdd = 5;
//					}
				for(int i = 1; i < groups; i++)
					{
						if(i <= (groups - temp) )
							{
								System.out.println("Group #" + i + ":");
								for(int j = 0; j < groupSize; j++)
									{
										System.out.println(students.get(getter));
										getter = getter + 1;
									}
								System.out.println();
					
							}
						
						if(i >= (groups - temp))
							{
								System.out.println("Group #" + (i + 1) + ":");
								for(int k = 0; k < lastGroupSize; k++)
									{
										System.out.println(students.get(getter));
										getter = getter + 1;
									}
								System.out.println();
							}
						
					}
				System.out.println("Would you like to randomize again?");
				Scanner userAgain = new Scanner (System.in);
				String again = userAgain.nextLine();
				if(again.equals("Yes"))
					{
						runAgain = true;
						counter++;
					}
				if(again.equals("No"))
					{
						runAgain = false;
						System.out.println("Thank you for using the group project randomizer!");
					}
					}
			
	}						
}