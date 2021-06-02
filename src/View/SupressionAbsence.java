package View;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class SupressionAbsence extends Dialog {

	protected Object result;
	protected Shell shlMediatekSuppression;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public SupressionAbsence(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlMediatekSuppression.open();
		shlMediatekSuppression.layout();
		Display display = getParent().getDisplay();
		while (!shlMediatekSuppression.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlMediatekSuppression = new Shell(getParent(), getStyle());
		shlMediatekSuppression.setSize(300, 150);
		shlMediatekSuppression.setText("MediaTek86 - Suppression Absence");
		
		Label lblSupressionAbsence = new Label(shlMediatekSuppression, SWT.BORDER | SWT.WRAP | SWT.SHADOW_NONE | SWT.CENTER);
		lblSupressionAbsence.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblSupressionAbsence.setBounds(35, 10, 220, 48);
		lblSupressionAbsence.setText("\u00CAtes vous s\u00FBr de vouloir supprimer cette abscence ?");
		
		Button btnAnnuler = new Button(shlMediatekSuppression, SWT.NONE);
		btnAnnuler.setBounds(35, 72, 75, 25);
		btnAnnuler.setText("Annuler");
		
		Button btnConfirmer = new Button(shlMediatekSuppression, SWT.NONE);
		btnConfirmer.setText("Confirmer");
		btnConfirmer.setBounds(180, 72, 75, 25);

	}
}
