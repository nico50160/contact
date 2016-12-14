 
package xyz.naudeon.contact.application.ui.parts;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.CoolItem;

public class ContactDetailsPart {
	private Text txtNom;
	private Text txtPrenom;
	private Text txtLigne1;
	private Text txtLigne2;
	private Text txtCommune;
	private Text txtCodePostal;
	private Text text;
	
	@Inject
	public ContactDetailsPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		ToolBar toolBar = new ToolBar(parent, SWT.FLAT | SWT.RIGHT);
		toolBar.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		CTabFolder tabFolder = new CTabFolder(parent, SWT.BORDER);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		CTabItem tbtmIdentification = new CTabItem(tabFolder, SWT.NONE);
		tbtmIdentification.setText("Identification");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmIdentification.setControl(composite);
		composite.setLayout(new GridLayout(1, false));
		
		Group grpNom = new Group(composite, SWT.NONE);
		grpNom.setSize(669, 79);
		grpNom.setLayout(new GridLayout(6, false));
		grpNom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label lblCivilite = new Label(grpNom, SWT.NONE);
		lblCivilite.setText("Civilit\u00E9 :");
		
		Combo cmbCivilite = new Combo(grpNom, SWT.NONE);
		
		Label lblPrenom = new Label(grpNom, SWT.NONE);
		lblPrenom.setText("Pr\u00E9nom :");
		
		txtPrenom = new Text(grpNom, SWT.BORDER);
		txtPrenom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNom = new Label(grpNom, SWT.WRAP);
		lblNom.setText("Nom :");
		
		txtNom = new Text(grpNom, SWT.BORDER);
		txtNom.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group grpAdresse = new Group(composite, SWT.NONE);
		grpAdresse.setLayout(new GridLayout(4, false));
		grpAdresse.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblLigne1 = new Label(grpAdresse, SWT.NONE);
		lblLigne1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblLigne1.setText("Adresse :");
		
		txtLigne1 = new Text(grpAdresse, SWT.BORDER);
		txtLigne1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Label lblLigne2 = new Label(grpAdresse, SWT.NONE);
		lblLigne2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblLigne2.setText("Suite :");
		
		txtLigne2 = new Text(grpAdresse, SWT.BORDER);
		txtLigne2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		Label lblCodePostal = new Label(grpAdresse, SWT.NONE);
		lblCodePostal.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCodePostal.setText("Code postal :");
		
		txtCodePostal = new Text(grpAdresse, SWT.BORDER);
		txtCodePostal.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblCommune = new Label(grpAdresse, SWT.NONE);
		lblCommune.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCommune.setText("Commune :");
		
		txtCommune = new Text(grpAdresse, SWT.BORDER);
		txtCommune.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPays = new Label(grpAdresse, SWT.NONE);
		lblPays.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPays.setText("Pays :");
		
		Combo cmbPays = new Combo(grpAdresse, SWT.NONE);
		cmbPays.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		new Label(grpAdresse, SWT.NONE);
		
		Group grpGroupage = new Group(composite, SWT.NONE);
		grpGroupage.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label lblNewLabel = new Label(grpGroupage, SWT.NONE);
		lblNewLabel.setBounds(23, 28, 70, 20);
		lblNewLabel.setText("New Label");
		
		text = new Text(grpGroupage, SWT.BORDER);
		text.setBounds(124, 28, 78, 26);
		
		CTabItem tbtmCommunication = new CTabItem(tabFolder, SWT.NONE);
		tbtmCommunication.setText("Moyens de communication");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmCommunication.setControl(composite_1);
		
		CTabItem tbtmDivers = new CTabItem(tabFolder, SWT.NONE);
		tbtmDivers.setText("Divers");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmDivers.setControl(composite_2);
		
		Composite composite_3 = new Composite(parent, SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		composite_3.setLayout(new GridLayout(2, false));
		
		Button btnNewButton = new Button(composite_3, SWT.NONE);
		btnNewButton.setText("New Button");
		
		Button btnNewButton_1 = new Button(composite_3, SWT.NONE);
		btnNewButton_1.setText("New Button");
		
	}
}