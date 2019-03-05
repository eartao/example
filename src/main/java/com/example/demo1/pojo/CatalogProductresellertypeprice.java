package com.example.demo1.pojo;

import java.io.Serializable;

public class CatalogProductresellertypeprice implements Serializable {
    private String pfId;

    private String privatelabelresellertypeid;

    private String gdshopServergroupid;

    private String gdshopCurrencytype;

    private String listPrice;

    private String createdate;

    private String pricestartdate;

    private String pricenewsaleexpirationdate;

    private String pricebasketexpirationdate;

    private String rowversionid;

    private String minimumresellerprice;

    private String maximumresellerprice;

    private static final long serialVersionUID = 1L;

    public String getPfId() {
        return pfId;
    }

    public void setPfId(String pfId) {
        this.pfId = pfId == null ? null : pfId.trim();
    }

    public String getPrivatelabelresellertypeid() {
        return privatelabelresellertypeid;
    }

    public void setPrivatelabelresellertypeid(String privatelabelresellertypeid) {
        this.privatelabelresellertypeid = privatelabelresellertypeid == null ? null : privatelabelresellertypeid.trim();
    }

    public String getGdshopServergroupid() {
        return gdshopServergroupid;
    }

    public void setGdshopServergroupid(String gdshopServergroupid) {
        this.gdshopServergroupid = gdshopServergroupid == null ? null : gdshopServergroupid.trim();
    }

    public String getGdshopCurrencytype() {
        return gdshopCurrencytype;
    }

    public void setGdshopCurrencytype(String gdshopCurrencytype) {
        this.gdshopCurrencytype = gdshopCurrencytype == null ? null : gdshopCurrencytype.trim();
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice == null ? null : listPrice.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getPricestartdate() {
        return pricestartdate;
    }

    public void setPricestartdate(String pricestartdate) {
        this.pricestartdate = pricestartdate == null ? null : pricestartdate.trim();
    }

    public String getPricenewsaleexpirationdate() {
        return pricenewsaleexpirationdate;
    }

    public void setPricenewsaleexpirationdate(String pricenewsaleexpirationdate) {
        this.pricenewsaleexpirationdate = pricenewsaleexpirationdate == null ? null : pricenewsaleexpirationdate.trim();
    }

    public String getPricebasketexpirationdate() {
        return pricebasketexpirationdate;
    }

    public void setPricebasketexpirationdate(String pricebasketexpirationdate) {
        this.pricebasketexpirationdate = pricebasketexpirationdate == null ? null : pricebasketexpirationdate.trim();
    }

    public String getRowversionid() {
        return rowversionid;
    }

    public void setRowversionid(String rowversionid) {
        this.rowversionid = rowversionid == null ? null : rowversionid.trim();
    }

    public String getMinimumresellerprice() {
        return minimumresellerprice;
    }

    public void setMinimumresellerprice(String minimumresellerprice) {
        this.minimumresellerprice = minimumresellerprice == null ? null : minimumresellerprice.trim();
    }

    public String getMaximumresellerprice() {
        return maximumresellerprice;
    }

    public void setMaximumresellerprice(String maximumresellerprice) {
        this.maximumresellerprice = maximumresellerprice == null ? null : maximumresellerprice.trim();
    }

    @Override
    public String toString() {
        return "CatalogProductresellertypeprice{" +
                "pfId='" + pfId + '\'' +
                ", privatelabelresellertypeid='" + privatelabelresellertypeid + '\'' +
                ", gdshopServergroupid='" + gdshopServergroupid + '\'' +
                ", gdshopCurrencytype='" + gdshopCurrencytype + '\'' +
                ", listPrice='" + listPrice + '\'' +
                ", createdate='" + createdate + '\'' +
                ", pricestartdate='" + pricestartdate + '\'' +
                ", pricenewsaleexpirationdate='" + pricenewsaleexpirationdate + '\'' +
                ", pricebasketexpirationdate='" + pricebasketexpirationdate + '\'' +
                ", rowversionid='" + rowversionid + '\'' +
                ", minimumresellerprice='" + minimumresellerprice + '\'' +
                ", maximumresellerprice='" + maximumresellerprice + '\'' +
                '}';
    }
}