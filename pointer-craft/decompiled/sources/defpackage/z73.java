package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z73 {
    public wi3 a;
    public long g;
    public boolean j;
    public boolean t;
    public final SparseLongArray y = new SparseLongArray();
    public final SparseBooleanArray r = new SparseBooleanArray();
    public final ArrayList n = new ArrayList();
    public final uy2 v = new uy2((Object) null);
    public int x = -1;
    public int l = -1;

    public final void g(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.y;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.g;
                this.g = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.g;
            this.g = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.r.put(pointerId2, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f A[EDGE_INSN: B:84:0x016f->B:62:0x016f BREAK  A[LOOP:0: B:43:0x00d7->B:61:0x0166], SYNTHETIC] */
    public final su3 n(ba baVar, MotionEvent motionEvent, wi3 wi3Var, int i, boolean z) {
        long jValueAt;
        char c;
        long j;
        long jK;
        long j2;
        long jN;
        int toolType;
        int i2;
        int historySize;
        char c2;
        int i3;
        long jFloatToRawIntBits;
        float fFloatValue;
        long jFloatToRawIntBits2;
        int i4;
        Float fValueOf;
        float historicalX;
        int i5;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.y;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j3 = this.g;
            this.g = 1 + j3;
            sparseLongArray.put(pointerId, j3);
            jValueAt = j3;
        }
        float pressure = motionEvent.getPressure(i);
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32);
        if (i != 0) {
            c = ' ';
            j = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                jK = wi3Var != null ? wi3Var.g : bb6.x(motionEvent, i);
                jN = baVar.N(jK);
            } else {
                jK = baVar.k(jFloatToRawIntBits3);
                j2 = jFloatToRawIntBits3;
            }
            toolType = motionEvent.getToolType(i);
            if (toolType != 0) {
                i5 = 2;
                if (toolType == 1) {
                    i2 = ((!motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.j || this.t)) ? i5 : 1;
                } else if (toolType != 2) {
                    if (toolType != 3) {
                        i5 = 4;
                        if (toolType != 4) {
                            i2 = 0;
                        }
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            c2 = c;
            i3 = 0;
            while (true) {
                jFloatToRawIntBits = 0;
                fFloatValue = 1.0f;
                if (i3 < historySize) {
                    break;
                }
                historicalX = motionEvent.getHistoricalX(i, i3);
                float historicalY = motionEvent.getHistoricalY(i, i3);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(historicalX)) << c2) | (((long) Float.floatToRawIntBits(historicalY)) & j);
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                    float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                    fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                    float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                    if (Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 3) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & j);
                    }
                    arrayList.add(new y62(historicalEventTime, jFloatToRawIntBits4, fFloatValue2, jFloatToRawIntBits, jFloatToRawIntBits4));
                }
                i3++;
                historySize = historySize;
            }
            if (motionEvent.getActionMasked() == 8) {
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j);
            } else {
                jFloatToRawIntBits2 = 0;
            }
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29 && motionEvent.getClassification() == 5) {
                float axisValue = motionEvent.getAxisValue(52, i);
                fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                }
            }
            float f = fFloatValue;
            if (i4 < 29 && motionEvent.getClassification() == 3) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
            }
            return new su3(jValueAt, motionEvent.getEventTime(), jK, j2, z, pressure, i2, this.r.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits2, f, jFloatToRawIntBits, jFloatToRawIntBits3);
        }
        if (wi3Var != null) {
            jK = wi3Var.g;
            c = ' ';
            j = 4294967295L;
        } else {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            long jFloatToRawIntBits5 = Float.floatToRawIntBits(rawX);
            int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
            c = ' ';
            j = 4294967295L;
            jK = (jFloatToRawIntBits5 << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
        }
        jN = baVar.N(jK);
        j2 = jN;
        toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            i5 = 2;
            if (toolType == 1) {
                if (toolType != 2) {
                    if (toolType != 3) {
                        i5 = 4;
                        if (toolType != 4) {
                            i2 = 0;
                        }
                    }
                } else {
                    i2 = 3;
                }
            } else if (motionEvent.isFromSource(8194)) {
            }
        } else {
            i2 = 0;
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        c2 = c;
        i3 = 0;
        while (true) {
            jFloatToRawIntBits = 0;
            fFloatValue = 1.0f;
            if (i3 < historySize) {
                break;
                break;
            }
            historicalX = motionEvent.getHistoricalX(i, i3);
            float historicalY2 = motionEvent.getHistoricalY(i, i3);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i3++;
            historySize = historySize;
        }
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j);
        } else {
            jFloatToRawIntBits2 = 0;
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            float axisValue2 = motionEvent.getAxisValue(52, i);
            if (axisValue2 > 0.0f) {
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        float f2 = fFloatValue;
        if (i4 < 29) {
        }
        return new su3(jValueAt, motionEvent.getEventTime(), jK, j2, z, pressure, i2, this.r.get(motionEvent.getPointerId(i), false), arrayList2, jFloatToRawIntBits2, f2, jFloatToRawIntBits, jFloatToRawIntBits3);
    }

    public final rk4 r(ba baVar, MotionEvent motionEvent) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.r;
        if (actionMasked == 3 || actionMasked == 4) {
            this.y.clear();
            sparseBooleanArray.clear();
            this.j = false;
            this.t = false;
            this.a = null;
            return null;
        }
        y(motionEvent);
        g(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.n;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.j = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || !(motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
            this.t = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(n(baVar, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    this.j = false;
                    this.t = false;
                    this.a = null;
                }
                v(motionEvent);
                return null;
            }
            this.t = true;
            if (motionEvent.getActionMasked() == 0) {
                this.a = new wi3((((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L));
            } else if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
                this.a = new wi3((((long) Float.floatToRawIntBits((motionEvent.getRawX(1) + motionEvent.getRawX(0)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((motionEvent.getRawY(1) + motionEvent.getRawY(0)) / 2.0f)) & 4294967295L));
            }
            arrayList.add(n(baVar, motionEvent, this.a, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.j = false;
            this.t = false;
            this.a = null;
        }
        v(motionEvent);
        motionEvent.getEventTime();
        return new rk4(arrayList, motionEvent, (byte) 18);
    }

    public final void v(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.r;
        SparseLongArray sparseLongArray = this.y;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void y(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.x && source == this.l) {
            return;
        }
        this.x = toolType;
        this.l = source;
        this.r.clear();
        this.y.clear();
    }
}
