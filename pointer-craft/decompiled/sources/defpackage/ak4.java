package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class ak4 {
    public final Context g;
    public Sensor j;
    public SensorManager l;
    public final float[] y = new float[9];
    public final float[] r = new float[9];
    public final float[] n = new float[9];
    public final float[] v = new float[4];
    public float x = 0.001f;

    public ak4(Context context) {
        this.g = context;
    }
}
