package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import defpackage.r85;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends r85 {
    public final /* synthetic */ ChipTextInputComboView j;

    public y(ChipTextInputComboView chipTextInputComboView) {
        this.j = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.j;
        if (zIsEmpty) {
            chipTextInputComboView.m = ChipTextInputComboView.g(chipTextInputComboView, "00");
            return;
        }
        String strG = ChipTextInputComboView.g(chipTextInputComboView, editable);
        if (TextUtils.isEmpty(strG)) {
            strG = ChipTextInputComboView.g(chipTextInputComboView, "00");
        }
        chipTextInputComboView.m = strG;
    }
}
