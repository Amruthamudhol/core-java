class Folder {

    String folderName;
    int numberOfFiles;

    Folder(String folderName, int numberOfFiles) {
        this.folderName = folderName;
        this.numberOfFiles = numberOfFiles;
    }
	void getdetails(){
		System.out.println("folderName:"+this.folderName + ",numberOfFiles:"+this.numberOfFiles);
	}
}