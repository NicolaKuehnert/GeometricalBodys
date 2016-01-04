
public class ListAngularPrimitives extends ListPrimitives {

	public boolean add(Primitive p) throws RoundArgumentException,WrongArgumentException {
		if (p instanceof IRound) {
			throw new RoundArgumentException();
		}
		return super.add(p);
	}
}
