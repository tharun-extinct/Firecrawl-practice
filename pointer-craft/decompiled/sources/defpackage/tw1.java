package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import io.appground.blek.ui.controls.TextInputView;

/* JADX INFO: loaded from: classes.dex */
public final class tw1 implements ik5 {
    public final CheckBox a;
    public final MaterialButton c;
    public final LinearLayout g;
    public final TextView i;
    public final LinearLayout j;
    public final MaterialButton l;
    public final MaterialButtonToggleGroup m;
    public final TextInputEditText n;
    public final MaterialCardView q;
    public final FrameLayout r;
    public final TextInputView t;
    public final TextInputLayout v;
    public final MaterialButton w;
    public final LinearLayout x;
    public final Button y;

    public tw1(LinearLayout linearLayout, Button button, FrameLayout frameLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, LinearLayout linearLayout2, MaterialButton materialButton, LinearLayout linearLayout3, TextInputView textInputView, CheckBox checkBox, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialCardView materialCardView, MaterialButton materialButton2, MaterialButton materialButton3, TextView textView) {
        this.g = linearLayout;
        this.y = button;
        this.r = frameLayout;
        this.n = textInputEditText;
        this.v = textInputLayout;
        this.x = linearLayout2;
        this.l = materialButton;
        this.j = linearLayout3;
        this.t = textInputView;
        this.a = checkBox;
        this.m = materialButtonToggleGroup;
        this.q = materialCardView;
        this.w = materialButton2;
        this.c = materialButton3;
        this.i = textView;
    }

    @Override // defpackage.ik5
    public final View getRoot() {
        return this.g;
    }
}
