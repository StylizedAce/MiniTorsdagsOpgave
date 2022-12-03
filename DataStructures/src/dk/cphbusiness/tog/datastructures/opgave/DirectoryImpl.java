package dk.cphbusiness.tog.datastructures.opgave;

import java.util.ArrayList;

public class DirectoryImpl extends DirectoryEntryImpl implements Directory {

public ArrayList<DirectoryEntry> folder = new ArrayList<>();
    public DirectoryImpl(String name) {
        super(name, true,false);
    }

    @Override
    public void addChild(DirectoryEntry entry) {
        folder.add(entry);
    }

    @Override
    public Iterable<DirectoryEntry> getChildren() {
        return folder;
    }
    public String getChildren(int index) {
        return folder.get(index).asFile().getContent();
    }
}
