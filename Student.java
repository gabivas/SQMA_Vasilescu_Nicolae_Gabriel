class ExceptieMatematica extends Exception {

}

class ExceptieStudent extends Exception {

}

public class Student {
	int varsta;
	String nume;
	int[] note;

	public static final int MIN_VARSTA = 14;
	public static final int MAX_VARSTA = 90;

	public Student() {
		note = null;
		nume = "Gabriel";
		varsta = 0;
	}

	public Student(int varsta, String nume, int[] note) throws ExceptieStudent {
		super();
		this.setVarsta(varsta);
		this.nume = nume;
		this.note = note;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws ExceptieStudent {
		if (varsta < Student.MIN_VARSTA || varsta > Student.MAX_VARSTA)
			throw new ExceptieStudent();
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int[] getNote() {
		return note;
	}

	public void setNote(int[] note) {
		if (note == null)
			this.note = null;
		else
			this.note = note.clone();
	}

	public int getNotaMinima() throws ExceptieMatematica {
		if (this.note == null || this.note.length == 0)
			throw new ExceptieMatematica();
		int minim = this.note[0];
		for (int i = 1; i < this.note.length; i++)
			if (minim > this.note[i])
				minim = this.note[i];
		return minim;
	}

}