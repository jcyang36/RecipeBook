import java.util.Scanner;
import java.util.ArrayList;
public class RecipeBook{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
                ArrayList<String> ingredients= new ArrayList<String>();
		String ingredient = "";
		String repeatSwitch="";	
		while (!repeatSwitch.equalsIgnoreCase("quit")){
			System.out.println("Enter a new ingredient:  ");
			ingredient =keyboard.nextLine();
                        ingredients.add(ingredient);
                        System.out.println("Enter any key to continue or 'quit' to exit: ");
                        repeatSwitch=keyboard.nextLine();

		}
                    System.out.println("Enter the instructions for  the recipe: ");
                 String instructions = keyboard.nextLine();
                 System.out.println("Ingredients: ") ;
for (String item:ingredients){System.out.println(item);}
System.out.println("Instructions: " +instructions);




	}



}
