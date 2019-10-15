package liu.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FxUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FxUserExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeIsNull() {
            addCriterion("FX_ALL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeIsNotNull() {
            addCriterion("FX_ALL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeEqualTo(String value) {
            addCriterion("FX_ALL_CODE =", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeNotEqualTo(String value) {
            addCriterion("FX_ALL_CODE <>", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeGreaterThan(String value) {
            addCriterion("FX_ALL_CODE >", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FX_ALL_CODE >=", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeLessThan(String value) {
            addCriterion("FX_ALL_CODE <", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeLessThanOrEqualTo(String value) {
            addCriterion("FX_ALL_CODE <=", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeLike(String value) {
            addCriterion("FX_ALL_CODE like", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeNotLike(String value) {
            addCriterion("FX_ALL_CODE not like", value, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeIn(List<String> values) {
            addCriterion("FX_ALL_CODE in", values, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeNotIn(List<String> values) {
            addCriterion("FX_ALL_CODE not in", values, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeBetween(String value1, String value2) {
            addCriterion("FX_ALL_CODE between", value1, value2, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andFxAllCodeNotBetween(String value1, String value2) {
            addCriterion("FX_ALL_CODE not between", value1, value2, "fxAllCode");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFxCodeIsNull() {
            addCriterion("FX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFxCodeIsNotNull() {
            addCriterion("FX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFxCodeEqualTo(String value) {
            addCriterion("FX_CODE =", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeNotEqualTo(String value) {
            addCriterion("FX_CODE <>", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeGreaterThan(String value) {
            addCriterion("FX_CODE >", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FX_CODE >=", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeLessThan(String value) {
            addCriterion("FX_CODE <", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeLessThanOrEqualTo(String value) {
            addCriterion("FX_CODE <=", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeLike(String value) {
            addCriterion("FX_CODE like", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeNotLike(String value) {
            addCriterion("FX_CODE not like", value, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeIn(List<String> values) {
            addCriterion("FX_CODE in", values, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeNotIn(List<String> values) {
            addCriterion("FX_CODE not in", values, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeBetween(String value1, String value2) {
            addCriterion("FX_CODE between", value1, value2, "fxCode");
            return (Criteria) this;
        }

        public Criteria andFxCodeNotBetween(String value1, String value2) {
            addCriterion("FX_CODE not between", value1, value2, "fxCode");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneIsNull() {
            addCriterion("LOGIN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneIsNotNull() {
            addCriterion("LOGIN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneEqualTo(String value) {
            addCriterion("LOGIN_PHONE =", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotEqualTo(String value) {
            addCriterion("LOGIN_PHONE <>", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneGreaterThan(String value) {
            addCriterion("LOGIN_PHONE >", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PHONE >=", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneLessThan(String value) {
            addCriterion("LOGIN_PHONE <", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PHONE <=", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneLike(String value) {
            addCriterion("LOGIN_PHONE like", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotLike(String value) {
            addCriterion("LOGIN_PHONE not like", value, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneIn(List<String> values) {
            addCriterion("LOGIN_PHONE in", values, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotIn(List<String> values) {
            addCriterion("LOGIN_PHONE not in", values, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneBetween(String value1, String value2) {
            addCriterion("LOGIN_PHONE between", value1, value2, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PHONE not between", value1, value2, "loginPhone");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserCertIsNull() {
            addCriterion("USER_CERT is null");
            return (Criteria) this;
        }

        public Criteria andUserCertIsNotNull() {
            addCriterion("USER_CERT is not null");
            return (Criteria) this;
        }

        public Criteria andUserCertEqualTo(String value) {
            addCriterion("USER_CERT =", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertNotEqualTo(String value) {
            addCriterion("USER_CERT <>", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertGreaterThan(String value) {
            addCriterion("USER_CERT >", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CERT >=", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertLessThan(String value) {
            addCriterion("USER_CERT <", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertLessThanOrEqualTo(String value) {
            addCriterion("USER_CERT <=", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertLike(String value) {
            addCriterion("USER_CERT like", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertNotLike(String value) {
            addCriterion("USER_CERT not like", value, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertIn(List<String> values) {
            addCriterion("USER_CERT in", values, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertNotIn(List<String> values) {
            addCriterion("USER_CERT not in", values, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertBetween(String value1, String value2) {
            addCriterion("USER_CERT between", value1, value2, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserCertNotBetween(String value1, String value2) {
            addCriterion("USER_CERT not between", value1, value2, "userCert");
            return (Criteria) this;
        }

        public Criteria andUserBankNoIsNull() {
            addCriterion("USER_BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserBankNoIsNotNull() {
            addCriterion("USER_BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserBankNoEqualTo(String value) {
            addCriterion("USER_BANK_NO =", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoNotEqualTo(String value) {
            addCriterion("USER_BANK_NO <>", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoGreaterThan(String value) {
            addCriterion("USER_BANK_NO >", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_BANK_NO >=", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoLessThan(String value) {
            addCriterion("USER_BANK_NO <", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoLessThanOrEqualTo(String value) {
            addCriterion("USER_BANK_NO <=", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoLike(String value) {
            addCriterion("USER_BANK_NO like", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoNotLike(String value) {
            addCriterion("USER_BANK_NO not like", value, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoIn(List<String> values) {
            addCriterion("USER_BANK_NO in", values, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoNotIn(List<String> values) {
            addCriterion("USER_BANK_NO not in", values, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoBetween(String value1, String value2) {
            addCriterion("USER_BANK_NO between", value1, value2, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andUserBankNoNotBetween(String value1, String value2) {
            addCriterion("USER_BANK_NO not between", value1, value2, "userBankNo");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeIsNull() {
            addCriterion("PRIVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeIsNotNull() {
            addCriterion("PRIVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeEqualTo(String value) {
            addCriterion("PRIVINCE_CODE =", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeNotEqualTo(String value) {
            addCriterion("PRIVINCE_CODE <>", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeGreaterThan(String value) {
            addCriterion("PRIVINCE_CODE >", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVINCE_CODE >=", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeLessThan(String value) {
            addCriterion("PRIVINCE_CODE <", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PRIVINCE_CODE <=", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeLike(String value) {
            addCriterion("PRIVINCE_CODE like", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeNotLike(String value) {
            addCriterion("PRIVINCE_CODE not like", value, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeIn(List<String> values) {
            addCriterion("PRIVINCE_CODE in", values, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeNotIn(List<String> values) {
            addCriterion("PRIVINCE_CODE not in", values, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeBetween(String value1, String value2) {
            addCriterion("PRIVINCE_CODE between", value1, value2, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andPrivinceCodeNotBetween(String value1, String value2) {
            addCriterion("PRIVINCE_CODE not between", value1, value2, "privinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeIsNull() {
            addCriterion("RIGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRigionCodeIsNotNull() {
            addCriterion("RIGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRigionCodeEqualTo(String value) {
            addCriterion("RIGION_CODE =", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeNotEqualTo(String value) {
            addCriterion("RIGION_CODE <>", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeGreaterThan(String value) {
            addCriterion("RIGION_CODE >", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RIGION_CODE >=", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeLessThan(String value) {
            addCriterion("RIGION_CODE <", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeLessThanOrEqualTo(String value) {
            addCriterion("RIGION_CODE <=", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeLike(String value) {
            addCriterion("RIGION_CODE like", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeNotLike(String value) {
            addCriterion("RIGION_CODE not like", value, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeIn(List<String> values) {
            addCriterion("RIGION_CODE in", values, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeNotIn(List<String> values) {
            addCriterion("RIGION_CODE not in", values, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeBetween(String value1, String value2) {
            addCriterion("RIGION_CODE between", value1, value2, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andRigionCodeNotBetween(String value1, String value2) {
            addCriterion("RIGION_CODE not between", value1, value2, "rigionCode");
            return (Criteria) this;
        }

        public Criteria andFxLeveIsNull() {
            addCriterion("FX_LEVE is null");
            return (Criteria) this;
        }

        public Criteria andFxLeveIsNotNull() {
            addCriterion("FX_LEVE is not null");
            return (Criteria) this;
        }

        public Criteria andFxLeveEqualTo(String value) {
            addCriterion("FX_LEVE =", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveNotEqualTo(String value) {
            addCriterion("FX_LEVE <>", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveGreaterThan(String value) {
            addCriterion("FX_LEVE >", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveGreaterThanOrEqualTo(String value) {
            addCriterion("FX_LEVE >=", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveLessThan(String value) {
            addCriterion("FX_LEVE <", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveLessThanOrEqualTo(String value) {
            addCriterion("FX_LEVE <=", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveLike(String value) {
            addCriterion("FX_LEVE like", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveNotLike(String value) {
            addCriterion("FX_LEVE not like", value, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveIn(List<String> values) {
            addCriterion("FX_LEVE in", values, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveNotIn(List<String> values) {
            addCriterion("FX_LEVE not in", values, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveBetween(String value1, String value2) {
            addCriterion("FX_LEVE between", value1, value2, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxLeveNotBetween(String value1, String value2) {
            addCriterion("FX_LEVE not between", value1, value2, "fxLeve");
            return (Criteria) this;
        }

        public Criteria andFxRankeIsNull() {
            addCriterion("FX_RANKE is null");
            return (Criteria) this;
        }

        public Criteria andFxRankeIsNotNull() {
            addCriterion("FX_RANKE is not null");
            return (Criteria) this;
        }

        public Criteria andFxRankeEqualTo(String value) {
            addCriterion("FX_RANKE =", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeNotEqualTo(String value) {
            addCriterion("FX_RANKE <>", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeGreaterThan(String value) {
            addCriterion("FX_RANKE >", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeGreaterThanOrEqualTo(String value) {
            addCriterion("FX_RANKE >=", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeLessThan(String value) {
            addCriterion("FX_RANKE <", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeLessThanOrEqualTo(String value) {
            addCriterion("FX_RANKE <=", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeLike(String value) {
            addCriterion("FX_RANKE like", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeNotLike(String value) {
            addCriterion("FX_RANKE not like", value, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeIn(List<String> values) {
            addCriterion("FX_RANKE in", values, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeNotIn(List<String> values) {
            addCriterion("FX_RANKE not in", values, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeBetween(String value1, String value2) {
            addCriterion("FX_RANKE between", value1, value2, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxRankeNotBetween(String value1, String value2) {
            addCriterion("FX_RANKE not between", value1, value2, "fxRanke");
            return (Criteria) this;
        }

        public Criteria andFxPointsIsNull() {
            addCriterion("FX_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andFxPointsIsNotNull() {
            addCriterion("FX_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andFxPointsEqualTo(Long value) {
            addCriterion("FX_POINTS =", value, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsNotEqualTo(Long value) {
            addCriterion("FX_POINTS <>", value, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsGreaterThan(Long value) {
            addCriterion("FX_POINTS >", value, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("FX_POINTS >=", value, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsLessThan(Long value) {
            addCriterion("FX_POINTS <", value, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsLessThanOrEqualTo(Long value) {
            addCriterion("FX_POINTS <=", value, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsIn(List<Long> values) {
            addCriterion("FX_POINTS in", values, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsNotIn(List<Long> values) {
            addCriterion("FX_POINTS not in", values, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsBetween(Long value1, Long value2) {
            addCriterion("FX_POINTS between", value1, value2, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxPointsNotBetween(Long value1, Long value2) {
            addCriterion("FX_POINTS not between", value1, value2, "fxPoints");
            return (Criteria) this;
        }

        public Criteria andFxTypeIsNull() {
            addCriterion("FX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFxTypeIsNotNull() {
            addCriterion("FX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFxTypeEqualTo(String value) {
            addCriterion("FX_TYPE =", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeNotEqualTo(String value) {
            addCriterion("FX_TYPE <>", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeGreaterThan(String value) {
            addCriterion("FX_TYPE >", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FX_TYPE >=", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeLessThan(String value) {
            addCriterion("FX_TYPE <", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeLessThanOrEqualTo(String value) {
            addCriterion("FX_TYPE <=", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeLike(String value) {
            addCriterion("FX_TYPE like", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeNotLike(String value) {
            addCriterion("FX_TYPE not like", value, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeIn(List<String> values) {
            addCriterion("FX_TYPE in", values, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeNotIn(List<String> values) {
            addCriterion("FX_TYPE not in", values, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeBetween(String value1, String value2) {
            addCriterion("FX_TYPE between", value1, value2, "fxType");
            return (Criteria) this;
        }

        public Criteria andFxTypeNotBetween(String value1, String value2) {
            addCriterion("FX_TYPE not between", value1, value2, "fxType");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andIsUntieIsNull() {
            addCriterion("IS_UNTIE is null");
            return (Criteria) this;
        }

        public Criteria andIsUntieIsNotNull() {
            addCriterion("IS_UNTIE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUntieEqualTo(String value) {
            addCriterion("IS_UNTIE =", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieNotEqualTo(String value) {
            addCriterion("IS_UNTIE <>", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieGreaterThan(String value) {
            addCriterion("IS_UNTIE >", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UNTIE >=", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieLessThan(String value) {
            addCriterion("IS_UNTIE <", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieLessThanOrEqualTo(String value) {
            addCriterion("IS_UNTIE <=", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieLike(String value) {
            addCriterion("IS_UNTIE like", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieNotLike(String value) {
            addCriterion("IS_UNTIE not like", value, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieIn(List<String> values) {
            addCriterion("IS_UNTIE in", values, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieNotIn(List<String> values) {
            addCriterion("IS_UNTIE not in", values, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieBetween(String value1, String value2) {
            addCriterion("IS_UNTIE between", value1, value2, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsUntieNotBetween(String value1, String value2) {
            addCriterion("IS_UNTIE not between", value1, value2, "isUntie");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("IS_DELETE like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("IS_DELETE not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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