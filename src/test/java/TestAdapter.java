import adapter.PdfAdapter;
import adapter.PdfFile;
import org.junit.jupiter.api.Test;

public class TestAdapter {

    @Test
    void testAdapter() {
        System.out.println("-----------ADAPTER TEST-----------");
        PdfFile pdfFile = new PdfFile("New file", "This is a new file");
        PdfAdapter adapter = new PdfAdapter(pdfFile);
        System.out.println("\"" + pdfFile.getTitle() + "\" hash code: " + adapter.getContentHashCode());
        System.out.println("----------------------------------");
    }

}
