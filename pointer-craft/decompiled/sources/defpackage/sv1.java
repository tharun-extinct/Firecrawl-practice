package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sv1 {
    public boolean g;
    public Object y;

    /* JADX WARN: Multi-variable type inference failed */
    public sv1(od5 od5Var, int i) {
        this.y = od5Var;
        this.g = i;
    }

    public boolean g() {
        return this.g;
    }

    public void r(td6 td6Var) {
        if (this.g) {
            i06.j("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((ed5) this.y).g(new iu(td6Var, xx3.j));
        } catch (Throwable unused) {
            i06.j("BillingLogger", "logging failed.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean y(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            t94.g();
            return false;
        }
        if (((l76) this.y) == null) {
            return g();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            sv1 sv1Var = q45.g;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case kq2.x /* 15 */:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return g();
        }
        return false;
    }

    public sv1(l76 l76Var, boolean z) {
        this.y = l76Var;
        this.g = z;
    }
}
