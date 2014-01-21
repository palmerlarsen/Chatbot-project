package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
/**
 * ChatbotView gets multiple inputs from other classes and brings it all into one
 * @author Palmer Larsen 
 * version 1.2 10/15/13
 */
public class ChatbotView
{
	/**
	 * creates new chatbot: myChatbot
	 */
	private Chatbot myChatbot;
	
	/**
	 * creates instance of myChatbot. creates a new chatbot
	 */
	public ChatbotView()
	{
		myChatbot = new Chatbot();
	}
	
	/**
	 * Show app was an ongoing loop that continued until the user typed in 'no'
	 * the variable is in use is the user's input
	 * the return is the the loop continuing on
	 */
	public void showApp()
	{
		String answer = "";
		
		while(answer == null || !answer.equals("no"))
		{
			answer = getInput();
			useInput(answer);
		}
		
	}
		
	/**
	 * This method gets input from the user to see if they want to talk
	 * creates a string variable 
	 * @return returns the users input into the message dialog
	 */
	private String getInput()
	{
		String userInput = "";
		userInput = JOptionPane.showInputDialog("Do you want to talk?");
		
		
		return userInput;
	}
	
	/**
	 * 
	 * @param currentInput
	 */
	private void useInput(String currentInput)
	{
		JOptionPane.showMessageDialog(null, "Seriously?");
		
	}	
		
	
	
}
