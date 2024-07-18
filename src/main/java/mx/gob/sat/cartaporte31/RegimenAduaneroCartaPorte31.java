
package mx.gob.sat.cartaporte31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegimenAduaneroCartaPorte31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegimenAduaneroCartaPorte31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="RegimenAduanero" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegimenAduaneroCartaPorte31")
public class RegimenAduaneroCartaPorte31 {

    @XmlAttribute(name = "RegimenAduanero")
    protected String regimenAduanero;

    /**
     * Obtiene el valor de la propiedad regimenAduanero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenAduanero() {
        return regimenAduanero;
    }

    /**
     * Define el valor de la propiedad regimenAduanero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenAduanero(String value) {
        this.regimenAduanero = value;
    }

}
