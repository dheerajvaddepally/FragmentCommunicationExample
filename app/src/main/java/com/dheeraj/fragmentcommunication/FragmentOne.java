package com.dheeraj.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dheeraj on 17/12/17.
 */

public class FragmentOne extends Fragment {
    Communicator communicator;
    TextView mButton;
    int counter = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator = (Communicator) getActivity();
        mButton = getActivity().findViewById(R.id.click_me);
        mButton.setOnClickListener(view -> {
            counter++;
            communicator.communicate(counter + "");
        });
    }
}
