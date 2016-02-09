package entity.ejb;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import entityAccess.eao.OrderspecificationEAOImplLocal;


@Embeddable
public class OrderspecificationId{
	
	private String pNumber;
	private String oNumber;
	
	public OrderspecificationId() {
		
	}
	
	public OrderspecificationId(String pNumber, String oNumber) {
		this.pNumber = pNumber;
		this.oNumber = oNumber;
	}
	
	@Column(name = "pNumber", nullable = false)
	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;

	}

	@Column(name = "oNumber", nullable = false)
	public String getoNumber() {
		return oNumber;

	}

	public void setoNumber(String oNumber) {
		this.oNumber = oNumber;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}

		if ((other == null)) {
			return false;
		}
		if (!(other instanceof OrderspecificationId)) {
			return false;
		}

		OrderspecificationId castOther = (OrderspecificationId) other;

		return ((this.getpNumber() == castOther.getpNumber()) || (this.getpNumber() != null && castOther.getpNumber() != null
				&& this.getpNumber().equals(castOther.getpNumber())))
				&& ((this.getoNumber() == castOther.getoNumber()) || (this.getoNumber() != null
						&& castOther.getoNumber() != null && this.getoNumber().equals(castOther.getoNumber())));
	}

	@Override
	public int hashCode() {
		return super.hashCode();

	}

}
