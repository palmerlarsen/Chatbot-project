package chatbot.model;

import java.util.ArrayList;
import chatbot.model.Chatbot;
/**
 * explination of the class: public class Chatbot, visible to everyone holds code for chatbot.
 * @author Palmer Larsen
 *version 1.4 10/15/13
 */
public class Chatbot
{

	/**
	 * An Arraylist of String that holds the memes for the program.
	 */
	private ArrayList<String> myManuel;
	private ArrayList<String> myMemes;
	private ArrayList<String> myConversationList;
	public ArrayList<String> fillMyStory;
	private ArrayList<String> randomList;
	
	/**
	 * calls multiple private methods in a public method for other classes to see. creates variables myMemes and myManuel.
	 * New variables created: myMemes and myManuel
	 */	
	public Chatbot()
	{
		myMemes = new ArrayList<String>();
		myManuel = new ArrayList<String>();
		myConversationList = new ArrayList<String>();
		fillMyStory = new ArrayList<String>();
		randomList = new ArrayList<String>();
		
		fillManuel();
		fillTheMemeList();
		fillMyConversation();
		fillRandom();
		fillMyStory();
	}
	
	private void fillMyStory()
	{
		
		
	}

	public void fillMyConversation()
	{
		myConversationList.add("Hey let's talk!");
		myConversationList.add("My name is Palmer");
		myConversationList.add("What is your favorite color?");
		myConversationList.add("What do you know anyway?");
		myConversationList.add("Do you like halloween?");
		
	}
	
	
	

	/**
	 * This method adds memes to the class to be used by other methods
	 * creates memes that are used for the chatbot
	 */
	
	private void fillManuel()
	{
		
		myManuel.add("Pony");
		myManuel.add("Magikarp");
		myManuel.add("Rainbows");
		myManuel.add("Hello Kitty");
		myManuel.add("Meatbell");
		
	}
	
	private void fillTheMemeList()
	{
		myMemes.add("nicolas cage");
		myMemes.add("arrow to the knee");
		myMemes.add("one does not simply");
		myMemes.add("y u no");
}
		
	private void fillRandom()
	{
		randomList.add("I like cheese");
		randomList.add("i hate essays");
		randomList.add("i like cereal");
		randomList.add("this is random");
		randomList.add("i like typing");
		randomList.add("do you like coding?");
	}	
	/**
	 * checks the current input for manuelchecker and if there is a response that matches a meme it returns true.
	 * @param manuelInput current input by the user in the chatbot
	 * @return returns hasmanuel as true and selects a response.
	 */
	public boolean manuelChecker(String manuelInput)
	{
		boolean hasManuel = false;
		
		
				
			if (manuelInput !=null)
				{
					for (String manuelPhrase : myManuel)
					{
						if(manuelPhrase.equalsIgnoreCase(manuelInput))
						{
							hasManuel = true;
						}
					}
				}
				return hasManuel;
	}
	/**
	 * adds memes to myMemes to be used in the chatbot
	 * adds multiple memes to myMemes.
	 */

	
	/**
	 * checks current input from the user to see if it is a memeber in the memelist. it returns true if it is a memeber of the list.
	 * @param currentInput The Current phrase typed by the user.
	 * @return It returns whether or not the input is a meme from the memelist.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		// loop over all he items in the list, if the input matches a meme, change hasMeme to true.
		
		if(currentInput !=null)
		{
			
			for (String currentPhrase : myMemes)
			{
				if(currentPhrase.equalsIgnoreCase(currentInput))
				{
					hasMeme = true;
				}
			}
		}	
		return hasMeme;
	}

	public ArrayList<String> myConversationList()
	{
		
	return myConversationList;
	
	}

	public String getRandomTopic()
	{
		String random = "";
		 double myRandom = Math.random();
		 int MyRandomListPosition = (int) (myRandom * randomList.size());
		 
		 random = randomList.get(MyRandomListPosition);
		 
		
		return random;
		
		
	}
}
