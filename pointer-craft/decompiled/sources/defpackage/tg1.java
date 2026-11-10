package defpackage;

import com.google.firebase.iid.Registrar;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class tg1 implements sy4, gm0, ex0, ju1, yx0, di0 {
    public final /* synthetic */ byte j;
    public static final /* synthetic */ tg1 t = new tg1(1);
    public static final y4 a = new y4(21);
    public static final on0 m = new on0(2);
    public static final on0 q = new on0(3);
    public static final on0 w = new on0(4);
    public static final on0 c = new on0(5);
    public static final l1 i = new l1(26);
    public static final tg1 b = new tg1(2);
    public static final /* synthetic */ tg1 s = new tg1(3);
    public static final tg1 p = new tg1(4);
    public static final tg1 u = new tg1(5);
    public static final tg1 z = new tg1(6);
    public static final /* synthetic */ tg1 h = new tg1(7);

    public /* synthetic */ tg1(byte b2) {
        this.j = b2;
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((i14) obj) != i14.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dj0.Y(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((i14) obj2).toString());
        }
        return arrayList2;
    }

    public static byte[] r(List list) {
        c70 c70Var = new c70();
        ArrayList arrayListG = g(list);
        int size = arrayListG.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListG.get(i2);
            i2++;
            String str = (String) obj;
            c70Var.F(str.length());
            c70Var.Q(str);
        }
        return c70Var.a();
    }

    public static q04 v(sk2 sk2Var) {
        q04 q04VarN;
        byte[] bArr = sk2Var.j;
        return (bArr == null || (q04VarN = eg6.n(bArr)) == null) ? rp2.y() : q04VarN;
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 5:
                return Registrar.lambda$getComponents$1$Registrar(vlVar);
            default:
                return new hi0((byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(File file, String str, ou0 ou0Var) {
        o12 o12Var;
        if (ou0Var instanceof o12) {
            o12Var = (o12) ou0Var;
            int i2 = o12Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o12Var.w = i2 - Integer.MIN_VALUE;
            } else {
                o12Var = new o12(this, ou0Var);
            }
        } else {
            o12Var = new o12(this, ou0Var);
        }
        Object objF0 = o12Var.m;
        int i3 = o12Var.w;
        mu0 mu0Var = null;
        if (i3 == 0) {
            js2.o(objF0);
            o12Var.w = 1;
            x21 x21Var = na1.g;
            objF0 = m50.f0(c21.a, new ko(file, str, mu0Var, (byte) 7), o12Var);
            px0 px0Var = px0.j;
            if (objF0 == px0Var) {
                return px0Var;
            }
        } else {
            if (i3 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objF0);
        }
        byte[] bArr = (byte[]) objF0;
        if (bArr != null) {
            return eg6.n(bArr);
        }
        return null;
    }

    @Override // defpackage.di0
    public long n() {
        return System.currentTimeMillis();
    }

    public String toString() {
        switch (this.j) {
            case kq2.x /* 15 */:
                int iHashCode = hashCode();
                a11.x(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return xi3.a("CreationExtras.Key@", string, "<", v54.g(id4.class).r(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.sy4
    public boolean x(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.sy4
    public void y(ry4 ry4Var) {
        ry4Var.clear();
    }
}
