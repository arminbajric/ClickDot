import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClikTheDot extends Applet implements ActionListener, ItemListener, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Checkbox C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20, C21, C22,
			C23, C24, C25, C26, C27, C28, C29, C30;
	public int s;
	CheckboxGroup matrica;
	public int nasumicni = (int) (Math.random() * 30);
	TextField box, timer;
	Thread t = new Thread();

	public void init() {
		GridLayout gL = new GridLayout(5, 6);
		s = 30;
		setLayout(gL);
		C1 = new Checkbox("", true);
		C2 = new Checkbox("", true);
		C3 = new Checkbox("", true);
		C4 = new Checkbox("", true);
		C5 = new Checkbox("", true);
		C6 = new Checkbox("", true);
		C7 = new Checkbox("", true);
		C8 = new Checkbox("", true);
		C9 = new Checkbox("", true);
		C10 = new Checkbox("", true);
		C11 = new Checkbox("", true);
		C12 = new Checkbox("", true);
		C13 = new Checkbox("", true);
		C14 = new Checkbox("", true);
		C15 = new Checkbox("", true);
		C16 = new Checkbox("", true);
		C17 = new Checkbox("", true);
		C18 = new Checkbox("", true);
		C19 = new Checkbox("", true);
		C20 = new Checkbox("", true);
		C21 = new Checkbox("", true);
		C22 = new Checkbox("", true);
		C23 = new Checkbox("", true);
		C24 = new Checkbox("", true);
		C25 = new Checkbox("", true);
		C26 = new Checkbox("", true);
		C27 = new Checkbox("", true);
		C28 = new Checkbox("", true);
		C29 = new Checkbox("", true);
		C30 = new Checkbox("", true);
		add(C1);
		add(C2);
		add(C3);
		add(C4);
		add(C5);
		add(C6);
		add(C7);
		add(C8);
		add(C9);
		add(C10);
		add(C11);
		add(C12);
		add(C13);
		add(C14);
		add(C15);
		add(C16);
		add(C17);
		add(C18);
		add(C19);
		add(C20);
		add(C21);
		add(C22);
		add(C23);
		add(C24);
		add(C25);
		add(C26);
		add(C27);
		add(C28);
		add(C29);
		add(C30);

		C1.addItemListener(this);
		C2.addItemListener(this);
		C3.addItemListener(this);
		C4.addItemListener(this);
		C5.addItemListener(this);
		C6.addItemListener(this);
		C7.addItemListener(this);
		C8.addItemListener(this);
		C9.addItemListener(this);
		C10.addItemListener(this);
		C11.addItemListener(this);
		C12.addItemListener(this);
		C13.addItemListener(this);
		C14.addItemListener(this);
		C15.addItemListener(this);
		C16.addItemListener(this);
		C17.addItemListener(this);
		C18.addItemListener(this);
		C19.addItemListener(this);
		C20.addItemListener(this);
		C21.addItemListener(this);
		C22.addItemListener(this);
		C23.addItemListener(this);
		C24.addItemListener(this);
		C25.addItemListener(this);
		C26.addItemListener(this);
		C27.addItemListener(this);
		C28.addItemListener(this);
		C29.addItemListener(this);
		C30.addItemListener(this);

		C1.setEnabled(false);
		C2.setEnabled(false);
		C3.setEnabled(false);
		C4.setEnabled(false);
		C5.setEnabled(false);
		C6.setEnabled(false);
		C7.setEnabled(false);
		C8.setEnabled(false);
		C9.setEnabled(false);
		C10.setEnabled(false);
		C11.setEnabled(false);
		C12.setEnabled(false);
		C13.setEnabled(false);
		C14.setEnabled(false);
		C15.setEnabled(false);
		C16.setEnabled(false);
		C17.setEnabled(false);
		C18.setEnabled(false);
		C19.setEnabled(false);
		C20.setEnabled(false);
		C21.setEnabled(false);
		C22.setEnabled(false);
		C23.setEnabled(false);
		C24.setEnabled(false);
		C25.setEnabled(false);
		C26.setEnabled(false);
		C27.setEnabled(false);
		C28.setEnabled(false);
		C29.setEnabled(false);
		C30.setEnabled(false);

		timer = new TextField("", 8);
		box = new TextField("", 8);
		Label skor = new Label("Skor");
		Label tajmer = new Label("Tajmer");
		Button start = new Button("Start");
		add(skor);
		add(box);
		add(tajmer);
		add(timer);
		add(start);
		start.addActionListener(this);
		switch (nasumicni) {
		case 0:
			C1.setState(false);
			C1.setEnabled(true);
			break;
		case 1:
			C2.setState(false);
			C2.setEnabled(true);
			break;
		case 2:
			C3.setState(false);
			C3.setEnabled(true);
			break;
		case 3:
			C4.setState(false);
			C4.setEnabled(true);
			break;
		case 4:
			C5.setState(false);
			C5.setEnabled(true);
			break;
		case 5:
			C6.setState(false);
			C6.setEnabled(true);
			break;
		case 6:
			C7.setState(false);
			C7.setEnabled(true);
			break;
		case 7:
			C8.setState(false);
			C8.setEnabled(true);
			break;
		case 8:
			C9.setState(false);
			C9.setEnabled(true);
			break;
		case 9:
			C10.setState(false);
			C10.setEnabled(true);
			break;
		case 10:
			C11.setState(false);
			C11.setEnabled(true);
			break;
		case 11:
			C12.setState(false);
			C12.setEnabled(true);
			break;
		case 12:
			C13.setState(false);
			C13.setEnabled(true);
			break;
		case 13:
			C14.setState(false);
			C14.setEnabled(true);
			break;
		case 14:
			C15.setState(false);
			C15.setEnabled(true);
			break;
		case 15:
			C16.setState(false);
			C16.setEnabled(true);
			break;
		case 16:
			C17.setState(false);
			C17.setEnabled(true);
			break;
		case 17:
			C18.setState(false);
			C18.setEnabled(true);
			break;
		case 18:
			C19.setState(false);
			C19.setEnabled(true);
			break;
		case 19:
			C20.setState(false);
			C20.setEnabled(true);
			break;
		case 20:
			C21.setState(false);
			C21.setEnabled(true);
			break;
		case 21:
			C22.setState(false);
			C22.setEnabled(true);
			break;
		case 22:
			C23.setState(false);
			C23.setEnabled(true);
			break;
		case 23:
			C24.setState(false);
			C24.setEnabled(true);
			break;
		case 24:
			C25.setState(false);
			C25.setEnabled(true);
			break;
		case 25:
			C26.setState(false);
			C26.setEnabled(true);
			break;
		case 26:
			C27.setState(false);
			C27.setEnabled(true);
			break;
		case 27:
			C28.setState(false);
			C28.setEnabled(true);
			break;
		case 28:
			C29.setState(false);
			C29.setEnabled(true);
			break;
		case 29:
			C30.setState(false);
			C30.setEnabled(true);
			break;

		}

	}

	public void start() {
		t = new Thread(this, "ClickTheDot");
		s = 30;
		t.start();
	}

	public void run() {
		while (Thread.currentThread() == t) {

			try {
				paint1();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

	public void paint1() throws InterruptedException {
		if (s == 0) {
			timer.setText(String.valueOf(s) + " s");
			JFrame frame = null;
			JOptionPane.showMessageDialog(frame, "Vas skor je " + stanje);
			s = 30;
			Thread.sleep(1000000);
		} else {
			timer.setText(String.valueOf(s) + " s");
			s--;
		}

	}

	int stanje;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t = new Thread(this, "ClickTheDot");
		s = 30;
		stanje = 0;
		box.setText(String.valueOf(stanje));
		t.start();
	}

	@Override
	public void itemStateChanged(ItemEvent s) {
		// TODO Auto-generated method stub
		stanje++;
		box.setText(String.valueOf(stanje));

		nasumicni = (int) (Math.random() * 30);
		switch (nasumicni) {
		case 0:
			C1.setState(false);
			C1.setEnabled(true);
			break;
		case 1:
			C2.setState(false);
			C2.setEnabled(true);
			break;
		case 2:
			C3.setState(false);
			C3.setEnabled(true);
			break;
		case 3:
			C4.setState(false);
			C4.setEnabled(true);
			break;
		case 4:
			C5.setState(false);
			C5.setEnabled(true);
			break;
		case 5:
			C6.setState(false);
			C6.setEnabled(true);
			break;
		case 6:
			C7.setState(false);
			C7.setEnabled(true);
			break;
		case 7:
			C8.setState(false);
			C8.setEnabled(true);
			break;
		case 8:
			C9.setState(false);
			C9.setEnabled(true);
			break;
		case 9:
			C10.setState(false);
			C10.setEnabled(true);
			break;
		case 10:
			C11.setState(false);
			C11.setEnabled(true);
			break;
		case 11:
			C12.setState(false);
			C12.setEnabled(true);
			break;
		case 12:
			C13.setState(false);
			C13.setEnabled(true);
			break;
		case 13:
			C14.setState(false);
			C14.setEnabled(true);
			break;
		case 14:
			C15.setState(false);
			C15.setEnabled(true);
			break;
		case 15:
			C16.setState(false);
			C16.setEnabled(true);
			break;
		case 16:
			C17.setState(false);
			C17.setEnabled(true);
			break;
		case 17:
			C18.setState(false);
			C18.setEnabled(true);
			break;
		case 18:
			C19.setState(false);
			C19.setEnabled(true);
			break;
		case 19:
			C20.setState(false);
			C20.setEnabled(true);
			break;
		case 20:
			C21.setState(false);
			C21.setEnabled(true);
			break;
		case 21:
			C22.setState(false);
			C22.setEnabled(true);
			break;
		case 22:
			C23.setState(false);
			C23.setEnabled(true);
			break;
		case 23:
			C24.setState(false);
			C24.setEnabled(true);
			break;
		case 24:
			C25.setState(false);
			C25.setEnabled(true);
			break;
		case 25:
			C26.setState(false);
			C26.setEnabled(true);
			break;
		case 26:
			C27.setState(false);
			C27.setEnabled(true);
			break;
		case 27:
			C28.setState(false);
			C28.setEnabled(true);
			break;
		case 28:
			C29.setState(false);
			C29.setEnabled(true);
			break;
		case 29:
			C30.setState(false);
			C30.setEnabled(true);
			break;

		}

	}

}
