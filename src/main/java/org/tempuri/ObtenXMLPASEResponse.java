
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObtenXMLPASEResult" type="{http://tempuri.org/}XMLCFDIResponsePASE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obtenXMLPASEResult"
})
@XmlRootElement(name = "ObtenXMLPASEResponse")
public class ObtenXMLPASEResponse {

    @XmlElement(name = "ObtenXMLPASEResult")
    protected XMLCFDIResponsePASE obtenXMLPASEResult;

    /**
     * Obtiene el valor de la propiedad obtenXMLPASEResult.
     * 
     * @return
     *     possible object is
     *     {@link XMLCFDIResponsePASE }
     *     
     */
    public XMLCFDIResponsePASE getObtenXMLPASEResult() {
        return obtenXMLPASEResult;
    }

    /**
     * Define el valor de la propiedad obtenXMLPASEResult.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLCFDIResponsePASE }
     *     
     */
    public void setObtenXMLPASEResult(XMLCFDIResponsePASE value) {
        this.obtenXMLPASEResult = value;
    }

}
