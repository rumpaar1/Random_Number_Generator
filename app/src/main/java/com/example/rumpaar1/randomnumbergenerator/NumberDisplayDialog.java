package com.example.rumpaar1.randomnumbergenerator;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by rumpaar1 on 7/2/16.
 */
public class NumberDisplayDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final int number = getArguments().getInt("number");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.random_number_return_title);
        builder.setPositiveButton(R.string.random_number_return_dismiss, null);
        builder.setMessage(getString(R.string.random_number_return_message_front) + " " + Integer.toString(number) + getString(R.string.random_number_return_message_back));
        return builder.create();
    }
}
