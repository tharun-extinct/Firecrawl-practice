package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class a70 extends z60 {
    public s25 g;
    public final /* synthetic */ Shader r;
    public long y = 9205357640488583168L;

    public a70(Shader shader) {
        this.r = shader;
    }

    @Override // defpackage.z60
    public final void g(float f, long j, cd cdVar) {
        s25 s25Var = this.g;
        if (s25Var == null || !cq4.g(this.y, j)) {
            if (cq4.r(j)) {
                this.g = null;
                this.y = 9205357640488583168L;
                s25Var = null;
            } else {
                s25Var = this.g;
                if (s25Var == null) {
                    s25Var = new s25();
                    this.g = s25Var;
                }
                s25Var.j = this.r;
                this.g = s25Var;
                this.y = j;
            }
        }
        long jG = cdVar.g();
        long j2 = jj0.y;
        if (!tf5.g(jG, j2)) {
            cdVar.x(j2);
        }
        if (!yf2.p((Shader) cdVar.r, s25Var != null ? (Shader) s25Var.j : null)) {
            cdVar.t(s25Var != null ? (Shader) s25Var.j : null);
        }
        if (((Paint) cdVar.y).getAlpha() / 255.0f == f) {
            return;
        }
        cdVar.n(f);
    }

    public final Shader y() {
        return this.r;
    }
}
