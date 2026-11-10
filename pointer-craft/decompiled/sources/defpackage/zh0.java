package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zh0 {
    public static final /* synthetic */ int v = 0;
    public final k95 g;
    public final String n;
    public final z22 r;
    public final List y;

    static {
        Collections.unmodifiableList(new ArrayList());
    }

    public zh0(k95 k95Var, List list, z22 z22Var, String str) {
        this.g = k95Var;
        this.y = list;
        this.r = z22Var;
        this.n = str;
    }

    public final byte[] g() {
        g14 g14Var = x04.g;
        g14Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g14Var.y(this, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
