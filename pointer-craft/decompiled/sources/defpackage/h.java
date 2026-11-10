package defpackage;

import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.CancellationSignal;
import androidx.fragment.app.FragmentContainerView;
import io.appground.blehid.ClassicHidService;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ h(ug1 ug1Var, rk4 rk4Var) {
        this.j = (byte) 20;
        this.t = ug1Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        ad3 ad3Var;
        String strConcat;
        int length;
        int i;
        String str;
        byte b = this.j;
        byte b2 = 3;
        boolean z = false;
        int i2 = 0;
        mu0 mu0Var = null;
        og5 og5Var = og5.g;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                return obj == ((o) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ur3 ur3Var = (ur3) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == ur3Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != ur3Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                s5 s5Var = (s5) obj2;
                s5Var.k.l((t35) obj, v70.b(s5Var, sa.y));
                return og5Var;
            case 3:
                ba baVar = (ba) obj2;
                return new td(baVar, baVar.getTextInputService(), (ox0) obj);
            case 4:
                return Boolean.valueOf(((cu1) obj).Y0(((bt1) obj2).g));
            case 5:
                return Boolean.valueOf(((he2) obj2).g(((gj4) obj).x));
            case 6:
                return Boolean.valueOf(sg6.s((gj4) obj, (Resources) obj2));
            case 7:
                ((nj4) obj).g(si4.g, new ri4(p42.j, ((cj3) obj2).g(), qi4.t, true));
                return og5Var;
            case 8:
                kx1 kx1Var = (kx1) obj2;
                pw1 pw1VarD = kx1Var != null ? kx1Var.D(((FragmentContainerView) obj).getId()) : null;
                if (pw1VarD != null && !kx1Var.S()) {
                    fw fwVar = new fw(kx1Var);
                    fwVar.j(pw1VarD);
                    if (fwVar.l) {
                        l0.z("This transaction is already being added to the back stack");
                        return null;
                    }
                    fwVar.s.B(fwVar, false);
                }
                return og5Var;
            case 9:
                return new kb((yy) obj2, b2);
            case 10:
                return new kb((ya5) obj2, (byte) 4);
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return g61.t((g61) obj, 0, ((s54) obj2).j, 1);
            case 12:
                wm2 wm2Var = (wm2) obj;
                ((kn2) obj2).a(wm2Var);
                wm2Var.g();
                return og5Var;
            case 13:
                ((ClassicHidService) obj2).z.y((String) obj, "reconnect");
                return og5Var;
            case 14:
                CancellationSignal cancellationSignal = (CancellationSignal) obj2;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return og5Var;
            case kq2.x /* 15 */:
                ((wm4) obj2).m(((Boolean) obj).booleanValue());
                return og5Var;
            case 16:
                v92 v92Var = (v92) obj2;
                ec1 ec1Var = (ec1) obj;
                if (!ec1Var.j.h) {
                    return gd5.t;
                }
                ec1 ec1Var2 = ec1Var.f;
                if (ec1Var2 != null) {
                    re6.r(ec1Var2, new h((Object) v92Var, (byte) 16));
                }
                ec1Var.f = null;
                ec1Var.o = null;
                return gd5.j;
            case 17:
                ((sy2) obj2).g();
                return og5Var;
            case 18:
                h12 h12Var = (h12) obj;
                return Boolean.valueOf(h12Var instanceof kd1 ? ((Boolean) ((xc1) obj2).a(h12Var)).booleanValue() : true);
            case 19:
                mc3 mc3Var = (mc3) obj2;
                xd3 xd3Var = (xd3) obj;
                xd3Var.getClass();
                if (mc3Var != null && (ad3Var = mc3Var.t) != null) {
                    int i3 = ad3.q;
                    ad3 ad3Var2 = (ad3) dk4.N(mq2.l(ad3Var));
                    if (ad3Var2 != null) {
                        xd3Var.g(ad3Var2.t.g);
                        xd3Var.x = true;
                        xd3Var.l = false;
                    }
                }
                xd3Var.y = true;
                return og5Var;
            case 20:
                ug1 ug1Var = (ug1) obj;
                String str2 = ((ug1) obj2) == ug1Var ? " > " : "   ";
                if (!(ug1Var instanceof rk0)) {
                    if (ug1Var instanceof ll4) {
                        ll4 ll4Var = (ll4) ug1Var;
                        length = ll4Var.g.t.length();
                        i = ll4Var.y;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (ug1Var instanceof kl4) {
                        strConcat = ((kl4) ug1Var).toString();
                    } else if (ug1Var instanceof e51) {
                        strConcat = ((e51) ug1Var).toString();
                    } else if (ug1Var instanceof f51) {
                        strConcat = ((f51) ug1Var).toString();
                    } else if (ug1Var instanceof ml4) {
                        strConcat = ((ml4) ug1Var).toString();
                    } else if (ug1Var instanceof mo1) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (ug1Var instanceof d51) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strR = v54.g(ug1Var.getClass()).r();
                        if (strR == null) {
                            strR = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strR);
                    }
                    return str2.concat(strConcat);
                }
                rk0 rk0Var = (rk0) ug1Var;
                length = rk0Var.g.t.length();
                i = rk0Var.y;
                str = "CommitTextCommand(text.length=";
                strConcat = du4.q(length, i, str, ", newCursorPosition=", ")");
                return str2.concat(strConcat);
            case 21:
                ol1 ol1Var = (ol1) obj2;
                ol1Var.x.setValue(null);
                ol1Var.a.setValue(f44.t);
                ol1Var.l.e(0.0f);
                return og5Var;
            case 22:
                ce4 ce4Var = (ce4) obj2;
                o84 o84Var = (o84) obj;
                o84Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (o84Var.d & 4294967295L));
                float fD = (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) ? 1.0f : 1.0f - (ce4Var.g.d() / fIntBitsToFloat);
                o84Var.j(fD);
                o84Var.t(fD);
                o84Var.c(xs2.r(0.5f, 1.0f));
                return og5Var;
            case 23:
                rb3 rb3Var = (rb3) obj2;
                Object[] objArr = rb3Var.j;
                int i4 = rb3Var.a;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((u33) objArr[i5]).n();
                }
                return og5Var;
            case 24:
                List list = (List) obj2;
                es2 es2Var = (es2) obj;
                es2Var.getClass();
                es2Var.H(list.size(), null, new wk0(list, (byte) 2), new nm0(802480018, true, new uu1(list)));
                return og5Var;
            case 25:
                kb2 kb2Var = (kb2) obj2;
                ja0 ja0Var = (ja0) obj;
                float fY = ja0Var.y() * ((vb1) kb2Var.H.n()).j;
                ld ldVarG = nd.g();
                cn4 cn4VarG = kb2Var.G;
                if (cn4VarG == null) {
                    cn4VarG = vn4.g((un4) v70.b(kb2Var, vn4.g), ib6.n);
                }
                br2 br2VarG = cn4VarG.g(ja0Var.j.n(), ja0Var.j.getLayoutDirection(), ja0Var);
                if (br2VarG instanceof ym3) {
                    ld.y(ldVarG, ((ym3) br2VarG).n);
                } else if (br2VarG instanceof zm3) {
                    ld.r(ldVarG, ((zm3) br2VarG).n);
                } else {
                    if (!(br2VarG instanceof xm3)) {
                        up.y();
                        return null;
                    }
                    ld.g(ldVarG, ((xm3) br2VarG).n);
                }
                ld ldVarG2 = nd.g();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ja0Var.j.n() & 4294967295L)) - fY;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (ja0Var.j.n() >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & ja0Var.j.n()));
                if (Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat3) || Float.isNaN(fIntBitsToFloat4)) {
                    nd.y("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = ldVarG2.y;
                if (rectF == null) {
                    rectF = new RectF();
                    ldVarG2.y = rectF;
                }
                rectF.set(0.0f, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
                Path path = ldVarG2.g;
                RectF rectF2 = ldVarG2.y;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                ld ldVarG3 = nd.g();
                ldVarG3.x(ldVarG2, ldVarG, 1);
                return ja0Var.g(new m(ldVarG3, kb2Var, (byte) 25));
            case 26:
                dd2 dd2Var = (dd2) obj2;
                ci3 ci3Var = (ci3) obj;
                h44 h44Var = ci3Var.y;
                if (h44Var != null) {
                    h44Var.closeConnection();
                    ci3Var.y = null;
                }
                rb3 rb3Var2 = dd2Var.n;
                Object[] objArr2 = rb3Var2.j;
                int i6 = rb3Var2.a;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!yf2.p((dn5) objArr2[i2], ci3Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    rb3Var2.w(i2);
                }
                if (rb3Var2.a == 0) {
                    dd2Var.y.g();
                }
                return og5Var;
            case 27:
                rz2 rz2Var = (rz2) obj;
                rz2Var.getClass();
                qr0 qr0VarT = ((vi2) obj2).T();
                qr0VarT.getClass();
                m50.T(v70.d(qr0VarT), null, new b8(rz2Var, qr0VarT, mu0Var, (byte) 5), 3);
                return og5Var;
            case 28:
                j63 j63Var = (j63) obj;
                j63Var.getClass();
                return Boolean.valueOf(j63Var.y == ((zf5) obj2).l);
            default:
                st4 st4Var = (st4) obj2;
                j63 j63Var2 = (j63) obj;
                j63Var2.getClass();
                if (j63Var2.r) {
                    st4Var.add(j63Var2);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ h(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }
}
