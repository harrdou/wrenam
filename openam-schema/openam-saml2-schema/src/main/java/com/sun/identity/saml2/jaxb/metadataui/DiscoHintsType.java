//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.13 at 09:39:08 AM EDT 
//


package com.sun.identity.saml2.jaxb.metadataui;


/**
 * Java content class for DiscoHintsType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Users/Doug/Work/OpenAM10/products/federation/library/xsd/saml2/sstc-saml-metadata-ui-v1.0.xsd line 82)
 * <p>
 * <pre>
 * &lt;complexType name="DiscoHintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:oasis:names:tc:SAML:metadata:ui}IPHint"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:metadata:ui}DomainHint"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:metadata:ui}GeolocationHint"/>
 *         &lt;any/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface DiscoHintsType {


    /**
     * Gets the value of the IPHintOrDomainHintOrGeolocationHint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the IPHintOrDomainHintOrGeolocationHint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPHintOrDomainHintOrGeolocationHint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.saml2.jaxb.metadataui.GeolocationHintElement}
     * {@link com.sun.identity.saml2.jaxb.metadataui.DomainHintElement}
     * {@link java.lang.Object}
     * {@link com.sun.identity.saml2.jaxb.metadataui.IPHintElement}
     * 
     */
    java.util.List getIPHintOrDomainHintOrGeolocationHint();

}