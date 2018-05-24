package com.hqhcn.android.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(Integer value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(Integer value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(Integer value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(Integer value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(Integer value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<Integer> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<Integer> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(Integer value1, Integer value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserstatIsNull() {
            addCriterion("userstat is null");
            return (Criteria) this;
        }

        public Criteria andUserstatIsNotNull() {
            addCriterion("userstat is not null");
            return (Criteria) this;
        }

        public Criteria andUserstatEqualTo(Integer value) {
            addCriterion("userstat =", value, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatNotEqualTo(Integer value) {
            addCriterion("userstat <>", value, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatGreaterThan(Integer value) {
            addCriterion("userstat >", value, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatGreaterThanOrEqualTo(Integer value) {
            addCriterion("userstat >=", value, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatLessThan(Integer value) {
            addCriterion("userstat <", value, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatLessThanOrEqualTo(Integer value) {
            addCriterion("userstat <=", value, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatIn(List<Integer> values) {
            addCriterion("userstat in", values, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatNotIn(List<Integer> values) {
            addCriterion("userstat not in", values, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatBetween(Integer value1, Integer value2) {
            addCriterion("userstat between", value1, value2, "userstat");
            return (Criteria) this;
        }

        public Criteria andUserstatNotBetween(Integer value1, Integer value2) {
            addCriterion("userstat not between", value1, value2, "userstat");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carid like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carid not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("sign_type is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("sign_type is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(Integer value) {
            addCriterion("sign_type =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(Integer value) {
            addCriterion("sign_type <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(Integer value) {
            addCriterion("sign_type >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_type >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(Integer value) {
            addCriterion("sign_type <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sign_type <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<Integer> values) {
            addCriterion("sign_type in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<Integer> values) {
            addCriterion("sign_type not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(Integer value1, Integer value2) {
            addCriterion("sign_type between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_type not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobilIsNull() {
            addCriterion("mobil is null");
            return (Criteria) this;
        }

        public Criteria andMobilIsNotNull() {
            addCriterion("mobil is not null");
            return (Criteria) this;
        }

        public Criteria andMobilEqualTo(String value) {
            addCriterion("mobil =", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotEqualTo(String value) {
            addCriterion("mobil <>", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilGreaterThan(String value) {
            addCriterion("mobil >", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilGreaterThanOrEqualTo(String value) {
            addCriterion("mobil >=", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilLessThan(String value) {
            addCriterion("mobil <", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilLessThanOrEqualTo(String value) {
            addCriterion("mobil <=", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilLike(String value) {
            addCriterion("mobil like", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotLike(String value) {
            addCriterion("mobil not like", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilIn(List<String> values) {
            addCriterion("mobil in", values, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotIn(List<String> values) {
            addCriterion("mobil not in", values, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilBetween(String value1, String value2) {
            addCriterion("mobil between", value1, value2, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotBetween(String value1, String value2) {
            addCriterion("mobil not between", value1, value2, "mobil");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNull() {
            addCriterion("link_email is null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNotNull() {
            addCriterion("link_email is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailEqualTo(String value) {
            addCriterion("link_email =", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotEqualTo(String value) {
            addCriterion("link_email <>", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThan(String value) {
            addCriterion("link_email >", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThanOrEqualTo(String value) {
            addCriterion("link_email >=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThan(String value) {
            addCriterion("link_email <", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThanOrEqualTo(String value) {
            addCriterion("link_email <=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLike(String value) {
            addCriterion("link_email like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotLike(String value) {
            addCriterion("link_email not like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIn(List<String> values) {
            addCriterion("link_email in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotIn(List<String> values) {
            addCriterion("link_email not in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailBetween(String value1, String value2) {
            addCriterion("link_email between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotBetween(String value1, String value2) {
            addCriterion("link_email not between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNull() {
            addCriterion("mac_address is null");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNotNull() {
            addCriterion("mac_address is not null");
            return (Criteria) this;
        }

        public Criteria andMacAddressEqualTo(String value) {
            addCriterion("mac_address =", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotEqualTo(String value) {
            addCriterion("mac_address <>", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThan(String value) {
            addCriterion("mac_address >", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mac_address >=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThan(String value) {
            addCriterion("mac_address <", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThanOrEqualTo(String value) {
            addCriterion("mac_address <=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLike(String value) {
            addCriterion("mac_address like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotLike(String value) {
            addCriterion("mac_address not like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressIn(List<String> values) {
            addCriterion("mac_address in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotIn(List<String> values) {
            addCriterion("mac_address not in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressBetween(String value1, String value2) {
            addCriterion("mac_address between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotBetween(String value1, String value2) {
            addCriterion("mac_address not between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("is_online is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("is_online is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Integer value) {
            addCriterion("is_online =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Integer value) {
            addCriterion("is_online <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Integer value) {
            addCriterion("is_online >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_online >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Integer value) {
            addCriterion("is_online <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("is_online <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Integer> values) {
            addCriterion("is_online in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Integer> values) {
            addCriterion("is_online not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("is_online between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("is_online not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(Integer value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(Integer value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(Integer value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(Integer value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(Integer value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<Integer> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<Integer> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(Integer value1, Integer value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andPymIsNull() {
            addCriterion("pym is null");
            return (Criteria) this;
        }

        public Criteria andPymIsNotNull() {
            addCriterion("pym is not null");
            return (Criteria) this;
        }

        public Criteria andPymEqualTo(String value) {
            addCriterion("pym =", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymNotEqualTo(String value) {
            addCriterion("pym <>", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymGreaterThan(String value) {
            addCriterion("pym >", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymGreaterThanOrEqualTo(String value) {
            addCriterion("pym >=", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymLessThan(String value) {
            addCriterion("pym <", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymLessThanOrEqualTo(String value) {
            addCriterion("pym <=", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymLike(String value) {
            addCriterion("pym like", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymNotLike(String value) {
            addCriterion("pym not like", value, "pym");
            return (Criteria) this;
        }

        public Criteria andPymIn(List<String> values) {
            addCriterion("pym in", values, "pym");
            return (Criteria) this;
        }

        public Criteria andPymNotIn(List<String> values) {
            addCriterion("pym not in", values, "pym");
            return (Criteria) this;
        }

        public Criteria andPymBetween(String value1, String value2) {
            addCriterion("pym between", value1, value2, "pym");
            return (Criteria) this;
        }

        public Criteria andPymNotBetween(String value1, String value2) {
            addCriterion("pym not between", value1, value2, "pym");
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

        public Criteria andGwhIsNull() {
            addCriterion("gwh is null");
            return (Criteria) this;
        }

        public Criteria andGwhIsNotNull() {
            addCriterion("gwh is not null");
            return (Criteria) this;
        }

        public Criteria andGwhEqualTo(String value) {
            addCriterion("gwh =", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhNotEqualTo(String value) {
            addCriterion("gwh <>", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhGreaterThan(String value) {
            addCriterion("gwh >", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhGreaterThanOrEqualTo(String value) {
            addCriterion("gwh >=", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhLessThan(String value) {
            addCriterion("gwh <", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhLessThanOrEqualTo(String value) {
            addCriterion("gwh <=", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhLike(String value) {
            addCriterion("gwh like", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhNotLike(String value) {
            addCriterion("gwh not like", value, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhIn(List<String> values) {
            addCriterion("gwh in", values, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhNotIn(List<String> values) {
            addCriterion("gwh not in", values, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhBetween(String value1, String value2) {
            addCriterion("gwh between", value1, value2, "gwh");
            return (Criteria) this;
        }

        public Criteria andGwhNotBetween(String value1, String value2) {
            addCriterion("gwh not between", value1, value2, "gwh");
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

        public Criteria andJybhIsNull() {
            addCriterion("jybh is null");
            return (Criteria) this;
        }

        public Criteria andJybhIsNotNull() {
            addCriterion("jybh is not null");
            return (Criteria) this;
        }

        public Criteria andJybhEqualTo(String value) {
            addCriterion("jybh =", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhNotEqualTo(String value) {
            addCriterion("jybh <>", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhGreaterThan(String value) {
            addCriterion("jybh >", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhGreaterThanOrEqualTo(String value) {
            addCriterion("jybh >=", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhLessThan(String value) {
            addCriterion("jybh <", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhLessThanOrEqualTo(String value) {
            addCriterion("jybh <=", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhLike(String value) {
            addCriterion("jybh like", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhNotLike(String value) {
            addCriterion("jybh not like", value, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhIn(List<String> values) {
            addCriterion("jybh in", values, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhNotIn(List<String> values) {
            addCriterion("jybh not in", values, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhBetween(String value1, String value2) {
            addCriterion("jybh between", value1, value2, "jybh");
            return (Criteria) this;
        }

        public Criteria andJybhNotBetween(String value1, String value2) {
            addCriterion("jybh not between", value1, value2, "jybh");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityIsNull() {
            addCriterion("issue_authority is null");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityIsNotNull() {
            addCriterion("issue_authority is not null");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityEqualTo(String value) {
            addCriterion("issue_authority =", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotEqualTo(String value) {
            addCriterion("issue_authority <>", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityGreaterThan(String value) {
            addCriterion("issue_authority >", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("issue_authority >=", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityLessThan(String value) {
            addCriterion("issue_authority <", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityLessThanOrEqualTo(String value) {
            addCriterion("issue_authority <=", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityLike(String value) {
            addCriterion("issue_authority like", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotLike(String value) {
            addCriterion("issue_authority not like", value, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityIn(List<String> values) {
            addCriterion("issue_authority in", values, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotIn(List<String> values) {
            addCriterion("issue_authority not in", values, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityBetween(String value1, String value2) {
            addCriterion("issue_authority between", value1, value2, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueAuthorityNotBetween(String value1, String value2) {
            addCriterion("issue_authority not between", value1, value2, "issueAuthority");
            return (Criteria) this;
        }

        public Criteria andIssueUnitIsNull() {
            addCriterion("issue_unit is null");
            return (Criteria) this;
        }

        public Criteria andIssueUnitIsNotNull() {
            addCriterion("issue_unit is not null");
            return (Criteria) this;
        }

        public Criteria andIssueUnitEqualTo(String value) {
            addCriterion("issue_unit =", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitNotEqualTo(String value) {
            addCriterion("issue_unit <>", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitGreaterThan(String value) {
            addCriterion("issue_unit >", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitGreaterThanOrEqualTo(String value) {
            addCriterion("issue_unit >=", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitLessThan(String value) {
            addCriterion("issue_unit <", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitLessThanOrEqualTo(String value) {
            addCriterion("issue_unit <=", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitLike(String value) {
            addCriterion("issue_unit like", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitNotLike(String value) {
            addCriterion("issue_unit not like", value, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitIn(List<String> values) {
            addCriterion("issue_unit in", values, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitNotIn(List<String> values) {
            addCriterion("issue_unit not in", values, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitBetween(String value1, String value2) {
            addCriterion("issue_unit between", value1, value2, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andIssueUnitNotBetween(String value1, String value2) {
            addCriterion("issue_unit not between", value1, value2, "issueUnit");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNull() {
            addCriterion("department_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNotNull() {
            addCriterion("department_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeEqualTo(String value) {
            addCriterion("department_code =", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotEqualTo(String value) {
            addCriterion("department_code <>", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThan(String value) {
            addCriterion("department_code >", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("department_code >=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThan(String value) {
            addCriterion("department_code <", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("department_code <=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLike(String value) {
            addCriterion("department_code like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotLike(String value) {
            addCriterion("department_code not like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIn(List<String> values) {
            addCriterion("department_code in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotIn(List<String> values) {
            addCriterion("department_code not in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeBetween(String value1, String value2) {
            addCriterion("department_code between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("department_code not between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNull() {
            addCriterion("job_status is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNotNull() {
            addCriterion("job_status is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusEqualTo(Integer value) {
            addCriterion("job_status =", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotEqualTo(Integer value) {
            addCriterion("job_status <>", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThan(Integer value) {
            addCriterion("job_status >", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_status >=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThan(Integer value) {
            addCriterion("job_status <", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThanOrEqualTo(Integer value) {
            addCriterion("job_status <=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusIn(List<Integer> values) {
            addCriterion("job_status in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotIn(List<Integer> values) {
            addCriterion("job_status not in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusBetween(Integer value1, Integer value2) {
            addCriterion("job_status between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("job_status not between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNull() {
            addCriterion("born_date is null");
            return (Criteria) this;
        }

        public Criteria andBornDateIsNotNull() {
            addCriterion("born_date is not null");
            return (Criteria) this;
        }

        public Criteria andBornDateEqualTo(Date value) {
            addCriterion("born_date =", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotEqualTo(Date value) {
            addCriterion("born_date <>", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThan(Date value) {
            addCriterion("born_date >", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateGreaterThanOrEqualTo(Date value) {
            addCriterion("born_date >=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThan(Date value) {
            addCriterion("born_date <", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateLessThanOrEqualTo(Date value) {
            addCriterion("born_date <=", value, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateIn(List<Date> values) {
            addCriterion("born_date in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotIn(List<Date> values) {
            addCriterion("born_date not in", values, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateBetween(Date value1, Date value2) {
            addCriterion("born_date between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andBornDateNotBetween(Date value1, Date value2) {
            addCriterion("born_date not between", value1, value2, "bornDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyIsNull() {
            addCriterion("last_modify is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyIsNotNull() {
            addCriterion("last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyEqualTo(Date value) {
            addCriterion("last_modify =", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotEqualTo(Date value) {
            addCriterion("last_modify <>", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThan(Date value) {
            addCriterion("last_modify >", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify >=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThan(Date value) {
            addCriterion("last_modify <", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThanOrEqualTo(Date value) {
            addCriterion("last_modify <=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyIn(List<Date> values) {
            addCriterion("last_modify in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotIn(List<Date> values) {
            addCriterion("last_modify not in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyBetween(Date value1, Date value2) {
            addCriterion("last_modify between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotBetween(Date value1, Date value2) {
            addCriterion("last_modify not between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andOverDateIsNull() {
            addCriterion("over_date is null");
            return (Criteria) this;
        }

        public Criteria andOverDateIsNotNull() {
            addCriterion("over_date is not null");
            return (Criteria) this;
        }

        public Criteria andOverDateEqualTo(Date value) {
            addCriterion("over_date =", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotEqualTo(Date value) {
            addCriterion("over_date <>", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateGreaterThan(Date value) {
            addCriterion("over_date >", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateGreaterThanOrEqualTo(Date value) {
            addCriterion("over_date >=", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateLessThan(Date value) {
            addCriterion("over_date <", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateLessThanOrEqualTo(Date value) {
            addCriterion("over_date <=", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateIn(List<Date> values) {
            addCriterion("over_date in", values, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotIn(List<Date> values) {
            addCriterion("over_date not in", values, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateBetween(Date value1, Date value2) {
            addCriterion("over_date between", value1, value2, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotBetween(Date value1, Date value2) {
            addCriterion("over_date not between", value1, value2, "overDate");
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