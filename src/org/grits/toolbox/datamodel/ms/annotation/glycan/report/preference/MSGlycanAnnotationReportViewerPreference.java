package org.grits.toolbox.datamodel.ms.annotation.glycan.report.preference;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.grits.toolbox.core.datamodel.UnsupportedVersionException;
import org.grits.toolbox.core.preference.share.PreferenceEntity;
import org.grits.toolbox.core.preference.share.PreferenceReader;
import org.grits.toolbox.core.preference.share.PreferenceWriter;

import org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate.DMExtGlycanFeature;
import org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate.DMExtPeak;
import org.grits.toolbox.datamodel.ms.annotation.glycan.report.tablemodel.dmtranslate.DMInterval;
import org.grits.toolbox.datamodel.ms.annotation.glycan.tablemodel.dmtranslate.DMGlycanAnnotation;
import org.grits.toolbox.datamodel.ms.annotation.preference.MSAnnotationViewerPreference;
import org.grits.toolbox.datamodel.ms.tablemodel.FillTypes;
import org.grits.toolbox.datamodel.ms.tablemodel.dmtranslate.DMPeak;
import org.grits.toolbox.datamodel.ms.tablemodel.dmtranslate.DMPrecursorPeak;
import org.grits.toolbox.display.control.table.datamodel.GRITSColumnHeader;
import org.grits.toolbox.ms.annotation.sugar.GlycanExtraInfo;

@XmlRootElement(name = "msGlycanAnnotationReportViewerPreference")
public class MSGlycanAnnotationReportViewerPreference extends MSAnnotationViewerPreference {
	private static final Logger logger = Logger.getLogger(MSGlycanAnnotationReportViewerPreference.class);
    public static final GRITSColumnHeader SEL_CARTOON = new GRITSColumnHeader("Selected Cartoon", "selected_cartoon");
	private static final String PREFERENCE_NAME_ALL = "org.grits.toolbox.datamodel.ms.annotation.glycan.report.preference.MSGlycanAnnotationReportViewerPreference";
	/*
	 * Version history:
	 * 1.0 - Original release w/ versioning
	 * 1.1 - Committed 03/08/16. Re-versioned because parent class "TableViewerPreference" was modified
	 */
	private static final String CURRENT_VERSION = "1.1";

	public MSGlycanAnnotationReportViewerPreference() {
		this( 1, FillTypes.Scans);
	}

	public MSGlycanAnnotationReportViewerPreference(int _iMSLevel, FillTypes fillType) {
		super(_iMSLevel, fillType);
	}

	protected static String getPreferenceID( int _iMSLevel, FillTypes fillType ) {
		String sAdder = "";
		String sName = PREFERENCE_NAME_ALL;
		if ( fillType == FillTypes.Scans ) {
			sAdder = ".Scans";
		}
		else if ( fillType == FillTypes.PeakList ) {
			sAdder = ".Peaks";
		}
		else if ( fillType == FillTypes.PeaksWithFeatures ) {
			sAdder = ".PeaksWithFeatures";
		}
		sName += sAdder;
		sName += ".MSLevel" + (_iMSLevel - 1);
		return sName;
	}
	
	public static PreferenceEntity getPreferenceEntity( int _iMSLevel, FillTypes fillType  ) throws UnsupportedVersionException {
		PreferenceEntity preferenceEntity = PreferenceReader.getPreferenceByName(MSGlycanAnnotationReportViewerPreference.getPreferenceID(_iMSLevel, fillType));
		return preferenceEntity;
	}
	
	@Override
	protected String getCurrentVersion() {
		return MSGlycanAnnotationReportViewerPreference.CURRENT_VERSION;
	}
	
	@Override
	public boolean writePreference() {
		PreferenceEntity preferenceEntity = new PreferenceEntity(MSGlycanAnnotationReportViewerPreference.getPreferenceID(getMSLevel(), getFillType()));
		preferenceEntity.setVersion(getCurrentVersion());
		preferenceEntity.setValue(marshalXML());
		return PreferenceWriter.savePreference(preferenceEntity);
	}
	
	/* added 03/10/16 to remove the Glycan Charge column generated by the GlycoVisitor */
	@Override
	protected boolean excludeColumn(String _sColumnKey, String _sColumnLabel) {
		if( _sColumnKey.equals(GlycanExtraInfo.GLYCAN_CHARGE) ) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public GRITSColumnHeader getColumnHeader(String _sKey) {		
		if ( _sKey.equals( DMInterval.interval_mz.name()) ) {
			GRITSColumnHeader header = new GRITSColumnHeader(  DMInterval.interval_mz.getLabel(),
					 DMInterval.interval_mz.name());
			header.setIsGrouped(false);
			return header;
		}
		if ( _sKey.equals( MSGlycanAnnotationReportViewerPreference.SEL_CARTOON.getKeyValue() ) ) {
			GRITSColumnHeader header = new GRITSColumnHeader(  MSGlycanAnnotationReportViewerPreference.SEL_CARTOON.getLabel(),
					MSGlycanAnnotationReportViewerPreference.SEL_CARTOON.getKeyValue());
			header.setIsGrouped(false);
			return header;
		}
		if ( _sKey.equals(DMExtPeak.ext_peak_peak_id.name()) ) {
			return new GRITSColumnHeader( DMExtPeak.ext_peak_peak_id.getLabel(), 
					DMExtPeak.ext_peak_peak_id.name());
		}
		if ( _sKey.equals(DMExtGlycanFeature.ext_glycan_feature_feature_id.name()) ) {
			return new GRITSColumnHeader(DMExtGlycanFeature.ext_glycan_feature_feature_id.getLabel(), 
					DMExtGlycanFeature.ext_glycan_feature_feature_id.name());
		}
		if ( _sKey.equals(DMExtGlycanFeature.ext_glycan_feature_sequence.name()) ) {
			return new GRITSColumnHeader(DMExtGlycanFeature.ext_glycan_feature_sequence.getLabel(), 
					DMExtGlycanFeature.ext_glycan_feature_sequence.name());
		}
		
		if ( _sKey.equals(DMGlycanAnnotation.glycan_annotation_glycancartoon.name()) ) {
			return new GRITSColumnHeader(DMGlycanAnnotation.glycan_annotation_glycancartoon.getLabel(), 
					DMGlycanAnnotation.glycan_annotation_glycancartoon.name());
		}
		if ( _sKey.equals(DMPeak.peak_mz.name() ) ) {
			return new GRITSColumnHeader( DMPeak.peak_mz.getLabel(), DMPeak.peak_mz.name() );
		}
		if ( _sKey.equals(DMPeak.peak_intensity.name() ) ) {
			return new GRITSColumnHeader( DMPeak.peak_intensity.getLabel(), DMPeak.peak_intensity.name() );
		}
		if ( _sKey.equals(DMPeak.peak_relative_intensity.name() ) ) {
			return new GRITSColumnHeader( DMPeak.peak_relative_intensity.getLabel(), DMPeak.peak_relative_intensity.name() );
		}
		if ( _sKey.equals(DMPeak.peak_charge.name() ) ) {
			return new GRITSColumnHeader( DMPeak.peak_charge.getLabel(), DMPeak.peak_charge.name() );
		}
		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_mz.name() ) ) {
			return new GRITSColumnHeader( DMPrecursorPeak.precursor_peak_mz.getLabel(), DMPrecursorPeak.precursor_peak_mz.name() );
		}
		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_intensity.name() ) ) {
			return new GRITSColumnHeader( DMPrecursorPeak.precursor_peak_intensity.getLabel(), DMPrecursorPeak.precursor_peak_intensity.name() ); 
		}
		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_relative_intensity.name() ) ) {
			return new GRITSColumnHeader( DMPrecursorPeak.precursor_peak_relative_intensity.getLabel(), DMPrecursorPeak.precursor_peak_relative_intensity.name() ); 
		}
		if ( _sKey.equals(DMPrecursorPeak.precursor_peak_charge.name() ) ) {
			return new GRITSColumnHeader( DMPrecursorPeak.precursor_peak_charge.getLabel(), DMPrecursorPeak.precursor_peak_charge.name() );
		}
			
		return super.getColumnHeader(_sKey);
	}
	
	
}