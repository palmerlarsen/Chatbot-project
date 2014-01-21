package chatbot.controller;

import java.util.ArrayList;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotView;
/**
 * public chatbotController owns all methods within its class
 * @author Palmer Larsen
 * version 1. 10/23/13 adding real GUI< reference to Chatbot.
 *
 */
public class ChatbotController
{
	/**
	 * creates instance of the objects for the projects
	 */

	private Chatbot myChatbot;
	private ChatbotFrame appFrame;
	
	/**
	 * public class that creates chatView as a new ChatbotView
	 */
	
	
	public ChatbotController()
	{
		myChatbot = new Chatbot();
	}
	
	public Chatbot getMyChatbot()
	{
		return myChatbot;
	}


	/**
	 * start method for the application
	 */
	public void start()
	{
		appFrame = new ChatbotFrame(this);
	}
	
	private String conversationHelper(ArrayList<String>conversationList)
	{
		String currentConversationHelper = "";
		
		if(conversationList.size()> 0)
		{
			currentConversationHelper = conversationList.remove(0);
		}
		
		return currentConversationHelper;
	}
	
	public String processConversation()
	{
		String currentConversation = "";
		
		currentConversation = conversationHelper(myChatbot.myConversationList());
		
	
		return currentConversation;
	}
	
	public String processConversation(String currentInput)
	{
		
		String memeResponse = "";
		 if(myChatbot.memeChecker(currentInput))
		 {
			 memeResponse = currentInput + "is a cool meme";
		 }
		return currentInput;
		
	}
	
	public String alphabetizeYourName(String first, String middle, String last)
	{
		String nameInOrder = " ";
		if(first.compareTo(middle) <0)
		{
			if(first.compareTo(last) <0)
			{
				if(middle.compareTo(last) <0)
				{
					nameInOrder = first + ", " + middle + ", " + last;
				}
				else
				{
					nameInOrder = first + ", " + last + ", " + middle;
				}
				
			}
			else
			{
				nameInOrder = last + ", " + first + ", " + middle;
			}
		}
		else
		{
			if(middle.compareTo(last) <0)
			{
				if(first.compareTo(last) <0)
				{
					nameInOrder = middle + ", " + first + ", " + last;
				}
				else
				{
					nameInOrder = middle + ", " + last + ", " + first;
				}
			}
			else
			{
				nameInOrder = last + ", " + middle + ", " + first;
			}
		}
		return nameInOrder;
	}

}
