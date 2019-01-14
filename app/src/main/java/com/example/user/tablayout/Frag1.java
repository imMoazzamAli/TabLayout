package com.example.user.tablayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Frag1 extends Fragment implements View.OnClickListener {

    protected View view;

    private TextInputLayout tilFirst;
    private EditText etFirst;
    private Button btnFirst;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_frag1, container, false);

        tilFirst = view.findViewById(R.id.tilFirst);
        etFirst = view.findViewById(R.id.etFirst);
        btnFirst = view.findViewById(R.id.btnFirst);

        btnFirst.setOnClickListener(this);

        return view;
    }

    public void showData() {
        if (TextUtils.isEmpty(etFirst.getText().toString())) {
            tilFirst.setError("Field required.");
        } else {
            String value = etFirst.getText().toString();
            Toast.makeText(getActivity(), "Value: " + value, Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onClick(View v) {

        if (v == btnFirst) {
            showData();
        }

    }
}
