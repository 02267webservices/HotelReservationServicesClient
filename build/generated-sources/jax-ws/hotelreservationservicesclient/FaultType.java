
package hotelreservationservicesclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditcardInfo" type="{http://HotelReservationServices}CreditcardInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faultType", propOrder = {
    "creditcardInfo"
})
public class FaultType {

    @XmlElement(required = true)
    protected CreditcardInformationType creditcardInfo;

    /**
     * Gets the value of the creditcardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditcardInformationType }
     *     
     */
    public CreditcardInformationType getCreditcardInfo() {
        return creditcardInfo;
    }

    /**
     * Sets the value of the creditcardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditcardInformationType }
     *     
     */
    public void setCreditcardInfo(CreditcardInformationType value) {
        this.creditcardInfo = value;
    }

}
