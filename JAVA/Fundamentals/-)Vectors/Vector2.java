public class Vector2 extends Vector1 {                                          // extends allows Vector2 to inherit from Vector1
    public int y;
    // constructor
    public Vector2(int xParam, int yParam){
        super(xParam);                                                          // calls the parent's constructor.
        this.y = yParam;
    }

    public Vector2 add(Vector2 vec){
        // this.x += vec.x;
        super.add(vec);
        this.y += vec.y;
        return this;                                                            // 'this' assigns something to an object
    }
}