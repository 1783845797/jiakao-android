package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.List;

public class KsxmExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KsxmExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andUpCodeIsNull() {
            addCriterion("up_code is null");
            return (Criteria) this;
        }

        public Criteria andUpCodeIsNotNull() {
            addCriterion("up_code is not null");
            return (Criteria) this;
        }

        public Criteria andUpCodeEqualTo(String value) {
            addCriterion("up_code =", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotEqualTo(String value) {
            addCriterion("up_code <>", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeGreaterThan(String value) {
            addCriterion("up_code >", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("up_code >=", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeLessThan(String value) {
            addCriterion("up_code <", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeLessThanOrEqualTo(String value) {
            addCriterion("up_code <=", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeLike(String value) {
            addCriterion("up_code like", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotLike(String value) {
            addCriterion("up_code not like", value, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeIn(List<String> values) {
            addCriterion("up_code in", values, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotIn(List<String> values) {
            addCriterion("up_code not in", values, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeBetween(String value1, String value2) {
            addCriterion("up_code between", value1, value2, "upCode");
            return (Criteria) this;
        }

        public Criteria andUpCodeNotBetween(String value1, String value2) {
            addCriterion("up_code not between", value1, value2, "upCode");
            return (Criteria) this;
        }

        public Criteria andKfzIsNull() {
            addCriterion("kfz is null");
            return (Criteria) this;
        }

        public Criteria andKfzIsNotNull() {
            addCriterion("kfz is not null");
            return (Criteria) this;
        }

        public Criteria andKfzEqualTo(String value) {
            addCriterion("kfz =", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzNotEqualTo(String value) {
            addCriterion("kfz <>", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzGreaterThan(String value) {
            addCriterion("kfz >", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzGreaterThanOrEqualTo(String value) {
            addCriterion("kfz >=", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzLessThan(String value) {
            addCriterion("kfz <", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzLessThanOrEqualTo(String value) {
            addCriterion("kfz <=", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzLike(String value) {
            addCriterion("kfz like", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzNotLike(String value) {
            addCriterion("kfz not like", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzIn(List<String> values) {
            addCriterion("kfz in", values, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzNotIn(List<String> values) {
            addCriterion("kfz not in", values, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzBetween(String value1, String value2) {
            addCriterion("kfz between", value1, value2, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzNotBetween(String value1, String value2) {
            addCriterion("kfz not between", value1, value2, "kfz");
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

        public Criteria andZdpdxIsNull() {
            addCriterion("zdpdx is null");
            return (Criteria) this;
        }

        public Criteria andZdpdxIsNotNull() {
            addCriterion("zdpdx is not null");
            return (Criteria) this;
        }

        public Criteria andZdpdxEqualTo(Short value) {
            addCriterion("zdpdx =", value, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxNotEqualTo(Short value) {
            addCriterion("zdpdx <>", value, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxGreaterThan(Short value) {
            addCriterion("zdpdx >", value, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxGreaterThanOrEqualTo(Short value) {
            addCriterion("zdpdx >=", value, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxLessThan(Short value) {
            addCriterion("zdpdx <", value, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxLessThanOrEqualTo(Short value) {
            addCriterion("zdpdx <=", value, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxIn(List<Short> values) {
            addCriterion("zdpdx in", values, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxNotIn(List<Short> values) {
            addCriterion("zdpdx not in", values, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxBetween(Short value1, Short value2) {
            addCriterion("zdpdx between", value1, value2, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andZdpdxNotBetween(Short value1, Short value2) {
            addCriterion("zdpdx not between", value1, value2, "zdpdx");
            return (Criteria) this;
        }

        public Criteria andCode61IsNull() {
            addCriterion("code61 is null");
            return (Criteria) this;
        }

        public Criteria andCode61IsNotNull() {
            addCriterion("code61 is not null");
            return (Criteria) this;
        }

        public Criteria andCode61EqualTo(String value) {
            addCriterion("code61 =", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61NotEqualTo(String value) {
            addCriterion("code61 <>", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61GreaterThan(String value) {
            addCriterion("code61 >", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61GreaterThanOrEqualTo(String value) {
            addCriterion("code61 >=", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61LessThan(String value) {
            addCriterion("code61 <", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61LessThanOrEqualTo(String value) {
            addCriterion("code61 <=", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61Like(String value) {
            addCriterion("code61 like", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61NotLike(String value) {
            addCriterion("code61 not like", value, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61In(List<String> values) {
            addCriterion("code61 in", values, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61NotIn(List<String> values) {
            addCriterion("code61 not in", values, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61Between(String value1, String value2) {
            addCriterion("code61 between", value1, value2, "code61");
            return (Criteria) this;
        }

        public Criteria andCode61NotBetween(String value1, String value2) {
            addCriterion("code61 not between", value1, value2, "code61");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("zt is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("zt is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(Integer value) {
            addCriterion("zt =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(Integer value) {
            addCriterion("zt <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(Integer value) {
            addCriterion("zt >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(Integer value) {
            addCriterion("zt >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(Integer value) {
            addCriterion("zt <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(Integer value) {
            addCriterion("zt <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<Integer> values) {
            addCriterion("zt in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<Integer> values) {
            addCriterion("zt not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(Integer value1, Integer value2) {
            addCriterion("zt between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(Integer value1, Integer value2) {
            addCriterion("zt not between", value1, value2, "zt");
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