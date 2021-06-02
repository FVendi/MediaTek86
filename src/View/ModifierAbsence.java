package View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;

public class ModifierAbsence {

	protected Shell shlMediatekModifier;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ModifierAbsence window = new ModifierAbsence();
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
		shlMediatekModifier.setSize(450, 260);
		shlMediatekModifier.setText("MediaTek86 - Modifier Absence");
		
		Label lblDateDebut = new Label(shlMediatekModifier, SWT.NONE);
		lblDateDebut.setText("Date D\u00E9but");
		lblDateDebut.setAlignment(SWT.CENTER);
		lblDateDebut.setBounds(0, 10, 434, 15);
		
		DateTime dateDebut = new DateTime(shlMediatekModifier, SWT.BORDER);
		dateDebut.setBounds(108, 31, 217, 24);
		
		Label lblDateFin = new Label(shlMediatekModifier, SWT.NONE);
		lblDateFin.setText("Date Fin");
		lblDateFin.setAlignment(SWT.CENTER);
		lblDateFin.setBounds(0, 70, 434, 15);
		
		DateTime dateFin = new DateTime(shlMediatekModifier, SWT.BORDER);
		dateFin.setBounds(108, 91, 217, 24);
		
		Label lblMotif = new Label(shlMediatekModifier, SWT.NONE);
		lblMotif.setText("Motif");
		lblMotif.setAlignment(SWT.CENTER);
		lblMotif.setBounds(0, 130, 434, 15);
		
		Combo comboMotif = new Combo(shlMediatekModifier, SWT.NONE);
		comboMotif.setBounds(108, 151, 217, 23);
		comboMotif.setText("S\u00E9lectionner motif");
		
		Button btnAnnuler = new Button(shlMediatekModifier, SWT.NONE);
		btnAnnuler.setText("Annuler");
		btnAnnuler.setBounds(218, 186, 100, 25);
		
		Button btnValider = new Button(shlMediatekModifier, SWT.NONE);
		btnValider.setText("Valider");
		btnValider.setBounds(324, 186, 100, 25);

	}

}
