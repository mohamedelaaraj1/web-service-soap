
package proxy;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compte complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="compte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="sold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "code",
    "dateCreation",
    "sold"
})
public class Compte {

    protected int code;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    protected double sold;

    /**
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the value of the dateCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreation() {
        return dateCreation;
    }

    /**
     * Sets the value of the dateCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreation(XMLGregorianCalendar value) {
        this.dateCreation = value;
    }

    /**
     * Gets the value of the sold property.
     * 
     */
    public double getSold() {
        return sold;
    }

    /**
     * Sets the value of the sold property.
     * 
     */
    public void setSold(double value) {
        this.sold = value;
    }

}
