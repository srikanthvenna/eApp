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
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Holiday service. Represents a row in the &quot;holiday&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.HolidayModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.HolidayImpl}.
 * </p>
 *
 * @author rknowsys
 * @see Holiday
 * @see com.rknowsys.eapp.hrm.model.impl.HolidayImpl
 * @see com.rknowsys.eapp.hrm.model.impl.HolidayModelImpl
 * @generated
 */
public interface HolidayModel extends BaseModel<Holiday>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Holiday model instance should use the {@link Holiday} interface instead.
	 */

	/**
	 * Returns the primary key of this Holiday.
	 *
	 * @return the primary key of this Holiday
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Holiday.
	 *
	 * @param primaryKey the primary key of this Holiday
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the holiday ID of this Holiday.
	 *
	 * @return the holiday ID of this Holiday
	 */
	public long getHolidayId();

	/**
	 * Sets the holiday ID of this Holiday.
	 *
	 * @param holidayId the holiday ID of this Holiday
	 */
	public void setHolidayId(long holidayId);

	/**
	 * Returns the holiday date of this Holiday.
	 *
	 * @return the holiday date of this Holiday
	 */
	public Date getHolidayDate();

	/**
	 * Sets the holiday date of this Holiday.
	 *
	 * @param holidayDate the holiday date of this Holiday
	 */
	public void setHolidayDate(Date holidayDate);

	/**
	 * Returns the nationality ID of this Holiday.
	 *
	 * @return the nationality ID of this Holiday
	 */
	public long getNationalityId();

	/**
	 * Sets the nationality ID of this Holiday.
	 *
	 * @param nationalityId the nationality ID of this Holiday
	 */
	public void setNationalityId(long nationalityId);

	/**
	 * Returns the group ID of this Holiday.
	 *
	 * @return the group ID of this Holiday
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this Holiday.
	 *
	 * @param groupId the group ID of this Holiday
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this Holiday.
	 *
	 * @return the company ID of this Holiday
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this Holiday.
	 *
	 * @param companyId the company ID of this Holiday
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this Holiday.
	 *
	 * @return the user ID of this Holiday
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this Holiday.
	 *
	 * @param userId the user ID of this Holiday
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this Holiday.
	 *
	 * @return the user uuid of this Holiday
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this Holiday.
	 *
	 * @param userUuid the user uuid of this Holiday
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this Holiday.
	 *
	 * @return the user name of this Holiday
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this Holiday.
	 *
	 * @param userName the user name of this Holiday
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this Holiday.
	 *
	 * @return the create date of this Holiday
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this Holiday.
	 *
	 * @param createDate the create date of this Holiday
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this Holiday.
	 *
	 * @return the modified date of this Holiday
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this Holiday.
	 *
	 * @param modifiedDate the modified date of this Holiday
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

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
	public int compareTo(Holiday holiday);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Holiday> toCacheModel();

	@Override
	public Holiday toEscapedModel();

	@Override
	public Holiday toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}