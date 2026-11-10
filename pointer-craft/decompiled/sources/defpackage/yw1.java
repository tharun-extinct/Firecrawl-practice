package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class yw1 implements ik5 {
    public final MaterialButtonToggleGroup a;
    public final CoordinatorLayout g;
    public final MaterialButton j;
    public final MaterialButtonToggleGroup l;
    public final MaterialButton m;
    public final FrameLayout n;
    public final ComposeView r;
    public final MaterialButton t;
    public final MaterialButtonToggleGroup v;
    public final MaterialButton x;
    public final MaterialButton y;

    public yw1(CoordinatorLayout coordinatorLayout, MaterialButton materialButton, ComposeView composeView, FrameLayout frameLayout, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialButton materialButton2, MaterialButtonToggleGroup materialButtonToggleGroup2, MaterialButton materialButton3, MaterialButton materialButton4, RecyclerView recyclerView, MaterialButtonToggleGroup materialButtonToggleGroup3, MaterialButton materialButton5) {
        this.g = coordinatorLayout;
        this.y = materialButton;
        this.r = composeView;
        this.n = frameLayout;
        this.v = materialButtonToggleGroup;
        this.x = materialButton2;
        this.l = materialButtonToggleGroup2;
        this.j = materialButton3;
        this.t = materialButton4;
        this.a = materialButtonToggleGroup3;
        this.m = materialButton5;
    }

    @Override // defpackage.ik5
    public final View getRoot() {
        return this.g;
    }
}
