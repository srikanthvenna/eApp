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

import com.rknowsys.eapp.hrm.model.EmpSalary;
import com.rknowsys.eapp.hrm.model.EmpSalaryModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the EmpSalary service. Represents a row in the &quot;emp_salary&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.EmpSalaryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmpSalaryImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpSalaryImpl
 * @see com.rknowsys.eapp.hrm.model.EmpSalary
 * @see com.rknowsys.eapp.hrm.model.EmpSalaryModel
 * @generated
 */
public class EmpSalaryModelImpl extends BaseModelImpl<EmpSalary>
	implements EmpSalaryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a emp salary model instance should use the {@link com.rknowsys.eapp.hrm.model.EmpSalary} interface instead.
	 */
	public static final String TABLE_NAME = "emp_salary";
	public static final Object[][] TABLE_COLUMNS = {
			{ "empSalaryId", Types.BIGINT },
			{ "employeeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "payGradeId", Types.BIGINT },
			{ "payGradeCurrencyId", Types.BIGINT },
			{ "comment_", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table emp_salary (empSalaryId LONG not null primary key,employeeId LONG,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,payGradeId LONG,payGradeCurrencyId LONG,comment_ VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table emp_salary";
	public static final String ORDER_BY_JPQL = " ORDER BY empSalary.empSalaryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY emp_salary.empSalaryId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.EmpSalary"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.EmpSalary"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.EmpSalary"),
			true);
	public static long EMPSALARYID_COLUMN_BITMASK = 1L;
	public static long EMPLOYEEID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.EmpSalary"));

	public EmpSalaryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _empSalaryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmpSalaryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empSalaryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmpSalary.class;
	}

	@Override
	public String getModelClassName() {
		return EmpSalary.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empSalaryId", getEmpSalaryId());
		attributes.put("employeeId", getEmployeeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("payGradeId", getPayGradeId());
		attributes.put("payGradeCurrencyId", getPayGradeCurrencyId());
		attributes.put("comment", getComment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empSalaryId = (Long)attributes.get("empSalaryId");

		if (empSalaryId != null) {
			setEmpSalaryId(empSalaryId);
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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long payGradeId = (Long)attributes.get("payGradeId");

		if (payGradeId != null) {
			setPayGradeId(payGradeId);
		}

		Long payGradeCurrencyId = (Long)attributes.get("payGradeCurrencyId");

		if (payGradeCurrencyId != null) {
			setPayGradeCurrencyId(payGradeCurrencyId);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}
	}

	@Override
	public long getEmpSalaryId() {
		return _empSalaryId;
	}

	@Override
	public void setEmpSalaryId(long empSalaryId) {
		_columnBitmask |= EMPSALARYID_COLUMN_BITMASK;

		if (!_setOriginalEmpSalaryId) {
			_setOriginalEmpSalaryId = true;

			_originalEmpSalaryId = _empSalaryId;
		}

		_empSalaryId = empSalaryId;
	}

	public long getOriginalEmpSalaryId() {
		return _originalEmpSalaryId;
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
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
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
	public long getPayGradeId() {
		return _payGradeId;
	}

	@Override
	public void setPayGradeId(long payGradeId) {
		_payGradeId = payGradeId;
	}

	@Override
	public long getPayGradeCurrencyId() {
		return _payGradeCurrencyId;
	}

	@Override
	public void setPayGradeCurrencyId(long payGradeCurrencyId) {
		_payGradeCurrencyId = payGradeCurrencyId;
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
			EmpSalary.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmpSalary toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmpSalary)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmpSalaryImpl empSalaryImpl = new EmpSalaryImpl();

		empSalaryImpl.setEmpSalaryId(getEmpSalaryId());
		empSalaryImpl.setEmployeeId(getEmployeeId());
		empSalaryImpl.setGroupId(getGroupId());
		empSalaryImpl.setCompanyId(getCompanyId());
		empSalaryImpl.setCreateDate(getCreateDate());
		empSalaryImpl.setModifiedDate(getModifiedDate());
		empSalaryImpl.setUserId(getUserId());
		empSalaryImpl.setPayGradeId(getPayGradeId());
		empSalaryImpl.setPayGradeCurrencyId(getPayGradeCurrencyId());
		empSalaryImpl.setComment(getComment());

		empSalaryImpl.resetOriginalValues();

		return empSalaryImpl;
	}

	@Override
	public int compareTo(EmpSalary empSalary) {
		long primaryKey = empSalary.getPrimaryKey();

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

		if (!(obj instanceof EmpSalary)) {
			return false;
		}

		EmpSalary empSalary = (EmpSalary)obj;

		long primaryKey = empSalary.getPrimaryKey();

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
		EmpSalaryModelImpl empSalaryModelImpl = this;

		empSalaryModelImpl._originalEmpSalaryId = empSalaryModelImpl._empSalaryId;

		empSalaryModelImpl._setOriginalEmpSalaryId = false;

		empSalaryModelImpl._originalEmployeeId = empSalaryModelImpl._employeeId;

		empSalaryModelImpl._setOriginalEmployeeId = false;

		empSalaryModelImpl._originalGroupId = empSalaryModelImpl._groupId;

		empSalaryModelImpl._setOriginalGroupId = false;

		empSalaryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmpSalary> toCacheModel() {
		EmpSalaryCacheModel empSalaryCacheModel = new EmpSalaryCacheModel();

		empSalaryCacheModel.empSalaryId = getEmpSalaryId();

		empSalaryCacheModel.employeeId = getEmployeeId();

		empSalaryCacheModel.groupId = getGroupId();

		empSalaryCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			empSalaryCacheModel.createDate = createDate.getTime();
		}
		else {
			empSalaryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			empSalaryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			empSalaryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		empSalaryCacheModel.userId = getUserId();

		empSalaryCacheModel.payGradeId = getPayGradeId();

		empSalaryCacheModel.payGradeCurrencyId = getPayGradeCurrencyId();

		empSalaryCacheModel.comment = getComment();

		String comment = empSalaryCacheModel.comment;

		if ((comment != null) && (comment.length() == 0)) {
			empSalaryCacheModel.comment = null;
		}

		return empSalaryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{empSalaryId=");
		sb.append(getEmpSalaryId());
		sb.append(", employeeId=");
		sb.append(getEmployeeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", payGradeId=");
		sb.append(getPayGradeId());
		sb.append(", payGradeCurrencyId=");
		sb.append(getPayGradeCurrencyId());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.EmpSalary");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>empSalaryId</column-name><column-value><![CDATA[");
		sb.append(getEmpSalaryId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payGradeId</column-name><column-value><![CDATA[");
		sb.append(getPayGradeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payGradeCurrencyId</column-name><column-value><![CDATA[");
		sb.append(getPayGradeCurrencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EmpSalary.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmpSalary.class
		};
	private long _empSalaryId;
	private long _originalEmpSalaryId;
	private boolean _setOriginalEmpSalaryId;
	private long _employeeId;
	private long _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _payGradeId;
	private long _payGradeCurrencyId;
	private String _comment;
	private long _columnBitmask;
	private EmpSalary _escapedModel;
}