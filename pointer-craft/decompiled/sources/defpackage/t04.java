package defpackage;

import android.os.Parcelable;
import io.appground.blek.nano.Proto$ShortcutData;

/* JADX INFO: loaded from: classes2.dex */
public final class t04 extends np3 {
    public static final Parcelable.Creator<t04> CREATOR = new op3(t04.class);
    public Proto$ShortcutData[] t;

    public static t04 z(byte[] bArr) throws jg2 {
        t04 t04Var = new t04();
        if (Proto$ShortcutData.c == null) {
            synchronized (lf2.y) {
                try {
                    if (Proto$ShortcutData.c == null) {
                        Proto$ShortcutData.c = new Proto$ShortcutData[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        t04Var.t = Proto$ShortcutData.c;
        t04Var.j = -1;
        np3.l(t04Var, bArr);
        return t04Var;
    }

    @Override // defpackage.np3
    public final void b(y22 y22Var) throws ui0 {
        Proto$ShortcutData[] proto$ShortcutDataArr = this.t;
        if (proto$ShortcutDataArr == null || proto$ShortcutDataArr.length <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            Proto$ShortcutData[] proto$ShortcutDataArr2 = this.t;
            if (i >= proto$ShortcutDataArr2.length) {
                return;
            }
            Proto$ShortcutData proto$ShortcutData = proto$ShortcutDataArr2[i];
            if (proto$ShortcutData != null) {
                y22Var.I(1, proto$ShortcutData);
            }
            i++;
        }
    }

    @Override // defpackage.np3
    public final np3 n(ni0 ni0Var) throws jg2 {
        while (true) {
            int iP = ni0Var.p();
            if (iP == 0) {
                break;
            }
            if (iP == 10) {
                int iK = k33.K(ni0Var, 10);
                Proto$ShortcutData[] proto$ShortcutDataArr = this.t;
                int length = proto$ShortcutDataArr == null ? 0 : proto$ShortcutDataArr.length;
                int i = iK + length;
                Proto$ShortcutData[] proto$ShortcutDataArr2 = new Proto$ShortcutData[i];
                if (length != 0) {
                    System.arraycopy(proto$ShortcutDataArr, 0, proto$ShortcutDataArr2, 0, length);
                }
                while (length < i - 1) {
                    Proto$ShortcutData proto$ShortcutData = new Proto$ShortcutData();
                    proto$ShortcutDataArr2[length] = proto$ShortcutData;
                    ni0Var.q(proto$ShortcutData);
                    ni0Var.p();
                    length++;
                }
                Proto$ShortcutData proto$ShortcutData2 = new Proto$ShortcutData();
                proto$ShortcutDataArr2[length] = proto$ShortcutData2;
                ni0Var.q(proto$ShortcutData2);
                this.t = proto$ShortcutDataArr2;
            } else if (!ni0Var.z(iP)) {
                break;
            }
        }
        return this;
    }

    @Override // defpackage.np3
    public final int r() {
        Proto$ShortcutData[] proto$ShortcutDataArr = this.t;
        int i = 0;
        if (proto$ShortcutDataArr == null || proto$ShortcutDataArr.length <= 0) {
            return 0;
        }
        int iT = 0;
        while (true) {
            Proto$ShortcutData[] proto$ShortcutDataArr2 = this.t;
            if (i >= proto$ShortcutDataArr2.length) {
                return iT;
            }
            Proto$ShortcutData proto$ShortcutData = proto$ShortcutDataArr2[i];
            if (proto$ShortcutData != null) {
                iT = y22.t(1, proto$ShortcutData) + iT;
            }
            i++;
        }
    }
}
