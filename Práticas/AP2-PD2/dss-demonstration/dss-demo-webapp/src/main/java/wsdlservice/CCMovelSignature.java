
package wsdlservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 *
 */
@WebService(name = "CCMovelSignature", targetNamespace = "http://Ama.Authentication.Service/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface CCMovelSignature {


    /**
     *
     * @param request
     * @return
     *     returns wsdlservice.SignStatus
     */
    @WebMethod(operationName = "CCMovelSign", action = "http://Ama.Authentication.Service/CCMovelSignature/CCMovelSign")
    @WebResult(name = "CCMovelSignResult", targetNamespace = "http://Ama.Authentication.Service/")
    @RequestWrapper(localName = "CCMovelSign", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.CCMovelSign")
    @ResponseWrapper(localName = "CCMovelSignResponse", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.CCMovelSignResponse")
    public SignStatus ccMovelSign(
            @WebParam(name = "request", targetNamespace = "http://Ama.Authentication.Service/")
            SignRequest request);

    /**
     *
     * @param applicationId
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCertificate", action = "http://Ama.Authentication.Service/CCMovelSignature/GetCertificate")
    @WebResult(name = "GetCertificateResult", targetNamespace = "http://Ama.Authentication.Service/")
    @RequestWrapper(localName = "GetCertificate", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.GetCertificate")
    @ResponseWrapper(localName = "GetCertificateResponse", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.GetCertificateResponse")
    public String getCertificate(
            @WebParam(name = "applicationId", targetNamespace = "http://Ama.Authentication.Service/")
            byte[] applicationId,
            @WebParam(name = "userId", targetNamespace = "http://Ama.Authentication.Service/")
            String userId);

    /**
     *
     * @param code
     * @param processId
     * @param applicationId
     * @return
     *     returns wsdlservice.SignResponse
     */
    @WebMethod(operationName = "ValidateOtp", action = "http://Ama.Authentication.Service/CCMovelSignature/ValidateOtp")
    @WebResult(name = "ValidateOtpResult", targetNamespace = "http://Ama.Authentication.Service/")
    @RequestWrapper(localName = "ValidateOtp", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.ValidateOtp")
    @ResponseWrapper(localName = "ValidateOtpResponse", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.ValidateOtpResponse")
    public SignResponse validateOtp(
            @WebParam(name = "code", targetNamespace = "http://Ama.Authentication.Service/")
            String code,
            @WebParam(name = "processId", targetNamespace = "http://Ama.Authentication.Service/")
            String processId,
            @WebParam(name = "applicationId", targetNamespace = "http://Ama.Authentication.Service/")
            byte[] applicationId);

    /**
     *
     * @param request
     * @param documents
     * @return
     *     returns wsdlservice.SignStatus
     */
    @WebMethod(operationName = "CCMovelMultipleSign", action = "http://Ama.Authentication.Service/CCMovelSignature/CCMovelMultipleSign")
    @WebResult(name = "CCMovelMultipleSignResult", targetNamespace = "http://Ama.Authentication.Service/")
    @RequestWrapper(localName = "CCMovelMultipleSign", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.CCMovelMultipleSign")
    @ResponseWrapper(localName = "CCMovelMultipleSignResponse", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.CCMovelMultipleSignResponse")
    public SignStatus ccMovelMultipleSign(
            @WebParam(name = "request", targetNamespace = "http://Ama.Authentication.Service/")
            MultipleSignRequest request,
            @WebParam(name = "documents", targetNamespace = "http://Ama.Authentication.Service/")
            ArrayOfHashStructure documents);

    /**
     *
     * @param processId
     * @param citizenId
     * @param applicationId
     * @return
     *     returns wsdlservice.SignStatus
     */
    @WebMethod(operationName = "ForceSMS", action = "http://Ama.Authentication.Service/CCMovelSignature/ForceSMS")
    @WebResult(name = "ForceSMSResult", targetNamespace = "http://Ama.Authentication.Service/")
    @RequestWrapper(localName = "ForceSMS", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.ForceSMS")
    @ResponseWrapper(localName = "ForceSMSResponse", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.ForceSMSResponse")
    public SignStatus forceSMS(
            @WebParam(name = "processId", targetNamespace = "http://Ama.Authentication.Service/")
            String processId,
            @WebParam(name = "citizenId", targetNamespace = "http://Ama.Authentication.Service/")
            String citizenId,
            @WebParam(name = "applicationId", targetNamespace = "http://Ama.Authentication.Service/")
            byte[] applicationId);

    /**
     *
     * @param applicationId
     * @param userId
     * @param signaturePin
     * @return
     *     returns wsdlservice.SignStatus
     */
    @WebMethod(operationName = "GetCertificateWithPin", action = "http://Ama.Authentication.Service/CCMovelSignature/GetCertificateWithPin")
    @WebResult(name = "GetCertificateWithPinResult", targetNamespace = "http://Ama.Authentication.Service/")
    @RequestWrapper(localName = "GetCertificateWithPin", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.GetCertificateWithPin")
    @ResponseWrapper(localName = "GetCertificateWithPinResponse", targetNamespace = "http://Ama.Authentication.Service/", className = "wsdlservice.GetCertificateWithPinResponse")
    public SignStatus getCertificateWithPin(
            @WebParam(name = "applicationId", targetNamespace = "http://Ama.Authentication.Service/")
            byte[] applicationId,
            @WebParam(name = "userId", targetNamespace = "http://Ama.Authentication.Service/")
            String userId,
            @WebParam(name = "signaturePin", targetNamespace = "http://Ama.Authentication.Service/")
            String signaturePin);

}
