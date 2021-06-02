package View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class ModifierPersonnel {

	protected Shell shlMediatekModifier;
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
			ModifierPersonnel window = new ModifierPersonnel();
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
		shlMediatekModifier.open();
		shlMediatekModifier.layout();
		while (!shlMediatekModifier.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMediatekModifier = new Shell();
		shlMediatekModifier.setSize(450, 385);
		shlMediatekModifier.setText("MediaTek86 - Modifier Personnel");
		
		Label lblService = new Label(shlMediatekModifier, SWT.NONE);
		lblService.setText("Service");
		lblService.setAlignment(SWT.CENTER);
		lblService.setBounds(0, 10, 434, 15);
		
		Combo comboService = new Combo(shlMediatekModifier, SWT.NONE);
		comboService.setBounds(108, 31, 217, 23);
		comboService.setText("S\u00E9lectionner service");
		
		Label lblNom = new Label(shlMediatekModifier, SWT.NONE);
		lblNom.setText("Nom");
		lblNom.setAlignment(SWT.CENTER);
		lblNom.setBounds(0, 70, 434, 15);
		
		textNom = new Text(shlMediatekModifier, SWT.BORDER);
		textNom.setBounds(108, 91, 217, 25);
		
		Label lblPrenom = new Label(shlMediatekModifier, SWT.NONE);
		lblPrenom.setText("Prenom");
		lblPrenom.setAlignment(SWT.CENTER);
		lblPrenom.setBounds(0, 130, 434, 15);
		
		textPrenom = new Text(shlMediatekModifier, SWT.BORDER);
		textPrenom.setBounds(108, 151, 217, 25);
		
		Label lblTel = new Label(shlMediatekModifier, SWT.NONE);
		lblTel.setText("Tel");
		lblTel.setAlignment(SWT.CENTER);
		lblTel.setBounds(0, 190, 434, 15);
		
		textTel = new Text(shlMediatekModifier, SWT.BORDER);
		textTel.setBounds(108, 211, 217, 25);
		
		Label lblMail = new Label(shlMediatekModifier, SWT.NONE);
		lblMail.setText("Mail");
		lblMail.setAlignment(SWT.CENTER);
		lblMail.setBounds(0, 250, 434, 15);
		
		textMail = new Text(shlMediatekModifier, SWT.BORDER);
		textMail.setBounds(108, 271, 217, 25);
		
		Button btnAnnuler = new Button(shlMediatekModifier, SWT.NONE);
		btnAnnuler.setText("Annuler");
		btnAnnuler.setBounds(218, 311, 100, 25);
		
		Button btnValider = new Button(shlMediatekModifier, SWT.NONE);
		btnValider.setText("Valider");
		btnValider.setBounds(324, 311, 100, 25);

	}

}
