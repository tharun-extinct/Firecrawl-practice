package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu4 {
    public final j a;
    public double g;
    public double j;
    public double l;
    public double n;
    public boolean r;
    public double t;
    public double v;
    public double x;
    public double y;

    public xu4() {
        this.g = Math.sqrt(1500.0d);
        this.y = 0.5d;
        this.r = false;
        this.t = Double.MAX_VALUE;
        this.a = new j();
    }

    public final void g(float f) {
        if (f < 0.0f) {
            l0.u("Damping ratio must be non-negative");
        } else {
            this.y = f;
            this.r = false;
        }
    }

    public final j r(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.r) {
            if (this.t == Double.MAX_VALUE) {
                l0.z("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.y;
            if (d3 > 1.0d) {
                double d4 = this.g;
                this.x = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.y;
                double d6 = this.g;
                this.l = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.j = Math.sqrt(1.0d - (d3 * d3)) * this.g;
            }
            this.r = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.t;
        double d9 = this.y;
        if (d9 > 1.0d) {
            double d10 = this.l;
            double d11 = ((d10 * d8) - d2) / (d10 - this.x);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.x * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.l;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.x;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.g;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.g) * d7) * d17;
            double d18 = -this.g;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.j;
            double d20 = this.g;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.j * d7) * d21) + (Math.cos(this.j * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.g;
            double d23 = this.y;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.j;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.j;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.t);
        j jVar = this.a;
        jVar.j = f;
        jVar.t = (float) dCos;
        return jVar;
    }

    public final void y(float f) {
        if (f <= 0.0f) {
            l0.u("Spring stiffness constant must be positive.");
        } else {
            this.g = Math.sqrt(f);
            this.r = false;
        }
    }

    public xu4(float f) {
        this.g = Math.sqrt(1500.0d);
        this.y = 0.5d;
        this.r = false;
        this.a = new j();
        this.t = f;
    }
}
