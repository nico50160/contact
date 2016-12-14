package xyz.naudeon.contact.application.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class QuitterHandler {

	@Execute
    public void execute(IWorkbench pWorkbench) {
            pWorkbench.close();
    }
}
