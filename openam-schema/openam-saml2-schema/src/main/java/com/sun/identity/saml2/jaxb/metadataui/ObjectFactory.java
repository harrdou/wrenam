//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.13 at 09:39:08 AM EDT 
//


package com.sun.identity.saml2.jaxb.metadataui;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.saml2.jaxb.metadataui package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(21, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.saml2.jaxb.assertion.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.saml2.jaxb.assertion.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.saml2.jaxb.metadataui.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.metadataui.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.DescriptionElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.DescriptionElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.DomainHintElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.DomainHintElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.UIInfoElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.UIInfoElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.UIInfoType.class), "com.sun.identity.saml2.jaxb.metadataui.impl.UIInfoTypeImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.PrivacyStatementURLElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.PrivacyStatementURLElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.DiscoHintsType.class), "com.sun.identity.saml2.jaxb.metadataui.impl.DiscoHintsTypeImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.IPHintElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.IPHintElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.LogoElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.LogoElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.InformationURLElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.InformationURLElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.DiscoHintsElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.DiscoHintsElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.KeywordsType.class), "com.sun.identity.saml2.jaxb.metadataui.impl.KeywordsTypeImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.GeolocationHintElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.GeolocationHintElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.DisplayNameElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.DisplayNameElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.KeywordsElement.class), "com.sun.identity.saml2.jaxb.metadataui.impl.KeywordsElementImpl");
        defaultImplementations.put((com.sun.identity.saml2.jaxb.metadataui.LogoType.class), "com.sun.identity.saml2.jaxb.metadataui.impl.LogoTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "PrivacyStatementURL"), (com.sun.identity.saml2.jaxb.metadataui.PrivacyStatementURLElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "IPHint"), (com.sun.identity.saml2.jaxb.metadataui.IPHintElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "DiscoHints"), (com.sun.identity.saml2.jaxb.metadataui.DiscoHintsElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "Logo"), (com.sun.identity.saml2.jaxb.metadataui.LogoElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "GeolocationHint"), (com.sun.identity.saml2.jaxb.metadataui.GeolocationHintElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "UIInfo"), (com.sun.identity.saml2.jaxb.metadataui.UIInfoElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "Description"), (com.sun.identity.saml2.jaxb.metadataui.DescriptionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "DisplayName"), (com.sun.identity.saml2.jaxb.metadataui.DisplayNameElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "Keywords"), (com.sun.identity.saml2.jaxb.metadataui.KeywordsElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "DomainHint"), (com.sun.identity.saml2.jaxb.metadataui.DomainHintElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:metadata:ui", "InformationURL"), (com.sun.identity.saml2.jaxb.metadataui.InformationURLElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.saml2.jaxb.metadataui
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of DescriptionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.DescriptionElement createDescriptionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.DescriptionElementImpl();
    }

    /**
     * Create an instance of DomainHintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.DomainHintElement createDomainHintElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.DomainHintElementImpl();
    }

    /**
     * Create an instance of DomainHintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.DomainHintElement createDomainHintElement(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.DomainHintElementImpl(value);
    }

    /**
     * Create an instance of UIInfoElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.UIInfoElement createUIInfoElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.UIInfoElementImpl();
    }

    /**
     * Create an instance of UIInfoType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.UIInfoType createUIInfoType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.UIInfoTypeImpl();
    }

    /**
     * Create an instance of PrivacyStatementURLElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.PrivacyStatementURLElement createPrivacyStatementURLElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.PrivacyStatementURLElementImpl();
    }

    /**
     * Create an instance of DiscoHintsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.DiscoHintsType createDiscoHintsType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.DiscoHintsTypeImpl();
    }

    /**
     * Create an instance of IPHintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.IPHintElement createIPHintElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.IPHintElementImpl();
    }

    /**
     * Create an instance of IPHintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.IPHintElement createIPHintElement(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.IPHintElementImpl(value);
    }

    /**
     * Create an instance of LogoElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.LogoElement createLogoElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.LogoElementImpl();
    }

    /**
     * Create an instance of InformationURLElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.InformationURLElement createInformationURLElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.InformationURLElementImpl();
    }

    /**
     * Create an instance of DiscoHintsElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.DiscoHintsElement createDiscoHintsElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.DiscoHintsElementImpl();
    }

    /**
     * Create an instance of KeywordsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.KeywordsType createKeywordsType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.KeywordsTypeImpl();
    }

    /**
     * Create an instance of GeolocationHintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.GeolocationHintElement createGeolocationHintElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.GeolocationHintElementImpl();
    }

    /**
     * Create an instance of GeolocationHintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.GeolocationHintElement createGeolocationHintElement(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.GeolocationHintElementImpl(value);
    }

    /**
     * Create an instance of DisplayNameElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.DisplayNameElement createDisplayNameElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.DisplayNameElementImpl();
    }

    /**
     * Create an instance of KeywordsElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.KeywordsElement createKeywordsElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.KeywordsElementImpl();
    }

    /**
     * Create an instance of LogoType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.metadataui.LogoType createLogoType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.metadataui.impl.LogoTypeImpl();
    }

}
