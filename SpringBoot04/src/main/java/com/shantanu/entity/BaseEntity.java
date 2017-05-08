package com.shantanu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

@MappedSuperclass
public abstract class BaseEntity<ID> {
	@Version
	private Long version;

	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	@Column(name = "last_modified_date", nullable = false)
	private Date modifiedDate;

	public abstract ID getId();

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@PrePersist
	public void prePersist() {
		this.createdDate = new Date();
		this.modifiedDate = new Date();
	}

	@PreUpdate
	public void preUpdate() {
		this.modifiedDate = new Date();
	}

}
