package org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel;

import java.util.ArrayList;

import org.eclipse.nebula.widgets.nattable.group.ColumnGroupModel;
import org.eclipse.nebula.widgets.nattable.group.ColumnGroupModel.ColumnGroup;

import org.grits.toolbox.datamodel.ms.annotation.glycan.preference.cartoon.MSGlycanAnnotationCartoonPreferencesLoader;
import org.grits.toolbox.datamodel.ms.annotation.glycan.report.preference.MSGlycanAnnotationReportViewerPreferenceLoader;
import org.grits.toolbox.datamodel.ms.annotation.glycan.tablemodel.MSGlycanAnnotationTableDataObject;
import org.grits.toolbox.datamodel.ms.tablemodel.FillTypes;

public class MSGlycanAnnotationReportTableDataObject extends MSGlycanAnnotationTableDataObject {    
	protected ArrayList<Integer> alFirstGroupIndices = null;
    protected ArrayList<Integer> alSourcePeakIdCols;

    public MSGlycanAnnotationReportTableDataObject( int _iMSLevel, FillTypes fillTypes ) {
    	super(_iMSLevel, fillTypes);
    	this.alFirstGroupIndices = null;
        this.alSourcePeakIdCols = new ArrayList<>();
	}
       
    @Override
    public void initializePreferences() {
    	setTablePreferences(MSGlycanAnnotationReportViewerPreferenceLoader.getTableViewerPreference(getMSLevel(), getFillType()));		
		setCartoonPrefs(MSGlycanAnnotationCartoonPreferencesLoader.getCartoonPreferences());
    }
    
    public ArrayList<Integer> getFirstGroupIndices() {
		return alFirstGroupIndices;
	}
    
	public void discoverGroups( ColumnGroupModel groupModel ) {
		this.alFirstGroupIndices = new ArrayList<Integer>();
		if ( groupModel == null || groupModel.isEmpty() ) 
			return;
		
		ColumnGroup prevGroup = null;
		int iTotalGroups = groupModel.size();
		int iGrpCnt = 0;
		int i = 0;
		while( iGrpCnt < iTotalGroups ) {
			ColumnGroup group = groupModel.getColumnGroupByIndex(i++);  // change 07/31/2013. No longer using "Exp" text so relying on order
			if ( prevGroup != null && prevGroup.equals(group) ) {
				// HACK to get around their bad API:  if we've seen this group continue.
				continue;
			}
			prevGroup = group;
			iGrpCnt++;
			this.alFirstGroupIndices.add(i-1);
		}	
	}
    
    public void addSourcePeakIdCol( int iScanNoCol ) {
    	this.alSourcePeakIdCols.add(iScanNoCol);
    }
    
    public ArrayList<Integer> getSourcePeakIdCol() {
    	return this.alSourcePeakIdCols;
    }
	
        
}
