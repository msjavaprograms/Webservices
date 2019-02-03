/*
 * XML Type:  EmployeeProfile
 * Namespace: http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd
 * Java type: com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile
 *
 * Automatically generated - do not modify.
 */
package com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd;


/**
 * An XML EmployeeProfile(@http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd).
 *
 * This is a complex type.
 */
public interface EmployeeProfile extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmployeeProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s958F483A44D783B5442E3F9B27A106EC").resolveHandle("employeeprofile800atype");
    
    /**
     * Gets the "userName" element
     */
    java.lang.String getUserName();
    
    /**
     * Gets (as xml) the "userName" element
     */
    org.apache.xmlbeans.XmlString xgetUserName();
    
    /**
     * True if has "userName" element
     */
    boolean isSetUserName();
    
    /**
     * Sets the "userName" element
     */
    void setUserName(java.lang.String userName);
    
    /**
     * Sets (as xml) the "userName" element
     */
    void xsetUserName(org.apache.xmlbeans.XmlString userName);
    
    /**
     * Unsets the "userName" element
     */
    void unsetUserName();
    
    /**
     * Gets the "email" element
     */
    java.lang.String getEmail();
    
    /**
     * Gets (as xml) the "email" element
     */
    org.apache.xmlbeans.XmlString xgetEmail();
    
    /**
     * True if has "email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "email" element
     */
    void setEmail(java.lang.String email);
    
    /**
     * Sets (as xml) the "email" element
     */
    void xsetEmail(org.apache.xmlbeans.XmlString email);
    
    /**
     * Unsets the "email" element
     */
    void unsetEmail();
    
    /**
     * Gets the "address" element
     */
    com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address getAddress();
    
    /**
     * True if has "address" element
     */
    boolean isSetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address address);
    
    /**
     * Appends and returns a new empty "address" element
     */
    com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address addNewAddress();
    
    /**
     * Unsets the "address" element
     */
    void unsetAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile newInstance() {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
