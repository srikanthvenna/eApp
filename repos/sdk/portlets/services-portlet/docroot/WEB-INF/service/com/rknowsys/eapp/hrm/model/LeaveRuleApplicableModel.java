/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LeaveRuleApplicable service. Represents a row in the &quot;leave_rule_applicable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.LeaveRuleApplicableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.LeaveRuleApplicableImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeaveRuleApplicable
 * @see com.rknowsys.eapp.hrm.model.impl.LeaveRuleApplicableImpl
 * @see com.rknowsys.eapp.hrm.model.impl.LeaveRuleApplicableModelImpl
 * @generated
 */
public interface LeaveRuleApplicableModel extends BaseModel<LeaveRuleApplicable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a leave rule applicable model instance should use the {@link LeaveRuleApplicable} interface instead.
	 */

	/**
	 * Returns the primary key of this leave rule applicable.
	 *
	 * @return the primary key of this leave rule applicable
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this leave rule applicable.
	 *
	 * @param primaryKey the primary key of this leave rule applicable
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the leave rule applicable ID of this leave rule applicable.
	 *
	 * @return the leave rule applicable ID of this leave rule applicable
	 */
	public long getLeaveRuleApplicableId();

	/**
	 * Sets the leave rule applicable ID of this leave rule applicable.
	 *
	 * @param leaveRuleApplicableId the leave rule applicable ID of this leave rule applicable
	 */
	public void setLeaveRuleApplicableId(long leaveRuleApplicableId);

	/**
	 * Returns the company ID of this leave rule applicable.
	 *
	 * @return the company ID of this leave rule applicable
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this leave rule applicable.
	 *
	 * @param companyId the company ID of this leave rule applicable
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this leave rule applicable.
	 *
	 * @return the group ID of this leave rule applicable
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this leave rule applicable.
	 *
	 * @param groupId the group ID of this leave rule applicable
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this leave rule applicable.
	 *
	 * @return the create date of this leave rule applicable
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this leave rule applicable.
	 *
	 * @param createDate the create date of this leave rule applicable
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this leave rule applicable.
	 *
	 * @return the modified date of this leave rule applicable
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this leave rule applicable.
	 *
	 * @param modifiedDate the modified date of this leave rule applicable
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this leave rule applicable.
	 *
	 * @return the user ID of this leave rule applicable
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this leave rule applicable.
	 *
	 * @param userId the user ID of this leave rule applicable
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this leave rule applicable.
	 *
	 * @return the user uuid of this leave rule applicable
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this leave rule applicable.
	 *
	 * @param userUuid the user uuid of this leave rule applicable
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the leave type ID of this leave rule applicable.
	 *
	 * @return the leave type ID of this leave rule applicable
	 */
	public long getLeaveTypeId();

	/**
	 * Sets the leave type ID of this leave rule applicable.
	 *
	 * @param leaveTypeId the leave type ID of this leave rule applicable
	 */
	public void setLeaveTypeId(long leaveTypeId);

	/**
	 * Returns the for female of this leave rule applicable.
	 *
	 * @return the for female of this leave rule applicable
	 */
	public boolean getForFemale();

	/**
	 * Returns <code>true</code> if this leave rule applicable is for female.
	 *
	 * @return <code>true</code> if this leave rule applicable is for female; <code>false</code> otherwise
	 */
	public boolean isForFemale();

	/**
	 * Sets whether this leave rule applicable is for female.
	 *
	 * @param forFemale the for female of this leave rule applicable
	 */
	public void setForFemale(boolean forFemale);

	/**
	 * Returns the for male of this leave rule applicable.
	 *
	 * @return the for male of this leave rule applicable
	 */
	public boolean getForMale();

	/**
	 * Returns <code>true</code> if this leave rule applicable is for male.
	 *
	 * @return <code>true</code> if this leave rule applicable is for male; <code>false</code> otherwise
	 */
	public boolean isForMale();

	/**
	 * Sets whether this leave rule applicable is for male.
	 *
	 * @param forMale the for male of this leave rule applicable
	 */
	public void setForMale(boolean forMale);

	/**
	 * Returns the for years of service of this leave rule applicable.
	 *
	 * @return the for years of service of this leave rule applicable
	 */
	public boolean getForYearsOfService();

	/**
	 * Returns <code>true</code> if this leave rule applicable is for years of service.
	 *
	 * @return <code>true</code> if this leave rule applicable is for years of service; <code>false</code> otherwise
	 */
	public boolean isForYearsOfService();

	/**
	 * Sets whether this leave rule applicable is for years of service.
	 *
	 * @param forYearsOfService the for years of service of this leave rule applicable
	 */
	public void setForYearsOfService(boolean forYearsOfService);

	/**
	 * Returns the from years of this leave rule applicable.
	 *
	 * @return the from years of this leave rule applicable
	 */
	@AutoEscape
	public String getFromYears();

	/**
	 * Sets the from years of this leave rule applicable.
	 *
	 * @param fromYears the from years of this leave rule applicable
	 */
	public void setFromYears(String fromYears);

	/**
	 * Returns the to years of this leave rule applicable.
	 *
	 * @return the to years of this leave rule applicable
	 */
	@AutoEscape
	public String getToYears();

	/**
	 * Sets the to years of this leave rule applicable.
	 *
	 * @param toYears the to years of this leave rule applicable
	 */
	public void setToYears(String toYears);

	/**
	 * Returns the for job titles of this leave rule applicable.
	 *
	 * @return the for job titles of this leave rule applicable
	 */
	public boolean getForJobTitles();

	/**
	 * Returns <code>true</code> if this leave rule applicable is for job titles.
	 *
	 * @return <code>true</code> if this leave rule applicable is for job titles; <code>false</code> otherwise
	 */
	public boolean isForJobTitles();

	/**
	 * Sets whether this leave rule applicable is for job titles.
	 *
	 * @param forJobTitles the for job titles of this leave rule applicable
	 */
	public void setForJobTitles(boolean forJobTitles);

	/**
	 * Returns the for job categories of this leave rule applicable.
	 *
	 * @return the for job categories of this leave rule applicable
	 */
	public boolean getForJobCategories();

	/**
	 * Returns <code>true</code> if this leave rule applicable is for job categories.
	 *
	 * @return <code>true</code> if this leave rule applicable is for job categories; <code>false</code> otherwise
	 */
	public boolean isForJobCategories();

	/**
	 * Sets whether this leave rule applicable is for job categories.
	 *
	 * @param forJobCategories the for job categories of this leave rule applicable
	 */
	public void setForJobCategories(boolean forJobCategories);

	/**
	 * Returns the for employment status of this leave rule applicable.
	 *
	 * @return the for employment status of this leave rule applicable
	 */
	public boolean getForEmploymentStatus();

	/**
	 * Returns <code>true</code> if this leave rule applicable is for employment status.
	 *
	 * @return <code>true</code> if this leave rule applicable is for employment status; <code>false</code> otherwise
	 */
	public boolean isForEmploymentStatus();

	/**
	 * Sets whether this leave rule applicable is for employment status.
	 *
	 * @param forEmploymentStatus the for employment status of this leave rule applicable
	 */
	public void setForEmploymentStatus(boolean forEmploymentStatus);

	/**
	 * Returns the for gender of this leave rule applicable.
	 *
	 * @return the for gender of this leave rule applicable
	 */
	public boolean getForGender();

	/**
	 * Returns <code>true</code> if this leave rule applicable is for gender.
	 *
	 * @return <code>true</code> if this leave rule applicable is for gender; <code>false</code> otherwise
	 */
	public boolean isForGender();

	/**
	 * Sets whether this leave rule applicable is for gender.
	 *
	 * @param forGender the for gender of this leave rule applicable
	 */
	public void setForGender(boolean forGender);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LeaveRuleApplicable leaveRuleApplicable);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LeaveRuleApplicable> toCacheModel();

	@Override
	public LeaveRuleApplicable toEscapedModel();

	@Override
	public LeaveRuleApplicable toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}