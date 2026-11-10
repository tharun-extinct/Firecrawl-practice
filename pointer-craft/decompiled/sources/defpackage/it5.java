package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class it5 extends ot5 {
    public final fu5 n;
    public final x25 v;
    public final /* synthetic */ jt5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it5(jt5 jt5Var, x25 x25Var) {
        super((byte) 0);
        Objects.requireNonNull(jt5Var);
        this.x = jt5Var;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.n = new fu5("OnRequestIntegrityTokenCallback");
        this.v = x25Var;
    }
}
