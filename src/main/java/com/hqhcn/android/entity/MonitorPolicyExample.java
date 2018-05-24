package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.List;

public class MonitorPolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonitorPolicyExample() {
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

        public Criteria andMonitorIpIsNull() {
            addCriterion("monitor_ip is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIpIsNotNull() {
            addCriterion("monitor_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorIpEqualTo(String value) {
            addCriterion("monitor_ip =", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotEqualTo(String value) {
            addCriterion("monitor_ip <>", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpGreaterThan(String value) {
            addCriterion("monitor_ip >", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_ip >=", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpLessThan(String value) {
            addCriterion("monitor_ip <", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpLessThanOrEqualTo(String value) {
            addCriterion("monitor_ip <=", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpLike(String value) {
            addCriterion("monitor_ip like", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotLike(String value) {
            addCriterion("monitor_ip not like", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpIn(List<String> values) {
            addCriterion("monitor_ip in", values, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotIn(List<String> values) {
            addCriterion("monitor_ip not in", values, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpBetween(String value1, String value2) {
            addCriterion("monitor_ip between", value1, value2, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotBetween(String value1, String value2) {
            addCriterion("monitor_ip not between", value1, value2, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andJlcxhIsNull() {
            addCriterion("jlcxh is null");
            return (Criteria) this;
        }

        public Criteria andJlcxhIsNotNull() {
            addCriterion("jlcxh is not null");
            return (Criteria) this;
        }

        public Criteria andJlcxhEqualTo(String value) {
            addCriterion("jlcxh =", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhNotEqualTo(String value) {
            addCriterion("jlcxh <>", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhGreaterThan(String value) {
            addCriterion("jlcxh >", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhGreaterThanOrEqualTo(String value) {
            addCriterion("jlcxh >=", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhLessThan(String value) {
            addCriterion("jlcxh <", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhLessThanOrEqualTo(String value) {
            addCriterion("jlcxh <=", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhLike(String value) {
            addCriterion("jlcxh like", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhNotLike(String value) {
            addCriterion("jlcxh not like", value, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhIn(List<String> values) {
            addCriterion("jlcxh in", values, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhNotIn(List<String> values) {
            addCriterion("jlcxh not in", values, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhBetween(String value1, String value2) {
            addCriterion("jlcxh between", value1, value2, "jlcxh");
            return (Criteria) this;
        }

        public Criteria andJlcxhNotBetween(String value1, String value2) {
            addCriterion("jlcxh not between", value1, value2, "jlcxh");
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