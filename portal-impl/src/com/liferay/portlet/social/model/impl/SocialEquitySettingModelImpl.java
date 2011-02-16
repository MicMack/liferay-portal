/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.social.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;
import com.liferay.portlet.social.model.SocialEquitySetting;
import com.liferay.portlet.social.model.SocialEquitySettingModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the SocialEquitySetting service. Represents a row in the &quot;SocialEquitySetting&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.social.model.SocialEquitySettingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SocialEquitySettingImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialEquitySettingImpl
 * @see com.liferay.portlet.social.model.SocialEquitySetting
 * @see com.liferay.portlet.social.model.SocialEquitySettingModel
 * @generated
 */
public class SocialEquitySettingModelImpl extends BaseModelImpl<SocialEquitySetting>
	implements SocialEquitySettingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a social equity setting model instance should use the {@link com.liferay.portlet.social.model.SocialEquitySetting} interface instead.
	 */
	public static final String TABLE_NAME = "SocialEquitySetting";
	public static final Object[][] TABLE_COLUMNS = {
			{ "equitySettingId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "actionId", Types.VARCHAR },
			{ "dailyLimit", Types.INTEGER },
			{ "lifespan", Types.INTEGER },
			{ "type_", Types.INTEGER },
			{ "uniqueEntry", Types.BOOLEAN },
			{ "value", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table SocialEquitySetting (equitySettingId LONG not null primary key,groupId LONG,companyId LONG,classNameId LONG,actionId VARCHAR(75) null,dailyLimit INTEGER,lifespan INTEGER,type_ INTEGER,uniqueEntry BOOLEAN,value INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table SocialEquitySetting";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.social.model.SocialEquitySetting"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.social.model.SocialEquitySetting"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.social.model.SocialEquitySetting"));

	public SocialEquitySettingModelImpl() {
	}

	public long getPrimaryKey() {
		return _equitySettingId;
	}

	public void setPrimaryKey(long pk) {
		setEquitySettingId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_equitySettingId);
	}

	public long getEquitySettingId() {
		return _equitySettingId;
	}

	public void setEquitySettingId(long equitySettingId) {
		_equitySettingId = equitySettingId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		if (!_setOriginalClassNameId) {
			_setOriginalClassNameId = true;

			_originalClassNameId = _classNameId;
		}

		_classNameId = classNameId;
	}

	public long getOriginalClassNameId() {
		return _originalClassNameId;
	}

	public String getActionId() {
		if (_actionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _actionId;
		}
	}

	public void setActionId(String actionId) {
		if (_originalActionId == null) {
			_originalActionId = _actionId;
		}

		_actionId = actionId;
	}

	public String getOriginalActionId() {
		return GetterUtil.getString(_originalActionId);
	}

	public int getDailyLimit() {
		return _dailyLimit;
	}

	public void setDailyLimit(int dailyLimit) {
		_dailyLimit = dailyLimit;
	}

	public int getLifespan() {
		return _lifespan;
	}

	public void setLifespan(int lifespan) {
		_lifespan = lifespan;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		if (!_setOriginalType) {
			_setOriginalType = true;

			_originalType = _type;
		}

		_type = type;
	}

	public int getOriginalType() {
		return _originalType;
	}

	public boolean getUniqueEntry() {
		return _uniqueEntry;
	}

	public boolean isUniqueEntry() {
		return _uniqueEntry;
	}

	public void setUniqueEntry(boolean uniqueEntry) {
		_uniqueEntry = uniqueEntry;
	}

	public int getValue() {
		return _value;
	}

	public void setValue(int value) {
		_value = value;
	}

	public SocialEquitySetting toEscapedModel() {
		if (isEscapedModel()) {
			return (SocialEquitySetting)this;
		}
		else {
			return (SocialEquitySetting)Proxy.newProxyInstance(SocialEquitySetting.class.getClassLoader(),
				new Class[] { SocialEquitySetting.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					SocialEquitySetting.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		SocialEquitySettingModelImpl clone = new SocialEquitySettingImpl();

		clone._equitySettingId = _equitySettingId;
		clone._originalGroupId = clone._groupId = _groupId;

		clone._companyId = _companyId;
		clone._originalClassNameId = clone._classNameId = _classNameId;
		clone._originalActionId = clone._actionId = _actionId;

		clone._dailyLimit = _dailyLimit;

		clone._lifespan = _lifespan;
		clone._originalType = clone._type = _type;

		clone._uniqueEntry = _uniqueEntry;

		clone._value = _value;

		return clone;
	}

	public int compareTo(SocialEquitySetting socialEquitySetting) {
		long pk = socialEquitySetting.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SocialEquitySetting socialEquitySetting = null;

		try {
			socialEquitySetting = (SocialEquitySetting)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = socialEquitySetting.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{equitySettingId=");
		sb.append(getEquitySettingId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", actionId=");
		sb.append(getActionId());
		sb.append(", dailyLimit=");
		sb.append(getDailyLimit());
		sb.append(", lifespan=");
		sb.append(getLifespan());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", uniqueEntry=");
		sb.append(getUniqueEntry());
		sb.append(", value=");
		sb.append(getValue());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.social.model.SocialEquitySetting");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>equitySettingId</column-name><column-value><![CDATA[");
		sb.append(getEquitySettingId());
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
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionId</column-name><column-value><![CDATA[");
		sb.append(getActionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dailyLimit</column-name><column-value><![CDATA[");
		sb.append(getDailyLimit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lifespan</column-name><column-value><![CDATA[");
		sb.append(getLifespan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uniqueEntry</column-name><column-value><![CDATA[");
		sb.append(getUniqueEntry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _equitySettingId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _classNameId;
	private long _originalClassNameId;
	private boolean _setOriginalClassNameId;
	private String _actionId;
	private String _originalActionId;
	private int _dailyLimit;
	private int _lifespan;
	private int _type;
	private int _originalType;
	private boolean _setOriginalType;
	private boolean _uniqueEntry;
	private int _value;
	private transient ExpandoBridge _expandoBridge;
}