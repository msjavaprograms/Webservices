/*
 * An XML document type.
 * Localname: GetEmployeeProfileResponse
 * Namespace: http://msjavasolutions.com/employeeProfile
 * Java type: com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msjavasolutions.employeeprofile.impl;
/**
 * A document containing one GetEmployeeProfileResponse(@http://msjavasolutions.com/employeeProfile) element.
 *
 * This is a complex type.
 */
public class GetEmployeeProfileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument
{
    
    public GetEmployeeProfileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEMPLOYEEPROFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile", "GetEmployeeProfileResponse");
    
    
    /**
     * Gets the "GetEmployeeProfileResponse" element
     */
    public com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse getGetEmployeeProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse target = null;
            target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse)get_store().find_element_user(GETEMPLOYEEPROFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetEmployeeProfileResponse" element
     */
    public void setGetEmployeeProfileResponse(com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse getEmployeeProfileResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse target = null;
            target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse)get_store().find_element_user(GETEMPLOYEEPROFILERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse)get_store().add_element_user(GETEMPLOYEEPROFILERESPONSE$0);
            }
            target.set(getEmployeeProfileResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetEmployeeProfileResponse" element
     */
    public com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse addNewGetEmployeeProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse target = null;
            target = (com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse)get_store().add_element_user(GETEMPLOYEEPROFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetEmployeeProfileResponse(@http://msjavasolutions.com/employeeProfile).
     *
     * This is a complex type.
     */
    public static class GetEmployeeProfileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msjavasolutions.employeeprofile.GetEmployeeProfileResponseDocument.GetEmployeeProfileResponse
    {
        
        public GetEmployeeProfileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMPLOYEEPROFILE$0 = 
            new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile", "EmployeeProfile");
        
        
        /**
         * Gets the "EmployeeProfile" element
         */
        public com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile getEmployeeProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile target = null;
                target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile)get_store().find_element_user(EMPLOYEEPROFILE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "EmployeeProfile" element
         */
        public void setEmployeeProfile(com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile employeeProfile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile target = null;
                target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile)get_store().find_element_user(EMPLOYEEPROFILE$0, 0);
                if (target == null)
                {
                    target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile)get_store().add_element_user(EMPLOYEEPROFILE$0);
                }
                target.set(employeeProfile);
            }
        }
        
        /**
         * Appends and returns a new empty "EmployeeProfile" element
         */
        public com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile addNewEmployeeProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile target = null;
                target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile)get_store().add_element_user(EMPLOYEEPROFILE$0);
                return target;
            }
        }
    }
}
