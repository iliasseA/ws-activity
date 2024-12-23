
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour convertToDH complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="convertToDH">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="montantEuro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convertToDH", propOrder = {
    "montantEuro"
})
public class ConvertToDH {

    protected double montantEuro;

    /**
     * Obtient la valeur de la propriété montantEuro.
     * 
     */
    public double getMontantEuro() {
        return montantEuro;
    }

    /**
     * Définit la valeur de la propriété montantEuro.
     * 
     */
    public void setMontantEuro(double value) {
        this.montantEuro = value;
    }

}
