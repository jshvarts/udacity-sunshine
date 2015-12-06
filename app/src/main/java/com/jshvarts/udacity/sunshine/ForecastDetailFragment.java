package com.jshvarts.udacity.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shvartsy on 12/1/15.
 */
public class ForecastDetailFragment extends Fragment {
    private static final String TAG = ForecastDetailFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_forecast_detail, container, false);

        Intent intent = getActivity().getIntent();
        if (intent != null) {
            TextView textView = (TextView) rootView.findViewById(R.id.fragment_forecast_detail_textview);
            if (textView != null) {
                textView.setText(intent.getStringExtra(ForecastDetailActivity.EXTRA_DETAIL));
            }
        }
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    }
}
