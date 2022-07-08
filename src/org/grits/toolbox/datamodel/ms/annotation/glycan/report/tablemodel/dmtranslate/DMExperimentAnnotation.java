package org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate;

/**
 * Abstraction for the ExperimentAnnotation class in the GRITS object model.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public enum DMExperimentAnnotation 
{
	experiment_annotation_entry_id("Experiment Entry Id", "The auto-assigned ID of the source MS annotation entry."),
	experiment_annotation_file_archive("Experiment Archive File", "The full path location of the source MS annotation archive."),
	experiment_annotation_display_name("Experiment Display Name", "The name of the MS annotation entry to be displayed to the user."),
	experiment_annotation_short_name("Experiment Short Name", "The abbreviated name of the MS annotation entry.");
	
    private String sLabel;
    private String sDescription;

    private DMExperimentAnnotation( String sLabel, String sDescription ) {
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

    public static DMExperimentAnnotation lookUp( String _sKey ) {
    	if ( experiment_annotation_entry_id.name().equals(_sKey ) )
    		return experiment_annotation_entry_id;
    	else if ( experiment_annotation_display_name.name().equals(_sKey) ) 
    		return experiment_annotation_display_name;
     	return null;
    } 
    
}
