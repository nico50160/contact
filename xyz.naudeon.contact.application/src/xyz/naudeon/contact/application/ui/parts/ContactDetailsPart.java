 
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

public class ContactDetailsPart {
	private Text text;
	@Inject
	public ContactDetailsPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		Group grpFiltres = new Group(parent, SWT.NONE);
		GridData gd_grpFiltres = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_grpFiltres.widthHint = 423;
		grpFiltres.setLayoutData(gd_grpFiltres);
		grpFiltres.setText("Filtres");
		grpFiltres.setLayout(new GridLayout(3, false));
		
		Label lblNewLabel = new Label(grpFiltres, SWT.NONE);
		lblNewLabel.setText("Groupe");
		
		Combo combo = new Combo(grpFiltres, SWT.NONE);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		Label lblNewLabel_1 = new Label(grpFiltres, SWT.NONE);
		lblNewLabel_1.setText("Filtre");
		
		text = new Text(grpFiltres, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, true, 2, 1));
		new Label(grpFiltres, SWT.NONE);
		new Label(grpFiltres, SWT.NONE);
		
		Composite composite = new Composite(grpFiltres, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setText("New Button");
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.setText("New Button");
		
		TreeViewer treeViewer = new TreeViewer(parent, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
	}
}