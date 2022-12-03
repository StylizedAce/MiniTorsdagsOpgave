package dk.cphbusiness.tog.datastructures.opgave;

public interface DirectoryEntry {
	String getName();

	boolean isDirectory();

	boolean isFile();

	File asFile();

	Directory asDirectory();
}
