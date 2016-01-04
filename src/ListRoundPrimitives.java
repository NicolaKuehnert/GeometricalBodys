

public class ListRoundPrimitives extends ListPrimitives {
	
	@Override
	public boolean add(Primitive p) throws AngularArgumentException, WrongArgumentException  {
		if (p instanceof IAngular) {
			throw new AngularArgumentException();
		}
		return super.add(p);
	}
	
}
