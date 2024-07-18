
package mx.gob.sat.cartaporte31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemolquesCCPCartaPorte31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemolquesCCPCartaPorte31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemolqueCCP" type="{http://www.sat.gob.mx/CartaPorte31}RemolqueCCPCartaPorte31" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemolquesCCPCartaPorte31", propOrder = {
    "remolqueCCP"
})
public class RemolquesCCPCartaPorte31 {

    @XmlElement(name = "RemolqueCCP")
    protected List<RemolqueCCPCartaPorte31> remolqueCCP;

    /**
     * Gets the value of the remolqueCCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remolqueCCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemolqueCCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemolqueCCPCartaPorte31 }
     * 
     * 
     */
    public List<RemolqueCCPCartaPorte31> getRemolqueCCP() {
        if (remolqueCCP == null) {
            remolqueCCP = new ArrayList<RemolqueCCPCartaPorte31>();
        }
        return this.remolqueCCP;
    }

}
