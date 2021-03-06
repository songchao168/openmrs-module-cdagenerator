package org.openmrs.module.CDAGenerator.CDAHandlers;

import java.util.Map;

import org.openmrs.module.CDAGenerator.SectionHandlers.BaseCdaSectionHandler;

public class BaseCdaTypeHandler
{
	public String documentFullName;
	public String documentShortName;
	public String documentDescription;
	public String parentTemplateId;
	public String templateid;
	public String formatCode;
		
	public String getDocumentFullName()
	{
	return documentFullName;
	}
	
	public String getParentTemplateId()
	{
	return parentTemplateId;
	}
	
	public String getDocumentShortName()
	{
	return documentShortName;
	}
	
	public String getDocumentDescription()
	{
	return documentDescription;
	}
	
	public String getTemplateid()
	{
	return templateid;
	}
	
	public String getFormatCode()
	{
		return formatCode;
	}
	
	public void setTemplateid(String Templateid)
	{
	this.templateid=Templateid;
	}
	
	public void setParentTemplateId(String ParentTemplateid)
	{
	this.parentTemplateId=ParentTemplateid;
	}
	
	public void setDocumentDescription(String documentDescription)
	{
	this.documentDescription=documentDescription;
	}
	
	public void setDocumentFullName(String fullname)
	{
	this.documentFullName=fullname;
	}
	
	public void setDocumentShortName(String shortname)
	{
	this.documentShortName=shortname;
	}
	
	public void setFormatCode(String code)
	{
		this.formatCode=code;
	}
	
	public String toString() 
    {
       return documentFullName+","+documentShortName+","+documentDescription+","+templateid+","
    +formatCode+","+parentTemplateId;
    }
}
