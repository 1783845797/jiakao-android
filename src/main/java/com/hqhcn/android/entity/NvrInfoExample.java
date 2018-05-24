package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.List;

public class NvrInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NvrInfoExample() {
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

        public Criteria andF1IsNull() {
            addCriterion("f1 is null");
            return (Criteria) this;
        }

        public Criteria andF1IsNotNull() {
            addCriterion("f1 is not null");
            return (Criteria) this;
        }

        public Criteria andF1EqualTo(String value) {
            addCriterion("f1 =", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotEqualTo(String value) {
            addCriterion("f1 <>", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThan(String value) {
            addCriterion("f1 >", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThanOrEqualTo(String value) {
            addCriterion("f1 >=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThan(String value) {
            addCriterion("f1 <", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThanOrEqualTo(String value) {
            addCriterion("f1 <=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Like(String value) {
            addCriterion("f1 like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotLike(String value) {
            addCriterion("f1 not like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1In(List<String> values) {
            addCriterion("f1 in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotIn(List<String> values) {
            addCriterion("f1 not in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Between(String value1, String value2) {
            addCriterion("f1 between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotBetween(String value1, String value2) {
            addCriterion("f1 not between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF2IsNull() {
            addCriterion("f2 is null");
            return (Criteria) this;
        }

        public Criteria andF2IsNotNull() {
            addCriterion("f2 is not null");
            return (Criteria) this;
        }

        public Criteria andF2EqualTo(String value) {
            addCriterion("f2 =", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotEqualTo(String value) {
            addCriterion("f2 <>", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThan(String value) {
            addCriterion("f2 >", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThanOrEqualTo(String value) {
            addCriterion("f2 >=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThan(String value) {
            addCriterion("f2 <", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThanOrEqualTo(String value) {
            addCriterion("f2 <=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Like(String value) {
            addCriterion("f2 like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotLike(String value) {
            addCriterion("f2 not like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2In(List<String> values) {
            addCriterion("f2 in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotIn(List<String> values) {
            addCriterion("f2 not in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Between(String value1, String value2) {
            addCriterion("f2 between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotBetween(String value1, String value2) {
            addCriterion("f2 not between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF3IsNull() {
            addCriterion("f3 is null");
            return (Criteria) this;
        }

        public Criteria andF3IsNotNull() {
            addCriterion("f3 is not null");
            return (Criteria) this;
        }

        public Criteria andF3EqualTo(String value) {
            addCriterion("f3 =", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotEqualTo(String value) {
            addCriterion("f3 <>", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThan(String value) {
            addCriterion("f3 >", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThanOrEqualTo(String value) {
            addCriterion("f3 >=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThan(String value) {
            addCriterion("f3 <", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThanOrEqualTo(String value) {
            addCriterion("f3 <=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Like(String value) {
            addCriterion("f3 like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotLike(String value) {
            addCriterion("f3 not like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3In(List<String> values) {
            addCriterion("f3 in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotIn(List<String> values) {
            addCriterion("f3 not in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Between(String value1, String value2) {
            addCriterion("f3 between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotBetween(String value1, String value2) {
            addCriterion("f3 not between", value1, value2, "f3");
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