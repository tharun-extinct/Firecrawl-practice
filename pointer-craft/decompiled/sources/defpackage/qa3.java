package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qa3 implements aa3 {
    public final z51 a;
    public final List j;
    public final z51 m;
    public final z51 q;
    public final List t;
    public x03 w;

    public qa3(List list) {
        this.j = list;
        this.t = list;
        final byte b = 0;
        this.a = pt4.y(new my1(this) { // from class: pa3
            public final /* synthetic */ qa3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                boolean z;
                boolean z2;
                byte b2 = b;
                boolean z3 = true;
                qa3 qa3Var = this.t;
                qr3 qr3Var = qr3.g;
                switch (b2) {
                    case 0:
                        List list2 = qa3Var.t;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!yf2.p(((or3) obj).g(), qr3Var)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = qa3Var.t;
                        if (!list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                rr3 rr3VarG = ((or3) it.next()).g();
                                rr3VarG.getClass();
                                if (!rr3VarG.equals(qr3Var)) {
                                    if (!((List) qa3Var.a.getValue()).isEmpty()) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                    default:
                        List<or3> list4 = qa3Var.t;
                        if (list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                rr3 rr3VarG2 = ((or3) it2.next()).g();
                                rr3VarG2.getClass();
                                if (rr3VarG2.equals(qr3Var)) {
                                    z = false;
                                } else {
                                    if (!(rr3VarG2 instanceof pr3)) {
                                        uo1.g();
                                        return null;
                                    }
                                    z = ((pr3) rr3VarG2).g;
                                }
                                if (z) {
                                    if (!list4.isEmpty()) {
                                        for (or3 or3Var : list4) {
                                            rr3 rr3VarG3 = or3Var.g();
                                            rr3VarG3.getClass();
                                            if (!rr3VarG3.equals(qr3Var)) {
                                                rr3 rr3VarG4 = or3Var.g();
                                                rr3VarG4.getClass();
                                                if (rr3VarG4.equals(qr3Var)) {
                                                    z2 = false;
                                                } else {
                                                    if (!(rr3VarG4 instanceof pr3)) {
                                                        uo1.g();
                                                        return null;
                                                    }
                                                    z2 = ((pr3) rr3VarG4).g;
                                                }
                                                if (!z2) {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final byte b2 = 1;
        this.m = pt4.y(new my1(this) { // from class: pa3
            public final /* synthetic */ qa3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                boolean z;
                boolean z2;
                byte b3 = b2;
                boolean z3 = true;
                qa3 qa3Var = this.t;
                qr3 qr3Var = qr3.g;
                switch (b3) {
                    case 0:
                        List list2 = qa3Var.t;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!yf2.p(((or3) obj).g(), qr3Var)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = qa3Var.t;
                        if (!list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                rr3 rr3VarG = ((or3) it.next()).g();
                                rr3VarG.getClass();
                                if (!rr3VarG.equals(qr3Var)) {
                                    if (!((List) qa3Var.a.getValue()).isEmpty()) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                    default:
                        List<or3> list4 = qa3Var.t;
                        if (list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                rr3 rr3VarG2 = ((or3) it2.next()).g();
                                rr3VarG2.getClass();
                                if (rr3VarG2.equals(qr3Var)) {
                                    z = false;
                                } else {
                                    if (!(rr3VarG2 instanceof pr3)) {
                                        uo1.g();
                                        return null;
                                    }
                                    z = ((pr3) rr3VarG2).g;
                                }
                                if (z) {
                                    if (!list4.isEmpty()) {
                                        for (or3 or3Var : list4) {
                                            rr3 rr3VarG3 = or3Var.g();
                                            rr3VarG3.getClass();
                                            if (!rr3VarG3.equals(qr3Var)) {
                                                rr3 rr3VarG4 = or3Var.g();
                                                rr3VarG4.getClass();
                                                if (rr3VarG4.equals(qr3Var)) {
                                                    z2 = false;
                                                } else {
                                                    if (!(rr3VarG4 instanceof pr3)) {
                                                        uo1.g();
                                                        return null;
                                                    }
                                                    z2 = ((pr3) rr3VarG4).g;
                                                }
                                                if (!z2) {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final byte b3 = 2;
        this.q = pt4.y(new my1(this) { // from class: pa3
            public final /* synthetic */ qa3 t;

            {
                this.t = this;
            }

            @Override // defpackage.my1
            public final Object g() {
                boolean z;
                boolean z2;
                byte b4 = b3;
                boolean z3 = true;
                qa3 qa3Var = this.t;
                qr3 qr3Var = qr3.g;
                switch (b4) {
                    case 0:
                        List list2 = qa3Var.t;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!yf2.p(((or3) obj).g(), qr3Var)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = qa3Var.t;
                        if (!list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                rr3 rr3VarG = ((or3) it.next()).g();
                                rr3VarG.getClass();
                                if (!rr3VarG.equals(qr3Var)) {
                                    if (!((List) qa3Var.a.getValue()).isEmpty()) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                    default:
                        List<or3> list4 = qa3Var.t;
                        if (list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                rr3 rr3VarG2 = ((or3) it2.next()).g();
                                rr3VarG2.getClass();
                                if (rr3VarG2.equals(qr3Var)) {
                                    z = false;
                                } else {
                                    if (!(rr3VarG2 instanceof pr3)) {
                                        uo1.g();
                                        return null;
                                    }
                                    z = ((pr3) rr3VarG2).g;
                                }
                                if (z) {
                                    if (!list4.isEmpty()) {
                                        for (or3 or3Var : list4) {
                                            rr3 rr3VarG3 = or3Var.g();
                                            rr3VarG3.getClass();
                                            if (!rr3VarG3.equals(qr3Var)) {
                                                rr3 rr3VarG4 = or3Var.g();
                                                rr3VarG4.getClass();
                                                if (rr3VarG4.equals(qr3Var)) {
                                                    z2 = false;
                                                } else {
                                                    if (!(rr3VarG4 instanceof pr3)) {
                                                        uo1.g();
                                                        return null;
                                                    }
                                                    z2 = ((pr3) rr3VarG4).g;
                                                }
                                                if (!z2) {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
    }

    @Override // defpackage.aa3
    public final boolean l() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    @Override // defpackage.aa3
    public final void t() throws Exception {
        x03 x03Var = this.w;
        if (x03Var == null) {
            l0.z("ActivityResultLauncher cannot be null");
            return;
        }
        List list = this.t;
        ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((or3) it.next()).y());
        }
        x03Var.g(arrayList.toArray(new String[0]));
    }

    @Override // defpackage.aa3
    public final boolean v() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }
}
