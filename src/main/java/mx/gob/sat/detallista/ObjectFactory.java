
package mx.gob.sat.detallista;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.sat.detallista package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DetallistaShipToNameAndAddressCity_QNAME = new QName("http://www.sat.gob.mx/detallista", "city");
    private final static QName _DetallistaShipToNameAndAddressName_QNAME = new QName("http://www.sat.gob.mx/detallista", "name");
    private final static QName _DetallistaShipToNameAndAddressPostalCode_QNAME = new QName("http://www.sat.gob.mx/detallista", "postalCode");
    private final static QName _DetallistaShipToNameAndAddressStreetAddressOne_QNAME = new QName("http://www.sat.gob.mx/detallista", "streetAddressOne");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.sat.detallista
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDetallistaLineItemLotNumber }
     * 
     */
    public ArrayOfDetallistaLineItemLotNumber createArrayOfDetallistaLineItemLotNumber() {
        return new ArrayOfDetallistaLineItemLotNumber();
    }

    /**
     * Create an instance of {@link ArrayOfDetallistaReferenceIdentification }
     * 
     */
    public ArrayOfDetallistaReferenceIdentification createArrayOfDetallistaReferenceIdentification() {
        return new ArrayOfDetallistaReferenceIdentification();
    }

    /**
     * Create an instance of {@link Detallista }
     * 
     */
    public Detallista createDetallista() {
        return new Detallista();
    }

    /**
     * Create an instance of {@link Detallista.LineItem }
     * 
     */
    public Detallista.LineItem createDetallistaLineItem() {
        return new Detallista.LineItem();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.TotalLineAmount }
     * 
     */
    public Detallista.LineItem.TotalLineAmount createDetallistaLineItemTotalLineAmount() {
        return new Detallista.LineItem.TotalLineAmount();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.TradeItemTaxInformation }
     * 
     */
    public Detallista.LineItem.TradeItemTaxInformation createDetallistaLineItemTradeItemTaxInformation() {
        return new Detallista.LineItem.TradeItemTaxInformation();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.AllowanceCharge }
     * 
     */
    public Detallista.LineItem.AllowanceCharge createDetallistaLineItemAllowanceCharge() {
        return new Detallista.LineItem.AllowanceCharge();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage }
     * 
     */
    public Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage createDetallistaLineItemAllowanceChargeMonetaryAmountOrPercentage() {
        return new Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.PalletInformation }
     * 
     */
    public Detallista.LineItem.PalletInformation createDetallistaLineItemPalletInformation() {
        return new Detallista.LineItem.PalletInformation();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.LogisticUnits }
     * 
     */
    public Detallista.LineItem.LogisticUnits createDetallistaLineItemLogisticUnits() {
        return new Detallista.LineItem.LogisticUnits();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.Customs }
     * 
     */
    public Detallista.LineItem.Customs createDetallistaLineItemCustoms() {
        return new Detallista.LineItem.Customs();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.AdditionalInformation }
     * 
     */
    public Detallista.LineItem.AdditionalInformation createDetallistaLineItemAdditionalInformation() {
        return new Detallista.LineItem.AdditionalInformation();
    }

    /**
     * Create an instance of {@link Detallista.AllowanceCharge }
     * 
     */
    public Detallista.AllowanceCharge createDetallistaAllowanceCharge() {
        return new Detallista.AllowanceCharge();
    }

    /**
     * Create an instance of {@link Detallista.AllowanceCharge.MonetaryAmountOrPercentage }
     * 
     */
    public Detallista.AllowanceCharge.MonetaryAmountOrPercentage createDetallistaAllowanceChargeMonetaryAmountOrPercentage() {
        return new Detallista.AllowanceCharge.MonetaryAmountOrPercentage();
    }

    /**
     * Create an instance of {@link Detallista.PaymentTerms }
     * 
     */
    public Detallista.PaymentTerms createDetallistaPaymentTerms() {
        return new Detallista.PaymentTerms();
    }

    /**
     * Create an instance of {@link Detallista.PaymentTerms.NetPayment }
     * 
     */
    public Detallista.PaymentTerms.NetPayment createDetallistaPaymentTermsNetPayment() {
        return new Detallista.PaymentTerms.NetPayment();
    }

    /**
     * Create an instance of {@link Detallista.PaymentTerms.NetPayment.PaymentTimePeriod }
     * 
     */
    public Detallista.PaymentTerms.NetPayment.PaymentTimePeriod createDetallistaPaymentTermsNetPaymentPaymentTimePeriod() {
        return new Detallista.PaymentTerms.NetPayment.PaymentTimePeriod();
    }

    /**
     * Create an instance of {@link Detallista.InvoiceCreator }
     * 
     */
    public Detallista.InvoiceCreator createDetallistaInvoiceCreator() {
        return new Detallista.InvoiceCreator();
    }

    /**
     * Create an instance of {@link Detallista.ShipTo }
     * 
     */
    public Detallista.ShipTo createDetallistaShipTo() {
        return new Detallista.ShipTo();
    }

    /**
     * Create an instance of {@link Detallista.Seller }
     * 
     */
    public Detallista.Seller createDetallistaSeller() {
        return new Detallista.Seller();
    }

    /**
     * Create an instance of {@link Detallista.Buyer }
     * 
     */
    public Detallista.Buyer createDetallistaBuyer() {
        return new Detallista.Buyer();
    }

    /**
     * Create an instance of {@link Detallista.Buyer.ContactInformation }
     * 
     */
    public Detallista.Buyer.ContactInformation createDetallistaBuyerContactInformation() {
        return new Detallista.Buyer.ContactInformation();
    }

    /**
     * Create an instance of {@link Detallista.OrderIdentification }
     * 
     */
    public Detallista.OrderIdentification createDetallistaOrderIdentification() {
        return new Detallista.OrderIdentification();
    }

    /**
     * Create an instance of {@link ArrayOfDetallistaLineItemLotNumber.LotNumber }
     * 
     */
    public ArrayOfDetallistaLineItemLotNumber.LotNumber createArrayOfDetallistaLineItemLotNumberLotNumber() {
        return new ArrayOfDetallistaLineItemLotNumber.LotNumber();
    }

    /**
     * Create an instance of {@link ArrayOfDetallistaReferenceIdentification.ReferenceIdentification }
     * 
     */
    public ArrayOfDetallistaReferenceIdentification.ReferenceIdentification createArrayOfDetallistaReferenceIdentificationReferenceIdentification() {
        return new ArrayOfDetallistaReferenceIdentification.ReferenceIdentification();
    }

    /**
     * Create an instance of {@link Detallista.RequestForPaymentIdentification }
     * 
     */
    public Detallista.RequestForPaymentIdentification createDetallistaRequestForPaymentIdentification() {
        return new Detallista.RequestForPaymentIdentification();
    }

    /**
     * Create an instance of {@link Detallista.SpecialInstruction }
     * 
     */
    public Detallista.SpecialInstruction createDetallistaSpecialInstruction() {
        return new Detallista.SpecialInstruction();
    }

    /**
     * Create an instance of {@link Detallista.DeliveryNote }
     * 
     */
    public Detallista.DeliveryNote createDetallistaDeliveryNote() {
        return new Detallista.DeliveryNote();
    }

    /**
     * Create an instance of {@link Detallista.Customs }
     * 
     */
    public Detallista.Customs createDetallistaCustoms() {
        return new Detallista.Customs();
    }

    /**
     * Create an instance of {@link Detallista.Currency }
     * 
     */
    public Detallista.Currency createDetallistaCurrency() {
        return new Detallista.Currency();
    }

    /**
     * Create an instance of {@link Detallista.TotalAmount }
     * 
     */
    public Detallista.TotalAmount createDetallistaTotalAmount() {
        return new Detallista.TotalAmount();
    }

    /**
     * Create an instance of {@link Detallista.TotalAllowanceCharge }
     * 
     */
    public Detallista.TotalAllowanceCharge createDetallistaTotalAllowanceCharge() {
        return new Detallista.TotalAllowanceCharge();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.TradeItemIdentification }
     * 
     */
    public Detallista.LineItem.TradeItemIdentification createDetallistaLineItemTradeItemIdentification() {
        return new Detallista.LineItem.TradeItemIdentification();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.AlternateTradeItemIdentification }
     * 
     */
    public Detallista.LineItem.AlternateTradeItemIdentification createDetallistaLineItemAlternateTradeItemIdentification() {
        return new Detallista.LineItem.AlternateTradeItemIdentification();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.TradeItemDescriptionInformation }
     * 
     */
    public Detallista.LineItem.TradeItemDescriptionInformation createDetallistaLineItemTradeItemDescriptionInformation() {
        return new Detallista.LineItem.TradeItemDescriptionInformation();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.InvoicedQuantity }
     * 
     */
    public Detallista.LineItem.InvoicedQuantity createDetallistaLineItemInvoicedQuantity() {
        return new Detallista.LineItem.InvoicedQuantity();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.AditionalQuantity }
     * 
     */
    public Detallista.LineItem.AditionalQuantity createDetallistaLineItemAditionalQuantity() {
        return new Detallista.LineItem.AditionalQuantity();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.GrossPrice }
     * 
     */
    public Detallista.LineItem.GrossPrice createDetallistaLineItemGrossPrice() {
        return new Detallista.LineItem.GrossPrice();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.NetPrice }
     * 
     */
    public Detallista.LineItem.NetPrice createDetallistaLineItemNetPrice() {
        return new Detallista.LineItem.NetPrice();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.TotalLineAmount.GrossAmount }
     * 
     */
    public Detallista.LineItem.TotalLineAmount.GrossAmount createDetallistaLineItemTotalLineAmountGrossAmount() {
        return new Detallista.LineItem.TotalLineAmount.GrossAmount();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.TotalLineAmount.NetAmount }
     * 
     */
    public Detallista.LineItem.TotalLineAmount.NetAmount createDetallistaLineItemTotalLineAmountNetAmount() {
        return new Detallista.LineItem.TotalLineAmount.NetAmount();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount }
     * 
     */
    public Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount createDetallistaLineItemTradeItemTaxInformationTradeItemTaxAmount() {
        return new Detallista.LineItem.TradeItemTaxInformation.TradeItemTaxAmount();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit }
     * 
     */
    public Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit createDetallistaLineItemAllowanceChargeMonetaryAmountOrPercentageRatePerUnit() {
        return new Detallista.LineItem.AllowanceCharge.MonetaryAmountOrPercentage.RatePerUnit();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.PalletInformation.Description }
     * 
     */
    public Detallista.LineItem.PalletInformation.Description createDetallistaLineItemPalletInformationDescription() {
        return new Detallista.LineItem.PalletInformation.Description();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.PalletInformation.Transport }
     * 
     */
    public Detallista.LineItem.PalletInformation.Transport createDetallistaLineItemPalletInformationTransport() {
        return new Detallista.LineItem.PalletInformation.Transport();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.LogisticUnits.SerialShippingContainerCode }
     * 
     */
    public Detallista.LineItem.LogisticUnits.SerialShippingContainerCode createDetallistaLineItemLogisticUnitsSerialShippingContainerCode() {
        return new Detallista.LineItem.LogisticUnits.SerialShippingContainerCode();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.Customs.AlternatePartyIdentification }
     * 
     */
    public Detallista.LineItem.Customs.AlternatePartyIdentification createDetallistaLineItemCustomsAlternatePartyIdentification() {
        return new Detallista.LineItem.Customs.AlternatePartyIdentification();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.Customs.NameAndAddress }
     * 
     */
    public Detallista.LineItem.Customs.NameAndAddress createDetallistaLineItemCustomsNameAndAddress() {
        return new Detallista.LineItem.Customs.NameAndAddress();
    }

    /**
     * Create an instance of {@link Detallista.LineItem.AdditionalInformation.ReferenceIdentification }
     * 
     */
    public Detallista.LineItem.AdditionalInformation.ReferenceIdentification createDetallistaLineItemAdditionalInformationReferenceIdentification() {
        return new Detallista.LineItem.AdditionalInformation.ReferenceIdentification();
    }

    /**
     * Create an instance of {@link Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate }
     * 
     */
    public Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate createDetallistaAllowanceChargeMonetaryAmountOrPercentageRate() {
        return new Detallista.AllowanceCharge.MonetaryAmountOrPercentage.Rate();
    }

    /**
     * Create an instance of {@link Detallista.PaymentTerms.DiscountPayment }
     * 
     */
    public Detallista.PaymentTerms.DiscountPayment createDetallistaPaymentTermsDiscountPayment() {
        return new Detallista.PaymentTerms.DiscountPayment();
    }

    /**
     * Create an instance of {@link Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue }
     * 
     */
    public Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue createDetallistaPaymentTermsNetPaymentPaymentTimePeriodTimePeriodDue() {
        return new Detallista.PaymentTerms.NetPayment.PaymentTimePeriod.TimePeriodDue();
    }

    /**
     * Create an instance of {@link Detallista.InvoiceCreator.AlternatePartyIdentification }
     * 
     */
    public Detallista.InvoiceCreator.AlternatePartyIdentification createDetallistaInvoiceCreatorAlternatePartyIdentification() {
        return new Detallista.InvoiceCreator.AlternatePartyIdentification();
    }

    /**
     * Create an instance of {@link Detallista.InvoiceCreator.NameAndAddress }
     * 
     */
    public Detallista.InvoiceCreator.NameAndAddress createDetallistaInvoiceCreatorNameAndAddress() {
        return new Detallista.InvoiceCreator.NameAndAddress();
    }

    /**
     * Create an instance of {@link Detallista.ShipTo.NameAndAddress }
     * 
     */
    public Detallista.ShipTo.NameAndAddress createDetallistaShipToNameAndAddress() {
        return new Detallista.ShipTo.NameAndAddress();
    }

    /**
     * Create an instance of {@link Detallista.Seller.AlternatePartyIdentification }
     * 
     */
    public Detallista.Seller.AlternatePartyIdentification createDetallistaSellerAlternatePartyIdentification() {
        return new Detallista.Seller.AlternatePartyIdentification();
    }

    /**
     * Create an instance of {@link Detallista.Buyer.ContactInformation.PersonOrDepartmentName }
     * 
     */
    public Detallista.Buyer.ContactInformation.PersonOrDepartmentName createDetallistaBuyerContactInformationPersonOrDepartmentName() {
        return new Detallista.Buyer.ContactInformation.PersonOrDepartmentName();
    }

    /**
     * Create an instance of {@link Detallista.OrderIdentification.ReferenceIdentification }
     * 
     */
    public Detallista.OrderIdentification.ReferenceIdentification createDetallistaOrderIdentificationReferenceIdentification() {
        return new Detallista.OrderIdentification.ReferenceIdentification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sat.gob.mx/detallista", name = "city", scope = Detallista.ShipTo.NameAndAddress.class)
    public JAXBElement<String> createDetallistaShipToNameAndAddressCity(String value) {
        return new JAXBElement<String>(_DetallistaShipToNameAndAddressCity_QNAME, String.class, Detallista.ShipTo.NameAndAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sat.gob.mx/detallista", name = "name", scope = Detallista.ShipTo.NameAndAddress.class)
    public JAXBElement<String> createDetallistaShipToNameAndAddressName(String value) {
        return new JAXBElement<String>(_DetallistaShipToNameAndAddressName_QNAME, String.class, Detallista.ShipTo.NameAndAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sat.gob.mx/detallista", name = "postalCode", scope = Detallista.ShipTo.NameAndAddress.class)
    public JAXBElement<String> createDetallistaShipToNameAndAddressPostalCode(String value) {
        return new JAXBElement<String>(_DetallistaShipToNameAndAddressPostalCode_QNAME, String.class, Detallista.ShipTo.NameAndAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.sat.gob.mx/detallista", name = "streetAddressOne", scope = Detallista.ShipTo.NameAndAddress.class)
    public JAXBElement<String> createDetallistaShipToNameAndAddressStreetAddressOne(String value) {
        return new JAXBElement<String>(_DetallistaShipToNameAndAddressStreetAddressOne_QNAME, String.class, Detallista.ShipTo.NameAndAddress.class, value);
    }

}
