package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pl1 implements p14 {
    public final /* synthetic */ byte g;
    public final p14 y;

    public /* synthetic */ pl1(p14 p14Var, byte b) {
        this.g = b;
        this.y = p14Var;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        p14 p14Var = this.y;
        switch (b) {
            case 0:
                String packageName = ((Context) p14Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                l0.q("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new oe4(((Integer) y94.j.get()).intValue(), (Context) p14Var.get(), "com.google.android.datatransport.events");
        }
    }
}
