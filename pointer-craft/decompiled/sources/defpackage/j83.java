package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class j83 implements ik5 {
    public final LinearLayout g;
    public final MaterialButton n;
    public final MaterialButton r;
    public final MaterialButton y;

    public j83(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3) {
        this.g = linearLayout;
        this.y = materialButton;
        this.r = materialButton2;
        this.n = materialButton3;
    }

    public static j83 g(View view) {
        int i = R.id.button_mouse_left;
        MaterialButton materialButton = (MaterialButton) br2.i(view, R.id.button_mouse_left);
        if (materialButton != null) {
            i = R.id.button_mouse_middle;
            MaterialButton materialButton2 = (MaterialButton) br2.i(view, R.id.button_mouse_middle);
            if (materialButton2 != null) {
                i = R.id.button_mouse_right;
                MaterialButton materialButton3 = (MaterialButton) br2.i(view, R.id.button_mouse_right);
                if (materialButton3 != null) {
                    return new j83((LinearLayout) view, materialButton, materialButton2, materialButton3);
                }
            }
        }
        l0.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ik5
    public final View getRoot() {
        return this.g;
    }
}
