/*
 * An XML document type.
 * Localname: GetEmployeeProfile
 * Namespace: http://msjavasolutions.com/employeeProfile
 * Java type: com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument
 *
 * Automatically generated - do not modify.
 */
package com.msjavasolutions.employeeprofile;


/**
 * A document containing one GetEmployeeProfile(@http://msjavasolutions.com/employeeProfile) element.
 *
 * This is a complex type.
 */
public interface GetEmployeeProfileDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployeeProfileDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s958F483A44D783B5442E3F9B27A106EC").resolveHandle("getemployeeprofile69e1doctype");
    
    /**
     * Gets the "GetEmployeeProfile" element
     */
    com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile getGetEmployeeProfile();
    
    /**
     * Sets the "GetEmployeeProfile" element
     */
    void setGetEmployeeProfile(com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile getEmployeeProfile);
    
    /**
     * Appends and returns a new empty "GetEmployeeProfile" element
     */
    com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile addNewGetEmployeeProfile();
    
    /**
     * An XML GetEmployeeProfile(@http://msjavasolutions.com/employeeProfile).
     *
     * This is a complex type.
     */
    public interface GetEmployeeProfile extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetEmployeeProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s958F483A44D783B5442E3F9B27A106EC").resolveHandle("getemployeeprofile7d82elemtype");
        
        /**
         * Gets the "employeeName" element
         */
        java.lang.String getEmployeeName();
        
        /**
         * Gets (as xml) the "employeeName" element
         */
        org.apache.xmlbeans.XmlString xgetEmployeeName();
        
        /**
         * Sets the "employeeName" element
         */
        void setEmployeeName(java.lang.String employeeName);
        
        /**
         * Sets (as xml) the "employeeName" element
         */
        void xsetEmployeeName(org.apache.xmlbeans.XmlString employeeName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile newInstance() {
              return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument newInstance() {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
