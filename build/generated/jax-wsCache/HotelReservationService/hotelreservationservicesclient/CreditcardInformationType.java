
package hotelreservationservicesclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditcardInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditcardInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditcardInformationType", propOrder = {
    "name",
    "number",
    "expirationMonth",
    "expirationYear"
})
public class CreditcardInformationType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Number")
    protected float number;
    @XmlElement(name = "ExpirationMonth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationMonth;
    @XmlElement(name = "ExpirationYear", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationYear;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public float getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(float value) {
        this.number = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationMonth(XMLGregorianCalendar value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationYear(XMLGregorianCalendar value) {
        this.expirationYear = value;
    }

}
