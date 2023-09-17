package iNV;

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String soldTo = "C026-01-0926/2022";
        String date = "28/04/2020";
        String address = "LINDSAY NJOKI";
        String contact = "0100100100";
        int qty;
        String itemDescription;
        double unitPrice;
        double amount;
        double subtotal=1650.00;
        double vat = subtotal * 0.16;
        double totalAmount = subtotal + vat;
        
        System.out.println("*************************Adamson Computers Ltd***************************");
        System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567   ");
        System.out.println("                 VAT REG. Tin 098-765-4321-0000                          ");
        System.out.println("                         SALES INVOICE                                   ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Sold to:" +soldTo);
        System.out.println("Date:" +date);
        System.out.print("Address:" +address );
        System.out.println("Contact Number:" +contact);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("==============================================================================");
        System.out.println("Qty     |        Item Description       |        Unit Price     |Amount       ");
        System.out.println("==============================================================================");
        System.out.println("4       |        Pencil                 |        20             |80.00        ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("10      |        Duster                 |        50             |500.00       ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("9       |        Pens                   |        30             |270.00       ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("10      |        crayon                 |        80             |800.00       ");
        System.out.println("==============================================================================");
        System.out.println("                                                |Sub Total      |1650.00      ");
        System.out.println("                                                ==============================");
        System.out.println("                                                |VAT(16%)       |264.00       ");
        System.out.println("                                                ==============================");
        System.out.println("                                                |Total Amount   |1914.00      ");
        System.out.println("                                                ==============================");
	}

}
