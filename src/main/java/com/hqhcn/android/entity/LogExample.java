package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andProgramIsNull() {
            addCriterion("program is null");
            return (Criteria) this;
        }

        public Criteria andProgramIsNotNull() {
            addCriterion("program is not null");
            return (Criteria) this;
        }

        public Criteria andProgramEqualTo(String value) {
            addCriterion("program =", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotEqualTo(String value) {
            addCriterion("program <>", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramGreaterThan(String value) {
            addCriterion("program >", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramGreaterThanOrEqualTo(String value) {
            addCriterion("program >=", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramLessThan(String value) {
            addCriterion("program <", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramLessThanOrEqualTo(String value) {
            addCriterion("program <=", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramLike(String value) {
            addCriterion("program like", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotLike(String value) {
            addCriterion("program not like", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramIn(List<String> values) {
            addCriterion("program in", values, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotIn(List<String> values) {
            addCriterion("program not in", values, "program");
            return (Criteria) this;
        }

        public Criteria andProgramBetween(String value1, String value2) {
            addCriterion("program between", value1, value2, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotBetween(String value1, String value2) {
            addCriterion("program not between", value1, value2, "program");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("cz is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("cz is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(String value) {
            addCriterion("cz =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(String value) {
            addCriterion("cz <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(String value) {
            addCriterion("cz >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(String value) {
            addCriterion("cz >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(String value) {
            addCriterion("cz <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(String value) {
            addCriterion("cz <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLike(String value) {
            addCriterion("cz like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotLike(String value) {
            addCriterion("cz not like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<String> values) {
            addCriterion("cz in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<String> values) {
            addCriterion("cz not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(String value1, String value2) {
            addCriterion("cz between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(String value1, String value2) {
            addCriterion("cz not between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andXxsmIsNull() {
            addCriterion("xxsm is null");
            return (Criteria) this;
        }

        public Criteria andXxsmIsNotNull() {
            addCriterion("xxsm is not null");
            return (Criteria) this;
        }

        public Criteria andXxsmEqualTo(String value) {
            addCriterion("xxsm =", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmNotEqualTo(String value) {
            addCriterion("xxsm <>", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmGreaterThan(String value) {
            addCriterion("xxsm >", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmGreaterThanOrEqualTo(String value) {
            addCriterion("xxsm >=", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmLessThan(String value) {
            addCriterion("xxsm <", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmLessThanOrEqualTo(String value) {
            addCriterion("xxsm <=", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmLike(String value) {
            addCriterion("xxsm like", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmNotLike(String value) {
            addCriterion("xxsm not like", value, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmIn(List<String> values) {
            addCriterion("xxsm in", values, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmNotIn(List<String> values) {
            addCriterion("xxsm not in", values, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmBetween(String value1, String value2) {
            addCriterion("xxsm between", value1, value2, "xxsm");
            return (Criteria) this;
        }

        public Criteria andXxsmNotBetween(String value1, String value2) {
            addCriterion("xxsm not between", value1, value2, "xxsm");
            return (Criteria) this;
        }

        public Criteria andCzipIsNull() {
            addCriterion("czip is null");
            return (Criteria) this;
        }

        public Criteria andCzipIsNotNull() {
            addCriterion("czip is not null");
            return (Criteria) this;
        }

        public Criteria andCzipEqualTo(String value) {
            addCriterion("czip =", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipNotEqualTo(String value) {
            addCriterion("czip <>", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipGreaterThan(String value) {
            addCriterion("czip >", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipGreaterThanOrEqualTo(String value) {
            addCriterion("czip >=", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipLessThan(String value) {
            addCriterion("czip <", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipLessThanOrEqualTo(String value) {
            addCriterion("czip <=", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipLike(String value) {
            addCriterion("czip like", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipNotLike(String value) {
            addCriterion("czip not like", value, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipIn(List<String> values) {
            addCriterion("czip in", values, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipNotIn(List<String> values) {
            addCriterion("czip not in", values, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipBetween(String value1, String value2) {
            addCriterion("czip between", value1, value2, "czip");
            return (Criteria) this;
        }

        public Criteria andCzipNotBetween(String value1, String value2) {
            addCriterion("czip not between", value1, value2, "czip");
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

        public Criteria andLogtypeIsNull() {
            addCriterion("logtype is null");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNotNull() {
            addCriterion("logtype is not null");
            return (Criteria) this;
        }

        public Criteria andLogtypeEqualTo(String value) {
            addCriterion("logtype =", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotEqualTo(String value) {
            addCriterion("logtype <>", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThan(String value) {
            addCriterion("logtype >", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("logtype >=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThan(String value) {
            addCriterion("logtype <", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThanOrEqualTo(String value) {
            addCriterion("logtype <=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLike(String value) {
            addCriterion("logtype like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotLike(String value) {
            addCriterion("logtype not like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeIn(List<String> values) {
            addCriterion("logtype in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotIn(List<String> values) {
            addCriterion("logtype not in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeBetween(String value1, String value2) {
            addCriterion("logtype between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotBetween(String value1, String value2) {
            addCriterion("logtype not between", value1, value2, "logtype");
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

        public Criteria andCzsjIsNull() {
            addCriterion("czsj is null");
            return (Criteria) this;
        }

        public Criteria andCzsjIsNotNull() {
            addCriterion("czsj is not null");
            return (Criteria) this;
        }

        public Criteria andCzsjEqualTo(Date value) {
            addCriterion("czsj =", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjNotEqualTo(Date value) {
            addCriterion("czsj <>", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjGreaterThan(Date value) {
            addCriterion("czsj >", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("czsj >=", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjLessThan(Date value) {
            addCriterion("czsj <", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjLessThanOrEqualTo(Date value) {
            addCriterion("czsj <=", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjIn(List<Date> values) {
            addCriterion("czsj in", values, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjNotIn(List<Date> values) {
            addCriterion("czsj not in", values, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjBetween(Date value1, Date value2) {
            addCriterion("czsj between", value1, value2, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjNotBetween(Date value1, Date value2) {
            addCriterion("czsj not between", value1, value2, "czsj");
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