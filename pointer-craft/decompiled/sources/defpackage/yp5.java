package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import io.appground.blek.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yp5 {
    public static final WeakHashMap k = new WeakHashMap();
    public final pi5 a;
    public final pi5 b;
    public final pi5 c;
    public final sd2 f;
    public final lg g;
    public final boolean h;
    public final pi5 i;
    public final lg j;
    public final lg l;
    public final tp3 m;
    public final lg n;
    public int o;
    public final pi5 p;
    public final lg5 q;
    public final lg r;
    public final pi5 s;
    public final lg t;
    public final pi5 u;
    public final lg v;
    public final lg5 w;
    public final lg x;
    public final lg y;
    public final pi5 z;

    public yp5(View view) {
        lg lgVar = new lg("captionBar", 4);
        this.g = lgVar;
        lg lgVar2 = new lg("displayCutout", 128);
        this.y = lgVar2;
        lg lgVar3 = new lg("ime", 8);
        this.r = lgVar3;
        lg lgVar4 = new lg("mandatorySystemGestures", 32);
        this.n = lgVar4;
        lg lgVar5 = new lg("navigationBars", 2);
        this.v = lgVar5;
        lg lgVar6 = new lg("statusBars", 1);
        this.x = lgVar6;
        lg lgVar7 = new lg("systemBars", 519);
        this.l = lgVar7;
        lg lgVar8 = new lg("systemGestures", 16);
        this.j = lgVar8;
        lg lgVar9 = new lg("tappableElement", 64);
        this.t = lgVar9;
        pi5 pi5Var = new pi5(new xd2(0, 0, 0, 0), "waterfall");
        this.a = pi5Var;
        this.m = kq2.M(null);
        lg5 lg5Var = new lg5(new lg5(lgVar7, lgVar3), lgVar2);
        this.q = lg5Var;
        this.w = new lg5(lg5Var, new lg5(new lg5(new lg5(lgVar9, lgVar4), lgVar8), pi5Var));
        this.c = v13.M("captionBarIgnoringVisibility", 4);
        this.i = v13.M("navigationBarsIgnoringVisibility", 2);
        this.b = v13.M("statusBarsIgnoringVisibility", 1);
        this.s = v13.M("systemBarsIgnoringVisibility", 519);
        this.p = v13.M("tappableElementIgnoringVisibility", 64);
        this.u = new pi5(new xd2(0, 0, 0, 0), "imeAnimationTarget");
        this.z = new pi5(new xd2(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.h = bool != null ? bool.booleanValue() : false;
        this.f = new sd2(this);
        WeakHashMap weakHashMap = xk5.g;
        tp5 tp5VarG = qk5.g(view);
        if (tp5VarG != null) {
            pp5 pp5Var = tp5VarG.g;
            lgVar.x(pp5Var.h(4));
            lgVar2.x(pp5Var.h(128));
            lgVar3.x(pp5Var.h(8));
            lgVar4.x(pp5Var.h(32));
            lgVar5.x(pp5Var.h(2));
            lgVar6.x(pp5Var.h(1));
            lgVar7.x(pp5Var.h(519));
            lgVar8.x(pp5Var.h(16));
            lgVar9.x(pp5Var.h(64));
        }
    }

    public static void y(yp5 yp5Var, tp5 tp5Var) {
        boolean z = false;
        yp5Var.g.l(tp5Var, 0);
        yp5Var.r.l(tp5Var, 0);
        yp5Var.y.l(tp5Var, 0);
        yp5Var.v.l(tp5Var, 0);
        yp5Var.x.l(tp5Var, 0);
        yp5Var.l.l(tp5Var, 0);
        yp5Var.j.l(tp5Var, 0);
        yp5Var.t.l(tp5Var, 0);
        yp5Var.n.l(tp5Var, 0);
        yp5Var.c.x(mq2.C(tp5Var.g.a(4)));
        yp5Var.i.x(mq2.C(tp5Var.g.a(2)));
        yp5Var.b.x(mq2.C(tp5Var.g.a(1)));
        yp5Var.s.x(mq2.C(tp5Var.g.a(519)));
        yp5Var.p.x(mq2.C(tp5Var.g.a(64)));
        pa1 pa1VarJ = tp5Var.g.j();
        yp5Var.a.x(mq2.C(pa1VarJ != null ? pa1VarJ.g() : nd2.v));
        ld ldVar = null;
        if (pa1VarJ != null) {
            Path pathR = Build.VERSION.SDK_INT >= 31 ? nq.r(pa1VarJ.g) : null;
            if (pathR != null) {
                ldVar = new ld(pathR);
            }
        }
        yp5Var.m.setValue(ldVar);
        synchronized (it4.r) {
            ib3 ib3Var = it4.a.j;
            if (ib3Var != null && ib3Var.j()) {
                z = true;
            }
        }
        if (z) {
            it4.r();
        }
    }

    public final void g(View view) {
        if (this.o == 0) {
            sd2 sd2Var = this.f;
            sd2Var.m = false;
            sd2Var.q = false;
            sd2Var.w = null;
            WeakHashMap weakHashMap = xk5.g;
            pk5.r(view, sd2Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(sd2Var);
            yo5.g(view, sd2Var);
        }
        this.o++;
    }
}
