package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.List;

public class CameraInfoExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CameraInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andKskmIsNull() {
            addCriterion("kskm is null");
            return (Criteria) this;
        }

        public Criteria andKskmIsNotNull() {
            addCriterion("kskm is not null");
            return (Criteria) this;
        }

        public Criteria andKskmEqualTo(String value) {
            addCriterion("kskm =", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotEqualTo(String value) {
            addCriterion("kskm <>", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmGreaterThan(String value) {
            addCriterion("kskm >", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmGreaterThanOrEqualTo(String value) {
            addCriterion("kskm >=", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmLessThan(String value) {
            addCriterion("kskm <", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmLessThanOrEqualTo(String value) {
            addCriterion("kskm <=", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmLike(String value) {
            addCriterion("kskm like", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotLike(String value) {
            addCriterion("kskm not like", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmIn(List<String> values) {
            addCriterion("kskm in", values, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotIn(List<String> values) {
            addCriterion("kskm not in", values, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmBetween(String value1, String value2) {
            addCriterion("kskm between", value1, value2, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotBetween(String value1, String value2) {
            addCriterion("kskm not between", value1, value2, "kskm");
            return (Criteria) this;
        }

        public Criteria andKsldIsNull() {
            addCriterion("ksld is null");
            return (Criteria) this;
        }

        public Criteria andKsldIsNotNull() {
            addCriterion("ksld is not null");
            return (Criteria) this;
        }

        public Criteria andKsldEqualTo(String value) {
            addCriterion("ksld =", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldNotEqualTo(String value) {
            addCriterion("ksld <>", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldGreaterThan(String value) {
            addCriterion("ksld >", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldGreaterThanOrEqualTo(String value) {
            addCriterion("ksld >=", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldLessThan(String value) {
            addCriterion("ksld <", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldLessThanOrEqualTo(String value) {
            addCriterion("ksld <=", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldLike(String value) {
            addCriterion("ksld like", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldNotLike(String value) {
            addCriterion("ksld not like", value, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldIn(List<String> values) {
            addCriterion("ksld in", values, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldNotIn(List<String> values) {
            addCriterion("ksld not in", values, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldBetween(String value1, String value2) {
            addCriterion("ksld between", value1, value2, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsldNotBetween(String value1, String value2) {
            addCriterion("ksld not between", value1, value2, "ksld");
            return (Criteria) this;
        }

        public Criteria andKsxmIsNull() {
            addCriterion("ksxm is null");
            return (Criteria) this;
        }

        public Criteria andKsxmIsNotNull() {
            addCriterion("ksxm is not null");
            return (Criteria) this;
        }

        public Criteria andKsxmEqualTo(String value) {
            addCriterion("ksxm =", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotEqualTo(String value) {
            addCriterion("ksxm <>", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmGreaterThan(String value) {
            addCriterion("ksxm >", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmGreaterThanOrEqualTo(String value) {
            addCriterion("ksxm >=", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmLessThan(String value) {
            addCriterion("ksxm <", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmLessThanOrEqualTo(String value) {
            addCriterion("ksxm <=", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmLike(String value) {
            addCriterion("ksxm like", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotLike(String value) {
            addCriterion("ksxm not like", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmIn(List<String> values) {
            addCriterion("ksxm in", values, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotIn(List<String> values) {
            addCriterion("ksxm not in", values, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmBetween(String value1, String value2) {
            addCriterion("ksxm between", value1, value2, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotBetween(String value1, String value2) {
            addCriterion("ksxm not between", value1, value2, "ksxm");
            return (Criteria) this;
        }

        public Criteria andNvrIdIsNull() {
            addCriterion("nvr_id is null");
            return (Criteria) this;
        }

        public Criteria andNvrIdIsNotNull() {
            addCriterion("nvr_id is not null");
            return (Criteria) this;
        }

        public Criteria andNvrIdEqualTo(String value) {
            addCriterion("nvr_id =", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdNotEqualTo(String value) {
            addCriterion("nvr_id <>", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdGreaterThan(String value) {
            addCriterion("nvr_id >", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdGreaterThanOrEqualTo(String value) {
            addCriterion("nvr_id >=", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdLessThan(String value) {
            addCriterion("nvr_id <", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdLessThanOrEqualTo(String value) {
            addCriterion("nvr_id <=", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdLike(String value) {
            addCriterion("nvr_id like", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdNotLike(String value) {
            addCriterion("nvr_id not like", value, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdIn(List<String> values) {
            addCriterion("nvr_id in", values, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdNotIn(List<String> values) {
            addCriterion("nvr_id not in", values, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdBetween(String value1, String value2) {
            addCriterion("nvr_id between", value1, value2, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrIdNotBetween(String value1, String value2) {
            addCriterion("nvr_id not between", value1, value2, "nvrId");
            return (Criteria) this;
        }

        public Criteria andNvrChannelIsNull() {
            addCriterion("nvr_channel is null");
            return (Criteria) this;
        }

        public Criteria andNvrChannelIsNotNull() {
            addCriterion("nvr_channel is not null");
            return (Criteria) this;
        }

        public Criteria andNvrChannelEqualTo(String value) {
            addCriterion("nvr_channel =", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelNotEqualTo(String value) {
            addCriterion("nvr_channel <>", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelGreaterThan(String value) {
            addCriterion("nvr_channel >", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelGreaterThanOrEqualTo(String value) {
            addCriterion("nvr_channel >=", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelLessThan(String value) {
            addCriterion("nvr_channel <", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelLessThanOrEqualTo(String value) {
            addCriterion("nvr_channel <=", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelLike(String value) {
            addCriterion("nvr_channel like", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelNotLike(String value) {
            addCriterion("nvr_channel not like", value, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelIn(List<String> values) {
            addCriterion("nvr_channel in", values, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelNotIn(List<String> values) {
            addCriterion("nvr_channel not in", values, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelBetween(String value1, String value2) {
            addCriterion("nvr_channel between", value1, value2, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andNvrChannelNotBetween(String value1, String value2) {
            addCriterion("nvr_channel not between", value1, value2, "nvrChannel");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}