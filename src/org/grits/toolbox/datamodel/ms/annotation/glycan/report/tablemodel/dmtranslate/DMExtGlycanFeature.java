package org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate;

/**
 * Abstraction for the simple elements of the ExperimentAnnotation class in the GRITS object model.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public enum DMExtGlycanFeature
{
	ext_glycan_feature_annotation_id("Extended Annotation Id", "The combined (delimited-concatenated) auto-assigned annotation ids for the merged  features in the particular MS annotation."),
//	ext_glycan_feature_glycan_annotation_id("Extended Glycan Annotation Id", "The combined (delimited-concatenated) user-assigned annotation ids for the merged  features in the particular MS annotation."),
	ext_glycan_feature_glycan_annotation_id("Extended String Annotation Id", "The combined (delimited-concatenated) user-assigned annotation ids for the merged  features in the particular MS annotation."),
//	ext_glycan_feature_feature_id("Extended Glycan Feature Id", "The combined (delimited-concatenated) auto-assigned feature ids for the merged  features in the particular MS annotation."),
	ext_glycan_feature_feature_id("Extended Feature Id", "The combined (delimited-concatenated) auto-assigned feature ids for the merged  features in the particular MS annotation."),
//	ext_glycan_feature_peak_id("Extended Glycan Feature Peak Id", "The peak id for the merged features in the particular MS annotation."),
	ext_glycan_feature_peak_id("Extended Feature Peak Id", "The peak id for the merged features in the particular MS annotation."),
	ext_glycan_feature_sequenceGWB("GWB Sequence", "The combined (delimited-concatenated) glycan sequences in Glycoworkbench format for the merged  features in the particular MS annotation."),
	ext_glycan_feature_sequence("Sequence", "The combined (delimited-concatenated) sequences in other, approved format for the merged  features in the particular MS annotation."),
	ext_glycan_feature_sequenceFormat("Sequence Format", "The format of the sequences in the 'Sequence' field"),
	ext_glycan_feature_mz("m/z", "The combined (delimited-concatenated) m/zs for the merged  features in the particular MS annotation."),
	ext_glycan_feature_intensity("Intensity", "The intensity of the peak in the particular MS annotation."),
//	ext_glycan_feature_charge("Glycan Charge", "The combined (delimited-concatenated) charges for the merged  features in the particular MS annotation."),
	ext_glycan_feature_charge("Structure Charge", "The combined (delimited-concatenated) charges for the merged features in the particular MS annotation."),
	ext_glycan_feature_score("Score", "The combined (delimited-concatenated) scores for the merged  features in the particular MS annotation.");

    private String sLabel;
    private String sDescription;

    private DMExtGlycanFeature( String sLabel, String sDescription ) {
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
    
    public static DMExtGlycanFeature lookUp( String _sKey ) {
    	if ( ext_glycan_feature_annotation_id.name().equals(_sKey ) )
    		return ext_glycan_feature_annotation_id;
    	else if ( ext_glycan_feature_glycan_annotation_id.name().equals(_sKey) ) 
    		return ext_glycan_feature_glycan_annotation_id;
    	else if ( ext_glycan_feature_feature_id.name().equals(_sKey) ) 
    		return ext_glycan_feature_feature_id;
    	else if ( ext_glycan_feature_peak_id.name().equals(_sKey) ) 
    		return ext_glycan_feature_peak_id;
    	else if ( ext_glycan_feature_sequenceGWB.name().equals(_sKey) ) 
    		return ext_glycan_feature_sequenceGWB;
    	else if ( ext_glycan_feature_sequence.name().equals(_sKey) ) 
    		return ext_glycan_feature_sequence;
    	else if ( ext_glycan_feature_sequenceFormat.name().equals(_sKey) ) 
    		return ext_glycan_feature_sequenceFormat;
    	else if ( ext_glycan_feature_mz.name().equals(_sKey) ) 
    		return ext_glycan_feature_mz;
    	else if ( ext_glycan_feature_intensity.name().equals(_sKey) ) 
    		return ext_glycan_feature_intensity;
    	else if ( ext_glycan_feature_charge.name().equals(_sKey) ) 
    		return ext_glycan_feature_charge;
    	else if ( ext_glycan_feature_score.name().equals(_sKey) ) 
    		return ext_glycan_feature_score;
     	
    	return null;
    } 
    
}
