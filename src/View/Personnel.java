package View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Table;

public class Personnel {

	protected Shell shlMediatekPersonnel;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Table tablePersonnel;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Personnel window = new Personnel();
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
		shlMediatekPersonnel.open();
		shlMediatekPersonnel.layout();
		while (!shlMediatekPersonnel.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMediatekPersonnel = new Shell();
		shlMediatekPersonnel.setSize(550, 415);
		shlMediatekPersonnel.setText("MediaTek86 - Personnel");
		
		Label lblPersonnel = new Label(shlMediatekPersonnel, SWT.NONE);
		lblPersonnel.setAlignment(SWT.CENTER);
		lblPersonnel.setBounds(0, 10, 534, 15);
		lblPersonnel.setText("Liste du personnel");
		
		Composite composite = new Composite(shlMediatekPersonnel, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setBounds(10, 31, 514, 290);
		
		Label lblIdCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblIdCol.setBounds(10, 10, 47, 20);
		lblIdCol.setText("ID");
		
		Label lblServiceCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblServiceCol.setText("Service");
		lblServiceCol.setBounds(63, 10, 70, 20);
		
		Label lblNomCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblNomCol.setText("Nom");
		lblNomCol.setBounds(139, 10, 70, 20);
		
		Label lblPrenomCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblPrenomCol.setText("Prenom");
		lblPrenomCol.setBounds(215, 10, 70, 20);
		
		Label lblTelCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblTelCol.setText("Tel");
		lblTelCol.setBounds(291, 10, 70, 20);
		
		Label lblMailCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblMailCol.setText("Mail");
		lblMailCol.setBounds(367, 10, 70, 20);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(10, 36, 494, 244);
		formToolkit.adapt(scrolledComposite);
		formToolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		tablePersonnel = new Table(scrolledComposite, SWT.BORDER | SWT.FULL_SELECTION);
		formToolkit.adapt(tablePersonnel);
		formToolkit.paintBordersFor(tablePersonnel);
		tablePersonnel.setHeaderVisible(true);
		tablePersonnel.setLinesVisible(true);
		scrolledComposite.setContent(tablePersonnel);
		scrolledComposite.setMinSize(tablePersonnel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		Button btnAjouter = new Button(shlMediatekPersonnel, SWT.NONE);
		btnAjouter.setBounds(449, 342, 75, 25);
		btnAjouter.setText("Ajouter");
		
		Button btnModifier = new Button(shlMediatekPersonnel, SWT.NONE);
		btnModifier.setText("Modifier");
		btnModifier.setBounds(368, 342, 75, 25);
		
		Button btnSupprimer = new Button(shlMediatekPersonnel, SWT.NONE);
		btnSupprimer.setText("Supprimer");
		btnSupprimer.setBounds(287, 342, 75, 25);
		
		Button btnVoirAbsences = new Button(shlMediatekPersonnel, SWT.NONE);
		btnVoirAbsences.setText("Voir les absences");
		btnVoirAbsences.setBounds(181, 342, 100, 25);

	}
}
