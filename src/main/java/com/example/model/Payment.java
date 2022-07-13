package com.example.model;

import java.time.LocalDate;
import java.util.Objects;

public class Payment {
	
	private Long paymentId;
	private LocalDate paymentDate;
	private double latePaymentCharges;
	private double totalPaid;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getLatePaymentCharges() {
		return latePaymentCharges;
	}
	public void setLatePaymentCharges(double latePaymentCharges) {
		this.latePaymentCharges = latePaymentCharges;
	}
	public double getTotalPaid() {
		return totalPaid;
	}
	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(latePaymentCharges, paymentDate, paymentId, totalPaid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Double.doubleToLongBits(latePaymentCharges) == Double.doubleToLongBits(other.latePaymentCharges)
				&& Objects.equals(paymentDate, other.paymentDate) && Objects.equals(paymentId, other.paymentId)
				&& Double.doubleToLongBits(totalPaid) == Double.doubleToLongBits(other.totalPaid);
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", latePaymentCharges="
				+ latePaymentCharges + ", totalPaid=" + totalPaid + "]";
	}
	


}
