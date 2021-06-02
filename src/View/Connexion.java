package View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class Connexion {

	protected Shell shlConnexionLapplication;
	private Text textLogin;
	private Text textPassword;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Connexion window = new Connexion();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlConnexionLapplication.open();
		shlConnexionLapplication.layout();
		while (!shlConnexionLapplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlConnexionLapplication = new Shell();
		shlConnexionLapplication.setSize(450, 240);
		shlConnexionLapplication.setText("Connexion \u00E0 l'application MediaTek86");
		shlConnexionLapplication.setLayout(null);
		
		Label lblLogin = new Label(shlConnexionLapplication, SWT.NONE);
		lblLogin.setBounds(0, 10, 434, 15);
		lblLogin.setAlignment(SWT.CENTER);
		lblLogin.setText("Login");
		
		textLogin = new Text(shlConnexionLapplication, SWT.BORDER);
		textLogin.setBounds(108, 31, 217, 25);
		
		Label lblPassword = new Label(shlConnexionLapplication, SWT.NONE);
		lblPassword.setBounds(0, 71, 434, 15);
		lblPassword.setAlignment(SWT.CENTER);
		lblPassword.setText("Password");
		
		textPassword = new Text(shlConnexionLapplication, SWT.BORDER);
		textPassword.setBounds(108, 92, 217, 25);
		
		Button btnConnexion = new Button(shlConnexionLapplication, SWT.NONE);
		btnConnexion.setBounds(225, 144, 100, 25);
		btnConnexion.setText("Connexion");

	}

}
