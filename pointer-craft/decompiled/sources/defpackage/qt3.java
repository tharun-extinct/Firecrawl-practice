package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: loaded from: classes2.dex */
public final class qt3 extends zz4 implements bz1 {
    public /* synthetic */ Object b;
    public long c;
    public byte i;
    public final /* synthetic */ long p;
    public ec3 q;
    public final /* synthetic */ CharSequence s;
    public final /* synthetic */ rt3 u;
    public rt3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt3(long j, mu0 mu0Var, rt3 rt3Var, CharSequence charSequence) {
        super(2, mu0Var);
        this.s = charSequence;
        this.p = j;
        this.u = rt3Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        qt3 qt3Var = new qt3(this.p, mu0Var, this.u, this.s);
        qt3Var.b = obj;
        return qt3Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((qt3) b((mu0) obj2, al0.v(obj))).u(og5.g);
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        long j;
        ec3 ec3Var;
        rt3 rt3Var;
        s35 s35Var;
        byte b = this.i;
        if (b == 0) {
            js2.o(obj);
            TextClassifier textClassifier = (TextClassifier) this.b;
            long j2 = this.p;
            int iX = u75.x(j2);
            int iV = u75.v(j2);
            CharSequence charSequence = this.s;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iX, iV);
            rt3 rt3Var2 = this.u;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(rt3Var2.r());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jY = sp2.y(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            px0 px0Var = px0.j;
            if (i < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.c = jY;
                this.i = (byte) 2;
                if (this.u.g(this.s, jY, textClassifier, this) != px0Var) {
                    j = jY;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                s35 s35VarY = rt3Var2.y(charSequence, jY, textClassification);
                ec3Var = rt3Var2.v;
                this.b = s35VarY;
                this.q = ec3Var;
                this.w = rt3Var2;
                this.c = jY;
                this.i = (byte) 1;
                if (ec3Var.y(this) != px0Var) {
                    rt3Var = rt3Var2;
                    s35Var = s35VarY;
                    j = jY;
                    rt3Var.l.setValue(s35Var);
                }
            }
            return px0Var;
        }
        if (b == 1) {
            j = this.c;
            rt3Var = this.w;
            ec3Var = this.q;
            s35Var = (s35) this.b;
            js2.o(obj);
            try {
                rt3Var.l.setValue(s35Var);
            } finally {
                ec3Var.x(null);
            }
        } else {
            if (b != 2) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.c;
            js2.o(obj);
        }
        return new u75(j);
    }
}
