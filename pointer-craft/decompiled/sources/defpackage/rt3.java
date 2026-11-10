package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class rt3 implements mt3 {
    public final fx0 g;
    public final tx2 n;
    public final fi4 r;
    public TextClassifier x;
    public final Context y;
    public final ec3 v = new ec3();
    public final tp3 l = kq2.M(null);
    public final Object j = new Object();

    public rt3(fx0 fx0Var, Context context, fi4 fi4Var, tx2 tx2Var) {
        this.g = fx0Var;
        this.y = context;
        this.r = fi4Var;
        this.n = tx2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(CharSequence charSequence, long j, TextClassifier textClassifier, ou0 ou0Var) throws Throwable {
        nt3 nt3Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        ec3 ec3Var;
        Object obj;
        Object obj2;
        s35 s35VarY;
        Object obj3;
        cc3 cc3Var;
        if (ou0Var instanceof nt3) {
            nt3Var = (nt3) ou0Var;
            int i = nt3Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                nt3Var.s = i - Integer.MIN_VALUE;
            } else {
                nt3Var = new nt3(this, ou0Var);
            }
        } else {
            nt3Var = new nt3(this, ou0Var);
        }
        Object obj4 = nt3Var.i;
        int i2 = nt3Var.s;
        tp3 tp3Var = this.l;
        og5 og5Var = og5.g;
        ec3 ec3Var2 = this.v;
        px0 px0Var = px0.j;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        j2 = nt3Var.c;
                        ec3 ec3Var3 = nt3Var.w;
                        textClassifier2 = (TextClassifier) nt3Var.q;
                        charSequence2 = (CharSequence) nt3Var.m;
                        js2.o(obj4);
                        ec3Var = ec3Var3;
                    } else {
                        if (i2 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cc3 cc3Var2 = (cc3) nt3Var.q;
                        s35VarY = (s35) nt3Var.m;
                        js2.o(obj4);
                        obj3 = null;
                        cc3Var = cc3Var2;
                    }
                    tp3Var.setValue(s35VarY);
                    return og5Var;
                }
                js2.o(obj4);
                nt3Var.m = charSequence;
                nt3Var.q = textClassifier;
                nt3Var.w = ec3Var2;
                j2 = j;
                nt3Var.c = j2;
                nt3Var.s = 1;
                if (ec3Var2.y(nt3Var) == px0Var) {
                    return px0Var;
                }
                charSequence2 = charSequence;
                textClassifier2 = textClassifier;
                ec3Var = ec3Var2;
                tp3Var.setValue(s35VarY);
                return og5Var;
            } finally {
                cc3Var.x(obj3);
            }
            s35 s35Var = (s35) tp3Var.getValue();
            if (s35Var != null) {
                try {
                    if (u75.y(j2, s35Var.y) && yf2.p(charSequence2, s35Var.g)) {
                        ec3Var.x(null);
                        return og5Var;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    ec3Var.x(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            ec3Var.x(obj2);
            s35VarY = y(charSequence2, j2, textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, u75.x(j2), u75.v(j2)).setDefaultLocales(r()).build()));
            nt3Var.m = s35VarY;
            nt3Var.q = ec3Var2;
            obj3 = null;
            nt3Var.w = null;
            nt3Var.s = 2;
            Object objY = ec3Var2.y(nt3Var);
            cc3Var = ec3Var2;
            if (objY == px0Var) {
                return px0Var;
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final LocaleList r() {
        tx2 tx2Var = this.n;
        if (tx2Var == null) {
            return new LocaleList(((sx2) bt3.g.u().j.get(0)).g);
        }
        ArrayList arrayList = new ArrayList(dj0.Y(tx2Var, 10));
        Iterator it = tx2Var.j.iterator();
        while (it.hasNext()) {
            arrayList.add(((sx2) it.next()).g);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final s35 y(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction remoteActionR = o35.r(obj);
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteActionR.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteActionR2 = o35.r(obj);
            if (remoteActionR2 != null && (icon = remoteActionR2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.y);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new s35(charSequence, j, textClassification, arrayList);
    }
}
