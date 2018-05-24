package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamsiteExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamsiteExample() {
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
            addCriterion("KCDDDH is null");
            return (Criteria) this;
        }

        public Criteria andKcdddhIsNotNull() {
            addCriterion("KCDDDH is not null");
            return (Criteria) this;
        }

        public Criteria andKcdddhEqualTo(String value) {
            addCriterion("KCDDDH =", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotEqualTo(String value) {
            addCriterion("KCDDDH <>", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhGreaterThan(String value) {
            addCriterion("KCDDDH >", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhGreaterThanOrEqualTo(String value) {
            addCriterion("KCDDDH >=", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhLessThan(String value) {
            addCriterion("KCDDDH <", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhLessThanOrEqualTo(String value) {
            addCriterion("KCDDDH <=", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhLike(String value) {
            addCriterion("KCDDDH like", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotLike(String value) {
            addCriterion("KCDDDH not like", value, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhIn(List<String> values) {
            addCriterion("KCDDDH in", values, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotIn(List<String> values) {
            addCriterion("KCDDDH not in", values, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhBetween(String value1, String value2) {
            addCriterion("KCDDDH between", value1, value2, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcdddhNotBetween(String value1, String value2) {
            addCriterion("KCDDDH not between", value1, value2, "kcdddh");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNull() {
            addCriterion("KCMC is null");
            return (Criteria) this;
        }

        public Criteria andKcmcIsNotNull() {
            addCriterion("KCMC is not null");
            return (Criteria) this;
        }

        public Criteria andKcmcEqualTo(String value) {
            addCriterion("KCMC =", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotEqualTo(String value) {
            addCriterion("KCMC <>", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThan(String value) {
            addCriterion("KCMC >", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcGreaterThanOrEqualTo(String value) {
            addCriterion("KCMC >=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThan(String value) {
            addCriterion("KCMC <", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLessThanOrEqualTo(String value) {
            addCriterion("KCMC <=", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcLike(String value) {
            addCriterion("KCMC like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotLike(String value) {
            addCriterion("KCMC not like", value, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcIn(List<String> values) {
            addCriterion("KCMC in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotIn(List<String> values) {
            addCriterion("KCMC not in", values, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcBetween(String value1, String value2) {
            addCriterion("KCMC between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andKcmcNotBetween(String value1, String value2) {
            addCriterion("KCMC not between", value1, value2, "kcmc");
            return (Criteria) this;
        }

        public Criteria andCksbsIsNull() {
            addCriterion("CKSBS is null");
            return (Criteria) this;
        }

        public Criteria andCksbsIsNotNull() {
            addCriterion("CKSBS is not null");
            return (Criteria) this;
        }

        public Criteria andCksbsEqualTo(Integer value) {
            addCriterion("CKSBS =", value, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsNotEqualTo(Integer value) {
            addCriterion("CKSBS <>", value, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsGreaterThan(Integer value) {
            addCriterion("CKSBS >", value, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CKSBS >=", value, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsLessThan(Integer value) {
            addCriterion("CKSBS <", value, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsLessThanOrEqualTo(Integer value) {
            addCriterion("CKSBS <=", value, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsIn(List<Integer> values) {
            addCriterion("CKSBS in", values, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsNotIn(List<Integer> values) {
            addCriterion("CKSBS not in", values, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsBetween(Integer value1, Integer value2) {
            addCriterion("CKSBS between", value1, value2, "cksbs");
            return (Criteria) this;
        }

        public Criteria andCksbsNotBetween(Integer value1, Integer value2) {
            addCriterion("CKSBS not between", value1, value2, "cksbs");
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

        public Criteria andKsxmIsNull() {
            addCriterion("KSXM is null");
            return (Criteria) this;
        }

        public Criteria andKsxmIsNotNull() {
            addCriterion("KSXM is not null");
            return (Criteria) this;
        }

        public Criteria andKsxmEqualTo(String value) {
            addCriterion("KSXM =", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotEqualTo(String value) {
            addCriterion("KSXM <>", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmGreaterThan(String value) {
            addCriterion("KSXM >", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmGreaterThanOrEqualTo(String value) {
            addCriterion("KSXM >=", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmLessThan(String value) {
            addCriterion("KSXM <", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmLessThanOrEqualTo(String value) {
            addCriterion("KSXM <=", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmLike(String value) {
            addCriterion("KSXM like", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotLike(String value) {
            addCriterion("KSXM not like", value, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmIn(List<String> values) {
            addCriterion("KSXM in", values, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotIn(List<String> values) {
            addCriterion("KSXM not in", values, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmBetween(String value1, String value2) {
            addCriterion("KSXM between", value1, value2, "ksxm");
            return (Criteria) this;
        }

        public Criteria andKsxmNotBetween(String value1, String value2) {
            addCriterion("KSXM not between", value1, value2, "ksxm");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNull() {
            addCriterion("YWLX is null");
            return (Criteria) this;
        }

        public Criteria andYwlxIsNotNull() {
            addCriterion("YWLX is not null");
            return (Criteria) this;
        }

        public Criteria andYwlxEqualTo(String value) {
            addCriterion("YWLX =", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotEqualTo(String value) {
            addCriterion("YWLX <>", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThan(String value) {
            addCriterion("YWLX >", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxGreaterThanOrEqualTo(String value) {
            addCriterion("YWLX >=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThan(String value) {
            addCriterion("YWLX <", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLessThanOrEqualTo(String value) {
            addCriterion("YWLX <=", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxLike(String value) {
            addCriterion("YWLX like", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotLike(String value) {
            addCriterion("YWLX not like", value, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxIn(List<String> values) {
            addCriterion("YWLX in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotIn(List<String> values) {
            addCriterion("YWLX not in", values, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxBetween(String value1, String value2) {
            addCriterion("YWLX between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andYwlxNotBetween(String value1, String value2) {
            addCriterion("YWLX not between", value1, value2, "ywlx");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNull() {
            addCriterion("FZJG is null");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNotNull() {
            addCriterion("FZJG is not null");
            return (Criteria) this;
        }

        public Criteria andFzjgEqualTo(String value) {
            addCriterion("FZJG =", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotEqualTo(String value) {
            addCriterion("FZJG <>", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThan(String value) {
            addCriterion("FZJG >", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThanOrEqualTo(String value) {
            addCriterion("FZJG >=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThan(String value) {
            addCriterion("FZJG <", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThanOrEqualTo(String value) {
            addCriterion("FZJG <=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLike(String value) {
            addCriterion("FZJG like", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotLike(String value) {
            addCriterion("FZJG not like", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgIn(List<String> values) {
            addCriterion("FZJG in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotIn(List<String> values) {
            addCriterion("FZJG not in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgBetween(String value1, String value2) {
            addCriterion("FZJG between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotBetween(String value1, String value2) {
            addCriterion("FZJG not between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNull() {
            addCriterion("GLBM is null");
            return (Criteria) this;
        }

        public Criteria andGlbmIsNotNull() {
            addCriterion("GLBM is not null");
            return (Criteria) this;
        }

        public Criteria andGlbmEqualTo(String value) {
            addCriterion("GLBM =", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotEqualTo(String value) {
            addCriterion("GLBM <>", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThan(String value) {
            addCriterion("GLBM >", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmGreaterThanOrEqualTo(String value) {
            addCriterion("GLBM >=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThan(String value) {
            addCriterion("GLBM <", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLessThanOrEqualTo(String value) {
            addCriterion("GLBM <=", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmLike(String value) {
            addCriterion("GLBM like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotLike(String value) {
            addCriterion("GLBM not like", value, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmIn(List<String> values) {
            addCriterion("GLBM in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotIn(List<String> values) {
            addCriterion("GLBM not in", values, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmBetween(String value1, String value2) {
            addCriterion("GLBM between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andGlbmNotBetween(String value1, String value2) {
            addCriterion("GLBM not between", value1, value2, "glbm");
            return (Criteria) this;
        }

        public Criteria andKskmIsNull() {
            addCriterion("KSKM is null");
            return (Criteria) this;
        }

        public Criteria andKskmIsNotNull() {
            addCriterion("KSKM is not null");
            return (Criteria) this;
        }

        public Criteria andKskmEqualTo(String value) {
            addCriterion("KSKM =", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotEqualTo(String value) {
            addCriterion("KSKM <>", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmGreaterThan(String value) {
            addCriterion("KSKM >", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmGreaterThanOrEqualTo(String value) {
            addCriterion("KSKM >=", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmLessThan(String value) {
            addCriterion("KSKM <", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmLessThanOrEqualTo(String value) {
            addCriterion("KSKM <=", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmLike(String value) {
            addCriterion("KSKM like", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotLike(String value) {
            addCriterion("KSKM not like", value, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmIn(List<String> values) {
            addCriterion("KSKM in", values, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotIn(List<String> values) {
            addCriterion("KSKM not in", values, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmBetween(String value1, String value2) {
            addCriterion("KSKM between", value1, value2, "kskm");
            return (Criteria) this;
        }

        public Criteria andKskmNotBetween(String value1, String value2) {
            addCriterion("KSKM not between", value1, value2, "kskm");
            return (Criteria) this;
        }

        public Criteria andKkcxIsNull() {
            addCriterion("KKCX is null");
            return (Criteria) this;
        }

        public Criteria andKkcxIsNotNull() {
            addCriterion("KKCX is not null");
            return (Criteria) this;
        }

        public Criteria andKkcxEqualTo(String value) {
            addCriterion("KKCX =", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxNotEqualTo(String value) {
            addCriterion("KKCX <>", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxGreaterThan(String value) {
            addCriterion("KKCX >", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxGreaterThanOrEqualTo(String value) {
            addCriterion("KKCX >=", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxLessThan(String value) {
            addCriterion("KKCX <", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxLessThanOrEqualTo(String value) {
            addCriterion("KKCX <=", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxLike(String value) {
            addCriterion("KKCX like", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxNotLike(String value) {
            addCriterion("KKCX not like", value, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxIn(List<String> values) {
            addCriterion("KKCX in", values, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxNotIn(List<String> values) {
            addCriterion("KKCX not in", values, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxBetween(String value1, String value2) {
            addCriterion("KKCX between", value1, value2, "kkcx");
            return (Criteria) this;
        }

        public Criteria andKkcxNotBetween(String value1, String value2) {
            addCriterion("KKCX not between", value1, value2, "kkcx");
            return (Criteria) this;
        }

        public Criteria andYsrIsNull() {
            addCriterion("YSR is null");
            return (Criteria) this;
        }

        public Criteria andYsrIsNotNull() {
            addCriterion("YSR is not null");
            return (Criteria) this;
        }

        public Criteria andYsrEqualTo(String value) {
            addCriterion("YSR =", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrNotEqualTo(String value) {
            addCriterion("YSR <>", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrGreaterThan(String value) {
            addCriterion("YSR >", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrGreaterThanOrEqualTo(String value) {
            addCriterion("YSR >=", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrLessThan(String value) {
            addCriterion("YSR <", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrLessThanOrEqualTo(String value) {
            addCriterion("YSR <=", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrLike(String value) {
            addCriterion("YSR like", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrNotLike(String value) {
            addCriterion("YSR not like", value, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrIn(List<String> values) {
            addCriterion("YSR in", values, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrNotIn(List<String> values) {
            addCriterion("YSR not in", values, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrBetween(String value1, String value2) {
            addCriterion("YSR between", value1, value2, "ysr");
            return (Criteria) this;
        }

        public Criteria andYsrNotBetween(String value1, String value2) {
            addCriterion("YSR not between", value1, value2, "ysr");
            return (Criteria) this;
        }

        public Criteria andKmeyymsIsNull() {
            addCriterion("KMEYYMS is null");
            return (Criteria) this;
        }

        public Criteria andKmeyymsIsNotNull() {
            addCriterion("KMEYYMS is not null");
            return (Criteria) this;
        }

        public Criteria andKmeyymsEqualTo(String value) {
            addCriterion("KMEYYMS =", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsNotEqualTo(String value) {
            addCriterion("KMEYYMS <>", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsGreaterThan(String value) {
            addCriterion("KMEYYMS >", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsGreaterThanOrEqualTo(String value) {
            addCriterion("KMEYYMS >=", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsLessThan(String value) {
            addCriterion("KMEYYMS <", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsLessThanOrEqualTo(String value) {
            addCriterion("KMEYYMS <=", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsLike(String value) {
            addCriterion("KMEYYMS like", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsNotLike(String value) {
            addCriterion("KMEYYMS not like", value, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsIn(List<String> values) {
            addCriterion("KMEYYMS in", values, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsNotIn(List<String> values) {
            addCriterion("KMEYYMS not in", values, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsBetween(String value1, String value2) {
            addCriterion("KMEYYMS between", value1, value2, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andKmeyymsNotBetween(String value1, String value2) {
            addCriterion("KMEYYMS not between", value1, value2, "kmeyyms");
            return (Criteria) this;
        }

        public Criteria andSjmsIsNull() {
            addCriterion("SJMS is null");
            return (Criteria) this;
        }

        public Criteria andSjmsIsNotNull() {
            addCriterion("SJMS is not null");
            return (Criteria) this;
        }

        public Criteria andSjmsEqualTo(String value) {
            addCriterion("SJMS =", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsNotEqualTo(String value) {
            addCriterion("SJMS <>", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsGreaterThan(String value) {
            addCriterion("SJMS >", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsGreaterThanOrEqualTo(String value) {
            addCriterion("SJMS >=", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsLessThan(String value) {
            addCriterion("SJMS <", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsLessThanOrEqualTo(String value) {
            addCriterion("SJMS <=", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsLike(String value) {
            addCriterion("SJMS like", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsNotLike(String value) {
            addCriterion("SJMS not like", value, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsIn(List<String> values) {
            addCriterion("SJMS in", values, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsNotIn(List<String> values) {
            addCriterion("SJMS not in", values, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsBetween(String value1, String value2) {
            addCriterion("SJMS between", value1, value2, "sjms");
            return (Criteria) this;
        }

        public Criteria andSjmsNotBetween(String value1, String value2) {
            addCriterion("SJMS not between", value1, value2, "sjms");
            return (Criteria) this;
        }

        public Criteria andFzmsIsNull() {
            addCriterion("FZMS is null");
            return (Criteria) this;
        }

        public Criteria andFzmsIsNotNull() {
            addCriterion("FZMS is not null");
            return (Criteria) this;
        }

        public Criteria andFzmsEqualTo(String value) {
            addCriterion("FZMS =", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsNotEqualTo(String value) {
            addCriterion("FZMS <>", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsGreaterThan(String value) {
            addCriterion("FZMS >", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsGreaterThanOrEqualTo(String value) {
            addCriterion("FZMS >=", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsLessThan(String value) {
            addCriterion("FZMS <", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsLessThanOrEqualTo(String value) {
            addCriterion("FZMS <=", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsLike(String value) {
            addCriterion("FZMS like", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsNotLike(String value) {
            addCriterion("FZMS not like", value, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsIn(List<String> values) {
            addCriterion("FZMS in", values, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsNotIn(List<String> values) {
            addCriterion("FZMS not in", values, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsBetween(String value1, String value2) {
            addCriterion("FZMS between", value1, value2, "fzms");
            return (Criteria) this;
        }

        public Criteria andFzmsNotBetween(String value1, String value2) {
            addCriterion("FZMS not between", value1, value2, "fzms");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzIsNull() {
            addCriterion("KMEKSRSXZ is null");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzIsNotNull() {
            addCriterion("KMEKSRSXZ is not null");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzEqualTo(Integer value) {
            addCriterion("KMEKSRSXZ =", value, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzNotEqualTo(Integer value) {
            addCriterion("KMEKSRSXZ <>", value, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzGreaterThan(Integer value) {
            addCriterion("KMEKSRSXZ >", value, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("KMEKSRSXZ >=", value, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzLessThan(Integer value) {
            addCriterion("KMEKSRSXZ <", value, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzLessThanOrEqualTo(Integer value) {
            addCriterion("KMEKSRSXZ <=", value, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzIn(List<Integer> values) {
            addCriterion("KMEKSRSXZ in", values, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzNotIn(List<Integer> values) {
            addCriterion("KMEKSRSXZ not in", values, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzBetween(Integer value1, Integer value2) {
            addCriterion("KMEKSRSXZ between", value1, value2, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmeksrsxzNotBetween(Integer value1, Integer value2) {
            addCriterion("KMEKSRSXZ not between", value1, value2, "kmeksrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzIsNull() {
            addCriterion("KMEZKRSXZ is null");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzIsNotNull() {
            addCriterion("KMEZKRSXZ is not null");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzEqualTo(Integer value) {
            addCriterion("KMEZKRSXZ =", value, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzNotEqualTo(Integer value) {
            addCriterion("KMEZKRSXZ <>", value, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzGreaterThan(Integer value) {
            addCriterion("KMEZKRSXZ >", value, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("KMEZKRSXZ >=", value, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzLessThan(Integer value) {
            addCriterion("KMEZKRSXZ <", value, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzLessThanOrEqualTo(Integer value) {
            addCriterion("KMEZKRSXZ <=", value, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzIn(List<Integer> values) {
            addCriterion("KMEZKRSXZ in", values, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzNotIn(List<Integer> values) {
            addCriterion("KMEZKRSXZ not in", values, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzBetween(Integer value1, Integer value2) {
            addCriterion("KMEZKRSXZ between", value1, value2, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKmezkrsxzNotBetween(Integer value1, Integer value2) {
            addCriterion("KMEZKRSXZ not between", value1, value2, "kmezkrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzIsNull() {
            addCriterion("KM2CKRSXZ is null");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzIsNotNull() {
            addCriterion("KM2CKRSXZ is not null");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzEqualTo(Integer value) {
            addCriterion("KM2CKRSXZ =", value, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzNotEqualTo(Integer value) {
            addCriterion("KM2CKRSXZ <>", value, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzGreaterThan(Integer value) {
            addCriterion("KM2CKRSXZ >", value, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzGreaterThanOrEqualTo(Integer value) {
            addCriterion("KM2CKRSXZ >=", value, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzLessThan(Integer value) {
            addCriterion("KM2CKRSXZ <", value, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzLessThanOrEqualTo(Integer value) {
            addCriterion("KM2CKRSXZ <=", value, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzIn(List<Integer> values) {
            addCriterion("KM2CKRSXZ in", values, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzNotIn(List<Integer> values) {
            addCriterion("KM2CKRSXZ not in", values, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzBetween(Integer value1, Integer value2) {
            addCriterion("KM2CKRSXZ between", value1, value2, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andKm2ckrsxzNotBetween(Integer value1, Integer value2) {
            addCriterion("KM2CKRSXZ not between", value1, value2, "km2ckrsxz");
            return (Criteria) this;
        }

        public Criteria andJbrIsNull() {
            addCriterion("JBR is null");
            return (Criteria) this;
        }

        public Criteria andJbrIsNotNull() {
            addCriterion("JBR is not null");
            return (Criteria) this;
        }

        public Criteria andJbrEqualTo(String value) {
            addCriterion("JBR =", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotEqualTo(String value) {
            addCriterion("JBR <>", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThan(String value) {
            addCriterion("JBR >", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThanOrEqualTo(String value) {
            addCriterion("JBR >=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThan(String value) {
            addCriterion("JBR <", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThanOrEqualTo(String value) {
            addCriterion("JBR <=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLike(String value) {
            addCriterion("JBR like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotLike(String value) {
            addCriterion("JBR not like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrIn(List<String> values) {
            addCriterion("JBR in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotIn(List<String> values) {
            addCriterion("JBR not in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrBetween(String value1, String value2) {
            addCriterion("JBR between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotBetween(String value1, String value2) {
            addCriterion("JBR not between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andBjIsNull() {
            addCriterion("BJ is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("BJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(String value) {
            addCriterion("BJ =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(String value) {
            addCriterion("BJ <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(String value) {
            addCriterion("BJ >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(String value) {
            addCriterion("BJ >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(String value) {
            addCriterion("BJ <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(String value) {
            addCriterion("BJ <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLike(String value) {
            addCriterion("BJ like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotLike(String value) {
            addCriterion("BJ not like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<String> values) {
            addCriterion("BJ in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<String> values) {
            addCriterion("BJ not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(String value1, String value2) {
            addCriterion("BJ between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(String value1, String value2) {
            addCriterion("BJ not between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andZksfdzIsNull() {
            addCriterion("ZKSFDZ is null");
            return (Criteria) this;
        }

        public Criteria andZksfdzIsNotNull() {
            addCriterion("ZKSFDZ is not null");
            return (Criteria) this;
        }

        public Criteria andZksfdzEqualTo(String value) {
            addCriterion("ZKSFDZ =", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzNotEqualTo(String value) {
            addCriterion("ZKSFDZ <>", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzGreaterThan(String value) {
            addCriterion("ZKSFDZ >", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzGreaterThanOrEqualTo(String value) {
            addCriterion("ZKSFDZ >=", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzLessThan(String value) {
            addCriterion("ZKSFDZ <", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzLessThanOrEqualTo(String value) {
            addCriterion("ZKSFDZ <=", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzLike(String value) {
            addCriterion("ZKSFDZ like", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzNotLike(String value) {
            addCriterion("ZKSFDZ not like", value, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzIn(List<String> values) {
            addCriterion("ZKSFDZ in", values, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzNotIn(List<String> values) {
            addCriterion("ZKSFDZ not in", values, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzBetween(String value1, String value2) {
            addCriterion("ZKSFDZ between", value1, value2, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andZksfdzNotBetween(String value1, String value2) {
            addCriterion("ZKSFDZ not between", value1, value2, "zksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzIsNull() {
            addCriterion("CKSFDZ is null");
            return (Criteria) this;
        }

        public Criteria andCksfdzIsNotNull() {
            addCriterion("CKSFDZ is not null");
            return (Criteria) this;
        }

        public Criteria andCksfdzEqualTo(String value) {
            addCriterion("CKSFDZ =", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzNotEqualTo(String value) {
            addCriterion("CKSFDZ <>", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzGreaterThan(String value) {
            addCriterion("CKSFDZ >", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzGreaterThanOrEqualTo(String value) {
            addCriterion("CKSFDZ >=", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzLessThan(String value) {
            addCriterion("CKSFDZ <", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzLessThanOrEqualTo(String value) {
            addCriterion("CKSFDZ <=", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzLike(String value) {
            addCriterion("CKSFDZ like", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzNotLike(String value) {
            addCriterion("CKSFDZ not like", value, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzIn(List<String> values) {
            addCriterion("CKSFDZ in", values, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzNotIn(List<String> values) {
            addCriterion("CKSFDZ not in", values, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzBetween(String value1, String value2) {
            addCriterion("CKSFDZ between", value1, value2, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andCksfdzNotBetween(String value1, String value2) {
            addCriterion("CKSFDZ not between", value1, value2, "cksfdz");
            return (Criteria) this;
        }

        public Criteria andKcztIsNull() {
            addCriterion("KCZT is null");
            return (Criteria) this;
        }

        public Criteria andKcztIsNotNull() {
            addCriterion("KCZT is not null");
            return (Criteria) this;
        }

        public Criteria andKcztEqualTo(String value) {
            addCriterion("KCZT =", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztNotEqualTo(String value) {
            addCriterion("KCZT <>", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztGreaterThan(String value) {
            addCriterion("KCZT >", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztGreaterThanOrEqualTo(String value) {
            addCriterion("KCZT >=", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztLessThan(String value) {
            addCriterion("KCZT <", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztLessThanOrEqualTo(String value) {
            addCriterion("KCZT <=", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztLike(String value) {
            addCriterion("KCZT like", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztNotLike(String value) {
            addCriterion("KCZT not like", value, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztIn(List<String> values) {
            addCriterion("KCZT in", values, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztNotIn(List<String> values) {
            addCriterion("KCZT not in", values, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztBetween(String value1, String value2) {
            addCriterion("KCZT between", value1, value2, "kczt");
            return (Criteria) this;
        }

        public Criteria andKcztNotBetween(String value1, String value2) {
            addCriterion("KCZT not between", value1, value2, "kczt");
            return (Criteria) this;
        }

        public Criteria andZksbsIsNull() {
            addCriterion("ZKSBS is null");
            return (Criteria) this;
        }

        public Criteria andZksbsIsNotNull() {
            addCriterion("ZKSBS is not null");
            return (Criteria) this;
        }

        public Criteria andZksbsEqualTo(Integer value) {
            addCriterion("ZKSBS =", value, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsNotEqualTo(Integer value) {
            addCriterion("ZKSBS <>", value, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsGreaterThan(Integer value) {
            addCriterion("ZKSBS >", value, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZKSBS >=", value, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsLessThan(Integer value) {
            addCriterion("ZKSBS <", value, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsLessThanOrEqualTo(Integer value) {
            addCriterion("ZKSBS <=", value, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsIn(List<Integer> values) {
            addCriterion("ZKSBS in", values, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsNotIn(List<Integer> values) {
            addCriterion("ZKSBS not in", values, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsBetween(Integer value1, Integer value2) {
            addCriterion("ZKSBS between", value1, value2, "zksbs");
            return (Criteria) this;
        }

        public Criteria andZksbsNotBetween(Integer value1, Integer value2) {
            addCriterion("ZKSBS not between", value1, value2, "zksbs");
            return (Criteria) this;
        }

        public Criteria andF1IsNull() {
            addCriterion("F1 is null");
            return (Criteria) this;
        }

        public Criteria andF1IsNotNull() {
            addCriterion("F1 is not null");
            return (Criteria) this;
        }

        public Criteria andF1EqualTo(String value) {
            addCriterion("F1 =", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotEqualTo(String value) {
            addCriterion("F1 <>", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThan(String value) {
            addCriterion("F1 >", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThanOrEqualTo(String value) {
            addCriterion("F1 >=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThan(String value) {
            addCriterion("F1 <", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThanOrEqualTo(String value) {
            addCriterion("F1 <=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Like(String value) {
            addCriterion("F1 like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotLike(String value) {
            addCriterion("F1 not like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1In(List<String> values) {
            addCriterion("F1 in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotIn(List<String> values) {
            addCriterion("F1 not in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Between(String value1, String value2) {
            addCriterion("F1 between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotBetween(String value1, String value2) {
            addCriterion("F1 not between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF2IsNull() {
            addCriterion("F2 is null");
            return (Criteria) this;
        }

        public Criteria andF2IsNotNull() {
            addCriterion("F2 is not null");
            return (Criteria) this;
        }

        public Criteria andF2EqualTo(String value) {
            addCriterion("F2 =", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotEqualTo(String value) {
            addCriterion("F2 <>", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThan(String value) {
            addCriterion("F2 >", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThanOrEqualTo(String value) {
            addCriterion("F2 >=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThan(String value) {
            addCriterion("F2 <", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThanOrEqualTo(String value) {
            addCriterion("F2 <=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Like(String value) {
            addCriterion("F2 like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotLike(String value) {
            addCriterion("F2 not like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2In(List<String> values) {
            addCriterion("F2 in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotIn(List<String> values) {
            addCriterion("F2 not in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Between(String value1, String value2) {
            addCriterion("F2 between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotBetween(String value1, String value2) {
            addCriterion("F2 not between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF3IsNull() {
            addCriterion("F3 is null");
            return (Criteria) this;
        }

        public Criteria andF3IsNotNull() {
            addCriterion("F3 is not null");
            return (Criteria) this;
        }

        public Criteria andF3EqualTo(String value) {
            addCriterion("F3 =", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotEqualTo(String value) {
            addCriterion("F3 <>", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThan(String value) {
            addCriterion("F3 >", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThanOrEqualTo(String value) {
            addCriterion("F3 >=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThan(String value) {
            addCriterion("F3 <", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThanOrEqualTo(String value) {
            addCriterion("F3 <=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Like(String value) {
            addCriterion("F3 like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotLike(String value) {
            addCriterion("F3 not like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3In(List<String> values) {
            addCriterion("F3 in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotIn(List<String> values) {
            addCriterion("F3 not in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Between(String value1, String value2) {
            addCriterion("F3 between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotBetween(String value1, String value2) {
            addCriterion("F3 not between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF4IsNull() {
            addCriterion("F4 is null");
            return (Criteria) this;
        }

        public Criteria andF4IsNotNull() {
            addCriterion("F4 is not null");
            return (Criteria) this;
        }

        public Criteria andF4EqualTo(String value) {
            addCriterion("F4 =", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotEqualTo(String value) {
            addCriterion("F4 <>", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThan(String value) {
            addCriterion("F4 >", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThanOrEqualTo(String value) {
            addCriterion("F4 >=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThan(String value) {
            addCriterion("F4 <", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThanOrEqualTo(String value) {
            addCriterion("F4 <=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Like(String value) {
            addCriterion("F4 like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotLike(String value) {
            addCriterion("F4 not like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4In(List<String> values) {
            addCriterion("F4 in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotIn(List<String> values) {
            addCriterion("F4 not in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Between(String value1, String value2) {
            addCriterion("F4 between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotBetween(String value1, String value2) {
            addCriterion("F4 not between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF5IsNull() {
            addCriterion("F5 is null");
            return (Criteria) this;
        }

        public Criteria andF5IsNotNull() {
            addCriterion("F5 is not null");
            return (Criteria) this;
        }

        public Criteria andF5EqualTo(String value) {
            addCriterion("F5 =", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotEqualTo(String value) {
            addCriterion("F5 <>", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThan(String value) {
            addCriterion("F5 >", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThanOrEqualTo(String value) {
            addCriterion("F5 >=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThan(String value) {
            addCriterion("F5 <", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThanOrEqualTo(String value) {
            addCriterion("F5 <=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Like(String value) {
            addCriterion("F5 like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotLike(String value) {
            addCriterion("F5 not like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5In(List<String> values) {
            addCriterion("F5 in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotIn(List<String> values) {
            addCriterion("F5 not in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Between(String value1, String value2) {
            addCriterion("F5 between", value1, value2, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotBetween(String value1, String value2) {
            addCriterion("F5 not between", value1, value2, "f5");
            return (Criteria) this;
        }

        public Criteria andSbztIsNull() {
            addCriterion("SBZT is null");
            return (Criteria) this;
        }

        public Criteria andSbztIsNotNull() {
            addCriterion("SBZT is not null");
            return (Criteria) this;
        }

        public Criteria andSbztEqualTo(String value) {
            addCriterion("SBZT =", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztNotEqualTo(String value) {
            addCriterion("SBZT <>", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztGreaterThan(String value) {
            addCriterion("SBZT >", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztGreaterThanOrEqualTo(String value) {
            addCriterion("SBZT >=", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztLessThan(String value) {
            addCriterion("SBZT <", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztLessThanOrEqualTo(String value) {
            addCriterion("SBZT <=", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztLike(String value) {
            addCriterion("SBZT like", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztNotLike(String value) {
            addCriterion("SBZT not like", value, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztIn(List<String> values) {
            addCriterion("SBZT in", values, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztNotIn(List<String> values) {
            addCriterion("SBZT not in", values, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztBetween(String value1, String value2) {
            addCriterion("SBZT between", value1, value2, "sbzt");
            return (Criteria) this;
        }

        public Criteria andSbztNotBetween(String value1, String value2) {
            addCriterion("SBZT not between", value1, value2, "sbzt");
            return (Criteria) this;
        }

        public Criteria andJgrIsNull() {
            addCriterion("JGR is null");
            return (Criteria) this;
        }

        public Criteria andJgrIsNotNull() {
            addCriterion("JGR is not null");
            return (Criteria) this;
        }

        public Criteria andJgrEqualTo(String value) {
            addCriterion("JGR =", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrNotEqualTo(String value) {
            addCriterion("JGR <>", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrGreaterThan(String value) {
            addCriterion("JGR >", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrGreaterThanOrEqualTo(String value) {
            addCriterion("JGR >=", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrLessThan(String value) {
            addCriterion("JGR <", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrLessThanOrEqualTo(String value) {
            addCriterion("JGR <=", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrLike(String value) {
            addCriterion("JGR like", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrNotLike(String value) {
            addCriterion("JGR not like", value, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrIn(List<String> values) {
            addCriterion("JGR in", values, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrNotIn(List<String> values) {
            addCriterion("JGR not in", values, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrBetween(String value1, String value2) {
            addCriterion("JGR between", value1, value2, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgrNotBetween(String value1, String value2) {
            addCriterion("JGR not between", value1, value2, "jgr");
            return (Criteria) this;
        }

        public Criteria andJgr2IsNull() {
            addCriterion("JGR2 is null");
            return (Criteria) this;
        }

        public Criteria andJgr2IsNotNull() {
            addCriterion("JGR2 is not null");
            return (Criteria) this;
        }

        public Criteria andJgr2EqualTo(String value) {
            addCriterion("JGR2 =", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2NotEqualTo(String value) {
            addCriterion("JGR2 <>", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2GreaterThan(String value) {
            addCriterion("JGR2 >", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2GreaterThanOrEqualTo(String value) {
            addCriterion("JGR2 >=", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2LessThan(String value) {
            addCriterion("JGR2 <", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2LessThanOrEqualTo(String value) {
            addCriterion("JGR2 <=", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2Like(String value) {
            addCriterion("JGR2 like", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2NotLike(String value) {
            addCriterion("JGR2 not like", value, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2In(List<String> values) {
            addCriterion("JGR2 in", values, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2NotIn(List<String> values) {
            addCriterion("JGR2 not in", values, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2Between(String value1, String value2) {
            addCriterion("JGR2 between", value1, value2, "jgr2");
            return (Criteria) this;
        }

        public Criteria andJgr2NotBetween(String value1, String value2) {
            addCriterion("JGR2 not between", value1, value2, "jgr2");
            return (Criteria) this;
        }

        public Criteria andCkcsIsNull() {
            addCriterion("CKCS is null");
            return (Criteria) this;
        }

        public Criteria andCkcsIsNotNull() {
            addCriterion("CKCS is not null");
            return (Criteria) this;
        }

        public Criteria andCkcsEqualTo(Integer value) {
            addCriterion("CKCS =", value, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsNotEqualTo(Integer value) {
            addCriterion("CKCS <>", value, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsGreaterThan(Integer value) {
            addCriterion("CKCS >", value, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CKCS >=", value, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsLessThan(Integer value) {
            addCriterion("CKCS <", value, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsLessThanOrEqualTo(Integer value) {
            addCriterion("CKCS <=", value, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsIn(List<Integer> values) {
            addCriterion("CKCS in", values, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsNotIn(List<Integer> values) {
            addCriterion("CKCS not in", values, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsBetween(Integer value1, Integer value2) {
            addCriterion("CKCS between", value1, value2, "ckcs");
            return (Criteria) this;
        }

        public Criteria andCkcsNotBetween(Integer value1, Integer value2) {
            addCriterion("CKCS not between", value1, value2, "ckcs");
            return (Criteria) this;
        }

        public Criteria andJkurlIsNull() {
            addCriterion("JKURL is null");
            return (Criteria) this;
        }

        public Criteria andJkurlIsNotNull() {
            addCriterion("JKURL is not null");
            return (Criteria) this;
        }

        public Criteria andJkurlEqualTo(String value) {
            addCriterion("JKURL =", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlNotEqualTo(String value) {
            addCriterion("JKURL <>", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlGreaterThan(String value) {
            addCriterion("JKURL >", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlGreaterThanOrEqualTo(String value) {
            addCriterion("JKURL >=", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlLessThan(String value) {
            addCriterion("JKURL <", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlLessThanOrEqualTo(String value) {
            addCriterion("JKURL <=", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlLike(String value) {
            addCriterion("JKURL like", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlNotLike(String value) {
            addCriterion("JKURL not like", value, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlIn(List<String> values) {
            addCriterion("JKURL in", values, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlNotIn(List<String> values) {
            addCriterion("JKURL not in", values, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlBetween(String value1, String value2) {
            addCriterion("JKURL between", value1, value2, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkurlNotBetween(String value1, String value2) {
            addCriterion("JKURL not between", value1, value2, "jkurl");
            return (Criteria) this;
        }

        public Criteria andJkxlhIsNull() {
            addCriterion("JKXLH is null");
            return (Criteria) this;
        }

        public Criteria andJkxlhIsNotNull() {
            addCriterion("JKXLH is not null");
            return (Criteria) this;
        }

        public Criteria andJkxlhEqualTo(String value) {
            addCriterion("JKXLH =", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhNotEqualTo(String value) {
            addCriterion("JKXLH <>", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhGreaterThan(String value) {
            addCriterion("JKXLH >", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhGreaterThanOrEqualTo(String value) {
            addCriterion("JKXLH >=", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhLessThan(String value) {
            addCriterion("JKXLH <", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhLessThanOrEqualTo(String value) {
            addCriterion("JKXLH <=", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhLike(String value) {
            addCriterion("JKXLH like", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhNotLike(String value) {
            addCriterion("JKXLH not like", value, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhIn(List<String> values) {
            addCriterion("JKXLH in", values, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhNotIn(List<String> values) {
            addCriterion("JKXLH not in", values, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhBetween(String value1, String value2) {
            addCriterion("JKXLH between", value1, value2, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andJkxlhNotBetween(String value1, String value2) {
            addCriterion("JKXLH not between", value1, value2, "jkxlh");
            return (Criteria) this;
        }

        public Criteria andZdysrqIsNull() {
            addCriterion("zdysrq is null");
            return (Criteria) this;
        }

        public Criteria andZdysrqIsNotNull() {
            addCriterion("zdysrq is not null");
            return (Criteria) this;
        }

        public Criteria andZdysrqEqualTo(Date value) {
            addCriterion("zdysrq =", value, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqNotEqualTo(Date value) {
            addCriterion("zdysrq <>", value, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqGreaterThan(Date value) {
            addCriterion("zdysrq >", value, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zdysrq >=", value, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqLessThan(Date value) {
            addCriterion("zdysrq <", value, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqLessThanOrEqualTo(Date value) {
            addCriterion("zdysrq <=", value, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqIn(List<Date> values) {
            addCriterion("zdysrq in", values, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqNotIn(List<Date> values) {
            addCriterion("zdysrq not in", values, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqBetween(Date value1, Date value2) {
            addCriterion("zdysrq between", value1, value2, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andZdysrqNotBetween(Date value1, Date value2) {
            addCriterion("zdysrq not between", value1, value2, "zdysrq");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("cjsj is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andGxrqIsNull() {
            addCriterion("gxrq is null");
            return (Criteria) this;
        }

        public Criteria andGxrqIsNotNull() {
            addCriterion("gxrq is not null");
            return (Criteria) this;
        }

        public Criteria andGxrqEqualTo(Date value) {
            addCriterion("gxrq =", value, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqNotEqualTo(Date value) {
            addCriterion("gxrq <>", value, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqGreaterThan(Date value) {
            addCriterion("gxrq >", value, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("gxrq >=", value, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqLessThan(Date value) {
            addCriterion("gxrq <", value, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqLessThanOrEqualTo(Date value) {
            addCriterion("gxrq <=", value, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqIn(List<Date> values) {
            addCriterion("gxrq in", values, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqNotIn(List<Date> values) {
            addCriterion("gxrq not in", values, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqBetween(Date value1, Date value2) {
            addCriterion("gxrq between", value1, value2, "gxrq");
            return (Criteria) this;
        }

        public Criteria andGxrqNotBetween(Date value1, Date value2) {
            addCriterion("gxrq not between", value1, value2, "gxrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqIsNull() {
            addCriterion("zklwrq is null");
            return (Criteria) this;
        }

        public Criteria andZklwrqIsNotNull() {
            addCriterion("zklwrq is not null");
            return (Criteria) this;
        }

        public Criteria andZklwrqEqualTo(Date value) {
            addCriterion("zklwrq =", value, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqNotEqualTo(Date value) {
            addCriterion("zklwrq <>", value, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqGreaterThan(Date value) {
            addCriterion("zklwrq >", value, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zklwrq >=", value, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqLessThan(Date value) {
            addCriterion("zklwrq <", value, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqLessThanOrEqualTo(Date value) {
            addCriterion("zklwrq <=", value, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqIn(List<Date> values) {
            addCriterion("zklwrq in", values, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqNotIn(List<Date> values) {
            addCriterion("zklwrq not in", values, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqBetween(Date value1, Date value2) {
            addCriterion("zklwrq between", value1, value2, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andZklwrqNotBetween(Date value1, Date value2) {
            addCriterion("zklwrq not between", value1, value2, "zklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqIsNull() {
            addCriterion("cklwrq is null");
            return (Criteria) this;
        }

        public Criteria andCklwrqIsNotNull() {
            addCriterion("cklwrq is not null");
            return (Criteria) this;
        }

        public Criteria andCklwrqEqualTo(Date value) {
            addCriterion("cklwrq =", value, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqNotEqualTo(Date value) {
            addCriterion("cklwrq <>", value, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqGreaterThan(Date value) {
            addCriterion("cklwrq >", value, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqGreaterThanOrEqualTo(Date value) {
            addCriterion("cklwrq >=", value, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqLessThan(Date value) {
            addCriterion("cklwrq <", value, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqLessThanOrEqualTo(Date value) {
            addCriterion("cklwrq <=", value, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqIn(List<Date> values) {
            addCriterion("cklwrq in", values, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqNotIn(List<Date> values) {
            addCriterion("cklwrq not in", values, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqBetween(Date value1, Date value2) {
            addCriterion("cklwrq between", value1, value2, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andCklwrqNotBetween(Date value1, Date value2) {
            addCriterion("cklwrq not between", value1, value2, "cklwrq");
            return (Criteria) this;
        }

        public Criteria andJgjssjIsNull() {
            addCriterion("jgjssj is null");
            return (Criteria) this;
        }

        public Criteria andJgjssjIsNotNull() {
            addCriterion("jgjssj is not null");
            return (Criteria) this;
        }

        public Criteria andJgjssjEqualTo(Date value) {
            addCriterion("jgjssj =", value, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjNotEqualTo(Date value) {
            addCriterion("jgjssj <>", value, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjGreaterThan(Date value) {
            addCriterion("jgjssj >", value, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjGreaterThanOrEqualTo(Date value) {
            addCriterion("jgjssj >=", value, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjLessThan(Date value) {
            addCriterion("jgjssj <", value, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjLessThanOrEqualTo(Date value) {
            addCriterion("jgjssj <=", value, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjIn(List<Date> values) {
            addCriterion("jgjssj in", values, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjNotIn(List<Date> values) {
            addCriterion("jgjssj not in", values, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjBetween(Date value1, Date value2) {
            addCriterion("jgjssj between", value1, value2, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgjssjNotBetween(Date value1, Date value2) {
            addCriterion("jgjssj not between", value1, value2, "jgjssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjIsNull() {
            addCriterion("jgkssj is null");
            return (Criteria) this;
        }

        public Criteria andJgkssjIsNotNull() {
            addCriterion("jgkssj is not null");
            return (Criteria) this;
        }

        public Criteria andJgkssjEqualTo(Date value) {
            addCriterion("jgkssj =", value, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjNotEqualTo(Date value) {
            addCriterion("jgkssj <>", value, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjGreaterThan(Date value) {
            addCriterion("jgkssj >", value, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjGreaterThanOrEqualTo(Date value) {
            addCriterion("jgkssj >=", value, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjLessThan(Date value) {
            addCriterion("jgkssj <", value, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjLessThanOrEqualTo(Date value) {
            addCriterion("jgkssj <=", value, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjIn(List<Date> values) {
            addCriterion("jgkssj in", values, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjNotIn(List<Date> values) {
            addCriterion("jgkssj not in", values, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjBetween(Date value1, Date value2) {
            addCriterion("jgkssj between", value1, value2, "jgkssj");
            return (Criteria) this;
        }

        public Criteria andJgkssjNotBetween(Date value1, Date value2) {
            addCriterion("jgkssj not between", value1, value2, "jgkssj");
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