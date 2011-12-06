/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 *
 * @author ASUS
 */
public class Invoice implements Payable {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Integer partNumber;
    private String partDescription;
    private Integer quantity;
    private Double pricePerItem;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">

    public Invoice(String Description, int Number, int Quantity, double ItemPrice) throws InvalidValue
    {
        setPartDescription(Description);
        setPartNumber(Number);
        setPricePerItem(ItemPrice);
        setQuantity(Quantity);
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Getters and Setters">
    
    public final String getPartDescription() {
        return partDescription;
    }

    public final void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public final Integer getPartNumber() {
        return partNumber;
    }

    public final void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public final Double getPricePerItem() {
        return pricePerItem;
    }

    public final void setPricePerItem(Double pricePerItem) throws InvalidValue {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            throw new InvalidValue("Price cannot be negaitive");
    }

    public final Integer getQuantity() {
        return quantity;
    }

    public final void setQuantity(Integer quantity) throws InvalidValue {
        if (quantity > 0)
            this.quantity = quantity;
        else
            throw new InvalidValue("Quantity cannot be negative");
    }
    
// </editor-fold>
    
    public @Override String toString()
    {
        String Temp = "Invoice"
                    + "\nPart: " + partNumber + " (" + partDescription + ')'
                    + "\nQuantity: " + quantity
                    + "\nPrice Per Item: " + pricePerItem;
        return Temp;
    }
    
    public @Override Double getPaymentAmount()
    {
        return quantity * pricePerItem;
    }
    
}
