/*
 * XML Type:  Address
 * Namespace: http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd
 * Java type: com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address
 *
 * Automatically generated - do not modify.
 */
package com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd;


/**
 * An XML Address(@http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd).
 *
 * This is a complex type.
 */
public interface Address extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Address.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s958F483A44D783B5442E3F9B27A106EC").resolveHandle("address1923type");
    
    /**
     * Gets the "streetAddress" element
     */
    java.lang.String getStreetAddress();
    
    /**
     * Gets (as xml) the "streetAddress" element
     */
    org.apache.xmlbeans.XmlString xgetStreetAddress();
    
    /**
     * Sets the "streetAddress" element
     */
    void setStreetAddress(java.lang.String streetAddress);
    
    /**
     * Sets (as xml) the "streetAddress" element
     */
    void xsetStreetAddress(org.apache.xmlbeans.XmlString streetAddress);
    
    /**
     * Gets the "city" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "city" element
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * Sets the "city" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "city" element
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Gets the "state" element
     */
    java.lang.String getState();
    
    /**
     * Gets (as xml) the "state" element
     */
    org.apache.xmlbeans.XmlString xgetState();
    
    /**
     * Sets the "state" element
     */
    void setState(java.lang.String state);
    
    /**
     * Sets (as xml) the "state" element
     */
    void xsetState(org.apache.xmlbeans.XmlString state);
    
    /**
     * Gets the "country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * Sets the "country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Gets the "zipcode" element
     */
    java.lang.String getZipcode();
    
    /**
     * Gets (as xml) the "zipcode" element
     */
    org.apache.xmlbeans.XmlString xgetZipcode();
    
    /**
     * Sets the "zipcode" element
     */
    void setZipcode(java.lang.String zipcode);
    
    /**
     * Sets (as xml) the "zipcode" element
     */
    void xsetZipcode(org.apache.xmlbeans.XmlString zipcode);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address newInstance() {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
