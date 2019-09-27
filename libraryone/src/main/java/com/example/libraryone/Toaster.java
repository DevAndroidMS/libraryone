package com.example.libraryone;

import android.content.Context;
import android.widget.Toast;

public class Toaster {


    public void showMessage(Context ctx, String string) {
        Toast.makeText(ctx, string, Toast.LENGTH_LONG).show();
    }
}
