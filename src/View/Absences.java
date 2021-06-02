package View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;

public class Absences {

	protected Shell shlMediatekAbsences;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Absences window = new Absences();
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
		shlMediatekAbsences.open();
		shlMediatekAbsences.layout();
		while (!shlMediatekAbsences.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMediatekAbsences = new Shell();
		shlMediatekAbsences.setSize(400, 415);
		shlMediatekAbsences.setText("MediaTek86 - Absences");
		
		Label lblAbsences = new Label(shlMediatekAbsences, SWT.NONE);
		lblAbsences.setAlignment(SWT.CENTER);
		lblAbsences.setBounds(0, 10, 384, 15);
		lblAbsences.setText("Liste des absences de ");
		
		Composite composite = new Composite(shlMediatekAbsences, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setBounds(32, 31, 310, 290);
		
		Label lblDateDebutCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblDateDebutCol.setText("Date D\u00E9but");
		lblDateDebutCol.setBounds(10, 10, 70, 20);
		
		Label lblDateFinCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblDateFinCol.setText("Date Fin");
		lblDateFinCol.setBounds(86, 10, 70, 20);
		
		Label lblMotifCol = new Label(composite, SWT.BORDER | SWT.CENTER);
		lblMotifCol.setText("Motif");
		lblMotifCol.setBounds(162, 10, 70, 20);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(10, 36, 290, 244);
		formToolkit.adapt(scrolledComposite);
		formToolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		table = new Table(scrolledComposite, SWT.BORDER | SWT.FULL_SELECTION);
		formToolkit.adapt(table);
		formToolkit.paintBordersFor(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		scrolledComposite.setContent(table);
		scrolledComposite.setMinSize(table.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		Button btnAjouter = new Button(shlMediatekAbsences, SWT.NONE);
		btnAjouter.setBounds(267, 341, 75, 25);
		btnAjouter.setText("Ajouter");
		
		Button btnModifier = new Button(shlMediatekAbsences, SWT.NONE);
		btnModifier.setText("Modifier");
		btnModifier.setBounds(186, 341, 75, 25);
		
		Button btnSupprimer = new Button(shlMediatekAbsences, SWT.NONE);
		btnSupprimer.setText("Supprimer");
		btnSupprimer.setBounds(105, 341, 75, 25);

	}
}
