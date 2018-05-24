package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamKfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamKfExample() {
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

        public Criteria andLshIsNull() {
            addCriterion("lsh is null");
            return (Criteria) this;
        }

        public Criteria andLshIsNotNull() {
            addCriterion("lsh is not null");
            return (Criteria) this;
        }

        public Criteria andLshEqualTo(String value) {
            addCriterion("lsh =", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotEqualTo(String value) {
            addCriterion("lsh <>", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThan(String value) {
            addCriterion("lsh >", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshGreaterThanOrEqualTo(String value) {
            addCriterion("lsh >=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThan(String value) {
            addCriterion("lsh <", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLessThanOrEqualTo(String value) {
            addCriterion("lsh <=", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshLike(String value) {
            addCriterion("lsh like", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotLike(String value) {
            addCriterion("lsh not like", value, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshIn(List<String> values) {
            addCriterion("lsh in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotIn(List<String> values) {
            addCriterion("lsh not in", values, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshBetween(String value1, String value2) {
            addCriterion("lsh between", value1, value2, "lsh");
            return (Criteria) this;
        }

        public Criteria andLshNotBetween(String value1, String value2) {
            addCriterion("lsh not between", value1, value2, "lsh");
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

        public Criteria andKfxmIsNull() {
            addCriterion("kfxm is null");
            return (Criteria) this;
        }

        public Criteria andKfxmIsNotNull() {
            addCriterion("kfxm is not null");
            return (Criteria) this;
        }

        public Criteria andKfxmEqualTo(String value) {
            addCriterion("kfxm =", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmNotEqualTo(String value) {
            addCriterion("kfxm <>", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmGreaterThan(String value) {
            addCriterion("kfxm >", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmGreaterThanOrEqualTo(String value) {
            addCriterion("kfxm >=", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmLessThan(String value) {
            addCriterion("kfxm <", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmLessThanOrEqualTo(String value) {
            addCriterion("kfxm <=", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmLike(String value) {
            addCriterion("kfxm like", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmNotLike(String value) {
            addCriterion("kfxm not like", value, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmIn(List<String> values) {
            addCriterion("kfxm in", values, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmNotIn(List<String> values) {
            addCriterion("kfxm not in", values, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmBetween(String value1, String value2) {
            addCriterion("kfxm between", value1, value2, "kfxm");
            return (Criteria) this;
        }

        public Criteria andKfxmNotBetween(String value1, String value2) {
            addCriterion("kfxm not between", value1, value2, "kfxm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmIsNull() {
            addCriterion("sfzmhm is null");
            return (Criteria) this;
        }

        public Criteria andSfzmhmIsNotNull() {
            addCriterion("sfzmhm is not null");
            return (Criteria) this;
        }

        public Criteria andSfzmhmEqualTo(String value) {
            addCriterion("sfzmhm =", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotEqualTo(String value) {
            addCriterion("sfzmhm <>", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmGreaterThan(String value) {
            addCriterion("sfzmhm >", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmGreaterThanOrEqualTo(String value) {
            addCriterion("sfzmhm >=", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmLessThan(String value) {
            addCriterion("sfzmhm <", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmLessThanOrEqualTo(String value) {
            addCriterion("sfzmhm <=", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmLike(String value) {
            addCriterion("sfzmhm like", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotLike(String value) {
            addCriterion("sfzmhm not like", value, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmIn(List<String> values) {
            addCriterion("sfzmhm in", values, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotIn(List<String> values) {
            addCriterion("sfzmhm not in", values, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmBetween(String value1, String value2) {
            addCriterion("sfzmhm between", value1, value2, "sfzmhm");
            return (Criteria) this;
        }

        public Criteria andSfzmhmNotBetween(String value1, String value2) {
            addCriterion("sfzmhm not between", value1, value2, "sfzmhm");
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

        public Criteria andKfzIsNull() {
            addCriterion("kfz is null");
            return (Criteria) this;
        }

        public Criteria andKfzIsNotNull() {
            addCriterion("kfz is not null");
            return (Criteria) this;
        }

        public Criteria andKfzEqualTo(Integer value) {
            addCriterion("kfz =", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzNotEqualTo(Integer value) {
            addCriterion("kfz <>", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzGreaterThan(Integer value) {
            addCriterion("kfz >", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzGreaterThanOrEqualTo(Integer value) {
            addCriterion("kfz >=", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzLessThan(Integer value) {
            addCriterion("kfz <", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzLessThanOrEqualTo(Integer value) {
            addCriterion("kfz <=", value, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzIn(List<Integer> values) {
            addCriterion("kfz in", values, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzNotIn(List<Integer> values) {
            addCriterion("kfz not in", values, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzBetween(Integer value1, Integer value2) {
            addCriterion("kfz between", value1, value2, "kfz");
            return (Criteria) this;
        }

        public Criteria andKfzNotBetween(Integer value1, Integer value2) {
            addCriterion("kfz not between", value1, value2, "kfz");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andKfsjIsNull() {
            addCriterion("kfsj is null");
            return (Criteria) this;
        }

        public Criteria andKfsjIsNotNull() {
            addCriterion("kfsj is not null");
            return (Criteria) this;
        }

        public Criteria andKfsjEqualTo(Date value) {
            addCriterion("kfsj =", value, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjNotEqualTo(Date value) {
            addCriterion("kfsj <>", value, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjGreaterThan(Date value) {
            addCriterion("kfsj >", value, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjGreaterThanOrEqualTo(Date value) {
            addCriterion("kfsj >=", value, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjLessThan(Date value) {
            addCriterion("kfsj <", value, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjLessThanOrEqualTo(Date value) {
            addCriterion("kfsj <=", value, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjIn(List<Date> values) {
            addCriterion("kfsj in", values, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjNotIn(List<Date> values) {
            addCriterion("kfsj not in", values, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjBetween(Date value1, Date value2) {
            addCriterion("kfsj between", value1, value2, "kfsj");
            return (Criteria) this;
        }

        public Criteria andKfsjNotBetween(Date value1, Date value2) {
            addCriterion("kfsj not between", value1, value2, "kfsj");
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