package com.evertschavez.ecwizardexample.pages;

import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.evertschavez.ecwizardlibrary.model.ModelCallbacks;
import com.evertschavez.ecwizardlibrary.model.Page;
import com.evertschavez.ecwizardlibrary.model.ReviewItem;

import java.util.ArrayList;

public class CustomerInfoPage extends Page {
    public static final String NAME_DATA_KEY = "name";
    public static final String EMAIL_DATA_KEY = "email";

    public CustomerInfoPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return CustomerInfoFragment.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
        dest.add(new ReviewItem("Your name", mData.getString(NAME_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Your email", mData.getString(EMAIL_DATA_KEY), getKey(), -1));
    }

    @Override
    public boolean isCompleted() {
        return !TextUtils.isEmpty(mData.getString(NAME_DATA_KEY));
    }
}
