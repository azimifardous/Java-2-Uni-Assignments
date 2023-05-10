import java.util.Scanner;

public class preLab7Driver {
    public static void main(String[] args) {
        Document[] documents = new Document[10];
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        String documentType = scanner.next();
        String documentNumber = scanner.next();
        String authorLastName = scanner.next();
        String year = scanner.next();


        while (!command.equals("q")) {
            // adding manually the documents into the array while just three types of documents are available
            if (command.equalsIgnoreCase("add")) {
                if (documentType.equalsIgnoreCase("book"))
                    documents[0] = new Book(documentType, documentNumber, authorLastName, year);
                else if (documentType.equalsIgnoreCase("paper"))
                    documents[1] = new Paper(documentType, documentNumber, authorLastName, year);
                else
                    documents[2] = new Thesis(documentType, documentNumber, authorLastName, year);
            }

            command = scanner.next();

            if (command.equals("update")) {
                documentNumber = scanner.next();
                year = scanner.next();

                for (Document document : documents) {
                    if (document != null) {
                        if (document.getDocumentNumber().equals(documentNumber))
                            document.setYear(year);;
                    }
                }
            }

            if (command.equals("q")) {
                System.out.println(Document.numberOfDocuments + " documents: ");
                for (Document document : documents) {
                    if (document != null)
                        System.out.println(document);
                }
                scanner.close();
            }

            if (!command.equals("update") && !command.equals("q")) {
                documentType = scanner.next();
                documentNumber = scanner.next();
                authorLastName = scanner.next();
                year = scanner.next();
            }
        }
    }
}