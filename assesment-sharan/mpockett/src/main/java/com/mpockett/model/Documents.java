package com.mpockett.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Documents {
	@Column(length = 30)
	private String documentName;
	@Id
	@GeneratedValue(generator = "docs_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="docs_gen",sequenceName = "docs_seq",initialValue = 10,allocationSize = 1)
	private Integer documentId;
	public Documents() {
		super();
	}
	public Documents(String documentName) {
		super();
		this.documentName = documentName;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public Integer getDocumentId() {
		return documentId;
	}
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}
	@Override
	public String toString() {
		return "Documents [documentName=" + documentName + ", documentId=" + documentId + "]";
	}
	
	
	
	
}