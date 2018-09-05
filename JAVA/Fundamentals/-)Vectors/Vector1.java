public class Vector1 {
    public int x;
    public Vector1(int xParam){
        this.x = xParam;
    }
    public Vector1 add(Vector1 vec){
        this.x += vec.x;
        return this;                                                            // 'this' assigns something to an object
    }
    // public int subtract(int vec){

    // }
    // public float distance(int vec){

    // }
}
