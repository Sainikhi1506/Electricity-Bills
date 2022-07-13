package com.example.model;

import java.time.LocalDate;
import java.util.Objects;

public class Reading {
	
	private Long readingId;
	private int unitsConsumed;
	private LocalDate readingDate;
	
	private int pricePerUnits;

	public Long getReadingId() {
		return readingId;
	}

	public void setReadingId(Long readingId) {
		this.readingId = readingId;
	}

	public int getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public LocalDate getReadingDate() {
		return readingDate;
	}

	public void setReadingDate(LocalDate readingDate) {
		this.readingDate = readingDate;
	}

	public int getPricePerUnits() {
		return pricePerUnits;
	}

	public void setPricePerUnits(int pricePerUnits) {
		this.pricePerUnits = pricePerUnits;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pricePerUnits, readingDate, readingId, unitsConsumed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reading other = (Reading) obj;
		return pricePerUnits == other.pricePerUnits && Objects.equals(readingDate, other.readingDate)
				&& Objects.equals(readingId, other.readingId) && unitsConsumed == other.unitsConsumed;
	}

	@Override
	public String toString() {
		return "Reading [readingId=" + readingId + ", unitsConsumed=" + unitsConsumed + ", readingDate=" + readingDate
				+ ", pricePerUnits=" + pricePerUnits + "]";
	}

	


}
