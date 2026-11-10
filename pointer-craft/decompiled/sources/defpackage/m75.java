package defpackage;

import android.content.pm.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m75 implements xy1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ m75(byte b) {
        this.j = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                ((nj4) obj).g(kj4.B, og5Var);
                return og5Var;
            case 1:
                ((be5) obj).getClass();
                return og5Var;
            case 2:
                ((Boolean) obj).getClass();
                return og5Var;
            case 3:
                Signature signature = (Signature) obj;
                signature.getClass();
                byte[] byteArray = signature.toByteArray();
                byteArray.getClass();
                return pr.c0(byteArray, "", new m9((byte) 16), 30).subSequence(0, 2);
            case 4:
                return ((yp5) obj).l;
            case 5:
                return ((yp5) obj).r;
            default:
                fq5 fq5Var = (fq5) obj;
                fq5Var.getClass();
                return fq5Var;
        }
    }
}
