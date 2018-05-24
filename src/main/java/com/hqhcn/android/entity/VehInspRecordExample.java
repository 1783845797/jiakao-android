package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehInspRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehInspRecordExample() {
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

        public Criteria andKcdddhIsNull() {
            addCriterion("kcdddh is null");
            return (Criteria) this;
        }

        public Criteria andKcdddhIsNotNull() {
            addCriterion("kcdddh is not null");
            return (Criteria) this;
        }

        public Criteria andKcdddhEqualTo(String value) {
            addCriterion("kcdddh =", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotEqualTo(String value) {
            addCriterion("kcdddh <>", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhGreaterThan(String value) {
            addCriterion("kcdddh >", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhGreaterThanOrEqualTo(String value) {
            addCriterion("kcdddh >=", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhLessThan(String value) {
            addCriterion("kcdddh <", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhLessThanOrEqualTo(String value) {
            addCriterion("kcdddh <=", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhLike(String value) {
            addCriterion("kcdddh like", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotLike(String value) {
            addCriterion("kcdddh not like", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhIn(List<String> values) {
            addCriterion("kcdddh in", values, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotIn(List<String> values) {
            addCriterion("kcdddh not in", values, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhBetween(String value1, String value2) {
            addCriterion("kcdddh between", value1, value2, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotBetween(String value1, String value2) {
            addCriterion("kcdddh not between", value1, value2, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andHphmIsNull() {
            addCriterion("hphm is null");
            return (Criteria) this;
        }

        public Criteria andHphmIsNotNull() {
            addCriterion("hphm is not null");
            return (Criteria) this;
        }

        public Criteria andHphmEqualTo(String value) {
            addCriterion("hphm =", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotEqualTo(String value) {
            addCriterion("hphm <>", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmGreaterThan(String value) {
            addCriterion("hphm >", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmGreaterThanOrEqualTo(String value) {
            addCriterion("hphm >=", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmLessThan(String value) {
            addCriterion("hphm <", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmLessThanOrEqualTo(String value) {
            addCriterion("hphm <=", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmLike(String value) {
            addCriterion("hphm like", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotLike(String value) {
            addCriterion("hphm not like", value, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmIn(List<String> values) {
            addCriterion("hphm in", values, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotIn(List<String> values) {
            addCriterion("hphm not in", values, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmBetween(String value1, String value2) {
            addCriterion("hphm between", value1, value2, "hphm");
            return (Criteria) this;
        }

        public Criteria andHphmNotBetween(String value1, String value2) {
            addCriterion("hphm not between", value1, value2, "hphm");
            return (Criteria) this;
        }

        public Criteria andJlcztIsNull() {
            addCriterion("jlczt is null");
            return (Criteria) this;
        }

        public Criteria andJlcztIsNotNull() {
            addCriterion("jlczt is not null");
            return (Criteria) this;
        }

        public Criteria andJlcztEqualTo(String value) {
            addCriterion("jlczt =", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztNotEqualTo(String value) {
            addCriterion("jlczt <>", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztGreaterThan(String value) {
            addCriterion("jlczt >", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztGreaterThanOrEqualTo(String value) {
            addCriterion("jlczt >=", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztLessThan(String value) {
            addCriterion("jlczt <", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztLessThanOrEqualTo(String value) {
            addCriterion("jlczt <=", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztLike(String value) {
            addCriterion("jlczt like", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztNotLike(String value) {
            addCriterion("jlczt not like", value, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztIn(List<String> values) {
            addCriterion("jlczt in", values, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztNotIn(List<String> values) {
            addCriterion("jlczt not in", values, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztBetween(String value1, String value2) {
            addCriterion("jlczt between", value1, value2, "jlczt");
            return (Criteria) this;
        }

        public Criteria andJlcztNotBetween(String value1, String value2) {
            addCriterion("jlczt not between", value1, value2, "jlczt");
            return (Criteria) this;
        }

        public Criteria andHpzlIsNull() {
            addCriterion("hpzl is null");
            return (Criteria) this;
        }

        public Criteria andHpzlIsNotNull() {
            addCriterion("hpzl is not null");
            return (Criteria) this;
        }

        public Criteria andHpzlEqualTo(String value) {
            addCriterion("hpzl =", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotEqualTo(String value) {
            addCriterion("hpzl <>", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlGreaterThan(String value) {
            addCriterion("hpzl >", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlGreaterThanOrEqualTo(String value) {
            addCriterion("hpzl >=", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLessThan(String value) {
            addCriterion("hpzl <", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLessThanOrEqualTo(String value) {
            addCriterion("hpzl <=", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlLike(String value) {
            addCriterion("hpzl like", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotLike(String value) {
            addCriterion("hpzl not like", value, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlIn(List<String> values) {
            addCriterion("hpzl in", values, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotIn(List<String> values) {
            addCriterion("hpzl not in", values, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlBetween(String value1, String value2) {
            addCriterion("hpzl between", value1, value2, "hpzl");
            return (Criteria) this;
        }

        public Criteria andHpzlNotBetween(String value1, String value2) {
            addCriterion("hpzl not between", value1, value2, "hpzl");
            return (Criteria) this;
        }

        public Criteria andJklxIsNull() {
            addCriterion("jklx is null");
            return (Criteria) this;
        }

        public Criteria andJklxIsNotNull() {
            addCriterion("jklx is not null");
            return (Criteria) this;
        }

        public Criteria andJklxEqualTo(String value) {
            addCriterion("jklx =", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxNotEqualTo(String value) {
            addCriterion("jklx <>", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxGreaterThan(String value) {
            addCriterion("jklx >", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxGreaterThanOrEqualTo(String value) {
            addCriterion("jklx >=", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxLessThan(String value) {
            addCriterion("jklx <", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxLessThanOrEqualTo(String value) {
            addCriterion("jklx <=", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxLike(String value) {
            addCriterion("jklx like", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxNotLike(String value) {
            addCriterion("jklx not like", value, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxIn(List<String> values) {
            addCriterion("jklx in", values, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxNotIn(List<String> values) {
            addCriterion("jklx not in", values, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxBetween(String value1, String value2) {
            addCriterion("jklx between", value1, value2, "jklx");
            return (Criteria) this;
        }

        public Criteria andJklxNotBetween(String value1, String value2) {
            addCriterion("jklx not between", value1, value2, "jklx");
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

        public Criteria andSjIsNull() {
            addCriterion("sj is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("sj is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(Date value) {
            addCriterion("sj =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(Date value) {
            addCriterion("sj <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(Date value) {
            addCriterion("sj >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(Date value) {
            addCriterion("sj >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(Date value) {
            addCriterion("sj <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(Date value) {
            addCriterion("sj <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<Date> values) {
            addCriterion("sj in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<Date> values) {
            addCriterion("sj not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(Date value1, Date value2) {
            addCriterion("sj between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(Date value1, Date value2) {
            addCriterion("sj not between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
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