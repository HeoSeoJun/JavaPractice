package generics;

enum Direction { EAST, WEST, SOUTH, NORTH }

public class Ex12_5 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println();
		System.out.println("d1 == d2 ? " + (d1 == d2));
		System.out.println("d1 == d3 ? " + (d1 == d3));
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
		System.out.println("d1.compareTo(d2) ? "+d1.compareTo(d2));
		System.out.println("d1.compareTo(d3) ? "+d1.compareTo(d3));
		System.out.println();
		
		switch (d1) {
		case EAST:
			System.out.println("Direction is EAST"); break;
		case WEST:
			System.out.println("Direction is WEST"); break;
		case SOUTH:
			System.out.println("Direction is SOUTH"); break;
		case NORTH:
			System.out.println("Direction is NORTH"); break;
		default:
			System.out.println("Invalid Direction!"); break;
		}
		System.out.println();
		
		Direction[] dir = Direction.values();
		for (Direction d : dir) System.out.printf("%s = %d%n", d.name(), d.ordinal());
		
	}

}
