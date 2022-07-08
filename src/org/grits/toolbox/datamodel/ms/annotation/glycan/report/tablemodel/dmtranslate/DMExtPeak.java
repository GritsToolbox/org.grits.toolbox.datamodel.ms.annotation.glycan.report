package org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate;

/**
 * Abstraction for the simple elements of the ExperimentAnnotation class in the GRITS object model.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public enum DMExtPeak
{
	ext_peak_annotation_id("Extended Peak Annotation Id", "Then entry ID of the source MS Annotation entry."),
	ext_peak_peak_id("Extended Peak Id", "The auto-assigned ID of the merge report extended peak."),
	ext_peak_source_scan_num("Source Scan Num", "The scan number of the scan in the MS file."),
	ext_peak_source_peak_id("Source Peak Id", "The peak ID of the scan in the MS file.");

    private String sLabel;
    private String sDescription;

    private DMExtPeak( String sLabel, String sDescription ) {
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
    
    public static DMExtPeak lookUp( String _sKey ) {
    	if ( ext_peak_annotation_id.name().equals(_sKey ) )
    		return ext_peak_annotation_id;
    	else if ( ext_peak_peak_id.name().equals(_sKey) ) 
    		return ext_peak_peak_id;
    	else if ( ext_peak_source_peak_id.name().equals(_sKey) ) 
    		return ext_peak_source_peak_id;
    	
    	return null;
    } 
    
}
