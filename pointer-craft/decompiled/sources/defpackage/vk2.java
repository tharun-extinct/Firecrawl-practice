package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public final class vk2 extends n54 {
    public final Object f;
    public final gm2 h;
    public final /* synthetic */ byte o;

    /* JADX WARN: Illegal instructions before constructor call */
    public vk2(ik5 ik5Var) {
        this.o = (byte) 1;
        View root = ik5Var.getRoot();
        root.getClass();
        this(root);
        this.f = ik5Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vk2(MaterialButton materialButton) {
        this((View) materialButton);
        this.o = (byte) 0;
        this.f = materialButton;
    }

    public vk2(View view) {
        super(view);
        this.h = new gm2(this);
    }
}
