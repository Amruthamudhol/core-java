class FileRunner {

    public static void main(String[] args) {

        Folder folder = new Folder("Documents", 50);
        Owner owner = new Owner("Amruta", 101);
        Permission permission = new Permission(true, true);
        DateInfo dateInfo = new DateInfo("01-01-2026", "05-03-2026");
        Location location = new Location("C:/Docs", "C");

        File file = new File("Report", 12.5, false, 3, "PDF",
                folder, owner, permission, dateInfo, location);

        System.out.println("File Name: " + file.name);
        System.out.println("Size: " + file.size);
        System.out.println("Read Only: " + file.readOnly);
        System.out.println("Version: " + file.version);
        System.out.println("Type: " + file.type);

        System.out.println("Folder: " + file.folder.folderName);
		if(folder!=null){
			folder.getdetails();
		}
		else{
			System.out.println("folderis not there...");
		}
        System.out.println("Owner: " + file.owner.ownerName);
		if(owner!=null){
			owner.printdetails();
		}
		else{
			System.out.println("owener is not there...");
		}
        System.out.println("Permission Read: " + file.permission.read);
        System.out.println("Created Date: " + file.dateInfo.createdDate);
        System.out.println("Location Path: " + file.location.path);
    }
}