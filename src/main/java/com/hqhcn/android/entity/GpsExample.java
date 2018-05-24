package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.List;

public class GpsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GpsExample() {
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

        public Criteria andKsLshIsNull() {
            addCriterion("ks_lsh is null");
            return (Criteria) this;
        }

        public Criteria andKsLshIsNotNull() {
            addCriterion("ks_lsh is not null");
            return (Criteria) this;
        }

        public Criteria andKsLshEqualTo(String value) {
            addCriterion("ks_lsh =", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshNotEqualTo(String value) {
            addCriterion("ks_lsh <>", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshGreaterThan(String value) {
            addCriterion("ks_lsh >", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshGreaterThanOrEqualTo(String value) {
            addCriterion("ks_lsh >=", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshLessThan(String value) {
            addCriterion("ks_lsh <", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshLessThanOrEqualTo(String value) {
            addCriterion("ks_lsh <=", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshLike(String value) {
            addCriterion("ks_lsh like", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshNotLike(String value) {
            addCriterion("ks_lsh not like", value, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshIn(List<String> values) {
            addCriterion("ks_lsh in", values, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshNotIn(List<String> values) {
            addCriterion("ks_lsh not in", values, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshBetween(String value1, String value2) {
            addCriterion("ks_lsh between", value1, value2, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKsLshNotBetween(String value1, String value2) {
            addCriterion("ks_lsh not between", value1, value2, "ksLsh");
            return (Criteria) this;
        }

        public Criteria andKscsIsNull() {
            addCriterion("kscs is null");
            return (Criteria) this;
        }

        public Criteria andKscsIsNotNull() {
            addCriterion("kscs is not null");
            return (Criteria) this;
        }

        public Criteria andKscsEqualTo(Integer value) {
            addCriterion("kscs =", value, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsNotEqualTo(Integer value) {
            addCriterion("kscs <>", value, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsGreaterThan(Integer value) {
            addCriterion("kscs >", value, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsGreaterThanOrEqualTo(Integer value) {
            addCriterion("kscs >=", value, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsLessThan(Integer value) {
            addCriterion("kscs <", value, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsLessThanOrEqualTo(Integer value) {
            addCriterion("kscs <=", value, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsIn(List<Integer> values) {
            addCriterion("kscs in", values, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsNotIn(List<Integer> values) {
            addCriterion("kscs not in", values, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsBetween(Integer value1, Integer value2) {
            addCriterion("kscs between", value1, value2, "kscs");
            return (Criteria) this;
        }

        public Criteria andKscsNotBetween(Integer value1, Integer value2) {
            addCriterion("kscs not between", value1, value2, "kscs");
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

        public Criteria andCarinfoIdIsNull() {
            addCriterion("carinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdIsNotNull() {
            addCriterion("carinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdEqualTo(String value) {
            addCriterion("carinfo_id =", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdNotEqualTo(String value) {
            addCriterion("carinfo_id <>", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdGreaterThan(String value) {
            addCriterion("carinfo_id >", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("carinfo_id >=", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdLessThan(String value) {
            addCriterion("carinfo_id <", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdLessThanOrEqualTo(String value) {
            addCriterion("carinfo_id <=", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdLike(String value) {
            addCriterion("carinfo_id like", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdNotLike(String value) {
            addCriterion("carinfo_id not like", value, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdIn(List<String> values) {
            addCriterion("carinfo_id in", values, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdNotIn(List<String> values) {
            addCriterion("carinfo_id not in", values, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdBetween(String value1, String value2) {
            addCriterion("carinfo_id between", value1, value2, "carinfoId");
            return (Criteria) this;
        }

        public Criteria andCarinfoIdNotBetween(String value1, String value2) {
            addCriterion("carinfo_id not between", value1, value2, "carinfoId");
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