class DocumentUnit {

    String documentTitle;
    int pageCount;

    DocumentUnit(String documentTitle, int pageCount) {
        this.documentTitle = documentTitle;
        this.pageCount = pageCount;
    }

    void display() {
        System.out.println("Document: " + this.documentTitle + " Pages: " +  this.pageCount);
    }
}