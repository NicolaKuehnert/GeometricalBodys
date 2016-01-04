

import java.io.BufferedReader;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListPrimitives {
	public static final int MAX_PRIMITIVES = 10;

	private ArrayList<Primitive> list;

	public ListPrimitives() {
		this.list = new ArrayList<Primitive>();
	}

	public boolean add(Primitive p) throws WrongArgumentException {
		if (p == null) {
			throw new WrongArgumentException();
		}
		return list.add(p);
		
	}

	public void add(String line) {
		if (line == null || line == "") {
			throw new IllegalArgumentException("Zeile nicht vorhanden");
		}
		String help[] = line.split(";");
		if (help[0].contains("Rectangle")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int length = Integer.parseInt(help[5]);
			final int height = Integer.parseInt(help[6]);
			try {
				this.add(new Rectangle(new Point(x, y), length, height));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}

		} else if (help[0].contains("Square")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int length = Integer.parseInt(help[5]);
			try {
				this.add(new Square(new Point(x, y), length));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}
		} else if (help[0].contains("Ellipse")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int longSemiaxis = Integer.parseInt(help[5]);
			final int shortSemiaxis = Integer.parseInt(help[6]);
			try {
				this.add(new Ellipse(new Point(x, y), longSemiaxis,
						shortSemiaxis));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}
		} else if (help[0].contains("Circle")) {
			final int x = Integer.parseInt(help[3]);
			final int y = Integer.parseInt(help[4]);
			final int longSemiaxis = Integer.parseInt(help[5]);
			try {
				this.add(new Circle(new Point(x, y), longSemiaxis));
			} catch (WrongArgumentException e) {
				e.printStackTrace();
			}
		}

	}

	public boolean remove(Primitive p) {

		return list.remove(p);
	}

	public void sortCircumference() {
		int size = list.size();
		Primitive swap = null;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; ++i) {
				if (list.get(i) == null && list.get(i+1) == null) {

				} else if (list.get(i) != null && list.get(i+1) == null) {

				} else if (list.get(i) == null && list.get(i+1) != null) {
					list.set(i, list.get(i+1));
					swapped = true;
				} else if (list.get(i).getCircumference() > list.get(i+1)
						.getCircumference()) {
					swap = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, swap);
					swapped = true;
				}
			}
			size--;
		} while (swapped);
	}

	public void sortArea() {
		int size = list.size();
		Primitive swap = null;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; ++i) {
				if (list.get(i) == null && list.get(i+1) == null) {

				} else if (list.get(i) != null && list.get(i+1) == null) {

				} else if (list.get(i) == null && list.get(i+1) != null) {
					list.set(i, list.get(i+1));
					list.remove(i+1);
					swapped = true;
				} else if (list.get(i).getArea() > list.get(i+1).getArea()) {
					swap = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, swap);
					swapped = true;
				}
			}
			size--;
		} while (swapped);
	}

	public void print() {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null) {
				System.out.println(list.get(i));
			} else {
				System.out.println("null");
			}
		}
	}

	public void save(File fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			for (Primitive p : list) {
				if (p != null) {
					bw.append(p.toString() + "\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void load(File fileName) {
		BufferedReader in = null;
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
			in = new BufferedReader(fr);
			String line = null;
			while ((line = in.readLine()) != null) {
				this.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				// ignore e.printStackTrace();
			}
		}
	}

	public Primitive getByIndex(int index) {
		if (this.list.get(index) == null) {
			throw new MyArrayOutOfBoundsException();
		}
		return this.list.get(index);
	}
}
