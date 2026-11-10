package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public enum oy5 {
    t("RESPONSE_CODE_UNSPECIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("SERVICE_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("FEATURE_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF36("SERVICE_DISCONNECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("OK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF53("USER_CANCELED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF63("SERVICE_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF71("BILLING_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF80("ITEM_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF92("DEVELOPER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF102("ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF111("ITEM_ALREADY_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF120("ITEM_NOT_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF134("EXPIRED_OFFER_TOKEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF147("NETWORK_ERROR");

    public static final c16 a;
    public final int j;

    static {
        ld1 ld1Var = new ld1((byte) 5);
        ld1Var.r = new Object[8];
        ld1Var.y = 0;
        for (oy5 oy5Var : values()) {
            Integer numValueOf = Integer.valueOf(oy5Var.j);
            int i = ld1Var.y + 1;
            Object[] objArrCopyOf = (Object[]) ld1Var.r;
            int length = objArrCopyOf.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, length);
                ld1Var.r = objArrCopyOf;
            }
            int i3 = ld1Var.y;
            int i4 = i3 + i3;
            objArrCopyOf[i4] = numValueOf;
            objArrCopyOf[i4 + 1] = oy5Var;
            ld1Var.y = i3 + 1;
        }
        c06 c06Var = (c06) ld1Var.n;
        if (c06Var != null) {
            throw c06Var.g();
        }
        c16 c16VarG = c16.g(ld1Var.y, (Object[]) ld1Var.r, ld1Var);
        c06 c06Var2 = (c06) ld1Var.n;
        if (c06Var2 != null) {
            throw c06Var2.g();
        }
        a = c16VarG;
    }

    oy5(String str) {
        this.j = i;
    }

    public static oy5 g(int i) {
        Integer numValueOf = Integer.valueOf(i);
        c16 c16Var = a;
        return !c16Var.containsKey(numValueOf) ? t : (oy5) c16Var.get(numValueOf);
    }
}
