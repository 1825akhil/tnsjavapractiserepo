package jdbcprograms.executer;

import jdbcprograms.services.CurdOperations;

public class MainProgram {

	public static void main(String[] args) {
		CurdOperations.addStudent(101, "Akhil");
		CurdOperations.addStudent(102, "Manish");
		CurdOperations.addStudent(103, "Srujan");
		CurdOperations.addStudent(104, "Azlan");
		CurdOperations.updateStudent(101, "Akhil N");
		CurdOperations.deleteStudent(104);
		CurdOperations.selectStudent(101);

	}

}
