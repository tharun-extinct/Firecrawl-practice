package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 kg3, still in use, count: 1, list:
  (r1v0 kg3) from 0x00fa: INVOKE (r0v15 android.util.SparseArray), (0 int), (r1v0 kg3) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:251)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class kg3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF1("UNKNOWN_MOBILE_SUBTYPE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("GPRS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("EDGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("UMTS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("CDMA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("EVDO_0"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("EVDO_A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("RTT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("HSDPA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("HSUPA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("HSPA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("IDEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("EVDO_B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("LTE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("EHRPD"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HSPAP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("GSM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("TD_SCDMA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("IWLAN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("LTE_CA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF202("COMBINED");

    public static final SparseArray j;

    static {
        SparseArray sparseArray = new SparseArray();
        j = sparseArray;
        sparseArray.put(0, kg3Var);
        sparseArray.put(1, kg3Var);
        sparseArray.put(2, kg3Var);
        sparseArray.put(3, kg3Var);
        sparseArray.put(4, kg3Var);
        sparseArray.put(5, kg3Var);
        sparseArray.put(6, kg3Var);
        sparseArray.put(7, kg3Var);
        sparseArray.put(8, kg3Var);
        sparseArray.put(9, kg3Var);
        sparseArray.put(10, kg3Var);
        sparseArray.put(11, kg3Var);
        sparseArray.put(12, kg3Var);
        sparseArray.put(13, kg3Var);
        sparseArray.put(14, kg3Var);
        sparseArray.put(15, kg3Var);
        sparseArray.put(16, kg3Var);
        sparseArray.put(17, kg3Var);
        sparseArray.put(18, kg3Var);
        sparseArray.put(19, kg3Var);
    }

    public kg3(String str) {
        super(str, i);
    }

    public static kg3 valueOf(String str) {
        return (kg3) Enum.valueOf(kg3.class, str);
    }

    public static kg3[] values() {
        return (kg3[]) t.clone();
    }
}
