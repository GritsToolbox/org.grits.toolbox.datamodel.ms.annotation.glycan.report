package org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate;

/**
 * Abstraction for the Interval class in the GRITS object model.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public enum DMInterval 
{
	interval_mz("Interval m/z", "The m/z value of merged peaks in the report with m/z within the specified mass tolerance.");

    private String sLabel;
    private String sDescription;

    private DMInterval( String sLabel, String sDescription ) {
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
    
    public static DMInterval lookUp( String _sKey ) {
    	if ( interval_mz.name().equals(_sKey ) )
    		return interval_mz;
    	return null;
    } 
    
}