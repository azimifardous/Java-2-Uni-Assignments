public class Document {
    private String documentType;
    private String documentNumber;
    private String authorLastName;
    private String year;

    static int numberOfDocuments = 0;

    public Document(String documentType, String documentNumber, String authorLastName, String year) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.authorLastName = authorLastName;
        this.year = year;
        numberOfDocuments++;
    }

    @Override
    public String toString() {
        return documentType +  " " + documentNumber + " " + authorLastName + " " + year;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
