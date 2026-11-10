package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fz4 implements tb4 {
    public final zx1 j;

    public fz4(zx1 zx1Var) {
        zx1Var.getClass();
        this.j = zx1Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.tb4
    public final cc4 O(String str) {
        lz4 lz4Var;
        int i;
        str.getClass();
        zx1 zx1Var = this.j;
        d93 d93Var = null;
        if (!zx1Var.isOpen()) {
            zq2.B("connection is closed", 21);
            throw null;
        }
        String upperCase = tx4.q0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iV = 0;
            loop0: while (iV < length) {
                char cCharAt = upperCase.charAt(iV);
                if (yf2.f(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iV2 = iV + 1;
                            if (upperCase.charAt(iV2) == '*') {
                                do {
                                    iV2 = tx4.V(upperCase, '*', iV2 + 1, 4);
                                    if (iV2 < 0) {
                                        break loop0;
                                    }
                                    i = iV2 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iV = iV2 + 2;
                            }
                        }
                        i2 = iV;
                        break;
                    }
                    if (upperCase.charAt(iV + 1) != '-') {
                        i2 = iV;
                        break;
                    }
                    iV = tx4.V(upperCase, '\n', iV + 2, 4);
                    if (iV < 0) {
                        break;
                    }
                }
                iV++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new nz4(zx1Var, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    lz4Var = null;
                } else if (!tx4.Q(upperCase, "EXCLUSIVE", false)) {
                    lz4Var = !tx4.Q(upperCase, "IMMEDIATE", false) ? lz4.q : lz4.m;
                } else {
                    lz4Var = lz4.a;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    lz4Var = null;
                } else {
                    lz4Var = lz4.j;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    lz4Var = null;
                } else {
                    lz4Var = lz4.j;
                }
                break;
            case 81327:
                lz4Var = (!strSubstring.equals("ROL") || tx4.Q(upperCase, " TO ", false)) ? null : lz4.t;
                break;
            default:
                lz4Var = null;
                break;
        }
        if (lz4Var != null) {
            return new nz4(zx1Var, str, lz4Var);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (tx4.Q(tx4.k0(lowerCase, "journal_mode", ""), "=", false)) {
                d93Var = d93.w;
            }
        }
        if (d93Var != null) {
            return new mz4(zx1Var, str, new oz4(zx1Var, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new nz4(zx1Var, str) : new oz4(zx1Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.j.close();
    }

    @Override // defpackage.tb4
    public final boolean p() {
        return this.j.p();
    }
}
