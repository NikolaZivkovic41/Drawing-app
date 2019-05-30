package mvc;

import java.awt.GridBagLayout;

import javax.swing.JFrame;


public class Application {
	//private static final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		GridBagLayout gridBagLayout = (GridBagLayout) frame.getContentPane().getLayout();
		gridBagLayout.rowHeights = new int[]{0, 338, 154};
		Model model = new Model();
		
		Controller controller = new Controller(model,frame);
		
		frame.setController(controller);
		frame.setSize(926,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		model.addObserver(frame);
		frame.getView().setModel(model);
		frame.setVisible(true);
		

	}
}
