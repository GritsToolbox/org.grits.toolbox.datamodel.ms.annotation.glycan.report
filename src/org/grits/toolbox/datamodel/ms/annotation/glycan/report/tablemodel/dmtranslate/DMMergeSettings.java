package org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate;

/**
 * Abstraction for the MergeSettings class in the GRITS object model.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public enum DMMergeSettings
{
	merge_settings_tolerance("Merge Tolerance", "The mass tolerance for determining the m/z intervals of the report."),
	merge_settings_tolerance_type("Merge Tolerance Type", "The mass tolerance type (ppm or dalton).");

    private String sLabel;
    private String sDescription;

    private DMMergeSettings( String sLabel, String sDescription ) {
        this.sLabel = sLabel;
        this.sDescription = sDescription;
    }

    public String getDescription() {
 		return sDescription;
 	}

    public String getLabel() 
    {  
        return this.sLabel;  
    }	
    
    public static DMMergeSettings lookUp( String _sKey ) {
    	if ( merge_settings_tolerance.name().equals(_sKey) ) 
    		return merge_settings_tolerance;
    	else if ( merge_settings_tolerance_type.name().equals(_sKey) ) 
    		return merge_settings_tolerance_type;
    	return null;
    } 
    
}
