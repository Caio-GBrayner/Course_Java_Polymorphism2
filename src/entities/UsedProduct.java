package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
    public String priceTag() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", name, price, sdf.format(manufactureDate));
    }

	
}
