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

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.WorkExpCompany;
import com.rknowsys.eapp.hrm.model.WorkExpCompanyModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the WorkExpCompany service. Represents a row in the &quot;work_exp_company&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.WorkExpCompanyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkExpCompanyImpl}.
 * </p>
 *
 * @author rknowsys
 * @see WorkExpCompanyImpl
 * @see com.rknowsys.eapp.hrm.model.WorkExpCompany
 * @see com.rknowsys.eapp.hrm.model.WorkExpCompanyModel
 * @generated
 */
public class WorkExpCompanyModelImpl extends BaseModelImpl<WorkExpCompany>
	implements WorkExpCompanyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a WorkExpCompany model instance should use the {@link com.rknowsys.eapp.hrm.model.WorkExpCompany} interface instead.
	 */
	public static final String TABLE_NAME = "work_exp_company";
	public static final Object[][] TABLE_COLUMNS = {
			{ "workExpCompanyId", Types.BIGINT },
			{ "employeeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "company", Types.VARCHAR },
			{ "jobTitle", Types.VARCHAR },
			{ "fromDate", Types.TIMESTAMP },
			{ "toDate", Types.TIMESTAMP },
			{ "comment_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table work_exp_company (workExpCompanyId LONG not null primary key,employeeId LONG,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,company VARCHAR(75) null,jobTitle VARCHAR(75) null,fromDate DATE null,toDate DATE null,comment_ VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table work_exp_company";
	public static final String ORDER_BY_JPQL = " ORDER BY workExpCompany.workExpCompanyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY work_exp_company.workExpCompanyId ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.WorkExpCompany"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.WorkExpCompany"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.WorkExpCompany"),
			true);
	public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
	public static long WORKEXPCOMPANYID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.WorkExpCompany"));

	public WorkExpCompanyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _workExpCompanyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWorkExpCompanyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _workExpCompanyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return WorkExpCompany.class;
	}

	@Override
	public String getModelClassName() {
		return WorkExpCompany.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("workExpCompanyId", getWorkExpCompanyId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("company", getCompany());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());
		attributes.put("comment", getComment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long workExpCompanyId = (Long)attributes.get("workExpCompanyId");

		if (workExpCompanyId != null) {
			setWorkExpCompanyId(workExpCompanyId);
		}

		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String company = (String)attributes.get("company");

		if (company != null) {
			setCompany(company);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}
	}

	@Override
	public long getWorkExpCompanyId() {
		return _workExpCompanyId;
	}

	@Override
	public void setWorkExpCompanyId(long workExpCompanyId) {
		_columnBitmask |= WORKEXPCOMPANYID_COLUMN_BITMASK;

		if (!_setOriginalWorkExpCompanyId) {
			_setOriginalWorkExpCompanyId = true;

			_originalWorkExpCompanyId = _workExpCompanyId;
		}

		_workExpCompanyId = workExpCompanyId;
	}

	public long getOriginalWorkExpCompanyId() {
		return _originalWorkExpCompanyId;
	}

	@Override
	public long getEmployeeId() {
		return _employeeId;
	}

	@Override
	public void setEmployeeId(long employeeId) {
		_columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

		if (!_setOriginalEmployeeId) {
			_setOriginalEmployeeId = true;

			_originalEmployeeId = _employeeId;
		}

		_employeeId = employeeId;
	}

	public long getOriginalEmployeeId() {
		return _originalEmployeeId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getCompany() {
		if (_company == null) {
			return StringPool.BLANK;
		}
		else {
			return _company;
		}
	}

	@Override
	public void setCompany(String company) {
		_company = company;
	}

	@Override
	public String getJobTitle() {
		if (_jobTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _jobTitle;
		}
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	@Override
	public Date getFromDate() {
		return _fromDate;
	}

	@Override
	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;
	}

	@Override
	public Date getToDate() {
		return _toDate;
	}

	@Override
	public void setToDate(Date toDate) {
		_toDate = toDate;
	}

	@Override
	public String getComment() {
		if (_comment == null) {
			return StringPool.BLANK;
		}
		else {
			return _comment;
		}
	}

	@Override
	public void setComment(String comment) {
		_comment = comment;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			WorkExpCompany.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public WorkExpCompany toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (WorkExpCompany)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WorkExpCompanyImpl workExpCompanyImpl = new WorkExpCompanyImpl();

		workExpCompanyImpl.setWorkExpCompanyId(getWorkExpCompanyId());
		workExpCompanyImpl.setEmployeeId(getEmployeeId());
		workExpCompanyImpl.setGroupId(getGroupId());
		workExpCompanyImpl.setCompanyId(getCompanyId());
		workExpCompanyImpl.setUserId(getUserId());
		workExpCompanyImpl.setCreateDate(getCreateDate());
		workExpCompanyImpl.setModifiedDate(getModifiedDate());
		workExpCompanyImpl.setCompany(getCompany());
		workExpCompanyImpl.setJobTitle(getJobTitle());
		workExpCompanyImpl.setFromDate(getFromDate());
		workExpCompanyImpl.setToDate(getToDate());
		workExpCompanyImpl.setComment(getComment());

		workExpCompanyImpl.resetOriginalValues();

		return workExpCompanyImpl;
	}

	@Override
	public int compareTo(WorkExpCompany workExpCompany) {
		long primaryKey = workExpCompany.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WorkExpCompany)) {
			return false;
		}

		WorkExpCompany workExpCompany = (WorkExpCompany)obj;

		long primaryKey = workExpCompany.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		WorkExpCompanyModelImpl workExpCompanyModelImpl = this;

		workExpCompanyModelImpl._originalWorkExpCompanyId = workExpCompanyModelImpl._workExpCompanyId;

		workExpCompanyModelImpl._setOriginalWorkExpCompanyId = false;

		workExpCompanyModelImpl._originalEmployeeId = workExpCompanyModelImpl._employeeId;

		workExpCompanyModelImpl._setOriginalEmployeeId = false;

		workExpCompanyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<WorkExpCompany> toCacheModel() {
		WorkExpCompanyCacheModel workExpCompanyCacheModel = new WorkExpCompanyCacheModel();

		workExpCompanyCacheModel.workExpCompanyId = getWorkExpCompanyId();

		workExpCompanyCacheModel.employeeId = getEmployeeId();

		workExpCompanyCacheModel.groupId = getGroupId();

		workExpCompanyCacheModel.companyId = getCompanyId();

		workExpCompanyCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			workExpCompanyCacheModel.createDate = createDate.getTime();
		}
		else {
			workExpCompanyCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			workExpCompanyCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			workExpCompanyCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		workExpCompanyCacheModel.company = getCompany();

		String company = workExpCompanyCacheModel.company;

		if ((company != null) && (company.length() == 0)) {
			workExpCompanyCacheModel.company = null;
		}

		workExpCompanyCacheModel.jobTitle = getJobTitle();

		String jobTitle = workExpCompanyCacheModel.jobTitle;

		if ((jobTitle != null) && (jobTitle.length() == 0)) {
			workExpCompanyCacheModel.jobTitle = null;
		}

		Date fromDate = getFromDate();

		if (fromDate != null) {
			workExpCompanyCacheModel.fromDate = fromDate.getTime();
		}
		else {
			workExpCompanyCacheModel.fromDate = Long.MIN_VALUE;
		}

		Date toDate = getToDate();

		if (toDate != null) {
			workExpCompanyCacheModel.toDate = toDate.getTime();
		}
		else {
			workExpCompanyCacheModel.toDate = Long.MIN_VALUE;
		}

		workExpCompanyCacheModel.comment = getComment();

		String comment = workExpCompanyCacheModel.comment;

		if ((comment != null) && (comment.length() == 0)) {
			workExpCompanyCacheModel.comment = null;
		}

		return workExpCompanyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{workExpCompanyId=");
		sb.append(getWorkExpCompanyId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", company=");
		sb.append(getCompany());
		sb.append(", jobTitle=");
		sb.append(getJobTitle());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.WorkExpCompany");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>workExpCompanyId</column-name><column-value><![CDATA[");
		sb.append(getWorkExpCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>company</column-name><column-value><![CDATA[");
		sb.append(getCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitle</column-name><column-value><![CDATA[");
		sb.append(getJobTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = WorkExpCompany.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			WorkExpCompany.class
		};
	private long _workExpCompanyId;
	private long _originalWorkExpCompanyId;
	private boolean _setOriginalWorkExpCompanyId;
	private long _employeeId;
	private long _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _company;
	private String _jobTitle;
	private Date _fromDate;
	private Date _toDate;
	private String _comment;
	private long _columnBitmask;
	private WorkExpCompany _escapedModel;
}