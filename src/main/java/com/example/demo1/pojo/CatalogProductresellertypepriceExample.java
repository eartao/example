package com.example.demo1.pojo;

import java.util.ArrayList;
import java.util.List;

public class CatalogProductresellertypepriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatalogProductresellertypepriceExample() {
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

        public Criteria andPfIdIsNull() {
            addCriterion("pf_id is null");
            return (Criteria) this;
        }

        public Criteria andPfIdIsNotNull() {
            addCriterion("pf_id is not null");
            return (Criteria) this;
        }

        public Criteria andPfIdEqualTo(String value) {
            addCriterion("pf_id =", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdNotEqualTo(String value) {
            addCriterion("pf_id <>", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdGreaterThan(String value) {
            addCriterion("pf_id >", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdGreaterThanOrEqualTo(String value) {
            addCriterion("pf_id >=", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdLessThan(String value) {
            addCriterion("pf_id <", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdLessThanOrEqualTo(String value) {
            addCriterion("pf_id <=", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdLike(String value) {
            addCriterion("pf_id like", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdNotLike(String value) {
            addCriterion("pf_id not like", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdIn(List<String> values) {
            addCriterion("pf_id in", values, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdNotIn(List<String> values) {
            addCriterion("pf_id not in", values, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdBetween(String value1, String value2) {
            addCriterion("pf_id between", value1, value2, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdNotBetween(String value1, String value2) {
            addCriterion("pf_id not between", value1, value2, "pfId");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidIsNull() {
            addCriterion("privateLabelResellerTypeID is null");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidIsNotNull() {
            addCriterion("privateLabelResellerTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidEqualTo(String value) {
            addCriterion("privateLabelResellerTypeID =", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidNotEqualTo(String value) {
            addCriterion("privateLabelResellerTypeID <>", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidGreaterThan(String value) {
            addCriterion("privateLabelResellerTypeID >", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidGreaterThanOrEqualTo(String value) {
            addCriterion("privateLabelResellerTypeID >=", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidLessThan(String value) {
            addCriterion("privateLabelResellerTypeID <", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidLessThanOrEqualTo(String value) {
            addCriterion("privateLabelResellerTypeID <=", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidLike(String value) {
            addCriterion("privateLabelResellerTypeID like", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidNotLike(String value) {
            addCriterion("privateLabelResellerTypeID not like", value, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidIn(List<String> values) {
            addCriterion("privateLabelResellerTypeID in", values, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidNotIn(List<String> values) {
            addCriterion("privateLabelResellerTypeID not in", values, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidBetween(String value1, String value2) {
            addCriterion("privateLabelResellerTypeID between", value1, value2, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andPrivatelabelresellertypeidNotBetween(String value1, String value2) {
            addCriterion("privateLabelResellerTypeID not between", value1, value2, "privatelabelresellertypeid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidIsNull() {
            addCriterion("gdshop_serverGroupID is null");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidIsNotNull() {
            addCriterion("gdshop_serverGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidEqualTo(String value) {
            addCriterion("gdshop_serverGroupID =", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidNotEqualTo(String value) {
            addCriterion("gdshop_serverGroupID <>", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidGreaterThan(String value) {
            addCriterion("gdshop_serverGroupID >", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidGreaterThanOrEqualTo(String value) {
            addCriterion("gdshop_serverGroupID >=", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidLessThan(String value) {
            addCriterion("gdshop_serverGroupID <", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidLessThanOrEqualTo(String value) {
            addCriterion("gdshop_serverGroupID <=", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidLike(String value) {
            addCriterion("gdshop_serverGroupID like", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidNotLike(String value) {
            addCriterion("gdshop_serverGroupID not like", value, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidIn(List<String> values) {
            addCriterion("gdshop_serverGroupID in", values, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidNotIn(List<String> values) {
            addCriterion("gdshop_serverGroupID not in", values, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidBetween(String value1, String value2) {
            addCriterion("gdshop_serverGroupID between", value1, value2, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopServergroupidNotBetween(String value1, String value2) {
            addCriterion("gdshop_serverGroupID not between", value1, value2, "gdshopServergroupid");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeIsNull() {
            addCriterion("gdshop_currencyType is null");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeIsNotNull() {
            addCriterion("gdshop_currencyType is not null");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeEqualTo(String value) {
            addCriterion("gdshop_currencyType =", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeNotEqualTo(String value) {
            addCriterion("gdshop_currencyType <>", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeGreaterThan(String value) {
            addCriterion("gdshop_currencyType >", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeGreaterThanOrEqualTo(String value) {
            addCriterion("gdshop_currencyType >=", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeLessThan(String value) {
            addCriterion("gdshop_currencyType <", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeLessThanOrEqualTo(String value) {
            addCriterion("gdshop_currencyType <=", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeLike(String value) {
            addCriterion("gdshop_currencyType like", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeNotLike(String value) {
            addCriterion("gdshop_currencyType not like", value, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeIn(List<String> values) {
            addCriterion("gdshop_currencyType in", values, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeNotIn(List<String> values) {
            addCriterion("gdshop_currencyType not in", values, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeBetween(String value1, String value2) {
            addCriterion("gdshop_currencyType between", value1, value2, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andGdshopCurrencytypeNotBetween(String value1, String value2) {
            addCriterion("gdshop_currencyType not between", value1, value2, "gdshopCurrencytype");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNull() {
            addCriterion("list_price is null");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNotNull() {
            addCriterion("list_price is not null");
            return (Criteria) this;
        }

        public Criteria andListPriceEqualTo(String value) {
            addCriterion("list_price =", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotEqualTo(String value) {
            addCriterion("list_price <>", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThan(String value) {
            addCriterion("list_price >", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThanOrEqualTo(String value) {
            addCriterion("list_price >=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThan(String value) {
            addCriterion("list_price <", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThanOrEqualTo(String value) {
            addCriterion("list_price <=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLike(String value) {
            addCriterion("list_price like", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotLike(String value) {
            addCriterion("list_price not like", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceIn(List<String> values) {
            addCriterion("list_price in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotIn(List<String> values) {
            addCriterion("list_price not in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceBetween(String value1, String value2) {
            addCriterion("list_price between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotBetween(String value1, String value2) {
            addCriterion("list_price not between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("createDate like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("createDate not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateIsNull() {
            addCriterion("priceStartDate is null");
            return (Criteria) this;
        }

        public Criteria andPricestartdateIsNotNull() {
            addCriterion("priceStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andPricestartdateEqualTo(String value) {
            addCriterion("priceStartDate =", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateNotEqualTo(String value) {
            addCriterion("priceStartDate <>", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateGreaterThan(String value) {
            addCriterion("priceStartDate >", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateGreaterThanOrEqualTo(String value) {
            addCriterion("priceStartDate >=", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateLessThan(String value) {
            addCriterion("priceStartDate <", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateLessThanOrEqualTo(String value) {
            addCriterion("priceStartDate <=", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateLike(String value) {
            addCriterion("priceStartDate like", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateNotLike(String value) {
            addCriterion("priceStartDate not like", value, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateIn(List<String> values) {
            addCriterion("priceStartDate in", values, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateNotIn(List<String> values) {
            addCriterion("priceStartDate not in", values, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateBetween(String value1, String value2) {
            addCriterion("priceStartDate between", value1, value2, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricestartdateNotBetween(String value1, String value2) {
            addCriterion("priceStartDate not between", value1, value2, "pricestartdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateIsNull() {
            addCriterion("priceNewSaleExpirationDate is null");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateIsNotNull() {
            addCriterion("priceNewSaleExpirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateEqualTo(String value) {
            addCriterion("priceNewSaleExpirationDate =", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateNotEqualTo(String value) {
            addCriterion("priceNewSaleExpirationDate <>", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateGreaterThan(String value) {
            addCriterion("priceNewSaleExpirationDate >", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateGreaterThanOrEqualTo(String value) {
            addCriterion("priceNewSaleExpirationDate >=", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateLessThan(String value) {
            addCriterion("priceNewSaleExpirationDate <", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateLessThanOrEqualTo(String value) {
            addCriterion("priceNewSaleExpirationDate <=", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateLike(String value) {
            addCriterion("priceNewSaleExpirationDate like", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateNotLike(String value) {
            addCriterion("priceNewSaleExpirationDate not like", value, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateIn(List<String> values) {
            addCriterion("priceNewSaleExpirationDate in", values, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateNotIn(List<String> values) {
            addCriterion("priceNewSaleExpirationDate not in", values, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateBetween(String value1, String value2) {
            addCriterion("priceNewSaleExpirationDate between", value1, value2, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricenewsaleexpirationdateNotBetween(String value1, String value2) {
            addCriterion("priceNewSaleExpirationDate not between", value1, value2, "pricenewsaleexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateIsNull() {
            addCriterion("priceBasketExpirationDate is null");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateIsNotNull() {
            addCriterion("priceBasketExpirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateEqualTo(String value) {
            addCriterion("priceBasketExpirationDate =", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateNotEqualTo(String value) {
            addCriterion("priceBasketExpirationDate <>", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateGreaterThan(String value) {
            addCriterion("priceBasketExpirationDate >", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateGreaterThanOrEqualTo(String value) {
            addCriterion("priceBasketExpirationDate >=", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateLessThan(String value) {
            addCriterion("priceBasketExpirationDate <", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateLessThanOrEqualTo(String value) {
            addCriterion("priceBasketExpirationDate <=", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateLike(String value) {
            addCriterion("priceBasketExpirationDate like", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateNotLike(String value) {
            addCriterion("priceBasketExpirationDate not like", value, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateIn(List<String> values) {
            addCriterion("priceBasketExpirationDate in", values, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateNotIn(List<String> values) {
            addCriterion("priceBasketExpirationDate not in", values, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateBetween(String value1, String value2) {
            addCriterion("priceBasketExpirationDate between", value1, value2, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPricebasketexpirationdateNotBetween(String value1, String value2) {
            addCriterion("priceBasketExpirationDate not between", value1, value2, "pricebasketexpirationdate");
            return (Criteria) this;
        }

        public Criteria andRowversionidIsNull() {
            addCriterion("rowVersionID is null");
            return (Criteria) this;
        }

        public Criteria andRowversionidIsNotNull() {
            addCriterion("rowVersionID is not null");
            return (Criteria) this;
        }

        public Criteria andRowversionidEqualTo(String value) {
            addCriterion("rowVersionID =", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidNotEqualTo(String value) {
            addCriterion("rowVersionID <>", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidGreaterThan(String value) {
            addCriterion("rowVersionID >", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidGreaterThanOrEqualTo(String value) {
            addCriterion("rowVersionID >=", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidLessThan(String value) {
            addCriterion("rowVersionID <", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidLessThanOrEqualTo(String value) {
            addCriterion("rowVersionID <=", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidLike(String value) {
            addCriterion("rowVersionID like", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidNotLike(String value) {
            addCriterion("rowVersionID not like", value, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidIn(List<String> values) {
            addCriterion("rowVersionID in", values, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidNotIn(List<String> values) {
            addCriterion("rowVersionID not in", values, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidBetween(String value1, String value2) {
            addCriterion("rowVersionID between", value1, value2, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andRowversionidNotBetween(String value1, String value2) {
            addCriterion("rowVersionID not between", value1, value2, "rowversionid");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceIsNull() {
            addCriterion("minimumResellerPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceIsNotNull() {
            addCriterion("minimumResellerPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceEqualTo(String value) {
            addCriterion("minimumResellerPrice =", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceNotEqualTo(String value) {
            addCriterion("minimumResellerPrice <>", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceGreaterThan(String value) {
            addCriterion("minimumResellerPrice >", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceGreaterThanOrEqualTo(String value) {
            addCriterion("minimumResellerPrice >=", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceLessThan(String value) {
            addCriterion("minimumResellerPrice <", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceLessThanOrEqualTo(String value) {
            addCriterion("minimumResellerPrice <=", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceLike(String value) {
            addCriterion("minimumResellerPrice like", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceNotLike(String value) {
            addCriterion("minimumResellerPrice not like", value, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceIn(List<String> values) {
            addCriterion("minimumResellerPrice in", values, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceNotIn(List<String> values) {
            addCriterion("minimumResellerPrice not in", values, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceBetween(String value1, String value2) {
            addCriterion("minimumResellerPrice between", value1, value2, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMinimumresellerpriceNotBetween(String value1, String value2) {
            addCriterion("minimumResellerPrice not between", value1, value2, "minimumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceIsNull() {
            addCriterion("maximumResellerPrice is null");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceIsNotNull() {
            addCriterion("maximumResellerPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceEqualTo(String value) {
            addCriterion("maximumResellerPrice =", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceNotEqualTo(String value) {
            addCriterion("maximumResellerPrice <>", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceGreaterThan(String value) {
            addCriterion("maximumResellerPrice >", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceGreaterThanOrEqualTo(String value) {
            addCriterion("maximumResellerPrice >=", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceLessThan(String value) {
            addCriterion("maximumResellerPrice <", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceLessThanOrEqualTo(String value) {
            addCriterion("maximumResellerPrice <=", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceLike(String value) {
            addCriterion("maximumResellerPrice like", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceNotLike(String value) {
            addCriterion("maximumResellerPrice not like", value, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceIn(List<String> values) {
            addCriterion("maximumResellerPrice in", values, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceNotIn(List<String> values) {
            addCriterion("maximumResellerPrice not in", values, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceBetween(String value1, String value2) {
            addCriterion("maximumResellerPrice between", value1, value2, "maximumresellerprice");
            return (Criteria) this;
        }

        public Criteria andMaximumresellerpriceNotBetween(String value1, String value2) {
            addCriterion("maximumResellerPrice not between", value1, value2, "maximumresellerprice");
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