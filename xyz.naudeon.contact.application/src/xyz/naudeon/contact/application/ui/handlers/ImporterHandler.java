package xyz.naudeon.contact.application.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class ImporterHandler {

	@Execute
    public void execute() {
      System.out.println((this.getClass().getSimpleName() + " called"));
    }
}
