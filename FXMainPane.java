


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	public Button one;
	public Button two;
	public Button three;
	public Button four;
	public Button five;
	public Label userInput;
	public TextField text;
	
	//  declare two HBoxes
	public HBox hBox1;
	public HBox hBox2;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataManager1;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		 this.one = new Button("Hello");
		 this.two = new Button("Howdy");
		 this.three = new Button("Chinese");
		 this.four = new Button("Clear");
		this.five = new Button("Exit");
		 this.userInput = new Label("Feedback: ");
		 this.text = new TextField();
		//  instantiate the HBoxes
		 	 this.hBox1 = new HBox();
			 this.hBox2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		this.dataManager1 = new DataManager();
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
			 hBox1.getChildren().addAll(one, two, three, four, five);
			 hBox2.getChildren().addAll(userInput, text);
		//  add the buttons to the other HBox  
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1, hBox2); 
		
		HBox.setMargin(two, new Insets(0,0,0,20));
		HBox.setMargin(three, new Insets(0,0,0,20) );
		HBox.setMargin(four, new Insets(0,0,0,20));
		HBox.setMargin(five, new Insets(0,0,0,20) );
		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		one.setOnAction(new ButtonHandler());
		two.setOnAction(new ButtonHandler());
		three.setOnAction(new ButtonHandler());
		four.setOnAction(new ButtonHandler());
		five.setOnAction(new ButtonHandler());
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {
		
			public void handle(ActionEvent event) {
				
				if (event.getTarget() instanceof Button) {
				 
					if (event.getTarget().equals(one)) {
						 text.setText(dataManager1.getHello());
		
					}else if (event.getTarget().equals(two))
					{
						text.setText(dataManager1.getHowdy());
						
					} else if (event.getTarget().equals(three))
					
					{ 
						text.setText(dataManager1.getChinese());
					}
					else if (event.getTarget().equals(four)) 
					{
						text.setText("");
						
					}else if (event.getTarget().equals(five)) 
					{
						Platform.exit();
						System.exit(0);
					}
			         } 

		
		
	}
}
}
	
