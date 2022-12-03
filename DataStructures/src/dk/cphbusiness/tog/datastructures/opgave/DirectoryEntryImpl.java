package dk.cphbusiness.tog.datastructures.opgave;

public abstract class DirectoryEntryImpl implements DirectoryEntry {

    String name;
    boolean isDirectory;
    boolean isFile;


    public DirectoryEntryImpl(String name, boolean isDirectory, boolean isFile) {
        this.name = name;
        this.isDirectory = isDirectory;
        this.isFile = isFile;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isDirectory() {
        return this.isDirectory;
    }

    @Override
    public boolean isFile() {
        return this.isFile;
    }

    @Override
    public File asFile() {

        if (!this.isFile) {
            throw new IllegalArgumentException("Cannot be saved as a file");
        }
        return (File) this;
    }

    @Override
    public Directory asDirectory() {
        if (!this.isDirectory) {
            throw new IllegalStateException("This is not a directory");
        }
        return (Directory) this;
    }
}
