package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotController;
import chatbot.model.Chatbot;
/**
 * 
 * @author plar4927
 *
 */
public class ChatbotPanel extends JPanel
{
	
/**
 * initiate the variables within the panel.
 */
private ChatbotController baseController;
private JButton submitButton;
private JTextField userInputField;
private JTextArea chatArea;
private Chatbot appBot;
private int clickCount;
private JScrollPane textPane;
private SpringLayout myLayout;
/**
 * 
 * @param first
 * @param middle
 * @param last
 * @return
 */

/**
 * 	establish the new variables and calls methods
 * @param baseController
 */
	public ChatbotPanel(ChatbotController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getMyChatbot();
		submitButton = new JButton("Submit this to the Chatbot");
		userInputField = new JTextField(30);
		chatArea = new JTextArea(10,30);
		textPane = new JScrollPane(chatArea);
		//chatArea.setBounds(139, 30, 244, 184);
		clickCount = 0;
		myLayout = new SpringLayout();
	
		
		setupListeners();
		setupPanel();
		setupLayout();
		
		startChat();
	
		
	}
/**
 * 	starts chatArea goes to app bot and fills my story.
 */
	private void startChat()
	{
		chatArea.setText(appBot.getRandomTopic());
	}
	/**
	 * creates listeners for all user interactive objects in the panel
	 */
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
		
			// do this when the submit chatbutton is clicked
			public void actionPerformed(ActionEvent click)
			{
				clickCount++;
				
				String currentInput = userInputField.getText();
				chatArea.append("\n" + currentInput);
				
				if(clickCount %2 == 0)
				{
					chatArea.append("\n" + appBot.getRandomTopic());
				}
				
				
				if(!((clickCount % 2) == 0))
				{
				    String currentConversation = baseController.processConversation();
				    if(currentConversation.length() != 0)
				    {
				    	chatArea.append("\n" + currentConversation);
				    	clickCount--;
				    }
				}
			}
		});
	}
	/**
	 * loads all components into the panel and sets the layout manager and color
	 */
	private void setupPanel()
	{
		setLayout(myLayout);
		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);
		this.setBackground(Color.BLUE);
		chatArea.setWrapStyleWord(true);
		chatArea.setLineWrap(true);
		
	}
	/**
	 * loads all the setup for the design of the panel
	 */
	private void setupLayout()
	{
		myLayout.putConstraint(SpringLayout.SOUTH, userInputField, -84, SpringLayout.SOUTH, this);
		myLayout.putConstraint(SpringLayout.NORTH, textPane, 30, SpringLayout.NORTH, this);
		myLayout.putConstraint(SpringLayout.WEST, textPane, 133, SpringLayout.WEST, this);
		myLayout.putConstraint(SpringLayout.NORTH, submitButton, 30, SpringLayout.SOUTH, userInputField);
		myLayout.putConstraint(SpringLayout.WEST, userInputField, 133, SpringLayout.WEST, this);
		myLayout.putConstraint(SpringLayout.WEST, submitButton, 177, SpringLayout.WEST, this);
	}

}
