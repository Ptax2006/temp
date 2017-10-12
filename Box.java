package void1;

public class Box {
    int w;
    int h;
    int d;

    public Box(int w, int h, int d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public Box(int w) {
        this.w = w;
        this.h = w;
        this.d = w;
    }

    public void scale(int n) {
        this.w *= n;
        this.h *= n;
        this.d *= n;
    }

    public int calcVolm() {
        return (w * h * d);}

    public void printDecs() {
        System.out.println("This is simple");
    }


    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
