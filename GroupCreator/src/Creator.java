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
					}
			
				//Randomizes Groups
				System.out.println("Would you like to randomize your groups?");
				Scanner userAnswer = new Scanner(System.in);
				String answer = userAnswer.nextLine();
				
				if(answer.equals("No"))
					{
						for(int i = 0; i < groups; i++)
							{
								
							}
					}
			}

	}
