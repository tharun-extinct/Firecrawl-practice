package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class ny0 extends kj1 {
    public final /* synthetic */ byte v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny0(jj1 jj1Var, byte b) {
        super(jj1Var);
        this.v = b;
    }

    @Override // defpackage.kj1
    public void p() {
        switch (this.v) {
            case 0:
                jj1 jj1Var = this.y;
                jj1Var.o = null;
                CheckableImageButton checkableImageButton = jj1Var.c;
                checkableImageButton.setOnLongClickListener(null);
                ue5.o0(checkableImageButton, null);
                break;
        }
    }
}
