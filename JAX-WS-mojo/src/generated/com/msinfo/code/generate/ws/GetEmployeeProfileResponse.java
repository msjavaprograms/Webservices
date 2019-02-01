
package com.msinfo.code.generate.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeProfile" type="{http://msjavasolutions.com/employeeProfile/schema/EmployeeProfile.xsd}EmployeeProfile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeProfile"
})
@XmlRootElement(name = "GetEmployeeProfileResponse")
public class GetEmployeeProfileResponse {

    @XmlElement(name = "EmployeeProfile", required = true)
    protected EmployeeProfile employeeProfile;

    /**
     * Gets the value of the employeeProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeProfile }
     *     
     */
    public EmployeeProfile getEmployeeProfile() {
        return employeeProfile;
    }

    /**
     * Sets the value of the employeeProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeProfile }
     *     
     */
    public void setEmployeeProfile(EmployeeProfile value) {
        this.employeeProfile = value;
    }

}
