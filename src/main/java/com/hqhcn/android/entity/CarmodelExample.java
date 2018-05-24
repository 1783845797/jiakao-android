package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.List;

public class CarmodelExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarmodelExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClppxhIsNull() {
            addCriterion("clppxh is null");
            return (Criteria) this;
        }

        public Criteria andClppxhIsNotNull() {
            addCriterion("clppxh is not null");
            return (Criteria) this;
        }

        public Criteria andClppxhEqualTo(String value) {
            addCriterion("clppxh =", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhNotEqualTo(String value) {
            addCriterion("clppxh <>", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhGreaterThan(String value) {
            addCriterion("clppxh >", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhGreaterThanOrEqualTo(String value) {
            addCriterion("clppxh >=", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhLessThan(String value) {
            addCriterion("clppxh <", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhLessThanOrEqualTo(String value) {
            addCriterion("clppxh <=", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhLike(String value) {
            addCriterion("clppxh like", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhNotLike(String value) {
            addCriterion("clppxh not like", value, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhIn(List<String> values) {
            addCriterion("clppxh in", values, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhNotIn(List<String> values) {
            addCriterion("clppxh not in", values, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhBetween(String value1, String value2) {
            addCriterion("clppxh between", value1, value2, "clppxh");
            return (Criteria) this;
        }

        public Criteria andClppxhNotBetween(String value1, String value2) {
            addCriterion("clppxh not between", value1, value2, "clppxh");
            return (Criteria) this;
        }

        public Criteria andModelPathIsNull() {
            addCriterion("model_path is null");
            return (Criteria) this;
        }

        public Criteria andModelPathIsNotNull() {
            addCriterion("model_path is not null");
            return (Criteria) this;
        }

        public Criteria andModelPathEqualTo(String value) {
            addCriterion("model_path =", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotEqualTo(String value) {
            addCriterion("model_path <>", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathGreaterThan(String value) {
            addCriterion("model_path >", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathGreaterThanOrEqualTo(String value) {
            addCriterion("model_path >=", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathLessThan(String value) {
            addCriterion("model_path <", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathLessThanOrEqualTo(String value) {
            addCriterion("model_path <=", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathLike(String value) {
            addCriterion("model_path like", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotLike(String value) {
            addCriterion("model_path not like", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathIn(List<String> values) {
            addCriterion("model_path in", values, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotIn(List<String> values) {
            addCriterion("model_path not in", values, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathBetween(String value1, String value2) {
            addCriterion("model_path between", value1, value2, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotBetween(String value1, String value2) {
            addCriterion("model_path not between", value1, value2, "modelPath");
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