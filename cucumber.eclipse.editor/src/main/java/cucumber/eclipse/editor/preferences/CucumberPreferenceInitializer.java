package cucumber.eclipse.editor.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import cucumber.eclipse.editor.Activator;

public class CucumberPreferenceInitializer extends
		AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        store.setDefault(ICucumberPreferenceConstants.PREF_FORMAT_RIGHT_ALIGN_NUMERIC_VALUES_IN_TABLES, true);
        store.setDefault(ICucumberPreferenceConstants.PREF_FORMAT_PRESERVE_BLANK_LINE_BETWEEN_STEPS, false);
        store.setDefault(ICucumberPreferenceConstants.PREF_FORMAT_CENTER_STEPS, false);
	}

}
