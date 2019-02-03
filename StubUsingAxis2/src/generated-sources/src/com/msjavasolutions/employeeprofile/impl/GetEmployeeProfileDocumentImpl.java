/*
 * An XML document type.
 * Localname: GetEmployeeProfile
 * Namespace: http://msjavasolutions.com/employeeProfile
 * Java type: com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument
 *
 * Automatically generated - do not modify.
 */
package com.msjavasolutions.employeeprofile.impl;
/**
 * A document containing one GetEmployeeProfile(@http://msjavasolutions.com/employeeProfile) element.
 *
 * This is a complex type.
 */
public class GetEmployeeProfileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument
{
    
    public GetEmployeeProfileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEMPLOYEEPROFILE$0 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile", "GetEmployeeProfile");
    
    
    /**
     * Gets the "GetEmployeeProfile" element
     */
    public com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile getGetEmployeeProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile target = null;
            target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile)get_store().find_element_user(GETEMPLOYEEPROFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetEmployeeProfile" element
     */
    public void setGetEmployeeProfile(com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile getEmployeeProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile target = null;
            target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile)get_store().find_element_user(GETEMPLOYEEPROFILE$0, 0);
            if (target == null)
            {
                target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile)get_store().add_element_user(GETEMPLOYEEPROFILE$0);
            }
            target.set(getEmployeeProfile);
        }
    }
    
    /**
     * Appends and returns a new empty "GetEmployeeProfile" element
     */
    public com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile addNewGetEmployeeProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile target = null;
            target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile)get_store().add_element_user(GETEMPLOYEEPROFILE$0);
            return target;
        }
    }
    /**
     * An XML GetEmployeeProfile(@http://msjavasolutions.com/employeeProfile).
     *
     * This is a complex type.
     */
    public static class GetEmployeeProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msjavasolutions.employeeprofile.GetEmployeeProfileDocument.GetEmployeeProfile
    {
        
        public GetEmployeeProfileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMPLOYEENAME$0 = 
            new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile", "employeeName");
        
        
        /**
         * Gets the "employeeName" element
         */
        public java.lang.String getEmployeeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEENAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "employeeName" element
         */
        public org.apache.xmlbeans.XmlString xgetEmployeeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYEENAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "employeeName" element
         */
        public void setEmployeeName(java.lang.String employeeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYEENAME$0);
                }
                target.setStringValue(employeeName);
            }
        }
        
        /**
         * Sets (as xml) the "employeeName" element
         */
        public void xsetEmployeeName(org.apache.xmlbeans.XmlString employeeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYEENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYEENAME$0);
                }
                target.set(employeeName);
            }
        }
    }
}
