package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a44 extends to0 {
    public static final ew4 B = y94.w(fs3.m);
    public static final AtomicReference C = new AtomicReference(Boolean.FALSE);
    public final hi0 A;
    public final rb3 a;
    public final hb3 b;
    public final ji c;
    public final fh2 d;
    public final fx0 e;
    public final ew4 f;
    public long g;
    public final ew4 h;
    public final hb3 i;
    public List j;
    public final ro k;
    public final ArrayList l;
    public final ArrayList m;
    public final Object n;
    public boolean o;
    public ib3 p;
    public final ArrayList q;
    public final ro r;
    public ArrayList s;
    public ib3 t;
    public ib0 u;
    public dh2 v;
    public final hb3 w;
    public Throwable x;
    public final qf y;
    public boolean z;

    public a44(fx0 fx0Var) {
        qf qfVar = new qf(new v34(this, (byte) 0));
        this.y = qfVar;
        this.r = new ro(new v34(this, (byte) 1));
        this.n = new Object();
        this.l = new ArrayList();
        this.t = new ib3();
        this.a = new rb3(new yo0[16]);
        this.m = new ArrayList();
        this.q = new ArrayList();
        this.w = new hb3();
        this.c = new ji((byte) 17);
        this.i = new hb3();
        this.b = new hb3();
        this.h = y94.w(null);
        this.f = y94.w(x34.a);
        this.k = new ro((byte) 25);
        fh2 fh2Var = new fh2((dh2) fx0Var.h(d52.m));
        fh2Var.A(new z6(this, (byte) 28));
        this.d = fh2Var;
        this.e = fx0Var.b(qfVar).b(fh2Var);
        this.A = new hi0((byte) 15);
    }

    public static final void G(ArrayList arrayList, a44 a44Var, yo0 yo0Var) {
        arrayList.clear();
        synchronized (a44Var.n) {
            Iterator it = a44Var.q.iterator();
            while (it.hasNext()) {
                w83 w83Var = (w83) it.next();
                if (w83Var.y().equals(yo0Var)) {
                    arrayList.add(w83Var);
                    it.remove();
                }
            }
        }
    }

    public static void f(nb3 nb3Var) {
        try {
            if (nb3Var.f() instanceof ct4) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            nb3Var.r();
        } catch (Throwable th) {
            nb3Var.r();
            throw th;
        }
    }

    public final boolean A() {
        return this.a.a != 0 || e() || B() || this.w.a();
    }

    public final boolean B() {
        return !this.o && (((bs) ((rv) this.r.a).a).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z;
        synchronized (this.n) {
            z = this.t.j() || this.a.a != 0 || e() || B();
        }
        return z;
    }

    public final List D() {
        List list = this.j;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.l;
        List arrayList2 = arrayList.isEmpty() ? pi1.j : new ArrayList(arrayList);
        this.j = arrayList2;
        return arrayList2;
    }

    public final void E() {
        hb0 hb0VarD;
        synchronized (this.n) {
            hb0VarD = d();
            if (((x34) this.f.getValue()).compareTo(x34.t) <= 0) {
                throw k33.v("Recomposer shutdown; frame clock awaiter will never resume", this.x);
            }
        }
        if (hb0VarD != null) {
            ((ib0) hb0VarD).j(og5.g);
        }
    }

    public final void F(yo0 yo0Var) {
        synchronized (this.n) {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((w83) arrayList.get(i)).y().equals(yo0Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    G(arrayList2, this, yo0Var);
                    while (!arrayList2.isEmpty()) {
                        H(arrayList2, null);
                        G(arrayList2, this, yo0Var);
                    }
                    return;
                }
            }
        }
    }

    public final List H(List list, ib3 ib3Var) {
        nb3 nb3VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            yo0 yo0VarY = ((w83) obj).y();
            Object arrayList2 = map.get(yo0VarY);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(yo0VarY, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            yo0 yo0Var = (yo0) entry.getKey();
            List list2 = (List) entry.getValue();
            if (yo0Var.C.F) {
                qo0.g("Check failed");
            }
            z6 z6Var = new z6(yo0Var, (byte) 27);
            xf xfVar = new xf(yo0Var, ib3Var, (byte) 23);
            at4 at4VarJ = it4.j();
            nb3 nb3Var = at4VarJ instanceof nb3 ? (nb3) at4VarJ : null;
            if (nb3Var == null || (nb3VarC = nb3Var.C(z6Var, xfVar)) == null) {
                l0.z("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                at4 at4VarA = nb3VarC.a();
                try {
                    synchronized (this.n) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                w83 w83Var = (w83) list2.get(i2);
                                hb3 hb3Var = this.w;
                                w83Var.getClass();
                                Object objG = o93.g(hb3Var);
                                arrayList.add(new fp3(w83Var, objG));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                fp3 fp3Var = (fp3) arrayList.get(i3);
                                if (fp3Var.t == null) {
                                    ji jiVar = this.c;
                                    ((w83) fp3Var.j).getClass();
                                    if (((hb3) jiVar.t).y(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            fp3 fp3Var2 = (fp3) arrayList.get(i4);
                                            if (fp3Var2.t == null) {
                                                ji jiVar2 = this.c;
                                                ((w83) fp3Var2.j).getClass();
                                                hb3 hb3Var2 = (hb3) jiVar2.t;
                                                if (hb3Var2.t()) {
                                                    ((hb3) jiVar2.a).g();
                                                }
                                            }
                                            arrayList3.add(fp3Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((fp3) arrayList.get(i5)).t != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((fp3) arrayList.get(i6)).t == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        fp3 fp3Var3 = (fp3) arrayList.get(i7);
                                        if (fp3Var3.t == null) {
                                        }
                                    }
                                    synchronized (this.n) {
                                        hj0.a0(this.q, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((fp3) obj2).t != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    yo0Var.p(arrayList);
                    at4.s(at4VarA);
                    f(nb3VarC);
                } catch (Throwable th2) {
                    at4.s(at4VarA);
                    throw th2;
                }
            } catch (Throwable th3) {
                f(nb3VarC);
                throw th3;
            }
        }
        return cj0.F0(map.keySet());
    }

    public final yo0 I(yo0 yo0Var, ib3 ib3Var) {
        nb3 nb3VarC;
        if (yo0Var.C.F || yo0Var.D == 3) {
            return null;
        }
        ib3 ib3Var2 = this.p;
        if (ib3Var2 == null || !ib3Var2.r(yo0Var)) {
            z6 z6Var = new z6(yo0Var, (byte) 27);
            byte b = 23;
            xf xfVar = new xf(yo0Var, ib3Var, b);
            at4 at4VarJ = it4.j();
            nb3 nb3Var = at4VarJ instanceof nb3 ? (nb3) at4VarJ : null;
            if (nb3Var == null || (nb3VarC = nb3Var.C(z6Var, xfVar)) == null) {
                l0.z("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    at4 at4VarA = nb3VarC.a();
                    if (ib3Var != null) {
                        try {
                            if (ib3Var.j()) {
                                rg rgVar = new rg(ib3Var, yo0Var, b);
                                h02 h02Var = yo0Var.C;
                                if (h02Var.F) {
                                    qo0.g("Preparing a composition while composing is not supported");
                                }
                                h02Var.F = true;
                                try {
                                    rgVar.g();
                                    h02Var.F = false;
                                } catch (Throwable th) {
                                    h02Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            at4.s(at4VarA);
                            throw th2;
                        }
                    }
                    boolean zF = yo0Var.f();
                    at4.s(at4VarA);
                    f(nb3VarC);
                    if (zF) {
                        return yo0Var;
                    }
                } catch (Throwable th3) {
                    f(nb3VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, yo0 yo0Var) throws Throwable {
        if (!((Boolean) C.get()).booleanValue() || (th instanceof bo0)) {
            synchronized (this.n) {
                zz5.r("Error was captured in composition.", th);
                w34 w34Var = (w34) this.h.getValue();
                if (w34Var != null) {
                    throw w34Var.g();
                }
                ew4 ew4Var = this.h;
                w34 w34Var2 = new w34(th);
                ew4Var.getClass();
                ew4Var.m(null, w34Var2);
            }
            throw th;
        }
        synchronized (this.n) {
            try {
                zz5.r("Error was captured in composition while live edit was enabled.", th);
                this.m.clear();
                this.a.j();
                this.t = new ib3();
                this.q.clear();
                this.w.g();
                this.i.g();
                ew4 ew4Var2 = this.h;
                w34 w34Var3 = new w34(th);
                ew4Var2.getClass();
                ew4Var2.m(null, w34Var3);
                if (yo0Var != null) {
                    L(yo0Var);
                }
                if (d() != null) {
                    qo0.g("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.n) {
            if (this.t.l()) {
                return A();
            }
            List listD = D();
            ge4 ge4Var = new ge4(this.t);
            this.t = new ib3();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((yo0) listD.get(i)).k(ge4Var);
                    if (((x34) this.f.getValue()).compareTo(x34.t) <= 0) {
                        break;
                    }
                }
                synchronized (this.n) {
                    if (d() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.n) {
                    ib3 ib3Var = this.t;
                    int i2 = ib3Var.n;
                    Iterator<E> it = ge4Var.iterator();
                    while (it.hasNext()) {
                        ib3Var.m(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(yo0 yo0Var) {
        ArrayList arrayList = this.s;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.s = arrayList;
        }
        if (!arrayList.contains(yo0Var)) {
            arrayList.add(yo0Var);
        }
        if (this.l.remove(yo0Var)) {
            this.j = null;
        }
    }

    public final Object M(zz4 zz4Var) {
        z34 z34Var = new z34(this, null);
        fx0 fx0Var = zz4Var.t;
        fx0Var.getClass();
        Object objF0 = m50.f0(this.y, new xu0(this, z34Var, br2.u(fx0Var), null), zz4Var);
        og5 og5Var = og5.g;
        px0 px0Var = px0.j;
        if (objF0 != px0Var) {
            objF0 = og5Var;
        }
        return objF0 == px0Var ? objF0 : og5Var;
    }

    @Override // defpackage.to0
    public final fx0 a() {
        return this.e;
    }

    @Override // defpackage.to0
    public final ib3 c(yo0 yo0Var, lp4 lp4Var, ib3 ib3Var) {
        ro roVar = this.k;
        try {
            K();
            yo0Var.k(new ge4(ib3Var));
            lp4 lp4Var2 = yo0Var.f;
            yo0Var.f = lp4Var;
            try {
                yo0 yo0VarI = I(yo0Var, null);
                if (yo0VarI != null) {
                    F(yo0Var);
                    yo0VarI.v();
                    yo0VarI.l();
                }
                ib3 ib3Var2 = (ib3) roVar.i();
                if (ib3Var2 == null) {
                    ib3Var2 = fe4.g;
                    ib3Var2.getClass();
                }
                yo0Var.f = lp4Var2;
                roVar.W(null);
                return ib3Var2;
            } catch (Throwable th) {
                yo0Var.f = lp4Var2;
                throw th;
            }
        } catch (Throwable th2) {
            roVar.W(null);
            throw th2;
        }
    }

    public final hb0 d() {
        ew4 ew4Var = this.f;
        int iCompareTo = ((x34) ew4Var.getValue()).compareTo(x34.t);
        ew4 ew4Var2 = this.h;
        ArrayList arrayList = this.q;
        ArrayList arrayList2 = this.m;
        rb3 rb3Var = this.a;
        if (iCompareTo > 0) {
            Object value = ew4Var2.getValue();
            x34 x34Var = x34.w;
            x34 x34Var2 = x34.a;
            if (value == null) {
                if (this.v == null) {
                    this.t = new ib3();
                    rb3Var.j();
                    if (e() || B()) {
                        x34Var2 = x34.m;
                    }
                } else {
                    x34Var2 = (rb3Var.a != 0 || this.t.j() || !arrayList2.isEmpty() || !arrayList.isEmpty() || e() || B() || this.w.a()) ? x34Var : x34.q;
                }
            }
            ew4Var.m(null, x34Var2);
            if (x34Var2 != x34Var) {
                return null;
            }
            ib0 ib0Var = this.u;
            this.u = null;
            return ib0Var;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.l.clear();
        this.j = pi1.j;
        this.t = new ib3();
        rb3Var.j();
        arrayList2.clear();
        arrayList.clear();
        this.s = null;
        ib0 ib0Var2 = this.u;
        if (ib0Var2 != null) {
            ib0Var2.s(null);
        }
        this.u = null;
        ew4Var2.a(null);
        return null;
    }

    public final boolean e() {
        return !this.o && (((bs) ((rv) this.y.a).a).get() & 134217727) > 0;
    }

    @Override // defpackage.to0
    public final void g(yo0 yo0Var, bz1 bz1Var) throws Throwable {
        x34 x34Var;
        boolean zContains;
        nb3 nb3VarC;
        boolean z = yo0Var.C.F;
        synchronized (this.n) {
            x34 x34Var2 = (x34) this.f.getValue();
            x34Var = x34.t;
            zContains = x34Var2.compareTo(x34Var) > 0 ? true ^ D().contains(yo0Var) : true;
        }
        try {
            z6 z6Var = new z6(yo0Var, (byte) 27);
            xf xfVar = new xf(yo0Var, null, (byte) 23);
            at4 at4VarJ = it4.j();
            nb3 nb3Var = at4VarJ instanceof nb3 ? (nb3) at4VarJ : null;
            if (nb3Var == null || (nb3VarC = nb3Var.C(z6Var, xfVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                at4 at4VarA = nb3VarC.a();
                try {
                    yo0Var.m(bz1Var);
                    at4.s(at4VarA);
                    f(nb3VarC);
                    synchronized (this.n) {
                        if (((x34) this.f.getValue()).compareTo(x34Var) > 0 && !D().contains(yo0Var)) {
                            this.l.add(yo0Var);
                            this.j = null;
                        }
                    }
                    if (!z) {
                        it4.j().w();
                    }
                    try {
                        F(yo0Var);
                        try {
                            yo0Var.v();
                            yo0Var.l();
                            if (z) {
                                return;
                            }
                            it4.j().w();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, yo0Var);
                    }
                } catch (Throwable th3) {
                    at4.s(at4VarA);
                    throw th3;
                }
            } catch (Throwable th4) {
                f(nb3VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.n) {
                }
            }
            J(th5, yo0Var);
        }
    }

    public final void k() {
        synchronized (this.n) {
            if (((x34) this.f.getValue()).compareTo(x34.q) >= 0) {
                ew4 ew4Var = this.f;
                x34 x34Var = x34.t;
                ew4Var.getClass();
                ew4Var.m(null, x34Var);
            }
        }
        this.d.x(null);
    }

    @Override // defpackage.to0
    public final void o(yo0 yo0Var) {
        synchronized (this.n) {
            if (this.l.remove(yo0Var)) {
                this.j = null;
            }
            this.a.q(yo0Var);
            this.m.remove(yo0Var);
        }
    }

    @Override // defpackage.to0
    public final void p(yo0 yo0Var) {
        synchronized (this.n) {
            try {
                ib3 ib3Var = this.p;
                if (ib3Var == null) {
                    ib3 ib3Var2 = fe4.g;
                    ib3Var = new ib3();
                    this.p = ib3Var;
                }
                ib3Var.g(yo0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.to0
    public final void q(yo0 yo0Var) {
        hb0 hb0VarD;
        synchronized (this.n) {
            if (this.a.a(yo0Var)) {
                hb0VarD = null;
            } else {
                this.a.y(yo0Var);
                hb0VarD = d();
            }
        }
        if (hb0VarD != null) {
            ((ib0) hb0VarD).j(og5.g);
        }
    }

    @Override // defpackage.to0
    public final void s(u34 u34Var) {
        ro roVar = this.k;
        ib3 ib3Var = (ib3) roVar.i();
        if (ib3Var == null) {
            ib3 ib3Var2 = fe4.g;
            ib3Var = new ib3();
            roVar.W(ib3Var);
        }
        ib3Var.g(u34Var);
    }

    @Override // defpackage.to0
    public final jb0 u(gf gfVar) {
        ro roVar = this.r;
        return ((rv) roVar.a).n(new wg3(gfVar), (rg) roVar.m);
    }

    @Override // defpackage.to0
    public final v83 w(w83 w83Var) {
        v83 v83Var;
        synchronized (this.n) {
            v83Var = (v83) this.i.q(w83Var);
        }
        return v83Var;
    }

    @Override // defpackage.to0
    public final ib3 y(yo0 yo0Var, lp4 lp4Var, bz1 bz1Var) {
        ro roVar = this.k;
        try {
            lp4 lp4Var2 = yo0Var.f;
            yo0Var.f = lp4Var;
            try {
                g(yo0Var, bz1Var);
                ib3 ib3Var = (ib3) roVar.i();
                if (ib3Var == null) {
                    ib3Var = fe4.g;
                    ib3Var.getClass();
                }
                yo0Var.f = lp4Var2;
                roVar.W(null);
                return ib3Var;
            } catch (Throwable th) {
                yo0Var.f = lp4Var2;
                throw th;
            }
        } catch (Throwable th2) {
            roVar.W(null);
            throw th2;
        }
    }
}
