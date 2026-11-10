package defpackage;

import android.content.Context;
import android.content.IntentSender;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hs0 implements mq {
    public int a;
    public final /* synthetic */ byte j;
    public final Object m;
    public int t;

    public hs0(Context context, XmlResourceParser xmlResourceParser) {
        this.j = (byte) 0;
        this.m = new ArrayList();
        this.a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j24.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.t = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                this.a = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new rs0().y((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.mq
    public void a(int i, int i2) {
        ((mq) this.m).a(i + (this.a == 0 ? this.t : 0), i2);
    }

    public void c(int i, int i2, int i3, boolean z) {
        d31 d31Var = (d31) ((v92) this.m).t;
        fa4 fa4Var = d31Var.r;
        if (i3 == 0) {
            xs2.l(i2 >= i);
            while (i <= i2) {
                Long lD = fa4Var.D(i);
                if (lD != null) {
                    if (z) {
                        d31Var.m(lD);
                    } else {
                        d31Var.n(lD);
                    }
                }
                i++;
            }
            return;
        }
        if (i3 != 1) {
            l0.u(xi3.j("Invalid range type: ", i3));
            return;
        }
        hi4 hi4Var = d31Var.g;
        xs2.l(i2 >= i);
        while (i <= i2) {
            Long lD2 = fa4Var.D(i);
            if (lD2 != null) {
                if (z) {
                    d31Var.n.getClass();
                    if (!hi4Var.j.contains(lD2)) {
                        hi4Var.t.add(lD2);
                    }
                } else {
                    hi4Var.t.remove(lD2);
                }
                d31Var.l(lD2, z);
            }
            i++;
        }
        d31Var.j();
    }

    public te2 g() {
        return new te2((IntentSender) this.m, null, this.t, this.a);
    }

    @Override // defpackage.mq
    public void i(bz1 bz1Var, Object obj) {
        ((mq) this.m).i(bz1Var, obj);
    }

    @Override // defpackage.mq
    public void j(int i, int i2, int i3) {
        int i4 = this.a == 0 ? this.t : 0;
        ((mq) this.m).j(i + i4, i2 + i4, i3);
    }

    public my1 m() {
        return (my1) this.m;
    }

    @Override // defpackage.mq
    public void n() {
        ((mq) this.m).n();
    }

    @Override // defpackage.mq
    public void p() {
        if (this.a <= 0) {
            qo0.g("OffsetApplier up called with no corresponding down");
        }
        this.a--;
        ((mq) this.m).p();
    }

    public int q() {
        return this.t;
    }

    @Override // defpackage.mq
    public void r(Object obj) {
        this.a++;
        ((mq) this.m).r(obj);
    }

    @Override // defpackage.mq
    public Object t() {
        return ((mq) this.m).t();
    }

    public String toString() {
        switch (this.j) {
            case 4:
                StringBuilder sb = new StringBuilder("Range{begin=");
                sb.append(this.t);
                sb.append(", end=");
                return xi3.m(sb, this.a, "}");
            default:
                return super.toString();
        }
    }

    public int v() {
        return this.a;
    }

    public void w(int i, int i2) {
        this.a = i;
        this.t = i2;
    }

    @Override // defpackage.mq
    public void x(int i, Object obj) {
        ((mq) this.m).x(i + (this.a == 0 ? this.t : 0), obj);
    }

    @Override // defpackage.mq
    public void y(int i, Object obj) {
        ((mq) this.m).y(i + (this.a == 0 ? this.t : 0), obj);
    }

    public hs0(IntentSender intentSender) {
        this.j = (byte) 2;
        intentSender.getClass();
        this.m = intentSender;
    }

    public hs0(int i, v92 v92Var) {
        this.j = (byte) 4;
        this.a = -1;
        this.t = i;
        this.m = v92Var;
    }

    public hs0(View view) {
        this.j = (byte) 6;
        this.m = view;
    }

    public hs0(mq mqVar, int i) {
        this.j = (byte) 3;
        this.m = mqVar;
        this.t = i;
    }

    public hs0(int i, int i2, my1 my1Var) {
        this.j = (byte) 5;
        this.t = i;
        this.a = i2;
        this.m = my1Var;
    }

    public hs0() {
        this.j = (byte) 1;
        this.m = new hs0[256];
        this.t = 0;
        this.a = 0;
    }

    public hs0(int i, int i2) {
        this.j = (byte) 1;
        this.m = null;
        this.t = i;
        int i3 = i2 & 7;
        this.a = i3 == 0 ? 8 : i3;
    }
}
