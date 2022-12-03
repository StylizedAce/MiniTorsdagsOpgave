package dk.cphbusiness.tog.datastructures.opgave;

public interface Directory extends DirectoryEntry
{
	void addChild(DirectoryEntry entry);
	Iterable<DirectoryEntry> getChildren();
}
