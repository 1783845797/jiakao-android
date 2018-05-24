package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KsldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KsldExample() {
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

        public Criteria andKsxmpxIsNull() {
            addCriterion("ksxmpx is null");
            return (Criteria) this;
        }

        public Criteria andKsxmpxIsNotNull() {
            addCriterion("ksxmpx is not null");
            return (Criteria) this;
        }

        public Criteria andKsxmpxEqualTo(String value) {
            addCriterion("ksxmpx =", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxNotEqualTo(String value) {
            addCriterion("ksxmpx <>", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxGreaterThan(String value) {
            addCriterion("ksxmpx >", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxGreaterThanOrEqualTo(String value) {
            addCriterion("ksxmpx >=", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxLessThan(String value) {
            addCriterion("ksxmpx <", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxLessThanOrEqualTo(String value) {
            addCriterion("ksxmpx <=", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxLike(String value) {
            addCriterion("ksxmpx like", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxNotLike(String value) {
            addCriterion("ksxmpx not like", value, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxIn(List<String> values) {
            addCriterion("ksxmpx in", values, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxNotIn(List<String> values) {
            addCriterion("ksxmpx not in", values, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxBetween(String value1, String value2) {
            addCriterion("ksxmpx between", value1, value2, "ksxmpx");
            return (Criteria) this;
        }

        public Criteria andKsxmpxNotBetween(String value1, String value2) {
            addCriterion("ksxmpx not between", value1, value2, "ksxmpx");
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

        public Criteria andLcIsNull() {
            addCriterion("lc is null");
            return (Criteria) this;
        }

        public Criteria andLcIsNotNull() {
            addCriterion("lc is not null");
            return (Criteria) this;
        }

        public Criteria andLcEqualTo(Integer value) {
            addCriterion("lc =", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotEqualTo(Integer value) {
            addCriterion("lc <>", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcGreaterThan(Integer value) {
            addCriterion("lc >", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcGreaterThanOrEqualTo(Integer value) {
            addCriterion("lc >=", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcLessThan(Integer value) {
            addCriterion("lc <", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcLessThanOrEqualTo(Integer value) {
            addCriterion("lc <=", value, "lc");
            return (Criteria) this;
        }

        public Criteria andLcIn(List<Integer> values) {
            addCriterion("lc in", values, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotIn(List<Integer> values) {
            addCriterion("lc not in", values, "lc");
            return (Criteria) this;
        }

        public Criteria andLcBetween(Integer value1, Integer value2) {
            addCriterion("lc between", value1, value2, "lc");
            return (Criteria) this;
        }

        public Criteria andLcNotBetween(Integer value1, Integer value2) {
            addCriterion("lc not between", value1, value2, "lc");
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

        public Criteria andGxsjIsNull() {
            addCriterion("gxsj is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("gxsj is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Date value) {
            addCriterion("gxsj =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Date value) {
            addCriterion("gxsj <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Date value) {
            addCriterion("gxsj >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("gxsj >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Date value) {
            addCriterion("gxsj <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Date value) {
            addCriterion("gxsj <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<Date> values) {
            addCriterion("gxsj in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<Date> values) {
            addCriterion("gxsj not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Date value1, Date value2) {
            addCriterion("gxsj between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Date value1, Date value2) {
            addCriterion("gxsj not between", value1, value2, "gxsj");
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