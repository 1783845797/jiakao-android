package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExampreasignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExampreasignExample() {
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

        public Criteria andZkzmbhIsNull() {
            addCriterion("zkzmbh is null");
            return (Criteria) this;
        }

        public Criteria andZkzmbhIsNotNull() {
            addCriterion("zkzmbh is not null");
            return (Criteria) this;
        }

        public Criteria andZkzmbhEqualTo(String value) {
            addCriterion("zkzmbh =", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhNotEqualTo(String value) {
            addCriterion("zkzmbh <>", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhGreaterThan(String value) {
            addCriterion("zkzmbh >", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhGreaterThanOrEqualTo(String value) {
            addCriterion("zkzmbh >=", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhLessThan(String value) {
            addCriterion("zkzmbh <", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhLessThanOrEqualTo(String value) {
            addCriterion("zkzmbh <=", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhLike(String value) {
            addCriterion("zkzmbh like", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhNotLike(String value) {
            addCriterion("zkzmbh not like", value, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhIn(List<String> values) {
            addCriterion("zkzmbh in", values, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhNotIn(List<String> values) {
            addCriterion("zkzmbh not in", values, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhBetween(String value1, String value2) {
            addCriterion("zkzmbh between", value1, value2, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andZkzmbhNotBetween(String value1, String value2) {
            addCriterion("zkzmbh not between", value1, value2, "zkzmbh");
            return (Criteria) this;
        }

        public Criteria andSfzmmcIsNull() {
            addCriterion("sfzmmc is null");
            return (Criteria) this;
        }

        public Criteria andSfzmmcIsNotNull() {
            addCriterion("sfzmmc is not null");
            return (Criteria) this;
        }

        public Criteria andSfzmmcEqualTo(String value) {
            addCriterion("sfzmmc =", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcNotEqualTo(String value) {
            addCriterion("sfzmmc <>", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcGreaterThan(String value) {
            addCriterion("sfzmmc >", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcGreaterThanOrEqualTo(String value) {
            addCriterion("sfzmmc >=", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcLessThan(String value) {
            addCriterion("sfzmmc <", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcLessThanOrEqualTo(String value) {
            addCriterion("sfzmmc <=", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcLike(String value) {
            addCriterion("sfzmmc like", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcNotLike(String value) {
            addCriterion("sfzmmc not like", value, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcIn(List<String> values) {
            addCriterion("sfzmmc in", values, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcNotIn(List<String> values) {
            addCriterion("sfzmmc not in", values, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcBetween(String value1, String value2) {
            addCriterion("sfzmmc between", value1, value2, "sfzmmc");
            return (Criteria) this;
        }

        public Criteria andSfzmmcNotBetween(String value1, String value2) {
            addCriterion("sfzmmc not between", value1, value2, "sfzmmc");
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

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andKsyyIsNull() {
            addCriterion("ksyy is null");
            return (Criteria) this;
        }

        public Criteria andKsyyIsNotNull() {
            addCriterion("ksyy is not null");
            return (Criteria) this;
        }

        public Criteria andKsyyEqualTo(String value) {
            addCriterion("ksyy =", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyNotEqualTo(String value) {
            addCriterion("ksyy <>", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyGreaterThan(String value) {
            addCriterion("ksyy >", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyGreaterThanOrEqualTo(String value) {
            addCriterion("ksyy >=", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyLessThan(String value) {
            addCriterion("ksyy <", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyLessThanOrEqualTo(String value) {
            addCriterion("ksyy <=", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyLike(String value) {
            addCriterion("ksyy like", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyNotLike(String value) {
            addCriterion("ksyy not like", value, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyIn(List<String> values) {
            addCriterion("ksyy in", values, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyNotIn(List<String> values) {
            addCriterion("ksyy not in", values, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyBetween(String value1, String value2) {
            addCriterion("ksyy between", value1, value2, "ksyy");
            return (Criteria) this;
        }

        public Criteria andKsyyNotBetween(String value1, String value2) {
            addCriterion("ksyy not between", value1, value2, "ksyy");
            return (Criteria) this;
        }

        public Criteria andXxsjIsNull() {
            addCriterion("xxsj is null");
            return (Criteria) this;
        }

        public Criteria andXxsjIsNotNull() {
            addCriterion("xxsj is not null");
            return (Criteria) this;
        }

        public Criteria andXxsjEqualTo(Integer value) {
            addCriterion("xxsj =", value, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjNotEqualTo(Integer value) {
            addCriterion("xxsj <>", value, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjGreaterThan(Integer value) {
            addCriterion("xxsj >", value, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxsj >=", value, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjLessThan(Integer value) {
            addCriterion("xxsj <", value, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjLessThanOrEqualTo(Integer value) {
            addCriterion("xxsj <=", value, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjIn(List<Integer> values) {
            addCriterion("xxsj in", values, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjNotIn(List<Integer> values) {
            addCriterion("xxsj not in", values, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjBetween(Integer value1, Integer value2) {
            addCriterion("xxsj between", value1, value2, "xxsj");
            return (Criteria) this;
        }

        public Criteria andXxsjNotBetween(Integer value1, Integer value2) {
            addCriterion("xxsj not between", value1, value2, "xxsj");
            return (Criteria) this;
        }

        public Criteria andKscxIsNull() {
            addCriterion("kscx is null");
            return (Criteria) this;
        }

        public Criteria andKscxIsNotNull() {
            addCriterion("kscx is not null");
            return (Criteria) this;
        }

        public Criteria andKscxEqualTo(String value) {
            addCriterion("kscx =", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxNotEqualTo(String value) {
            addCriterion("kscx <>", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxGreaterThan(String value) {
            addCriterion("kscx >", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxGreaterThanOrEqualTo(String value) {
            addCriterion("kscx >=", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxLessThan(String value) {
            addCriterion("kscx <", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxLessThanOrEqualTo(String value) {
            addCriterion("kscx <=", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxLike(String value) {
            addCriterion("kscx like", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxNotLike(String value) {
            addCriterion("kscx not like", value, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxIn(List<String> values) {
            addCriterion("kscx in", values, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxNotIn(List<String> values) {
            addCriterion("kscx not in", values, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxBetween(String value1, String value2) {
            addCriterion("kscx between", value1, value2, "kscx");
            return (Criteria) this;
        }

        public Criteria andKscxNotBetween(String value1, String value2) {
            addCriterion("kscx not between", value1, value2, "kscx");
            return (Criteria) this;
        }

        public Criteria andKsccIsNull() {
            addCriterion("kscc is null");
            return (Criteria) this;
        }

        public Criteria andKsccIsNotNull() {
            addCriterion("kscc is not null");
            return (Criteria) this;
        }

        public Criteria andKsccEqualTo(Integer value) {
            addCriterion("kscc =", value, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccNotEqualTo(Integer value) {
            addCriterion("kscc <>", value, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccGreaterThan(Integer value) {
            addCriterion("kscc >", value, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccGreaterThanOrEqualTo(Integer value) {
            addCriterion("kscc >=", value, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccLessThan(Integer value) {
            addCriterion("kscc <", value, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccLessThanOrEqualTo(Integer value) {
            addCriterion("kscc <=", value, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccIn(List<Integer> values) {
            addCriterion("kscc in", values, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccNotIn(List<Integer> values) {
            addCriterion("kscc not in", values, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccBetween(Integer value1, Integer value2) {
            addCriterion("kscc between", value1, value2, "kscc");
            return (Criteria) this;
        }

        public Criteria andKsccNotBetween(Integer value1, Integer value2) {
            addCriterion("kscc not between", value1, value2, "kscc");
            return (Criteria) this;
        }

        public Criteria andKchpIsNull() {
            addCriterion("kchp is null");
            return (Criteria) this;
        }

        public Criteria andKchpIsNotNull() {
            addCriterion("kchp is not null");
            return (Criteria) this;
        }

        public Criteria andKchpEqualTo(String value) {
            addCriterion("kchp =", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpNotEqualTo(String value) {
            addCriterion("kchp <>", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpGreaterThan(String value) {
            addCriterion("kchp >", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpGreaterThanOrEqualTo(String value) {
            addCriterion("kchp >=", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpLessThan(String value) {
            addCriterion("kchp <", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpLessThanOrEqualTo(String value) {
            addCriterion("kchp <=", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpLike(String value) {
            addCriterion("kchp like", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpNotLike(String value) {
            addCriterion("kchp not like", value, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpIn(List<String> values) {
            addCriterion("kchp in", values, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpNotIn(List<String> values) {
            addCriterion("kchp not in", values, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpBetween(String value1, String value2) {
            addCriterion("kchp between", value1, value2, "kchp");
            return (Criteria) this;
        }

        public Criteria andKchpNotBetween(String value1, String value2) {
            addCriterion("kchp not between", value1, value2, "kchp");
            return (Criteria) this;
        }

        public Criteria andJbrIsNull() {
            addCriterion("jbr is null");
            return (Criteria) this;
        }

        public Criteria andJbrIsNotNull() {
            addCriterion("jbr is not null");
            return (Criteria) this;
        }

        public Criteria andJbrEqualTo(String value) {
            addCriterion("jbr =", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotEqualTo(String value) {
            addCriterion("jbr <>", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThan(String value) {
            addCriterion("jbr >", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThanOrEqualTo(String value) {
            addCriterion("jbr >=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThan(String value) {
            addCriterion("jbr <", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThanOrEqualTo(String value) {
            addCriterion("jbr <=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLike(String value) {
            addCriterion("jbr like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotLike(String value) {
            addCriterion("jbr not like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrIn(List<String> values) {
            addCriterion("jbr in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotIn(List<String> values) {
            addCriterion("jbr not in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrBetween(String value1, String value2) {
            addCriterion("jbr between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotBetween(String value1, String value2) {
            addCriterion("jbr not between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNull() {
            addCriterion("glbm is null");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNotNull() {
            addCriterion("glbm is not null");
            return (Criteria) this;
        }

        public Criteria andGlbmEqualTo(String value) {
            addCriterion("glbm =", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotEqualTo(String value) {
            addCriterion("glbm <>", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThan(String value) {
            addCriterion("glbm >", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThanOrEqualTo(String value) {
            addCriterion("glbm >=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThan(String value) {
            addCriterion("glbm <", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThanOrEqualTo(String value) {
            addCriterion("glbm <=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLike(String value) {
            addCriterion("glbm like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotLike(String value) {
            addCriterion("glbm not like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmIn(List<String> values) {
            addCriterion("glbm in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotIn(List<String> values) {
            addCriterion("glbm not in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmBetween(String value1, String value2) {
            addCriterion("glbm between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotBetween(String value1, String value2) {
            addCriterion("glbm not between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andDlrIsNull() {
            addCriterion("dlr is null");
            return (Criteria) this;
        }

        public Criteria andDlrIsNotNull() {
            addCriterion("dlr is not null");
            return (Criteria) this;
        }

        public Criteria andDlrEqualTo(String value) {
            addCriterion("dlr =", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrNotEqualTo(String value) {
            addCriterion("dlr <>", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrGreaterThan(String value) {
            addCriterion("dlr >", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrGreaterThanOrEqualTo(String value) {
            addCriterion("dlr >=", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrLessThan(String value) {
            addCriterion("dlr <", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrLessThanOrEqualTo(String value) {
            addCriterion("dlr <=", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrLike(String value) {
            addCriterion("dlr like", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrNotLike(String value) {
            addCriterion("dlr not like", value, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrIn(List<String> values) {
            addCriterion("dlr in", values, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrNotIn(List<String> values) {
            addCriterion("dlr not in", values, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrBetween(String value1, String value2) {
            addCriterion("dlr between", value1, value2, "dlr");
            return (Criteria) this;
        }

        public Criteria andDlrNotBetween(String value1, String value2) {
            addCriterion("dlr not between", value1, value2, "dlr");
            return (Criteria) this;
        }

        public Criteria andKscjIsNull() {
            addCriterion("kscj is null");
            return (Criteria) this;
        }

        public Criteria andKscjIsNotNull() {
            addCriterion("kscj is not null");
            return (Criteria) this;
        }

        public Criteria andKscjEqualTo(Integer value) {
            addCriterion("kscj =", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjNotEqualTo(Integer value) {
            addCriterion("kscj <>", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjGreaterThan(Integer value) {
            addCriterion("kscj >", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjGreaterThanOrEqualTo(Integer value) {
            addCriterion("kscj >=", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjLessThan(Integer value) {
            addCriterion("kscj <", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjLessThanOrEqualTo(Integer value) {
            addCriterion("kscj <=", value, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjIn(List<Integer> values) {
            addCriterion("kscj in", values, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjNotIn(List<Integer> values) {
            addCriterion("kscj not in", values, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjBetween(Integer value1, Integer value2) {
            addCriterion("kscj between", value1, value2, "kscj");
            return (Criteria) this;
        }

        public Criteria andKscjNotBetween(Integer value1, Integer value2) {
            addCriterion("kscj not between", value1, value2, "kscj");
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

        public Criteria andKsy1IsNull() {
            addCriterion("ksy1 is null");
            return (Criteria) this;
        }

        public Criteria andKsy1IsNotNull() {
            addCriterion("ksy1 is not null");
            return (Criteria) this;
        }

        public Criteria andKsy1EqualTo(String value) {
            addCriterion("ksy1 =", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1NotEqualTo(String value) {
            addCriterion("ksy1 <>", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1GreaterThan(String value) {
            addCriterion("ksy1 >", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1GreaterThanOrEqualTo(String value) {
            addCriterion("ksy1 >=", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1LessThan(String value) {
            addCriterion("ksy1 <", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1LessThanOrEqualTo(String value) {
            addCriterion("ksy1 <=", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1Like(String value) {
            addCriterion("ksy1 like", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1NotLike(String value) {
            addCriterion("ksy1 not like", value, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1In(List<String> values) {
            addCriterion("ksy1 in", values, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1NotIn(List<String> values) {
            addCriterion("ksy1 not in", values, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1Between(String value1, String value2) {
            addCriterion("ksy1 between", value1, value2, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy1NotBetween(String value1, String value2) {
            addCriterion("ksy1 not between", value1, value2, "ksy1");
            return (Criteria) this;
        }

        public Criteria andKsy2IsNull() {
            addCriterion("ksy2 is null");
            return (Criteria) this;
        }

        public Criteria andKsy2IsNotNull() {
            addCriterion("ksy2 is not null");
            return (Criteria) this;
        }

        public Criteria andKsy2EqualTo(String value) {
            addCriterion("ksy2 =", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2NotEqualTo(String value) {
            addCriterion("ksy2 <>", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2GreaterThan(String value) {
            addCriterion("ksy2 >", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2GreaterThanOrEqualTo(String value) {
            addCriterion("ksy2 >=", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2LessThan(String value) {
            addCriterion("ksy2 <", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2LessThanOrEqualTo(String value) {
            addCriterion("ksy2 <=", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2Like(String value) {
            addCriterion("ksy2 like", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2NotLike(String value) {
            addCriterion("ksy2 not like", value, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2In(List<String> values) {
            addCriterion("ksy2 in", values, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2NotIn(List<String> values) {
            addCriterion("ksy2 not in", values, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2Between(String value1, String value2) {
            addCriterion("ksy2 between", value1, value2, "ksy2");
            return (Criteria) this;
        }

        public Criteria andKsy2NotBetween(String value1, String value2) {
            addCriterion("ksy2 not between", value1, value2, "ksy2");
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

        public Criteria andSfykIsNull() {
            addCriterion("sfyk is null");
            return (Criteria) this;
        }

        public Criteria andSfykIsNotNull() {
            addCriterion("sfyk is not null");
            return (Criteria) this;
        }

        public Criteria andSfykEqualTo(String value) {
            addCriterion("sfyk =", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykNotEqualTo(String value) {
            addCriterion("sfyk <>", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykGreaterThan(String value) {
            addCriterion("sfyk >", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykGreaterThanOrEqualTo(String value) {
            addCriterion("sfyk >=", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykLessThan(String value) {
            addCriterion("sfyk <", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykLessThanOrEqualTo(String value) {
            addCriterion("sfyk <=", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykLike(String value) {
            addCriterion("sfyk like", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykNotLike(String value) {
            addCriterion("sfyk not like", value, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykIn(List<String> values) {
            addCriterion("sfyk in", values, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykNotIn(List<String> values) {
            addCriterion("sfyk not in", values, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykBetween(String value1, String value2) {
            addCriterion("sfyk between", value1, value2, "sfyk");
            return (Criteria) this;
        }

        public Criteria andSfykNotBetween(String value1, String value2) {
            addCriterion("sfyk not between", value1, value2, "sfyk");
            return (Criteria) this;
        }

        public Criteria andClzlIsNull() {
            addCriterion("clzl is null");
            return (Criteria) this;
        }

        public Criteria andClzlIsNotNull() {
            addCriterion("clzl is not null");
            return (Criteria) this;
        }

        public Criteria andClzlEqualTo(String value) {
            addCriterion("clzl =", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlNotEqualTo(String value) {
            addCriterion("clzl <>", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlGreaterThan(String value) {
            addCriterion("clzl >", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlGreaterThanOrEqualTo(String value) {
            addCriterion("clzl >=", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlLessThan(String value) {
            addCriterion("clzl <", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlLessThanOrEqualTo(String value) {
            addCriterion("clzl <=", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlLike(String value) {
            addCriterion("clzl like", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlNotLike(String value) {
            addCriterion("clzl not like", value, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlIn(List<String> values) {
            addCriterion("clzl in", values, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlNotIn(List<String> values) {
            addCriterion("clzl not in", values, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlBetween(String value1, String value2) {
            addCriterion("clzl between", value1, value2, "clzl");
            return (Criteria) this;
        }

        public Criteria andClzlNotBetween(String value1, String value2) {
            addCriterion("clzl not between", value1, value2, "clzl");
            return (Criteria) this;
        }

        public Criteria andJlyIsNull() {
            addCriterion("jly is null");
            return (Criteria) this;
        }

        public Criteria andJlyIsNotNull() {
            addCriterion("jly is not null");
            return (Criteria) this;
        }

        public Criteria andJlyEqualTo(String value) {
            addCriterion("jly =", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyNotEqualTo(String value) {
            addCriterion("jly <>", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyGreaterThan(String value) {
            addCriterion("jly >", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyGreaterThanOrEqualTo(String value) {
            addCriterion("jly >=", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyLessThan(String value) {
            addCriterion("jly <", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyLessThanOrEqualTo(String value) {
            addCriterion("jly <=", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyLike(String value) {
            addCriterion("jly like", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyNotLike(String value) {
            addCriterion("jly not like", value, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyIn(List<String> values) {
            addCriterion("jly in", values, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyNotIn(List<String> values) {
            addCriterion("jly not in", values, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyBetween(String value1, String value2) {
            addCriterion("jly between", value1, value2, "jly");
            return (Criteria) this;
        }

        public Criteria andJlyNotBetween(String value1, String value2) {
            addCriterion("jly not between", value1, value2, "jly");
            return (Criteria) this;
        }

        public Criteria andZkkfIsNull() {
            addCriterion("zkkf is null");
            return (Criteria) this;
        }

        public Criteria andZkkfIsNotNull() {
            addCriterion("zkkf is not null");
            return (Criteria) this;
        }

        public Criteria andZkkfEqualTo(Integer value) {
            addCriterion("zkkf =", value, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfNotEqualTo(Integer value) {
            addCriterion("zkkf <>", value, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfGreaterThan(Integer value) {
            addCriterion("zkkf >", value, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfGreaterThanOrEqualTo(Integer value) {
            addCriterion("zkkf >=", value, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfLessThan(Integer value) {
            addCriterion("zkkf <", value, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfLessThanOrEqualTo(Integer value) {
            addCriterion("zkkf <=", value, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfIn(List<Integer> values) {
            addCriterion("zkkf in", values, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfNotIn(List<Integer> values) {
            addCriterion("zkkf not in", values, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfBetween(Integer value1, Integer value2) {
            addCriterion("zkkf between", value1, value2, "zkkf");
            return (Criteria) this;
        }

        public Criteria andZkkfNotBetween(Integer value1, Integer value2) {
            addCriterion("zkkf not between", value1, value2, "zkkf");
            return (Criteria) this;
        }

        public Criteria andCkyyIsNull() {
            addCriterion("ckyy is null");
            return (Criteria) this;
        }

        public Criteria andCkyyIsNotNull() {
            addCriterion("ckyy is not null");
            return (Criteria) this;
        }

        public Criteria andCkyyEqualTo(String value) {
            addCriterion("ckyy =", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyNotEqualTo(String value) {
            addCriterion("ckyy <>", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyGreaterThan(String value) {
            addCriterion("ckyy >", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyGreaterThanOrEqualTo(String value) {
            addCriterion("ckyy >=", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyLessThan(String value) {
            addCriterion("ckyy <", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyLessThanOrEqualTo(String value) {
            addCriterion("ckyy <=", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyLike(String value) {
            addCriterion("ckyy like", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyNotLike(String value) {
            addCriterion("ckyy not like", value, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyIn(List<String> values) {
            addCriterion("ckyy in", values, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyNotIn(List<String> values) {
            addCriterion("ckyy not in", values, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyBetween(String value1, String value2) {
            addCriterion("ckyy between", value1, value2, "ckyy");
            return (Criteria) this;
        }

        public Criteria andCkyyNotBetween(String value1, String value2) {
            addCriterion("ckyy not between", value1, value2, "ckyy");
            return (Criteria) this;
        }

        public Criteria andZwhIsNull() {
            addCriterion("zwh is null");
            return (Criteria) this;
        }

        public Criteria andZwhIsNotNull() {
            addCriterion("zwh is not null");
            return (Criteria) this;
        }

        public Criteria andZwhEqualTo(String value) {
            addCriterion("zwh =", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhNotEqualTo(String value) {
            addCriterion("zwh <>", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhGreaterThan(String value) {
            addCriterion("zwh >", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhGreaterThanOrEqualTo(String value) {
            addCriterion("zwh >=", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhLessThan(String value) {
            addCriterion("zwh <", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhLessThanOrEqualTo(String value) {
            addCriterion("zwh <=", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhLike(String value) {
            addCriterion("zwh like", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhNotLike(String value) {
            addCriterion("zwh not like", value, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhIn(List<String> values) {
            addCriterion("zwh in", values, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhNotIn(List<String> values) {
            addCriterion("zwh not in", values, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhBetween(String value1, String value2) {
            addCriterion("zwh between", value1, value2, "zwh");
            return (Criteria) this;
        }

        public Criteria andZwhNotBetween(String value1, String value2) {
            addCriterion("zwh not between", value1, value2, "zwh");
            return (Criteria) this;
        }

        public Criteria andYwblbmIsNull() {
            addCriterion("ywblbm is null");
            return (Criteria) this;
        }

        public Criteria andYwblbmIsNotNull() {
            addCriterion("ywblbm is not null");
            return (Criteria) this;
        }

        public Criteria andYwblbmEqualTo(String value) {
            addCriterion("ywblbm =", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmNotEqualTo(String value) {
            addCriterion("ywblbm <>", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmGreaterThan(String value) {
            addCriterion("ywblbm >", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmGreaterThanOrEqualTo(String value) {
            addCriterion("ywblbm >=", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmLessThan(String value) {
            addCriterion("ywblbm <", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmLessThanOrEqualTo(String value) {
            addCriterion("ywblbm <=", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmLike(String value) {
            addCriterion("ywblbm like", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmNotLike(String value) {
            addCriterion("ywblbm not like", value, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmIn(List<String> values) {
            addCriterion("ywblbm in", values, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmNotIn(List<String> values) {
            addCriterion("ywblbm not in", values, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmBetween(String value1, String value2) {
            addCriterion("ywblbm between", value1, value2, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andYwblbmNotBetween(String value1, String value2) {
            addCriterion("ywblbm not between", value1, value2, "ywblbm");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andGjIsNull() {
            addCriterion("gj is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("gj is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(String value) {
            addCriterion("gj =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(String value) {
            addCriterion("gj <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(String value) {
            addCriterion("gj >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(String value) {
            addCriterion("gj >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(String value) {
            addCriterion("gj <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(String value) {
            addCriterion("gj <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLike(String value) {
            addCriterion("gj like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotLike(String value) {
            addCriterion("gj not like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<String> values) {
            addCriterion("gj in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<String> values) {
            addCriterion("gj not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(String value1, String value2) {
            addCriterion("gj between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(String value1, String value2) {
            addCriterion("gj not between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andZkbjIsNull() {
            addCriterion("zkbj is null");
            return (Criteria) this;
        }

        public Criteria andZkbjIsNotNull() {
            addCriterion("zkbj is not null");
            return (Criteria) this;
        }

        public Criteria andZkbjEqualTo(String value) {
            addCriterion("zkbj =", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjNotEqualTo(String value) {
            addCriterion("zkbj <>", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjGreaterThan(String value) {
            addCriterion("zkbj >", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjGreaterThanOrEqualTo(String value) {
            addCriterion("zkbj >=", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjLessThan(String value) {
            addCriterion("zkbj <", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjLessThanOrEqualTo(String value) {
            addCriterion("zkbj <=", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjLike(String value) {
            addCriterion("zkbj like", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjNotLike(String value) {
            addCriterion("zkbj not like", value, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjIn(List<String> values) {
            addCriterion("zkbj in", values, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjNotIn(List<String> values) {
            addCriterion("zkbj not in", values, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjBetween(String value1, String value2) {
            addCriterion("zkbj between", value1, value2, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkbjNotBetween(String value1, String value2) {
            addCriterion("zkbj not between", value1, value2, "zkbj");
            return (Criteria) this;
        }

        public Criteria andZkcjIsNull() {
            addCriterion("zkcj is null");
            return (Criteria) this;
        }

        public Criteria andZkcjIsNotNull() {
            addCriterion("zkcj is not null");
            return (Criteria) this;
        }

        public Criteria andZkcjEqualTo(Integer value) {
            addCriterion("zkcj =", value, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjNotEqualTo(Integer value) {
            addCriterion("zkcj <>", value, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjGreaterThan(Integer value) {
            addCriterion("zkcj >", value, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjGreaterThanOrEqualTo(Integer value) {
            addCriterion("zkcj >=", value, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjLessThan(Integer value) {
            addCriterion("zkcj <", value, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjLessThanOrEqualTo(Integer value) {
            addCriterion("zkcj <=", value, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjIn(List<Integer> values) {
            addCriterion("zkcj in", values, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjNotIn(List<Integer> values) {
            addCriterion("zkcj not in", values, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjBetween(Integer value1, Integer value2) {
            addCriterion("zkcj between", value1, value2, "zkcj");
            return (Criteria) this;
        }

        public Criteria andZkcjNotBetween(Integer value1, Integer value2) {
            addCriterion("zkcj not between", value1, value2, "zkcj");
            return (Criteria) this;
        }

        public Criteria andYkcsIsNull() {
            addCriterion("ykcs is null");
            return (Criteria) this;
        }

        public Criteria andYkcsIsNotNull() {
            addCriterion("ykcs is not null");
            return (Criteria) this;
        }

        public Criteria andYkcsEqualTo(Integer value) {
            addCriterion("ykcs =", value, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsNotEqualTo(Integer value) {
            addCriterion("ykcs <>", value, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsGreaterThan(Integer value) {
            addCriterion("ykcs >", value, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ykcs >=", value, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsLessThan(Integer value) {
            addCriterion("ykcs <", value, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsLessThanOrEqualTo(Integer value) {
            addCriterion("ykcs <=", value, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsIn(List<Integer> values) {
            addCriterion("ykcs in", values, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsNotIn(List<Integer> values) {
            addCriterion("ykcs not in", values, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsBetween(Integer value1, Integer value2) {
            addCriterion("ykcs between", value1, value2, "ykcs");
            return (Criteria) this;
        }

        public Criteria andYkcsNotBetween(Integer value1, Integer value2) {
            addCriterion("ykcs not between", value1, value2, "ykcs");
            return (Criteria) this;
        }

        public Criteria andDabhIsNull() {
            addCriterion("dabh is null");
            return (Criteria) this;
        }

        public Criteria andDabhIsNotNull() {
            addCriterion("dabh is not null");
            return (Criteria) this;
        }

        public Criteria andDabhEqualTo(String value) {
            addCriterion("dabh =", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotEqualTo(String value) {
            addCriterion("dabh <>", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhGreaterThan(String value) {
            addCriterion("dabh >", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhGreaterThanOrEqualTo(String value) {
            addCriterion("dabh >=", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLessThan(String value) {
            addCriterion("dabh <", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLessThanOrEqualTo(String value) {
            addCriterion("dabh <=", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLike(String value) {
            addCriterion("dabh like", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotLike(String value) {
            addCriterion("dabh not like", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhIn(List<String> values) {
            addCriterion("dabh in", values, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotIn(List<String> values) {
            addCriterion("dabh not in", values, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhBetween(String value1, String value2) {
            addCriterion("dabh between", value1, value2, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotBetween(String value1, String value2) {
            addCriterion("dabh not between", value1, value2, "dabh");
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

        public Criteria andJmwIsNull() {
            addCriterion("jmw is null");
            return (Criteria) this;
        }

        public Criteria andJmwIsNotNull() {
            addCriterion("jmw is not null");
            return (Criteria) this;
        }

        public Criteria andJmwEqualTo(String value) {
            addCriterion("jmw =", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwNotEqualTo(String value) {
            addCriterion("jmw <>", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwGreaterThan(String value) {
            addCriterion("jmw >", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwGreaterThanOrEqualTo(String value) {
            addCriterion("jmw >=", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwLessThan(String value) {
            addCriterion("jmw <", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwLessThanOrEqualTo(String value) {
            addCriterion("jmw <=", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwLike(String value) {
            addCriterion("jmw like", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwNotLike(String value) {
            addCriterion("jmw not like", value, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwIn(List<String> values) {
            addCriterion("jmw in", values, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwNotIn(List<String> values) {
            addCriterion("jmw not in", values, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwBetween(String value1, String value2) {
            addCriterion("jmw between", value1, value2, "jmw");
            return (Criteria) this;
        }

        public Criteria andJmwNotBetween(String value1, String value2) {
            addCriterion("jmw not between", value1, value2, "jmw");
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

        public Criteria andF4IsNull() {
            addCriterion("f4 is null");
            return (Criteria) this;
        }

        public Criteria andF4IsNotNull() {
            addCriterion("f4 is not null");
            return (Criteria) this;
        }

        public Criteria andF4EqualTo(String value) {
            addCriterion("f4 =", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotEqualTo(String value) {
            addCriterion("f4 <>", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThan(String value) {
            addCriterion("f4 >", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThanOrEqualTo(String value) {
            addCriterion("f4 >=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThan(String value) {
            addCriterion("f4 <", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThanOrEqualTo(String value) {
            addCriterion("f4 <=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Like(String value) {
            addCriterion("f4 like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotLike(String value) {
            addCriterion("f4 not like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4In(List<String> values) {
            addCriterion("f4 in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotIn(List<String> values) {
            addCriterion("f4 not in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Between(String value1, String value2) {
            addCriterion("f4 between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotBetween(String value1, String value2) {
            addCriterion("f4 not between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF5IsNull() {
            addCriterion("f5 is null");
            return (Criteria) this;
        }

        public Criteria andF5IsNotNull() {
            addCriterion("f5 is not null");
            return (Criteria) this;
        }

        public Criteria andF5EqualTo(String value) {
            addCriterion("f5 =", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotEqualTo(String value) {
            addCriterion("f5 <>", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThan(String value) {
            addCriterion("f5 >", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThanOrEqualTo(String value) {
            addCriterion("f5 >=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThan(String value) {
            addCriterion("f5 <", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThanOrEqualTo(String value) {
            addCriterion("f5 <=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Like(String value) {
            addCriterion("f5 like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotLike(String value) {
            addCriterion("f5 not like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5In(List<String> values) {
            addCriterion("f5 in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotIn(List<String> values) {
            addCriterion("f5 not in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Between(String value1, String value2) {
            addCriterion("f5 between", value1, value2, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotBetween(String value1, String value2) {
            addCriterion("f5 not between", value1, value2, "f5");
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

        public Criteria andZksfgIsNull() {
            addCriterion("zksfg is null");
            return (Criteria) this;
        }

        public Criteria andZksfgIsNotNull() {
            addCriterion("zksfg is not null");
            return (Criteria) this;
        }

        public Criteria andZksfgEqualTo(String value) {
            addCriterion("zksfg =", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgNotEqualTo(String value) {
            addCriterion("zksfg <>", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgGreaterThan(String value) {
            addCriterion("zksfg >", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgGreaterThanOrEqualTo(String value) {
            addCriterion("zksfg >=", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgLessThan(String value) {
            addCriterion("zksfg <", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgLessThanOrEqualTo(String value) {
            addCriterion("zksfg <=", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgLike(String value) {
            addCriterion("zksfg like", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgNotLike(String value) {
            addCriterion("zksfg not like", value, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgIn(List<String> values) {
            addCriterion("zksfg in", values, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgNotIn(List<String> values) {
            addCriterion("zksfg not in", values, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgBetween(String value1, String value2) {
            addCriterion("zksfg between", value1, value2, "zksfg");
            return (Criteria) this;
        }

        public Criteria andZksfgNotBetween(String value1, String value2) {
            addCriterion("zksfg not between", value1, value2, "zksfg");
            return (Criteria) this;
        }

        public Criteria andBdztIsNull() {
            addCriterion("bdzt is null");
            return (Criteria) this;
        }

        public Criteria andBdztIsNotNull() {
            addCriterion("bdzt is not null");
            return (Criteria) this;
        }

        public Criteria andBdztEqualTo(Integer value) {
            addCriterion("bdzt =", value, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztNotEqualTo(Integer value) {
            addCriterion("bdzt <>", value, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztGreaterThan(Integer value) {
            addCriterion("bdzt >", value, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdzt >=", value, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztLessThan(Integer value) {
            addCriterion("bdzt <", value, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztLessThanOrEqualTo(Integer value) {
            addCriterion("bdzt <=", value, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztIn(List<Integer> values) {
            addCriterion("bdzt in", values, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztNotIn(List<Integer> values) {
            addCriterion("bdzt not in", values, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztBetween(Integer value1, Integer value2) {
            addCriterion("bdzt between", value1, value2, "bdzt");
            return (Criteria) this;
        }

        public Criteria andBdztNotBetween(Integer value1, Integer value2) {
            addCriterion("bdzt not between", value1, value2, "bdzt");
            return (Criteria) this;
        }

        public Criteria andLcztIsNull() {
            addCriterion("lczt is null");
            return (Criteria) this;
        }

        public Criteria andLcztIsNotNull() {
            addCriterion("lczt is not null");
            return (Criteria) this;
        }

        public Criteria andLcztEqualTo(String value) {
            addCriterion("lczt =", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztNotEqualTo(String value) {
            addCriterion("lczt <>", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztGreaterThan(String value) {
            addCriterion("lczt >", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztGreaterThanOrEqualTo(String value) {
            addCriterion("lczt >=", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztLessThan(String value) {
            addCriterion("lczt <", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztLessThanOrEqualTo(String value) {
            addCriterion("lczt <=", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztLike(String value) {
            addCriterion("lczt like", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztNotLike(String value) {
            addCriterion("lczt not like", value, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztIn(List<String> values) {
            addCriterion("lczt in", values, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztNotIn(List<String> values) {
            addCriterion("lczt not in", values, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztBetween(String value1, String value2) {
            addCriterion("lczt between", value1, value2, "lczt");
            return (Criteria) this;
        }

        public Criteria andLcztNotBetween(String value1, String value2) {
            addCriterion("lczt not between", value1, value2, "lczt");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andBdyzztIsNull() {
            addCriterion("bdyzzt is null");
            return (Criteria) this;
        }

        public Criteria andBdyzztIsNotNull() {
            addCriterion("bdyzzt is not null");
            return (Criteria) this;
        }

        public Criteria andBdyzztEqualTo(Integer value) {
            addCriterion("bdyzzt =", value, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztNotEqualTo(Integer value) {
            addCriterion("bdyzzt <>", value, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztGreaterThan(Integer value) {
            addCriterion("bdyzzt >", value, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztGreaterThanOrEqualTo(Integer value) {
            addCriterion("bdyzzt >=", value, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztLessThan(Integer value) {
            addCriterion("bdyzzt <", value, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztLessThanOrEqualTo(Integer value) {
            addCriterion("bdyzzt <=", value, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztIn(List<Integer> values) {
            addCriterion("bdyzzt in", values, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztNotIn(List<Integer> values) {
            addCriterion("bdyzzt not in", values, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztBetween(Integer value1, Integer value2) {
            addCriterion("bdyzzt between", value1, value2, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andBdyzztNotBetween(Integer value1, Integer value2) {
            addCriterion("bdyzzt not between", value1, value2, "bdyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztIsNull() {
            addCriterion("scyzzt is null");
            return (Criteria) this;
        }

        public Criteria andScyzztIsNotNull() {
            addCriterion("scyzzt is not null");
            return (Criteria) this;
        }

        public Criteria andScyzztEqualTo(Integer value) {
            addCriterion("scyzzt =", value, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztNotEqualTo(Integer value) {
            addCriterion("scyzzt <>", value, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztGreaterThan(Integer value) {
            addCriterion("scyzzt >", value, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztGreaterThanOrEqualTo(Integer value) {
            addCriterion("scyzzt >=", value, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztLessThan(Integer value) {
            addCriterion("scyzzt <", value, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztLessThanOrEqualTo(Integer value) {
            addCriterion("scyzzt <=", value, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztIn(List<Integer> values) {
            addCriterion("scyzzt in", values, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztNotIn(List<Integer> values) {
            addCriterion("scyzzt not in", values, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztBetween(Integer value1, Integer value2) {
            addCriterion("scyzzt between", value1, value2, "scyzzt");
            return (Criteria) this;
        }

        public Criteria andScyzztNotBetween(Integer value1, Integer value2) {
            addCriterion("scyzzt not between", value1, value2, "scyzzt");
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

        public Criteria andZwIsNull() {
            addCriterion("zw is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("zw is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("zw =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("zw <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("zw >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("zw >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("zw <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("zw <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("zw like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("zw not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("zw in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("zw not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("zw between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("zw not between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andPrintZtIsNull() {
            addCriterion("print_zt is null");
            return (Criteria) this;
        }

        public Criteria andPrintZtIsNotNull() {
            addCriterion("print_zt is not null");
            return (Criteria) this;
        }

        public Criteria andPrintZtEqualTo(Integer value) {
            addCriterion("print_zt =", value, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtNotEqualTo(Integer value) {
            addCriterion("print_zt <>", value, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtGreaterThan(Integer value) {
            addCriterion("print_zt >", value, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtGreaterThanOrEqualTo(Integer value) {
            addCriterion("print_zt >=", value, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtLessThan(Integer value) {
            addCriterion("print_zt <", value, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtLessThanOrEqualTo(Integer value) {
            addCriterion("print_zt <=", value, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtIn(List<Integer> values) {
            addCriterion("print_zt in", values, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtNotIn(List<Integer> values) {
            addCriterion("print_zt not in", values, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtBetween(Integer value1, Integer value2) {
            addCriterion("print_zt between", value1, value2, "printZt");
            return (Criteria) this;
        }

        public Criteria andPrintZtNotBetween(Integer value1, Integer value2) {
            addCriterion("print_zt not between", value1, value2, "printZt");
            return (Criteria) this;
        }

        public Criteria andYyrqIsNull() {
            addCriterion("yyrq is null");
            return (Criteria) this;
        }

        public Criteria andYyrqIsNotNull() {
            addCriterion("yyrq is not null");
            return (Criteria) this;
        }

        public Criteria andYyrqEqualTo(Date value) {
            addCriterion("yyrq =", value, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqNotEqualTo(Date value) {
            addCriterion("yyrq <>", value, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqGreaterThan(Date value) {
            addCriterion("yyrq >", value, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqGreaterThanOrEqualTo(Date value) {
            addCriterion("yyrq >=", value, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqLessThan(Date value) {
            addCriterion("yyrq <", value, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqLessThanOrEqualTo(Date value) {
            addCriterion("yyrq <=", value, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqIn(List<Date> values) {
            addCriterion("yyrq in", values, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqNotIn(List<Date> values) {
            addCriterion("yyrq not in", values, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqBetween(Date value1, Date value2) {
            addCriterion("yyrq between", value1, value2, "yyrq");
            return (Criteria) this;
        }

        public Criteria andYyrqNotBetween(Date value1, Date value2) {
            addCriterion("yyrq not between", value1, value2, "yyrq");
            return (Criteria) this;
        }

        public Criteria andKsrqIsNull() {
            addCriterion("ksrq is null");
            return (Criteria) this;
        }

        public Criteria andKsrqIsNotNull() {
            addCriterion("ksrq is not null");
            return (Criteria) this;
        }

        public Criteria andKsrqEqualTo(Date value) {
            addCriterion("ksrq =", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqNotEqualTo(Date value) {
            addCriterion("ksrq <>", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqGreaterThan(Date value) {
            addCriterion("ksrq >", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ksrq >=", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqLessThan(Date value) {
            addCriterion("ksrq <", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqLessThanOrEqualTo(Date value) {
            addCriterion("ksrq <=", value, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqIn(List<Date> values) {
            addCriterion("ksrq in", values, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqNotIn(List<Date> values) {
            addCriterion("ksrq not in", values, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqBetween(Date value1, Date value2) {
            addCriterion("ksrq between", value1, value2, "ksrq");
            return (Criteria) this;
        }

        public Criteria andKsrqNotBetween(Date value1, Date value2) {
            addCriterion("ksrq not between", value1, value2, "ksrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqIsNull() {
            addCriterion("pxshrq is null");
            return (Criteria) this;
        }

        public Criteria andPxshrqIsNotNull() {
            addCriterion("pxshrq is not null");
            return (Criteria) this;
        }

        public Criteria andPxshrqEqualTo(Date value) {
            addCriterion("pxshrq =", value, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqNotEqualTo(Date value) {
            addCriterion("pxshrq <>", value, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqGreaterThan(Date value) {
            addCriterion("pxshrq >", value, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqGreaterThanOrEqualTo(Date value) {
            addCriterion("pxshrq >=", value, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqLessThan(Date value) {
            addCriterion("pxshrq <", value, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqLessThanOrEqualTo(Date value) {
            addCriterion("pxshrq <=", value, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqIn(List<Date> values) {
            addCriterion("pxshrq in", values, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqNotIn(List<Date> values) {
            addCriterion("pxshrq not in", values, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqBetween(Date value1, Date value2) {
            addCriterion("pxshrq between", value1, value2, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andPxshrqNotBetween(Date value1, Date value2) {
            addCriterion("pxshrq not between", value1, value2, "pxshrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqIsNull() {
            addCriterion("zkykrq is null");
            return (Criteria) this;
        }

        public Criteria andZkykrqIsNotNull() {
            addCriterion("zkykrq is not null");
            return (Criteria) this;
        }

        public Criteria andZkykrqEqualTo(Date value) {
            addCriterion("zkykrq =", value, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqNotEqualTo(Date value) {
            addCriterion("zkykrq <>", value, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqGreaterThan(Date value) {
            addCriterion("zkykrq >", value, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zkykrq >=", value, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqLessThan(Date value) {
            addCriterion("zkykrq <", value, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqLessThanOrEqualTo(Date value) {
            addCriterion("zkykrq <=", value, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqIn(List<Date> values) {
            addCriterion("zkykrq in", values, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqNotIn(List<Date> values) {
            addCriterion("zkykrq not in", values, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqBetween(Date value1, Date value2) {
            addCriterion("zkykrq between", value1, value2, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andZkykrqNotBetween(Date value1, Date value2) {
            addCriterion("zkykrq not between", value1, value2, "zkykrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterion("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterion("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterion("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterion("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterion("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterion("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterion("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterion("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterion("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andYkrqIsNull() {
            addCriterion("ykrq is null");
            return (Criteria) this;
        }

        public Criteria andYkrqIsNotNull() {
            addCriterion("ykrq is not null");
            return (Criteria) this;
        }

        public Criteria andYkrqEqualTo(Date value) {
            addCriterion("ykrq =", value, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqNotEqualTo(Date value) {
            addCriterion("ykrq <>", value, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqGreaterThan(Date value) {
            addCriterion("ykrq >", value, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ykrq >=", value, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqLessThan(Date value) {
            addCriterion("ykrq <", value, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqLessThanOrEqualTo(Date value) {
            addCriterion("ykrq <=", value, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqIn(List<Date> values) {
            addCriterion("ykrq in", values, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqNotIn(List<Date> values) {
            addCriterion("ykrq not in", values, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqBetween(Date value1, Date value2) {
            addCriterion("ykrq between", value1, value2, "ykrq");
            return (Criteria) this;
        }

        public Criteria andYkrqNotBetween(Date value1, Date value2) {
            addCriterion("ykrq not between", value1, value2, "ykrq");
            return (Criteria) this;
        }

        public Criteria andBdsjIsNull() {
            addCriterion("bdsj is null");
            return (Criteria) this;
        }

        public Criteria andBdsjIsNotNull() {
            addCriterion("bdsj is not null");
            return (Criteria) this;
        }

        public Criteria andBdsjEqualTo(Date value) {
            addCriterion("bdsj =", value, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjNotEqualTo(Date value) {
            addCriterion("bdsj <>", value, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjGreaterThan(Date value) {
            addCriterion("bdsj >", value, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjGreaterThanOrEqualTo(Date value) {
            addCriterion("bdsj >=", value, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjLessThan(Date value) {
            addCriterion("bdsj <", value, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjLessThanOrEqualTo(Date value) {
            addCriterion("bdsj <=", value, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjIn(List<Date> values) {
            addCriterion("bdsj in", values, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjNotIn(List<Date> values) {
            addCriterion("bdsj not in", values, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjBetween(Date value1, Date value2) {
            addCriterion("bdsj between", value1, value2, "bdsj");
            return (Criteria) this;
        }

        public Criteria andBdsjNotBetween(Date value1, Date value2) {
            addCriterion("bdsj not between", value1, value2, "bdsj");
            return (Criteria) this;
        }

        public Criteria andFpsjIsNull() {
            addCriterion("fpsj is null");
            return (Criteria) this;
        }

        public Criteria andFpsjIsNotNull() {
            addCriterion("fpsj is not null");
            return (Criteria) this;
        }

        public Criteria andFpsjEqualTo(Date value) {
            addCriterion("fpsj =", value, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjNotEqualTo(Date value) {
            addCriterion("fpsj <>", value, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjGreaterThan(Date value) {
            addCriterion("fpsj >", value, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjGreaterThanOrEqualTo(Date value) {
            addCriterion("fpsj >=", value, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjLessThan(Date value) {
            addCriterion("fpsj <", value, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjLessThanOrEqualTo(Date value) {
            addCriterion("fpsj <=", value, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjIn(List<Date> values) {
            addCriterion("fpsj in", values, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjNotIn(List<Date> values) {
            addCriterion("fpsj not in", values, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjBetween(Date value1, Date value2) {
            addCriterion("fpsj between", value1, value2, "fpsj");
            return (Criteria) this;
        }

        public Criteria andFpsjNotBetween(Date value1, Date value2) {
            addCriterion("fpsj not between", value1, value2, "fpsj");
            return (Criteria) this;
        }

        public Criteria andKskssjIsNull() {
            addCriterion("kskssj is null");
            return (Criteria) this;
        }

        public Criteria andKskssjIsNotNull() {
            addCriterion("kskssj is not null");
            return (Criteria) this;
        }

        public Criteria andKskssjEqualTo(Date value) {
            addCriterion("kskssj =", value, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjNotEqualTo(Date value) {
            addCriterion("kskssj <>", value, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjGreaterThan(Date value) {
            addCriterion("kskssj >", value, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjGreaterThanOrEqualTo(Date value) {
            addCriterion("kskssj >=", value, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjLessThan(Date value) {
            addCriterion("kskssj <", value, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjLessThanOrEqualTo(Date value) {
            addCriterion("kskssj <=", value, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjIn(List<Date> values) {
            addCriterion("kskssj in", values, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjNotIn(List<Date> values) {
            addCriterion("kskssj not in", values, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjBetween(Date value1, Date value2) {
            addCriterion("kskssj between", value1, value2, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKskssjNotBetween(Date value1, Date value2) {
            addCriterion("kskssj not between", value1, value2, "kskssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjIsNull() {
            addCriterion("ksjssj is null");
            return (Criteria) this;
        }

        public Criteria andKsjssjIsNotNull() {
            addCriterion("ksjssj is not null");
            return (Criteria) this;
        }

        public Criteria andKsjssjEqualTo(Date value) {
            addCriterion("ksjssj =", value, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjNotEqualTo(Date value) {
            addCriterion("ksjssj <>", value, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjGreaterThan(Date value) {
            addCriterion("ksjssj >", value, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjGreaterThanOrEqualTo(Date value) {
            addCriterion("ksjssj >=", value, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjLessThan(Date value) {
            addCriterion("ksjssj <", value, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjLessThanOrEqualTo(Date value) {
            addCriterion("ksjssj <=", value, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjIn(List<Date> values) {
            addCriterion("ksjssj in", values, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjNotIn(List<Date> values) {
            addCriterion("ksjssj not in", values, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjBetween(Date value1, Date value2) {
            addCriterion("ksjssj between", value1, value2, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andKsjssjNotBetween(Date value1, Date value2) {
            addCriterion("ksjssj not between", value1, value2, "ksjssj");
            return (Criteria) this;
        }

        public Criteria andCjscsjIsNull() {
            addCriterion("cjscsj is null");
            return (Criteria) this;
        }

        public Criteria andCjscsjIsNotNull() {
            addCriterion("cjscsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjscsjEqualTo(Date value) {
            addCriterion("cjscsj =", value, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjNotEqualTo(Date value) {
            addCriterion("cjscsj <>", value, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjGreaterThan(Date value) {
            addCriterion("cjscsj >", value, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjscsj >=", value, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjLessThan(Date value) {
            addCriterion("cjscsj <", value, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjLessThanOrEqualTo(Date value) {
            addCriterion("cjscsj <=", value, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjIn(List<Date> values) {
            addCriterion("cjscsj in", values, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjNotIn(List<Date> values) {
            addCriterion("cjscsj not in", values, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjBetween(Date value1, Date value2) {
            addCriterion("cjscsj between", value1, value2, "cjscsj");
            return (Criteria) this;
        }

        public Criteria andCjscsjNotBetween(Date value1, Date value2) {
            addCriterion("cjscsj not between", value1, value2, "cjscsj");
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