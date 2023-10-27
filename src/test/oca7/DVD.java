package test.oca7;

public class DVD extends CD{
    int c;

    public DVD(int c) {
        super(c);
        this.c = c;
    }

    public DVD(int r, int c) {
        super(r);
        this.c = c;
    }

    /**
     Which code fragment should  you are at line n1 to instantiate the dvd object successfully?
     A) super.r = r;
     this.c = c;

     B) super(r);
     this(c);

     C) super(r);
     this.c = c;

     D) this.c = r;
     super(c);
     * */
}
