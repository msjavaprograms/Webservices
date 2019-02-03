/*
 * XML Type:  EmployeeProfile
 * Namespace: http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd
 * Java type: com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile
 *
 * Automatically generated - do not modify.
 */
package com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.impl;
/**
 * An XML EmployeeProfile(@http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd).
 *
 * This is a complex type.
 */
public class EmployeeProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.EmployeeProfile
{
    
    public EmployeeProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "userName");
    private static final javax.xml.namespace.QName EMAIL$2 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "email");
    private static final javax.xml.namespace.QName ADDRESS$4 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "address");
    
    
    /**
     * Gets the "userName" element
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userName" element
     */
    public org.apache.xmlbeans.XmlString xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "userName" element
     */
    public boolean isSetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "userName" element
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "userName" element
     */
    public void xsetUserName(org.apache.xmlbeans.XmlString userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
            }
            target.set(userName);
        }
    }
    
    /**
     * Unsets the "userName" element
     */
    public void unsetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERNAME$0, 0);
        }
    }
    
    /**
     * Gets the "email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$2);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$2);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$2, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address target = null;
            target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address target = null;
            target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address)get_store().find_element_user(ADDRESS$4, 0);
            if (target == null)
            {
                target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address)get_store().add_element_user(ADDRESS$4);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address target = null;
            target = (com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address)get_store().add_element_user(ADDRESS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$4, 0);
        }
    }
}
