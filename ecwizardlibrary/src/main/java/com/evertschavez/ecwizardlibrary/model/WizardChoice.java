package com.evertschavez.ecwizardlibrary.model;

import android.os.Bundle;

public class WizardChoice {
    protected String mTitle;
    protected String mPageKey;
    protected Object mValue;

    public WizardChoice(String title, String pageKey, Object value) {
        this.mTitle = title;
        this.mPageKey = pageKey;
        this.mValue = value;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getPageKey() {
        return mPageKey;
    }

    public void setPageKey(String mPageKey) {
        this.mPageKey = mPageKey;
    }

    public Object getValue() {
        return mValue;
    }

    public void setValue(Object mValue) {
        this.mValue = mValue;
    }
}
