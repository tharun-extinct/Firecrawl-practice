package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class us4 implements xy1 {
    public final /* synthetic */ r54 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ float t;

    public /* synthetic */ us4(float f, r54 r54Var, Object obj, Object obj2, byte b) {
        this.j = b;
        this.t = f;
        this.a = r54Var;
        this.m = obj;
        this.q = obj2;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        float fG = 0.0f;
        og5 og5Var = og5.g;
        Object obj2 = this.q;
        Object obj3 = this.m;
        r54 r54Var = this.a;
        float f = this.t;
        switch (b) {
            case 0:
                pf4 pf4Var = (pf4) obj3;
                xy1 xy1Var = (xy1) obj2;
                ni niVar = (ni) obj;
                float fAbs = Math.abs(((Number) niVar.v.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                tp3 tp3Var = niVar.v;
                if (fAbs < fAbs2) {
                    lr2.m(niVar, pf4Var, xy1Var, ((Number) tp3Var.getValue()).floatValue() - r54Var.j);
                    r54Var.j = ((Number) tp3Var.getValue()).floatValue();
                } else {
                    float fS = lr2.s(((Number) tp3Var.getValue()).floatValue(), f);
                    lr2.m(niVar, pf4Var, xy1Var, fS - r54Var.j);
                    niVar.g();
                    r54Var.j = fS;
                }
                break;
            case 1:
                pf4 pf4Var2 = (pf4) obj3;
                xy1 xy1Var2 = (xy1) obj2;
                ni niVar2 = (ni) obj;
                float fS2 = lr2.s(((Number) niVar2.v.getValue()).floatValue(), f);
                float f2 = fS2 - r54Var.j;
                try {
                    fG = pf4Var2.g(f2);
                } catch (CancellationException unused) {
                    niVar2.g();
                }
                xy1Var2.a(Float.valueOf(fG));
                if (Math.abs(f2 - fG) > 0.5f || fS2 != ((Number) niVar2.v.getValue()).floatValue()) {
                    niVar2.g();
                }
                r54Var.j += fG;
                break;
            default:
                m8 m8Var = (m8) obj3;
                r54 r54Var2 = (r54) obj2;
                ni niVar3 = (ni) obj;
                tp3 tp3Var2 = niVar3.v;
                if ((((Number) tp3Var2.getValue()).floatValue() < f && r54Var.j > f) || (((Number) tp3Var2.getValue()).floatValue() > f && r54Var.j < f)) {
                    float fFloatValue = ((Number) tp3Var2.getValue()).floatValue();
                    if (f == 0.0f) {
                        f = 0.0f;
                    } else if (f <= 0.0f ? fFloatValue >= f : fFloatValue <= f) {
                        f = fFloatValue;
                    }
                    m8Var.g(f, ((Number) niVar3.y()).floatValue());
                    r54Var2.j = Float.isNaN(((Number) niVar3.y()).floatValue()) ? 0.0f : ((Number) niVar3.y()).floatValue();
                    r54Var.j = f;
                    niVar3.g();
                } else {
                    m8Var.g(((Number) tp3Var2.getValue()).floatValue(), ((Number) niVar3.y()).floatValue());
                    r54Var2.j = ((Number) niVar3.y()).floatValue();
                    r54Var.j = ((Number) tp3Var2.getValue()).floatValue();
                }
                break;
        }
        return og5Var;
    }
}
