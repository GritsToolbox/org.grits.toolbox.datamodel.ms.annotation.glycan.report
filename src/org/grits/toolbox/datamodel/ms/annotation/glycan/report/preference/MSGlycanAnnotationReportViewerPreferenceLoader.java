package org.grits.toolbox.datamodel.ms.annotation.glycan.report.preference;

import org.apache.log4j.Logger;
import org.grits.toolbox.core.datamodel.UnsupportedVersionException;
import org.grits.toolbox.core.preference.share.PreferenceEntity;

import org.grits.toolbox.datamodel.ms.annotation.glycan.preference.MSGlycanAnnotationViewerPreferencePreVersion;
import org.grits.toolbox.datamodel.ms.tablemodel.FillTypes;
import org.grits.toolbox.display.control.table.preference.TableViewerPreference;

public class MSGlycanAnnotationReportViewerPreferenceLoader {
	private static final Logger logger = Logger.getLogger(MSGlycanAnnotationReportViewerPreferenceLoader.class);

	public static MSGlycanAnnotationReportViewerPreference getTableViewerPreference(int _iMSLevel, FillTypes fillType )  {
		MSGlycanAnnotationReportViewerPreference preferences = null;
		try {
			PreferenceEntity preferenceEntity = MSGlycanAnnotationReportViewerPreference.getPreferenceEntity(_iMSLevel, fillType); 
			if( preferenceEntity == null ) { // previous version
				preferences = MSGlycanAnnotationReportViewerPreferencePreVersion.getTableViewerPreferencesPreVersioning(_iMSLevel, fillType);
				
				if( preferences != null ) {
					MSGlycanAnnotationViewerPreferencePreVersion.removeElements(_iMSLevel, fillType);
				}
			} else {
				preferences = (MSGlycanAnnotationReportViewerPreference) TableViewerPreference.getTableViewerPreference(preferenceEntity, MSGlycanAnnotationReportViewerPreference.class);
			}
		} catch (UnsupportedVersionException ex) {
			logger.error(ex.getMessage(), ex);
			
		} catch( Exception ex ) {
			logger.error(ex.getMessage(), ex);
		}		
		if( preferences == null ) { // well, either no preferences yet or some error. initialize to defaults and return
			preferences = new MSGlycanAnnotationReportViewerPreference();
			preferences.setFillType(fillType);
			preferences.setMSLevel(_iMSLevel);
			preferences.setColumnSettings("");
		}
		return preferences;
	}
	
}
