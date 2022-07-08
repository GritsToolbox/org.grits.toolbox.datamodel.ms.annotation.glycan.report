package org.grits.toolbox.datamodel.ms.annotation.glycan.report.preference;

import org.grits.toolbox.datamodel.ms.annotation.glycan.preference.MSGlycanAnnotationViewerPreferenceReader;
import org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate.DMExtGlycanFeature;
import org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate.DMExtPeak;
import org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate.DMInterval;
import org.grits.toolbox.datamodel.ms.annotation.glycan.tablemodel.dmtranslate.DMGlycanAnnotation;
import org.grits.toolbox.datamodel.ms.tablemodel.dmtranslate.DMPeak;
import org.grits.toolbox.datamodel.ms.tablemodel.dmtranslate.DMPrecursorPeak;
import org.grits.toolbox.display.control.table.datamodel.GRITSColumnHeader;

public class MSGlycanAnnotationReportViewerPreferenceReader extends MSGlycanAnnotationViewerPreferenceReader {

//	@Override
//	public SimianColumnHeader getColumnHeader(String _sKey) {		
//		if ( _sKey.equals( DMInterval.interval_mz.name()) ) {
//			SimianColumnHeader header = new SimianColumnHeader(  DMInterval.interval_mz.getLabel(),
//					 DMInterval.interval_mz.name());
//			header.setIsGrouped(false);
//			return header;
//		}
//		if ( _sKey.equals( MSGlycanAnnotationReportViewerPreference.SEL_CARTOON.getKeyValue() ) ) {
//			SimianColumnHeader header = new SimianColumnHeader(  MSGlycanAnnotationReportViewerPreference.SEL_CARTOON.getLabel(),
//					MSGlycanAnnotationReportViewerPreference.SEL_CARTOON.getKeyValue());
//			header.setIsGrouped(false);
//			return header;
//		}
//		/*
//		if ( _sKey.equals(_ExtGlycanFeature.ext_glycan_feature_mz.name()) ) {
//			return new SimianColumnHeader( _ExtGlycanFeature.ext_glycan_feature_mz.getLabel(), 
//					_ExtGlycanFeature.ext_glycan_feature_mz.name());
//		}
//		if ( _sKey.equals(_ExtGlycanFeature.ext_glycan_feature_intensity.name() ) ) {
//			return new SimianColumnHeader( _ExtGlycanFeature.ext_glycan_feature_intensity.getLabel(), 
//					_ExtGlycanFeature.ext_glycan_feature_intensity.name());
//		}
//		if ( _sKey.equals(_ExtGlycanFeature.ext_glycan_feature_score.name()) ) {
//			return new SimianColumnHeader( _ExtGlycanFeature.ext_glycan_feature_score.getLabel(), 
//					_ExtGlycanFeature.ext_glycan_feature_score.name());
//		}
//		if ( _sKey.equals(_ExtGlycanFeature.ext_glycan_feature_sequence.name()) ) {
//			return new SimianColumnHeader(_ExtGlycanFeature.ext_glycan_feature_sequence.getLabel(), 
//					_ExtGlycanFeature.ext_glycan_feature_sequence.name());
//		}
//		*/
//		if ( _sKey.equals(DMExtPeak.ext_peak_peak_id.name()) ) {
//			return new SimianColumnHeader( DMExtPeak.ext_peak_peak_id.getLabel(), 
//					DMExtPeak.ext_peak_peak_id.name());
//		}
//		if ( _sKey.equals(DMExtGlycanFeature.ext_glycan_feature_feature_id.name()) ) {
//			return new SimianColumnHeader(DMExtGlycanFeature.ext_glycan_feature_feature_id.getLabel(), 
//					DMExtGlycanFeature.ext_glycan_feature_feature_id.name());
//		}
//		if ( _sKey.equals(DMExtGlycanFeature.ext_glycan_feature_sequence.name()) ) {
//			return new SimianColumnHeader(DMExtGlycanFeature.ext_glycan_feature_sequence.getLabel(), 
//					DMExtGlycanFeature.ext_glycan_feature_sequence.name());
//		}
//		
//		if ( _sKey.equals(DMGlycanAnnotation.glycan_annotation_glycancartoon.name()) ) {
//			return new SimianColumnHeader(DMGlycanAnnotation.glycan_annotation_glycancartoon.getLabel(), 
//					DMGlycanAnnotation.glycan_annotation_glycancartoon.name());
//		}
//		if ( _sKey.equals(DMPeak.peak_mz.name() ) ) {
//			return new SimianColumnHeader( DMPeak.peak_mz.getLabel(), DMPeak.peak_mz.name() );
//		}
//		if ( _sKey.equals(DMPeak.peak_intensity.name() ) ) {
//			return new SimianColumnHeader( DMPeak.peak_intensity.getLabel(), DMPeak.peak_intensity.name() );
//		}
//		if ( _sKey.equals(DMPeak.peak_relative_intensity.name() ) ) {
//			return new SimianColumnHeader( DMPeak.peak_relative_intensity.getLabel(), DMPeak.peak_relative_intensity.name() );
//		}
//		if ( _sKey.equals(DMPeak.peak_charge.name() ) ) {
//			return new SimianColumnHeader( DMPeak.peak_charge.getLabel(), DMPeak.peak_charge.name() );
//		}
//		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_mz.name() ) ) {
//			return new SimianColumnHeader( DMPrecursorPeak.precursor_peak_mz.getLabel(), DMPrecursorPeak.precursor_peak_mz.name() );
//		}
//		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_intensity.name() ) ) {
//			return new SimianColumnHeader( DMPrecursorPeak.precursor_peak_intensity.getLabel(), DMPrecursorPeak.precursor_peak_intensity.name() ); 
//		}
//		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_relative_intensity.name() ) ) {
//			return new SimianColumnHeader( DMPrecursorPeak.precursor_peak_relative_intensity.getLabel(), DMPrecursorPeak.precursor_peak_relative_intensity.name() ); 
//		}
//		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_charge.name() ) ) {
//			return new SimianColumnHeader( DMPrecursorPeak.precursor_peak_charge.getLabel(), DMPrecursorPeak.precursor_peak_charge.name() );
//		}
//			
//		return super.getColumnHeader(_sKey);
//	}
//	
}
