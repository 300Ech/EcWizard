package com.evertschavez.ecwizardlibrary.model;

import android.os.Bundle;

public class WizardChoice {
    protected String mTitle;
    protected String mPageKey;

    public WizardChoice(String title, String pageKey) {
        this.mTitle = title;
        this.mPageKey = pageKey;
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
}
