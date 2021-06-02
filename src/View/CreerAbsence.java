package View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Combo;

public class CreerAbsence {

	protected Shell shlMediatekCrer;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CreerAbsence window = new CreerAbsence();
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
		shlMediatekCrer.setSize(450, 260);
		shlMediatekCrer.setText("MediaTek86 - Cr\u00E9er Absence");
		
		Label lblDateDebut = new Label(shlMediatekCrer, SWT.NONE);
		lblDateDebut.setText("Date D\u00E9but");
		lblDateDebut.setAlignment(SWT.CENTER);
		lblDateDebut.setBounds(0, 10, 434, 15);
		
		Label lblDateFin = new Label(shlMediatekCrer, SWT.NONE);
		lblDateFin.setText("Date Fin");
		lblDateFin.setAlignment(SWT.CENTER);
		lblDateFin.setBounds(0, 70, 434, 15);
		
		Button btnValider = new Button(shlMediatekCrer, SWT.NONE);
		btnValider.setText("Valider");
		btnValider.setBounds(324, 186, 100, 25);
		
		Label lblMotif = new Label(shlMediatekCrer, SWT.NONE);
		lblMotif.setText("Motif");
		lblMotif.setAlignment(SWT.CENTER);
		lblMotif.setBounds(0, 130, 434, 15);
		
		Button btnAnnuler = new Button(shlMediatekCrer, SWT.NONE);
		btnAnnuler.setText("Annuler");
		btnAnnuler.setBounds(218, 186, 100, 25);
		
		DateTime dateDebut = new DateTime(shlMediatekCrer, SWT.BORDER);
		dateDebut.setBounds(108, 31, 217, 24);
		
		DateTime dateFin = new DateTime(shlMediatekCrer, SWT.BORDER);
		dateFin.setBounds(108, 91, 217, 24);
		
		Combo comboMotif = new Combo(shlMediatekCrer, SWT.NONE);
		comboMotif.setBounds(108, 151, 217, 23);
		comboMotif.setText("S\u00E9lectionner motif");

	}
}
