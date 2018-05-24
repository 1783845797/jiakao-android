package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeExample() {
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

        public Criteria andXtlbIsNull() {
            addCriterion("XTLB is null");
            return (Criteria) this;
        }

        public Criteria andXtlbIsNotNull() {
            addCriterion("XTLB is not null");
            return (Criteria) this;
        }

        public Criteria andXtlbEqualTo(String value) {
            addCriterion("XTLB =", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotEqualTo(String value) {
            addCriterion("XTLB <>", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbGreaterThan(String value) {
            addCriterion("XTLB >", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbGreaterThanOrEqualTo(String value) {
            addCriterion("XTLB >=", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbLessThan(String value) {
            addCriterion("XTLB <", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbLessThanOrEqualTo(String value) {
            addCriterion("XTLB <=", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbLike(String value) {
            addCriterion("XTLB like", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotLike(String value) {
            addCriterion("XTLB not like", value, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbIn(List<String> values) {
            addCriterion("XTLB in", values, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotIn(List<String> values) {
            addCriterion("XTLB not in", values, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbBetween(String value1, String value2) {
            addCriterion("XTLB between", value1, value2, "xtlb");
            return (Criteria) this;
        }

        public Criteria andXtlbNotBetween(String value1, String value2) {
            addCriterion("XTLB not between", value1, value2, "xtlb");
            return (Criteria) this;
        }

        public Criteria andDmlbIsNull() {
            addCriterion("DMLB is null");
            return (Criteria) this;
        }

        public Criteria andDmlbIsNotNull() {
            addCriterion("DMLB is not null");
            return (Criteria) this;
        }

        public Criteria andDmlbEqualTo(String value) {
            addCriterion("DMLB =", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotEqualTo(String value) {
            addCriterion("DMLB <>", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbGreaterThan(String value) {
            addCriterion("DMLB >", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbGreaterThanOrEqualTo(String value) {
            addCriterion("DMLB >=", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbLessThan(String value) {
            addCriterion("DMLB <", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbLessThanOrEqualTo(String value) {
            addCriterion("DMLB <=", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbLike(String value) {
            addCriterion("DMLB like", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotLike(String value) {
            addCriterion("DMLB not like", value, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbIn(List<String> values) {
            addCriterion("DMLB in", values, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotIn(List<String> values) {
            addCriterion("DMLB not in", values, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbBetween(String value1, String value2) {
            addCriterion("DMLB between", value1, value2, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmlbNotBetween(String value1, String value2) {
            addCriterion("DMLB not between", value1, value2, "dmlb");
            return (Criteria) this;
        }

        public Criteria andDmzIsNull() {
            addCriterion("DMZ is null");
            return (Criteria) this;
        }

        public Criteria andDmzIsNotNull() {
            addCriterion("DMZ is not null");
            return (Criteria) this;
        }

        public Criteria andDmzEqualTo(String value) {
            addCriterion("DMZ =", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotEqualTo(String value) {
            addCriterion("DMZ <>", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzGreaterThan(String value) {
            addCriterion("DMZ >", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzGreaterThanOrEqualTo(String value) {
            addCriterion("DMZ >=", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzLessThan(String value) {
            addCriterion("DMZ <", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzLessThanOrEqualTo(String value) {
            addCriterion("DMZ <=", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzLike(String value) {
            addCriterion("DMZ like", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotLike(String value) {
            addCriterion("DMZ not like", value, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzIn(List<String> values) {
            addCriterion("DMZ in", values, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotIn(List<String> values) {
            addCriterion("DMZ not in", values, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzBetween(String value1, String value2) {
            addCriterion("DMZ between", value1, value2, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmzNotBetween(String value1, String value2) {
            addCriterion("DMZ not between", value1, value2, "dmz");
            return (Criteria) this;
        }

        public Criteria andDmsxIsNull() {
            addCriterion("DMSX is null");
            return (Criteria) this;
        }

        public Criteria andDmsxIsNotNull() {
            addCriterion("DMSX is not null");
            return (Criteria) this;
        }

        public Criteria andDmsxEqualTo(String value) {
            addCriterion("DMSX =", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotEqualTo(String value) {
            addCriterion("DMSX <>", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThan(String value) {
            addCriterion("DMSX >", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxGreaterThanOrEqualTo(String value) {
            addCriterion("DMSX >=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThan(String value) {
            addCriterion("DMSX <", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLessThanOrEqualTo(String value) {
            addCriterion("DMSX <=", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxLike(String value) {
            addCriterion("DMSX like", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotLike(String value) {
            addCriterion("DMSX not like", value, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxIn(List<String> values) {
            addCriterion("DMSX in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotIn(List<String> values) {
            addCriterion("DMSX not in", values, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxBetween(String value1, String value2) {
            addCriterion("DMSX between", value1, value2, "dmsx");
            return (Criteria) this;
        }

        public Criteria andDmsxNotBetween(String value1, String value2) {
            addCriterion("DMSX not between", value1, value2, "dmsx");
            return (Criteria) this;
        }

        public Criteria andSxhIsNull() {
            addCriterion("SXH is null");
            return (Criteria) this;
        }

        public Criteria andSxhIsNotNull() {
            addCriterion("SXH is not null");
            return (Criteria) this;
        }

        public Criteria andSxhEqualTo(Short value) {
            addCriterion("SXH =", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotEqualTo(Short value) {
            addCriterion("SXH <>", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThan(Short value) {
            addCriterion("SXH >", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhGreaterThanOrEqualTo(Short value) {
            addCriterion("SXH >=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThan(Short value) {
            addCriterion("SXH <", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhLessThanOrEqualTo(Short value) {
            addCriterion("SXH <=", value, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhIn(List<Short> values) {
            addCriterion("SXH in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotIn(List<Short> values) {
            addCriterion("SXH not in", values, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhBetween(Short value1, Short value2) {
            addCriterion("SXH between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andSxhNotBetween(Short value1, Short value2) {
            addCriterion("SXH not between", value1, value2, "sxh");
            return (Criteria) this;
        }

        public Criteria andYwdxIsNull() {
            addCriterion("YWDX is null");
            return (Criteria) this;
        }

        public Criteria andYwdxIsNotNull() {
            addCriterion("YWDX is not null");
            return (Criteria) this;
        }

        public Criteria andYwdxEqualTo(String value) {
            addCriterion("YWDX =", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotEqualTo(String value) {
            addCriterion("YWDX <>", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxGreaterThan(String value) {
            addCriterion("YWDX >", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxGreaterThanOrEqualTo(String value) {
            addCriterion("YWDX >=", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxLessThan(String value) {
            addCriterion("YWDX <", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxLessThanOrEqualTo(String value) {
            addCriterion("YWDX <=", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxLike(String value) {
            addCriterion("YWDX like", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotLike(String value) {
            addCriterion("YWDX not like", value, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxIn(List<String> values) {
            addCriterion("YWDX in", values, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotIn(List<String> values) {
            addCriterion("YWDX not in", values, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxBetween(String value1, String value2) {
            addCriterion("YWDX between", value1, value2, "ywdx");
            return (Criteria) this;
        }

        public Criteria andYwdxNotBetween(String value1, String value2) {
            addCriterion("YWDX not between", value1, value2, "ywdx");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("ZT like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("ZT not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andCsbjIsNull() {
            addCriterion("CSBJ is null");
            return (Criteria) this;
        }

        public Criteria andCsbjIsNotNull() {
            addCriterion("CSBJ is not null");
            return (Criteria) this;
        }

        public Criteria andCsbjEqualTo(String value) {
            addCriterion("CSBJ =", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjNotEqualTo(String value) {
            addCriterion("CSBJ <>", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjGreaterThan(String value) {
            addCriterion("CSBJ >", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjGreaterThanOrEqualTo(String value) {
            addCriterion("CSBJ >=", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjLessThan(String value) {
            addCriterion("CSBJ <", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjLessThanOrEqualTo(String value) {
            addCriterion("CSBJ <=", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjLike(String value) {
            addCriterion("CSBJ like", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjNotLike(String value) {
            addCriterion("CSBJ not like", value, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjIn(List<String> values) {
            addCriterion("CSBJ in", values, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjNotIn(List<String> values) {
            addCriterion("CSBJ not in", values, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjBetween(String value1, String value2) {
            addCriterion("CSBJ between", value1, value2, "csbj");
            return (Criteria) this;
        }

        public Criteria andCsbjNotBetween(String value1, String value2) {
            addCriterion("CSBJ not between", value1, value2, "csbj");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNull() {
            addCriterion("GXSJ is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("GXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Date value) {
            addCriterion("GXSJ =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Date value) {
            addCriterion("GXSJ <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Date value) {
            addCriterion("GXSJ >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("GXSJ >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Date value) {
            addCriterion("GXSJ <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Date value) {
            addCriterion("GXSJ <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<Date> values) {
            addCriterion("GXSJ in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<Date> values) {
            addCriterion("GXSJ not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Date value1, Date value2) {
            addCriterion("GXSJ between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Date value1, Date value2) {
            addCriterion("GXSJ not between", value1, value2, "gxsj");
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