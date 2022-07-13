package com.example.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "connection")
public class Connection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int connetionid;
	private Long consumernum;

	private LocalDate applicationdate;
	private LocalDate connectiondate;
	private boolean connectionstatus;

	public int getConnetionid() {
		return connetionid;
	}

	public void setConnetionid(int connetionid) {
		this.connetionid = connetionid;
	}

	public Long getConsumernum() {
		return consumernum;
	}

	public void setConsumernum(Long consumernum) {
		this.consumernum = consumernum;
	}

	public LocalDate getApplicationdate() {
		return applicationdate;
	}

	public void setApplicationdate(LocalDate applicationdate) {
		this.applicationdate = applicationdate;
	}

	public LocalDate getConnectiondate() {
		return connectiondate;
	}

	public void setConnectiondate(LocalDate connectiondate) {
		this.connectiondate = connectiondate;
	}

	public boolean isConnectionstatus() {
		return connectionstatus;
	}

	public void setConnectionstatus(boolean connectionstatus) {
		this.connectionstatus = connectionstatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicationdate, connectiondate, connectionstatus, connetionid, consumernum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Connection other = (Connection) obj;
		return Objects.equals(applicationdate, other.applicationdate)
				&& Objects.equals(connectiondate, other.connectiondate) && connectionstatus == other.connectionstatus
				&& Objects.equals(connetionid, other.connetionid) && Objects.equals(consumernum, other.consumernum);
	}

	@Override
	public String toString() {
		return "Connection [connetionid=" + connetionid + ", consumernum=" + consumernum + ", applicationdate="
				+ applicationdate + ", connectiondate=" + connectiondate + ", connectionstatus=" + connectionstatus
				+ "]";
	}

}
