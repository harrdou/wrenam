//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.13 at 09:39:08 AM EDT 
//


package com.sun.identity.saml2.jaxb.metadataui;


/**
 * Java content class for KeywordsType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Users/Doug/Work/OpenAM10/products/federation/library/xsd/saml2/sstc-saml-metadata-ui-v1.0.xsd line 58)
 * <p>
 * <pre>
 * &lt;complexType name="KeywordsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:oasis:names:tc:SAML:metadata:ui>listOfStrings">
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface KeywordsType {


    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLang();

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLang(java.lang.String value);

    /**
     * Gets the value of the Value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String}
     * 
     */
    java.util.List getValue();

}
