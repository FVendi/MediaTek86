package View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

public class CreerPersonnel {

	protected Shell shlMediatekCrer;
	private Text textNom;
	private Text textPrenom;
	private Text textTel;
	private Text textMail;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CreerPersonnel window = new CreerPersonnel();
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
		shlMediatekCrer.open();
		shlMediatekCrer.layout();
		while (!shlMediatekCrer.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMediatekCrer = new Shell();
		shlMediatekCrer.setSize(450, 385);
		shlMediatekCrer.setText("MediaTek86 - Cr\u00E9er Personnel");
		
		Label lblService = new Label(shlMediatekCrer, SWT.NONE);
		lblService.setText("Service");
		lblService.setAlignment(SWT.CENTER);
		lblService.setBounds(0, 10, 434, 15);
		
		Label lblNom = new Label(shlMediatekCrer, SWT.NONE);
		lblNom.setText("Nom");
		lblNom.setAlignment(SWT.CENTER);
		lblNom.setBounds(0, 70, 434, 15);
		
		Button btnValider = new Button(shlMediatekCrer, SWT.NONE);
		btnValider.setText("Valider");
		btnValider.setBounds(324, 311, 100, 25);
		
		Label lblPrenom = new Label(shlMediatekCrer, SWT.NONE);
		lblPrenom.setText("Prenom");
		lblPrenom.setAlignment(SWT.CENTER);
		lblPrenom.setBounds(0, 130, 434, 15);
		
		Button btnAnnuler = new Button(shlMediatekCrer, SWT.NONE);
		btnAnnuler.setText("Annuler");
		btnAnnuler.setBounds(218, 311, 100, 25);
		
		Combo comboService = new Combo(shlMediatekCrer, SWT.NONE);
		comboService.setBounds(108, 31, 217, 23);
		comboService.setText("S\u00E9lectionner service");
		
		textNom = new Text(shlMediatekCrer, SWT.BORDER);
		textNom.setBounds(108, 91, 217, 25);
		
		textPrenom = new Text(shlMediatekCrer, SWT.BORDER);
		textPrenom.setBounds(108, 151, 217, 25);
		
		textTel = new Text(shlMediatekCrer, SWT.BORDER);
		textTel.setBounds(108, 211, 217, 25);
		
		Label lblTel = new Label(shlMediatekCrer, SWT.NONE);
		lblTel.setText("Tel");
		lblTel.setAlignment(SWT.CENTER);
		lblTel.setBounds(0, 190, 434, 15);
		
		textMail = new Text(shlMediatekCrer, SWT.BORDER);
		textMail.setBounds(108, 271, 217, 25);
		
		Label lblMail = new Label(shlMediatekCrer, SWT.NONE);
		lblMail.setText("Mail");
		lblMail.setAlignment(SWT.CENTER);
		lblMail.setBounds(0, 250, 434, 15);

	}

}
