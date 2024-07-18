
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FoliosBancario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FoliosBancario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolioBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoliosBancario", propOrder = {
    "folioBanco"
})
public class FoliosBancario {

    @XmlElement(name = "FolioBanco")
    protected String folioBanco;

    /**
     * Obtiene el valor de la propiedad folioBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioBanco() {
        return folioBanco;
    }

    /**
     * Define el valor de la propiedad folioBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioBanco(String value) {
        this.folioBanco = value;
    }

}
