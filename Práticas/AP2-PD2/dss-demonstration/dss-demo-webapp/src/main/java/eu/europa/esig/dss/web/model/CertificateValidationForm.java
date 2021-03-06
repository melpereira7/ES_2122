package eu.europa.esig.dss.web.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.springframework.web.multipart.MultipartFile;

public class CertificateValidationForm {

	private Date validationTime;

	private CertificateForm certificateForm;

	private List<MultipartFile> certificateChainFiles;

	private boolean includeCertificateTokens;

	private boolean includeRevocationTokens;

	public Date getValidationTime() {
		return validationTime;
	}

	public void setValidationTime(Date validationTime) {
		this.validationTime = validationTime;
	}

	public CertificateForm getCertificateForm() {
		return certificateForm;
	}

	public void setCertificateForm(CertificateForm certificateForm) {
		this.certificateForm = certificateForm;
	}

	public List<MultipartFile> getCertificateChainFiles() {
		return certificateChainFiles;
	}

	public void setCertificateChainFiles(List<MultipartFile> certificateChainFiles) {
		this.certificateChainFiles = certificateChainFiles;
	}

	public boolean isIncludeCertificateTokens() {
		return includeCertificateTokens;
	}

	public void setIncludeCertificateTokens(boolean includeCertificateTokens) {
		this.includeCertificateTokens = includeCertificateTokens;
	}

	public boolean isIncludeRevocationTokens() {
		return includeRevocationTokens;
	}

	public void setIncludeRevocationTokens(boolean includeRevocationTokens) {
		this.includeRevocationTokens = includeRevocationTokens;
	}

	@AssertTrue(message = "{error.certificate.invalid}")
	public boolean isCertificateFormValid() {
		return certificateForm != null && certificateForm.isValid();
	}

}
