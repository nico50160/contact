package xyz.naudeon.contact.application.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class ContenuHandler {

	@Execute
    public void execute() {
      System.out.println((this.getClass().getSimpleName() + " called"));
    }
}
