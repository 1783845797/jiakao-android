package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamprocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamprocExample() {
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

        public Criteria andKsztIsNull() {
            addCriterion("kszt is null");
            return (Criteria) this;
        }

        public Criteria andKsztIsNotNull() {
            addCriterion("kszt is not null");
            return (Criteria) this;
        }

        public Criteria andKsztEqualTo(Integer value) {
            addCriterion("kszt =", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztNotEqualTo(Integer value) {
            addCriterion("kszt <>", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztGreaterThan(Integer value) {
            addCriterion("kszt >", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztGreaterThanOrEqualTo(Integer value) {
            addCriterion("kszt >=", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztLessThan(Integer value) {
            addCriterion("kszt <", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztLessThanOrEqualTo(Integer value) {
            addCriterion("kszt <=", value, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztIn(List<Integer> values) {
            addCriterion("kszt in", values, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztNotIn(List<Integer> values) {
            addCriterion("kszt not in", values, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztBetween(Integer value1, Integer value2) {
            addCriterion("kszt between", value1, value2, "kszt");
            return (Criteria) this;
        }

        public Criteria andKsztNotBetween(Integer value1, Integer value2) {
            addCriterion("kszt not between", value1, value2, "kszt");
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

        public Criteria andPic1IsNull() {
            addCriterion("pic1 is null");
            return (Criteria) this;
        }

        public Criteria andPic1IsNotNull() {
            addCriterion("pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andPic1EqualTo(String value) {
            addCriterion("pic1 =", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotEqualTo(String value) {
            addCriterion("pic1 <>", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThan(String value) {
            addCriterion("pic1 >", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThanOrEqualTo(String value) {
            addCriterion("pic1 >=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThan(String value) {
            addCriterion("pic1 <", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThanOrEqualTo(String value) {
            addCriterion("pic1 <=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Like(String value) {
            addCriterion("pic1 like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotLike(String value) {
            addCriterion("pic1 not like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1In(List<String> values) {
            addCriterion("pic1 in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotIn(List<String> values) {
            addCriterion("pic1 not in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Between(String value1, String value2) {
            addCriterion("pic1 between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotBetween(String value1, String value2) {
            addCriterion("pic1 not between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic2IsNull() {
            addCriterion("pic2 is null");
            return (Criteria) this;
        }

        public Criteria andPic2IsNotNull() {
            addCriterion("pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andPic2EqualTo(String value) {
            addCriterion("pic2 =", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotEqualTo(String value) {
            addCriterion("pic2 <>", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThan(String value) {
            addCriterion("pic2 >", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThanOrEqualTo(String value) {
            addCriterion("pic2 >=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThan(String value) {
            addCriterion("pic2 <", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThanOrEqualTo(String value) {
            addCriterion("pic2 <=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Like(String value) {
            addCriterion("pic2 like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotLike(String value) {
            addCriterion("pic2 not like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2In(List<String> values) {
            addCriterion("pic2 in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotIn(List<String> values) {
            addCriterion("pic2 not in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Between(String value1, String value2) {
            addCriterion("pic2 between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotBetween(String value1, String value2) {
            addCriterion("pic2 not between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andKssjIsNull() {
            addCriterion("kssj is null");
            return (Criteria) this;
        }

        public Criteria andKssjIsNotNull() {
            addCriterion("kssj is not null");
            return (Criteria) this;
        }

        public Criteria andKssjEqualTo(Date value) {
            addCriterion("kssj =", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotEqualTo(Date value) {
            addCriterion("kssj <>", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThan(Date value) {
            addCriterion("kssj >", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThanOrEqualTo(Date value) {
            addCriterion("kssj >=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThan(Date value) {
            addCriterion("kssj <", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThanOrEqualTo(Date value) {
            addCriterion("kssj <=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjIn(List<Date> values) {
            addCriterion("kssj in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotIn(List<Date> values) {
            addCriterion("kssj not in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjBetween(Date value1, Date value2) {
            addCriterion("kssj between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotBetween(Date value1, Date value2) {
            addCriterion("kssj not between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andJssjIsNull() {
            addCriterion("jssj is null");
            return (Criteria) this;
        }

        public Criteria andJssjIsNotNull() {
            addCriterion("jssj is not null");
            return (Criteria) this;
        }

        public Criteria andJssjEqualTo(Date value) {
            addCriterion("jssj =", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotEqualTo(Date value) {
            addCriterion("jssj <>", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThan(Date value) {
            addCriterion("jssj >", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThanOrEqualTo(Date value) {
            addCriterion("jssj >=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThan(Date value) {
            addCriterion("jssj <", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThanOrEqualTo(Date value) {
            addCriterion("jssj <=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjIn(List<Date> values) {
            addCriterion("jssj in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotIn(List<Date> values) {
            addCriterion("jssj not in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjBetween(Date value1, Date value2) {
            addCriterion("jssj between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotBetween(Date value1, Date value2) {
            addCriterion("jssj not between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andJywIsNull() {
            addCriterion("jyw is null");
            return (Criteria) this;
        }

        public Criteria andJywIsNotNull() {
            addCriterion("jyw is not null");
            return (Criteria) this;
        }

        public Criteria andJywEqualTo(String value) {
            addCriterion("jyw =", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotEqualTo(String value) {
            addCriterion("jyw <>", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywGreaterThan(String value) {
            addCriterion("jyw >", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywGreaterThanOrEqualTo(String value) {
            addCriterion("jyw >=", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLessThan(String value) {
            addCriterion("jyw <", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLessThanOrEqualTo(String value) {
            addCriterion("jyw <=", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywLike(String value) {
            addCriterion("jyw like", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotLike(String value) {
            addCriterion("jyw not like", value, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywIn(List<String> values) {
            addCriterion("jyw in", values, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotIn(List<String> values) {
            addCriterion("jyw not in", values, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywBetween(String value1, String value2) {
            addCriterion("jyw between", value1, value2, "jyw");
            return (Criteria) this;
        }

        public Criteria andJywNotBetween(String value1, String value2) {
            addCriterion("jyw not between", value1, value2, "jyw");
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