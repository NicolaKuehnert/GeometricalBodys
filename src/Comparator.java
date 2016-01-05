
public interface Comparator<T> 
{

	int compare(Primitive o1, Primitive o2);
	
	public static Comparator<Primitive> AREA = new Comparator<Primitive>() {
        @Override
        public int compare(Primitive o1, Primitive o2) {
            return o1.compareArea(o2);
        }
    };
    public static Comparator<Primitive> CIRCUMFERENCE = new Comparator<Primitive>() {
        @Override
        public int compare(Primitive o1, Primitive o2) {
            return o1.compareUmfang(o2);
        }
    };
    public static Comparator<Primitive> AREAANDCIRCUMFERENCE = new Comparator<Primitive>() {
        @Override
        public int compare(Primitive o1, Primitive o2) {
            int i = o1.compareArea(o2);
            if (i == 0) {
                i = o1.compareUmfang(o2);
            }
            return i;
        }
    };

}
