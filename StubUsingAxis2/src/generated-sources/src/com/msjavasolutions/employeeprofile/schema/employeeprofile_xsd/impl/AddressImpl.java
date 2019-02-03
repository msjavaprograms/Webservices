/*
 * XML Type:  Address
 * Namespace: http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd
 * Java type: com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address
 *
 * Automatically generated - do not modify.
 */
package com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.impl;
/**
 * An XML Address(@http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd).
 *
 * This is a complex type.
 */
public class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msjavasolutions.employeeprofile.schema.employeeprofile_xsd.Address
{
    
    public AddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETADDRESS$0 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "streetAddress");
    private static final javax.xml.namespace.QName CITY$2 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "city");
    private static final javax.xml.namespace.QName STATE$4 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "state");
    private static final javax.xml.namespace.QName COUNTRY$6 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "country");
    private static final javax.xml.namespace.QName ZIPCODE$8 = 
        new javax.xml.namespace.QName("http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd", "zipcode");
    
    
    /**
     * Gets the "streetAddress" element
     */
    public java.lang.String getStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "streetAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetStreetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "streetAddress" element
     */
    public void setStreetAddress(java.lang.String streetAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREETADDRESS$0);
            }
            target.setStringValue(streetAddress);
        }
    }
    
    /**
     * Sets (as xml) the "streetAddress" element
     */
    public void xsetStreetAddress(org.apache.xmlbeans.XmlString streetAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREETADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREETADDRESS$0);
            }
            target.set(streetAddress);
        }
    }
    
    /**
     * Gets the "city" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "city" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "city" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$2);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "city" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$2);
            }
            target.set(city);
        }
    }
    
    /**
     * Gets the "state" element
     */
    public java.lang.String getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" element
     */
    public org.apache.xmlbeans.XmlString xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "state" element
     */
    public void setState(java.lang.String state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$4);
            }
            target.setStringValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" element
     */
    public void xsetState(org.apache.xmlbeans.XmlString state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$4);
            }
            target.set(state);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$6);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$6);
            }
            target.set(country);
        }
    }
    
    /**
     * Gets the "zipcode" element
     */
    public java.lang.String getZipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "zipcode" element
     */
    public org.apache.xmlbeans.XmlString xgetZipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "zipcode" element
     */
    public void setZipcode(java.lang.String zipcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$8);
            }
            target.setStringValue(zipcode);
        }
    }
    
    /**
     * Sets (as xml) the "zipcode" element
     */
    public void xsetZipcode(org.apache.xmlbeans.XmlString zipcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$8);
            }
            target.set(zipcode);
        }
    }
}
