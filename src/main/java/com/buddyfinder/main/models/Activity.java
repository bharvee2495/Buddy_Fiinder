package com.buddyfinder.main.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Activity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer activityId;

	@Column
	private String location;
	
	@Column
	private String description;
	
	@Column
	private String activityName;
	
	@Column
	private Date date;
	
	@OneToOne
	private Account postedBy;
	
	/*@ManyToMany
	@JoinTable(name="activityAccount",
		joinColumns = @JoinColumn(name="activityId", referencedColumnName="activityId"),
		inverseJoinColumns = @JoinColumn(name="accountId", referencedColumnName="accountId"))*/
	@OneToOne
	private Account attendedBy;
	
	@Column
	private String status;
	
	public Activity() {
		
	}

	public Activity( String location, String description, String activityName, Date date,
			Account postedBy, Account attendedBy) {
		super();
		this.location = location;
		this.description = description;
		this.activityName = activityName;
		this.date = date;
		this.postedBy = postedBy;
		this.attendedBy = attendedBy;
	}

	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getActivityName() {
		return activityName;
	}


	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}


	public Integer getActivityId() {
		return activityId;
	}


	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Account getPostedBy() {
		return postedBy;
	}


	public void setPostedBy(Account postedBy) {
		this.postedBy = postedBy;
	}


	public Account getAttendedBy() {
		return attendedBy;
	}


	public void setAttendedBy(Account attendedBy) {
		this.attendedBy = attendedBy;
	}

	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", location=" + location + ", description=" + description
				+ ", activityName=" + activityName + ", date=" + date + ", postedBy=" + postedBy + ", attendedBy="
				+ attendedBy + ", status=" + status + "]";
	}
	
}
