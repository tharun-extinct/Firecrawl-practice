package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a01 extends kk2 implements my1 {
    public final /* synthetic */ p01 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a01(p01 p01Var, byte b) {
        super(0);
        this.t = b;
        this.a = p01Var;
    }

    @Override // defpackage.my1
    public final Object g() throws IOException {
        switch (this.t) {
            case 0:
                return ((do1) this.a.a.getValue()).r;
            default:
                ao1 ao1Var = this.a.g;
                File canonicalFile = ((File) ao1Var.r.g()).getCanonicalFile();
                synchronized (ao1.v) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = ao1.n;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new do1(canonicalFile, ao1Var.g, (xp4) ao1Var.y.a(canonicalFile), new xh(canonicalFile, (byte) 2));
        }
    }
}
