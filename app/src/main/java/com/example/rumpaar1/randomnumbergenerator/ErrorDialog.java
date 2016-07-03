package com.example.rumpaar1.randomnumbergenerator;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by rumpaar1 on 7/2/16.
 */
public class ErrorDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.random_number_error_title);
        builder.setPositiveButton(R.string.random_number_error_dismiss, null);
        builder.setMessage(getString(R.string.random_number_error_message));
        return builder.create();
    }
}
