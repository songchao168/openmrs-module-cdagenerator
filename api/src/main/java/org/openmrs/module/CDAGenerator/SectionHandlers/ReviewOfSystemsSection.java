package org.openmrs.module.CDAGenerator.SectionHandlers;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openmrs.module.CDAGenerator.api.CDAHelper;

public class ReviewOfSystemsSection extends BaseCdaSectionHandler 
{
	public ReviewOfSystemsSection()
	{
		this.sectionName="REVIEW OF SYSTEMS";
		this.templateid="1.3.6.1.4.1.19376.1.5.3.1.3.18";
		this.code="10187-3";
		this.sectionDescription=" 	The review of systems section shall contain a narrative description of the responses the patient gave to a set of routine questions on the functions of each anatomic body system.";
	}

	public static Section buildReviewOfSystemsSection()
	{
		Section section=CDAFactory.eINSTANCE.createSection();
        ReviewOfSystemsSection ccs=new ReviewOfSystemsSection();
        section.getTemplateIds().add(CDAHelper.buildTemplateID(ccs.getTemplateid(),null ,null ));
        section.setCode(CDAHelper.buildCodeCE(ccs.getCode(),ccs.getCodeSystem(),ccs.getSectionName(),ccs.getCodeSystemName()));
        section.setTitle(CDAHelper.buildTitle(ccs.getSectionDescription()));
        StrucDocText text=CDAFactory.eINSTANCE.createStrucDocText();
        text.addText("Text as described above");
        section.setText(text);        
		return section;
	}
}
