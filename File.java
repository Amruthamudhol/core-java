class File {

    String name;
    double size;
    boolean readOnly;
    int version;
    String type;

    Folder folder;
    Owner owner;
    Permission permission;
    DateInfo dateInfo;
    Location location;

    File(String name, double size, boolean readOnly, int version, String type,
         Folder folder, Owner owner, Permission permission, DateInfo dateInfo, Location location) {

        this.name = name;
        this.size = size;
        this.readOnly = readOnly;
        this.version = version;
        this.type = type;

        this.folder = folder;
        this.owner = owner;
        this.permission = permission;
        this.dateInfo = dateInfo;
        this.location = location;
    }
}