package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarinfoExample() {
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

        public Criteria andFzjgIsNull() {
            addCriterion("fzjg is null");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNotNull() {
            addCriterion("fzjg is not null");
            return (Criteria) this;
        }

        public Criteria andFzjgEqualTo(String value) {
            addCriterion("fzjg =", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotEqualTo(String value) {
            addCriterion("fzjg <>", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThan(String value) {
            addCriterion("fzjg >", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThanOrEqualTo(String value) {
            addCriterion("fzjg >=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThan(String value) {
            addCriterion("fzjg <", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThanOrEqualTo(String value) {
            addCriterion("fzjg <=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLike(String value) {
            addCriterion("fzjg like", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotLike(String value) {
            addCriterion("fzjg not like", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgIn(List<String> values) {
            addCriterion("fzjg in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotIn(List<String> values) {
            addCriterion("fzjg not in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgBetween(String value1, String value2) {
            addCriterion("fzjg between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotBetween(String value1, String value2) {
            addCriterion("fzjg not between", value1, value2, "fzjg");
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

        public Criteria andBjIsNull() {
            addCriterion("bj is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("bj is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(String value) {
            addCriterion("bj =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(String value) {
            addCriterion("bj <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(String value) {
            addCriterion("bj >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(String value) {
            addCriterion("bj >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(String value) {
            addCriterion("bj <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(String value) {
            addCriterion("bj <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLike(String value) {
            addCriterion("bj like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotLike(String value) {
            addCriterion("bj not like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<String> values) {
            addCriterion("bj in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<String> values) {
            addCriterion("bj not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(String value1, String value2) {
            addCriterion("bj between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(String value1, String value2) {
            addCriterion("bj not between", value1, value2, "bj");
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

        public Criteria andPkyIsNull() {
            addCriterion("pky is null");
            return (Criteria) this;
        }

        public Criteria andPkyIsNotNull() {
            addCriterion("pky is not null");
            return (Criteria) this;
        }

        public Criteria andPkyEqualTo(String value) {
            addCriterion("pky =", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyNotEqualTo(String value) {
            addCriterion("pky <>", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyGreaterThan(String value) {
            addCriterion("pky >", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyGreaterThanOrEqualTo(String value) {
            addCriterion("pky >=", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyLessThan(String value) {
            addCriterion("pky <", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyLessThanOrEqualTo(String value) {
            addCriterion("pky <=", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyLike(String value) {
            addCriterion("pky like", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyNotLike(String value) {
            addCriterion("pky not like", value, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyIn(List<String> values) {
            addCriterion("pky in", values, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyNotIn(List<String> values) {
            addCriterion("pky not in", values, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyBetween(String value1, String value2) {
            addCriterion("pky between", value1, value2, "pky");
            return (Criteria) this;
        }

        public Criteria andPkyNotBetween(String value1, String value2) {
            addCriterion("pky not between", value1, value2, "pky");
            return (Criteria) this;
        }

        public Criteria andCam1NvrIsNull() {
            addCriterion("cam1_nvr is null");
            return (Criteria) this;
        }

        public Criteria andCam1NvrIsNotNull() {
            addCriterion("cam1_nvr is not null");
            return (Criteria) this;
        }

        public Criteria andCam1NvrEqualTo(String value) {
            addCriterion("cam1_nvr =", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrNotEqualTo(String value) {
            addCriterion("cam1_nvr <>", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrGreaterThan(String value) {
            addCriterion("cam1_nvr >", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrGreaterThanOrEqualTo(String value) {
            addCriterion("cam1_nvr >=", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrLessThan(String value) {
            addCriterion("cam1_nvr <", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrLessThanOrEqualTo(String value) {
            addCriterion("cam1_nvr <=", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrLike(String value) {
            addCriterion("cam1_nvr like", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrNotLike(String value) {
            addCriterion("cam1_nvr not like", value, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrIn(List<String> values) {
            addCriterion("cam1_nvr in", values, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrNotIn(List<String> values) {
            addCriterion("cam1_nvr not in", values, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrBetween(String value1, String value2) {
            addCriterion("cam1_nvr between", value1, value2, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrNotBetween(String value1, String value2) {
            addCriterion("cam1_nvr not between", value1, value2, "cam1Nvr");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelIsNull() {
            addCriterion("cam1_nvr_channel is null");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelIsNotNull() {
            addCriterion("cam1_nvr_channel is not null");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelEqualTo(String value) {
            addCriterion("cam1_nvr_channel =", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelNotEqualTo(String value) {
            addCriterion("cam1_nvr_channel <>", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelGreaterThan(String value) {
            addCriterion("cam1_nvr_channel >", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelGreaterThanOrEqualTo(String value) {
            addCriterion("cam1_nvr_channel >=", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelLessThan(String value) {
            addCriterion("cam1_nvr_channel <", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelLessThanOrEqualTo(String value) {
            addCriterion("cam1_nvr_channel <=", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelLike(String value) {
            addCriterion("cam1_nvr_channel like", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelNotLike(String value) {
            addCriterion("cam1_nvr_channel not like", value, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelIn(List<String> values) {
            addCriterion("cam1_nvr_channel in", values, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelNotIn(List<String> values) {
            addCriterion("cam1_nvr_channel not in", values, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelBetween(String value1, String value2) {
            addCriterion("cam1_nvr_channel between", value1, value2, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam1NvrChannelNotBetween(String value1, String value2) {
            addCriterion("cam1_nvr_channel not between", value1, value2, "cam1NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrIsNull() {
            addCriterion("cam2_nvr is null");
            return (Criteria) this;
        }

        public Criteria andCam2NvrIsNotNull() {
            addCriterion("cam2_nvr is not null");
            return (Criteria) this;
        }

        public Criteria andCam2NvrEqualTo(String value) {
            addCriterion("cam2_nvr =", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrNotEqualTo(String value) {
            addCriterion("cam2_nvr <>", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrGreaterThan(String value) {
            addCriterion("cam2_nvr >", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrGreaterThanOrEqualTo(String value) {
            addCriterion("cam2_nvr >=", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrLessThan(String value) {
            addCriterion("cam2_nvr <", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrLessThanOrEqualTo(String value) {
            addCriterion("cam2_nvr <=", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrLike(String value) {
            addCriterion("cam2_nvr like", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrNotLike(String value) {
            addCriterion("cam2_nvr not like", value, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrIn(List<String> values) {
            addCriterion("cam2_nvr in", values, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrNotIn(List<String> values) {
            addCriterion("cam2_nvr not in", values, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrBetween(String value1, String value2) {
            addCriterion("cam2_nvr between", value1, value2, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrNotBetween(String value1, String value2) {
            addCriterion("cam2_nvr not between", value1, value2, "cam2Nvr");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelIsNull() {
            addCriterion("cam2_nvr_channel is null");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelIsNotNull() {
            addCriterion("cam2_nvr_channel is not null");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelEqualTo(String value) {
            addCriterion("cam2_nvr_channel =", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelNotEqualTo(String value) {
            addCriterion("cam2_nvr_channel <>", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelGreaterThan(String value) {
            addCriterion("cam2_nvr_channel >", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelGreaterThanOrEqualTo(String value) {
            addCriterion("cam2_nvr_channel >=", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelLessThan(String value) {
            addCriterion("cam2_nvr_channel <", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelLessThanOrEqualTo(String value) {
            addCriterion("cam2_nvr_channel <=", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelLike(String value) {
            addCriterion("cam2_nvr_channel like", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelNotLike(String value) {
            addCriterion("cam2_nvr_channel not like", value, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelIn(List<String> values) {
            addCriterion("cam2_nvr_channel in", values, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelNotIn(List<String> values) {
            addCriterion("cam2_nvr_channel not in", values, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelBetween(String value1, String value2) {
            addCriterion("cam2_nvr_channel between", value1, value2, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam2NvrChannelNotBetween(String value1, String value2) {
            addCriterion("cam2_nvr_channel not between", value1, value2, "cam2NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrIsNull() {
            addCriterion("cam3_nvr is null");
            return (Criteria) this;
        }

        public Criteria andCam3NvrIsNotNull() {
            addCriterion("cam3_nvr is not null");
            return (Criteria) this;
        }

        public Criteria andCam3NvrEqualTo(String value) {
            addCriterion("cam3_nvr =", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrNotEqualTo(String value) {
            addCriterion("cam3_nvr <>", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrGreaterThan(String value) {
            addCriterion("cam3_nvr >", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrGreaterThanOrEqualTo(String value) {
            addCriterion("cam3_nvr >=", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrLessThan(String value) {
            addCriterion("cam3_nvr <", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrLessThanOrEqualTo(String value) {
            addCriterion("cam3_nvr <=", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrLike(String value) {
            addCriterion("cam3_nvr like", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrNotLike(String value) {
            addCriterion("cam3_nvr not like", value, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrIn(List<String> values) {
            addCriterion("cam3_nvr in", values, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrNotIn(List<String> values) {
            addCriterion("cam3_nvr not in", values, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrBetween(String value1, String value2) {
            addCriterion("cam3_nvr between", value1, value2, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrNotBetween(String value1, String value2) {
            addCriterion("cam3_nvr not between", value1, value2, "cam3Nvr");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelIsNull() {
            addCriterion("cam3_nvr_channel is null");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelIsNotNull() {
            addCriterion("cam3_nvr_channel is not null");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelEqualTo(String value) {
            addCriterion("cam3_nvr_channel =", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelNotEqualTo(String value) {
            addCriterion("cam3_nvr_channel <>", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelGreaterThan(String value) {
            addCriterion("cam3_nvr_channel >", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelGreaterThanOrEqualTo(String value) {
            addCriterion("cam3_nvr_channel >=", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelLessThan(String value) {
            addCriterion("cam3_nvr_channel <", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelLessThanOrEqualTo(String value) {
            addCriterion("cam3_nvr_channel <=", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelLike(String value) {
            addCriterion("cam3_nvr_channel like", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelNotLike(String value) {
            addCriterion("cam3_nvr_channel not like", value, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelIn(List<String> values) {
            addCriterion("cam3_nvr_channel in", values, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelNotIn(List<String> values) {
            addCriterion("cam3_nvr_channel not in", values, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelBetween(String value1, String value2) {
            addCriterion("cam3_nvr_channel between", value1, value2, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andCam3NvrChannelNotBetween(String value1, String value2) {
            addCriterion("cam3_nvr_channel not between", value1, value2, "cam3NvrChannel");
            return (Criteria) this;
        }

        public Criteria andSerialPort1IsNull() {
            addCriterion("serial_port1 is null");
            return (Criteria) this;
        }

        public Criteria andSerialPort1IsNotNull() {
            addCriterion("serial_port1 is not null");
            return (Criteria) this;
        }

        public Criteria andSerialPort1EqualTo(String value) {
            addCriterion("serial_port1 =", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1NotEqualTo(String value) {
            addCriterion("serial_port1 <>", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1GreaterThan(String value) {
            addCriterion("serial_port1 >", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1GreaterThanOrEqualTo(String value) {
            addCriterion("serial_port1 >=", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LessThan(String value) {
            addCriterion("serial_port1 <", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LessThanOrEqualTo(String value) {
            addCriterion("serial_port1 <=", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1Like(String value) {
            addCriterion("serial_port1 like", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1NotLike(String value) {
            addCriterion("serial_port1 not like", value, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1In(List<String> values) {
            addCriterion("serial_port1 in", values, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1NotIn(List<String> values) {
            addCriterion("serial_port1 not in", values, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1Between(String value1, String value2) {
            addCriterion("serial_port1 between", value1, value2, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andSerialPort1NotBetween(String value1, String value2) {
            addCriterion("serial_port1 not between", value1, value2, "serialPort1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1IsNull() {
            addCriterion("baud_rate1 is null");
            return (Criteria) this;
        }

        public Criteria andBaudRate1IsNotNull() {
            addCriterion("baud_rate1 is not null");
            return (Criteria) this;
        }

        public Criteria andBaudRate1EqualTo(String value) {
            addCriterion("baud_rate1 =", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1NotEqualTo(String value) {
            addCriterion("baud_rate1 <>", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1GreaterThan(String value) {
            addCriterion("baud_rate1 >", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1GreaterThanOrEqualTo(String value) {
            addCriterion("baud_rate1 >=", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1LessThan(String value) {
            addCriterion("baud_rate1 <", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1LessThanOrEqualTo(String value) {
            addCriterion("baud_rate1 <=", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1Like(String value) {
            addCriterion("baud_rate1 like", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1NotLike(String value) {
            addCriterion("baud_rate1 not like", value, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1In(List<String> values) {
            addCriterion("baud_rate1 in", values, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1NotIn(List<String> values) {
            addCriterion("baud_rate1 not in", values, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1Between(String value1, String value2) {
            addCriterion("baud_rate1 between", value1, value2, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andBaudRate1NotBetween(String value1, String value2) {
            addCriterion("baud_rate1 not between", value1, value2, "baudRate1");
            return (Criteria) this;
        }

        public Criteria andSerialPort2IsNull() {
            addCriterion("serial_port2 is null");
            return (Criteria) this;
        }

        public Criteria andSerialPort2IsNotNull() {
            addCriterion("serial_port2 is not null");
            return (Criteria) this;
        }

        public Criteria andSerialPort2EqualTo(String value) {
            addCriterion("serial_port2 =", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2NotEqualTo(String value) {
            addCriterion("serial_port2 <>", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2GreaterThan(String value) {
            addCriterion("serial_port2 >", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2GreaterThanOrEqualTo(String value) {
            addCriterion("serial_port2 >=", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LessThan(String value) {
            addCriterion("serial_port2 <", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LessThanOrEqualTo(String value) {
            addCriterion("serial_port2 <=", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2Like(String value) {
            addCriterion("serial_port2 like", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2NotLike(String value) {
            addCriterion("serial_port2 not like", value, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2In(List<String> values) {
            addCriterion("serial_port2 in", values, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2NotIn(List<String> values) {
            addCriterion("serial_port2 not in", values, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2Between(String value1, String value2) {
            addCriterion("serial_port2 between", value1, value2, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andSerialPort2NotBetween(String value1, String value2) {
            addCriterion("serial_port2 not between", value1, value2, "serialPort2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2IsNull() {
            addCriterion("baud_rate2 is null");
            return (Criteria) this;
        }

        public Criteria andBaudRate2IsNotNull() {
            addCriterion("baud_rate2 is not null");
            return (Criteria) this;
        }

        public Criteria andBaudRate2EqualTo(String value) {
            addCriterion("baud_rate2 =", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2NotEqualTo(String value) {
            addCriterion("baud_rate2 <>", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2GreaterThan(String value) {
            addCriterion("baud_rate2 >", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2GreaterThanOrEqualTo(String value) {
            addCriterion("baud_rate2 >=", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2LessThan(String value) {
            addCriterion("baud_rate2 <", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2LessThanOrEqualTo(String value) {
            addCriterion("baud_rate2 <=", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2Like(String value) {
            addCriterion("baud_rate2 like", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2NotLike(String value) {
            addCriterion("baud_rate2 not like", value, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2In(List<String> values) {
            addCriterion("baud_rate2 in", values, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2NotIn(List<String> values) {
            addCriterion("baud_rate2 not in", values, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2Between(String value1, String value2) {
            addCriterion("baud_rate2 between", value1, value2, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andBaudRate2NotBetween(String value1, String value2) {
            addCriterion("baud_rate2 not between", value1, value2, "baudRate2");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxIsNull() {
            addCriterion("serial_port1_linux is null");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxIsNotNull() {
            addCriterion("serial_port1_linux is not null");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxEqualTo(String value) {
            addCriterion("serial_port1_linux =", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxNotEqualTo(String value) {
            addCriterion("serial_port1_linux <>", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxGreaterThan(String value) {
            addCriterion("serial_port1_linux >", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxGreaterThanOrEqualTo(String value) {
            addCriterion("serial_port1_linux >=", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxLessThan(String value) {
            addCriterion("serial_port1_linux <", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxLessThanOrEqualTo(String value) {
            addCriterion("serial_port1_linux <=", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxLike(String value) {
            addCriterion("serial_port1_linux like", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxNotLike(String value) {
            addCriterion("serial_port1_linux not like", value, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxIn(List<String> values) {
            addCriterion("serial_port1_linux in", values, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxNotIn(List<String> values) {
            addCriterion("serial_port1_linux not in", values, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxBetween(String value1, String value2) {
            addCriterion("serial_port1_linux between", value1, value2, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort1LinuxNotBetween(String value1, String value2) {
            addCriterion("serial_port1_linux not between", value1, value2, "serialPort1Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxIsNull() {
            addCriterion("serial_port2_linux is null");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxIsNotNull() {
            addCriterion("serial_port2_linux is not null");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxEqualTo(String value) {
            addCriterion("serial_port2_linux =", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxNotEqualTo(String value) {
            addCriterion("serial_port2_linux <>", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxGreaterThan(String value) {
            addCriterion("serial_port2_linux >", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxGreaterThanOrEqualTo(String value) {
            addCriterion("serial_port2_linux >=", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxLessThan(String value) {
            addCriterion("serial_port2_linux <", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxLessThanOrEqualTo(String value) {
            addCriterion("serial_port2_linux <=", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxLike(String value) {
            addCriterion("serial_port2_linux like", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxNotLike(String value) {
            addCriterion("serial_port2_linux not like", value, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxIn(List<String> values) {
            addCriterion("serial_port2_linux in", values, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxNotIn(List<String> values) {
            addCriterion("serial_port2_linux not in", values, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxBetween(String value1, String value2) {
            addCriterion("serial_port2_linux between", value1, value2, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andSerialPort2LinuxNotBetween(String value1, String value2) {
            addCriterion("serial_port2_linux not between", value1, value2, "serialPort2Linux");
            return (Criteria) this;
        }

        public Criteria andCcdjrqIsNull() {
            addCriterion("ccdjrq is null");
            return (Criteria) this;
        }

        public Criteria andCcdjrqIsNotNull() {
            addCriterion("ccdjrq is not null");
            return (Criteria) this;
        }

        public Criteria andCcdjrqEqualTo(Date value) {
            addCriterion("ccdjrq =", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqNotEqualTo(Date value) {
            addCriterion("ccdjrq <>", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqGreaterThan(Date value) {
            addCriterion("ccdjrq >", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ccdjrq >=", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqLessThan(Date value) {
            addCriterion("ccdjrq <", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqLessThanOrEqualTo(Date value) {
            addCriterion("ccdjrq <=", value, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqIn(List<Date> values) {
            addCriterion("ccdjrq in", values, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqNotIn(List<Date> values) {
            addCriterion("ccdjrq not in", values, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqBetween(Date value1, Date value2) {
            addCriterion("ccdjrq between", value1, value2, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andCcdjrqNotBetween(Date value1, Date value2) {
            addCriterion("ccdjrq not between", value1, value2, "ccdjrq");
            return (Criteria) this;
        }

        public Criteria andQzbfqzIsNull() {
            addCriterion("qzbfqz is null");
            return (Criteria) this;
        }

        public Criteria andQzbfqzIsNotNull() {
            addCriterion("qzbfqz is not null");
            return (Criteria) this;
        }

        public Criteria andQzbfqzEqualTo(Date value) {
            addCriterion("qzbfqz =", value, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzNotEqualTo(Date value) {
            addCriterion("qzbfqz <>", value, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzGreaterThan(Date value) {
            addCriterion("qzbfqz >", value, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzGreaterThanOrEqualTo(Date value) {
            addCriterion("qzbfqz >=", value, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzLessThan(Date value) {
            addCriterion("qzbfqz <", value, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzLessThanOrEqualTo(Date value) {
            addCriterion("qzbfqz <=", value, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzIn(List<Date> values) {
            addCriterion("qzbfqz in", values, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzNotIn(List<Date> values) {
            addCriterion("qzbfqz not in", values, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzBetween(Date value1, Date value2) {
            addCriterion("qzbfqz between", value1, value2, "qzbfqz");
            return (Criteria) this;
        }

        public Criteria andQzbfqzNotBetween(Date value1, Date value2) {
            addCriterion("qzbfqz not between", value1, value2, "qzbfqz");
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

        public Criteria andAssignTimeIsNull() {
            addCriterion("assign_time is null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNotNull() {
            addCriterion("assign_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeEqualTo(Date value) {
            addCriterion("assign_time =", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotEqualTo(Date value) {
            addCriterion("assign_time <>", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThan(Date value) {
            addCriterion("assign_time >", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assign_time >=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThan(Date value) {
            addCriterion("assign_time <", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThanOrEqualTo(Date value) {
            addCriterion("assign_time <=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIn(List<Date> values) {
            addCriterion("assign_time in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotIn(List<Date> values) {
            addCriterion("assign_time not in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeBetween(Date value1, Date value2) {
            addCriterion("assign_time between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotBetween(Date value1, Date value2) {
            addCriterion("assign_time not between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpIsNull() {
            addCriterion("audio_nvr_IP is null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpIsNotNull() {
            addCriterion("audio_nvr_IP is not null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpEqualTo(String value) {
            addCriterion("audio_nvr_IP =", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpNotEqualTo(String value) {
            addCriterion("audio_nvr_IP <>", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpGreaterThan(String value) {
            addCriterion("audio_nvr_IP >", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpGreaterThanOrEqualTo(String value) {
            addCriterion("audio_nvr_IP >=", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpLessThan(String value) {
            addCriterion("audio_nvr_IP <", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpLessThanOrEqualTo(String value) {
            addCriterion("audio_nvr_IP <=", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpLike(String value) {
            addCriterion("audio_nvr_IP like", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpNotLike(String value) {
            addCriterion("audio_nvr_IP not like", value, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpIn(List<String> values) {
            addCriterion("audio_nvr_IP in", values, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpNotIn(List<String> values) {
            addCriterion("audio_nvr_IP not in", values, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpBetween(String value1, String value2) {
            addCriterion("audio_nvr_IP between", value1, value2, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrIpNotBetween(String value1, String value2) {
            addCriterion("audio_nvr_IP not between", value1, value2, "audioNvrIp");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortIsNull() {
            addCriterion("audio_nvr_port is null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortIsNotNull() {
            addCriterion("audio_nvr_port is not null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortEqualTo(String value) {
            addCriterion("audio_nvr_port =", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortNotEqualTo(String value) {
            addCriterion("audio_nvr_port <>", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortGreaterThan(String value) {
            addCriterion("audio_nvr_port >", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortGreaterThanOrEqualTo(String value) {
            addCriterion("audio_nvr_port >=", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortLessThan(String value) {
            addCriterion("audio_nvr_port <", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortLessThanOrEqualTo(String value) {
            addCriterion("audio_nvr_port <=", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortLike(String value) {
            addCriterion("audio_nvr_port like", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortNotLike(String value) {
            addCriterion("audio_nvr_port not like", value, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortIn(List<String> values) {
            addCriterion("audio_nvr_port in", values, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortNotIn(List<String> values) {
            addCriterion("audio_nvr_port not in", values, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortBetween(String value1, String value2) {
            addCriterion("audio_nvr_port between", value1, value2, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPortNotBetween(String value1, String value2) {
            addCriterion("audio_nvr_port not between", value1, value2, "audioNvrPort");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountIsNull() {
            addCriterion("audio_nvr_account is null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountIsNotNull() {
            addCriterion("audio_nvr_account is not null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountEqualTo(String value) {
            addCriterion("audio_nvr_account =", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountNotEqualTo(String value) {
            addCriterion("audio_nvr_account <>", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountGreaterThan(String value) {
            addCriterion("audio_nvr_account >", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountGreaterThanOrEqualTo(String value) {
            addCriterion("audio_nvr_account >=", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountLessThan(String value) {
            addCriterion("audio_nvr_account <", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountLessThanOrEqualTo(String value) {
            addCriterion("audio_nvr_account <=", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountLike(String value) {
            addCriterion("audio_nvr_account like", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountNotLike(String value) {
            addCriterion("audio_nvr_account not like", value, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountIn(List<String> values) {
            addCriterion("audio_nvr_account in", values, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountNotIn(List<String> values) {
            addCriterion("audio_nvr_account not in", values, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountBetween(String value1, String value2) {
            addCriterion("audio_nvr_account between", value1, value2, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrAccountNotBetween(String value1, String value2) {
            addCriterion("audio_nvr_account not between", value1, value2, "audioNvrAccount");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordIsNull() {
            addCriterion("audio_nvr_password is null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordIsNotNull() {
            addCriterion("audio_nvr_password is not null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordEqualTo(String value) {
            addCriterion("audio_nvr_password =", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordNotEqualTo(String value) {
            addCriterion("audio_nvr_password <>", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordGreaterThan(String value) {
            addCriterion("audio_nvr_password >", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("audio_nvr_password >=", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordLessThan(String value) {
            addCriterion("audio_nvr_password <", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordLessThanOrEqualTo(String value) {
            addCriterion("audio_nvr_password <=", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordLike(String value) {
            addCriterion("audio_nvr_password like", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordNotLike(String value) {
            addCriterion("audio_nvr_password not like", value, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordIn(List<String> values) {
            addCriterion("audio_nvr_password in", values, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordNotIn(List<String> values) {
            addCriterion("audio_nvr_password not in", values, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordBetween(String value1, String value2) {
            addCriterion("audio_nvr_password between", value1, value2, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrPasswordNotBetween(String value1, String value2) {
            addCriterion("audio_nvr_password not between", value1, value2, "audioNvrPassword");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelIsNull() {
            addCriterion("audio_nvr_channel is null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelIsNotNull() {
            addCriterion("audio_nvr_channel is not null");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelEqualTo(String value) {
            addCriterion("audio_nvr_channel =", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelNotEqualTo(String value) {
            addCriterion("audio_nvr_channel <>", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelGreaterThan(String value) {
            addCriterion("audio_nvr_channel >", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelGreaterThanOrEqualTo(String value) {
            addCriterion("audio_nvr_channel >=", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelLessThan(String value) {
            addCriterion("audio_nvr_channel <", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelLessThanOrEqualTo(String value) {
            addCriterion("audio_nvr_channel <=", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelLike(String value) {
            addCriterion("audio_nvr_channel like", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelNotLike(String value) {
            addCriterion("audio_nvr_channel not like", value, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelIn(List<String> values) {
            addCriterion("audio_nvr_channel in", values, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelNotIn(List<String> values) {
            addCriterion("audio_nvr_channel not in", values, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelBetween(String value1, String value2) {
            addCriterion("audio_nvr_channel between", value1, value2, "audioNvrChannel");
            return (Criteria) this;
        }

        public Criteria andAudioNvrChannelNotBetween(String value1, String value2) {
            addCriterion("audio_nvr_channel not between", value1, value2, "audioNvrChannel");
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